package com.diviso.graeshoppe.service.impl;

import static org.elasticsearch.action.search.SearchType.QUERY_THEN_FETCH;
import static org.elasticsearch.index.query.QueryBuilders.matchAllQuery;
import static org.elasticsearch.index.query.QueryBuilders.matchQuery;
import static org.elasticsearch.index.query.QueryBuilders.termQuery;

import java.util.ArrayList;
import java.util.List;

import org.elasticsearch.search.aggregations.AggregationBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.data.elasticsearch.core.query.SearchQuery;
import org.springframework.stereotype.Service;

import com.diviso.graeshoppe.client.customer.domain.Customer;
import com.diviso.graeshoppe.client.product.model.Category;
import com.diviso.graeshoppe.client.product.model.Product;
import com.diviso.graeshoppe.client.product.model.StockCurrent;
import com.diviso.graeshoppe.client.product.model.StockDiary;
import com.diviso.graeshoppe.client.product.model.StockLine;
import com.diviso.graeshoppe.client.product.model.Uom;
import com.diviso.graeshoppe.client.sale.domain.Sale;
import com.diviso.graeshoppe.client.sale.domain.TicketLine;
/*import com.diviso.graeshoppe.client.product.domain.Product;
import com.diviso.graeshoppe.domain.Result;*/
import com.diviso.graeshoppe.service.QueryService;
import com.github.vanroy.springdata.jest.JestElasticsearchTemplate;
import com.github.vanroy.springdata.jest.aggregation.AggregatedPage;

import io.searchbox.client.JestClient;
import io.searchbox.core.search.aggregation.TermsAggregation;

@Service
public class QueryServiceImpl implements QueryService {
	private final JestClient jestClient;
	private final JestElasticsearchTemplate elasticsearchTemplate;

	public QueryServiceImpl(JestClient jestClient) {
		this.jestClient = jestClient;
		this.elasticsearchTemplate = new JestElasticsearchTemplate(this.jestClient);
	}

	@Autowired
	ElasticsearchOperations elasticsearchOperations;

	@Override
	public Page<Category> findAllCategories(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Category.class);
	}
	
	@Override
	public Page<Product> findAllProduct(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}
	
	@Override
	public Page<Product> findAllProductBySearchTerm(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).prefixLength(3)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Product.class);

	}
	
	@Override
	public Page<Product> findProductByCategoryId(Long categoryId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("categories.id", categoryId))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, Product.class);
	}
	
	@Override
	public Page<StockCurrent> findStockCurrentByProductId(Long productId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.id", productId))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}
	@Override
	public Page<StockCurrent> findStockCurrentByProductName(String name, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchQuery("product.name", name))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}
	
	@Override
	public Page<StockDiary> findStockDiaryByProductId(Long productId, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("product.id", productId))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, StockDiary.class);
	}
	
	
	
	@Override
	public Page<StockLine> findAllStockLines(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockLine.class);
	}

/*	public List<Result> findAll(String searchTerm, Pageable pageable) {
		List<Result> values = new ArrayList<Result>();
		;

		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).fuzziness(Fuzziness.TWO)).build();

		elasticsearchTemplate.query(searchQuery, new JestResultsExtractor<List<Result>>() {
			@Override
			public List<Result> extract(SearchResult response) {

				for (SearchResult.Hit<JsonObject, Void> searchHit : response.getHits(JsonObject.class)) {
					Result result = new Result();
					// sampleEntity.setId(searchHit.source.get(JestResult.ES_METADATA_ID).getAsString());
					result.setName(searchHit.source.get("name").getAsString());

					values.add(result);

				}
				return values;
			}
		});
		return values;

	}
*/
	@Override
	public Page<Customer> findAllCustomers(String searchTerm, Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				.withQuery(matchQuery("name", searchTerm).prefixLength(3)).build();

		return elasticsearchOperations.queryForPage(searchQuery, Customer.class);

	}
	@Override
	public List<String> findAllUom(Pageable pageable){
		List<String> uomList = new ArrayList<String>();
		SearchQuery searchQuery = new NativeSearchQueryBuilder()
				  .withQuery(matchAllQuery())
				  .withSearchType(QUERY_THEN_FETCH)
				  .withIndices("uom").withTypes("uom")
				  .addAggregation(AggregationBuilders.terms("distinct_uom").field("name.keyword"))
				  .build();
	
		
		AggregatedPage<Uom> result = elasticsearchTemplate.queryForPage(searchQuery, Uom.class);
		TermsAggregation uomAgg = result.getAggregation("distinct_uom", TermsAggregation.class);
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<"+uomAgg.getBuckets().size());


	for (int i=0;i<uomAgg.getBuckets().size();i++)
	{
		uomList.add(uomAgg.getBuckets().get(i).getKey());
	}
	
		
		
		return uomList;
	}
	@Override
	public Page<Customer> findAllCustomersWithoutSearch(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Customer.class);
	}

	/* (non-Javadoc)
	 * @see com.diviso.graeshoppe.service.QueryService#findSales()
	 */
	@Override
	public Page<Sale> findSales(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, Sale.class);
	
	}
	
	@Override
	public List<TicketLine> findTicketLinesBySaleId(Long saleId) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(termQuery("sale.id", saleId))
				.build();
		return elasticsearchOperations.queryForPage(searchQuery, TicketLine.class).getContent();
	}
	
	@Override
	public Page<StockCurrent> findAllStockCurrents(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockCurrent.class);
	}
	
	@Override
	public Page<StockDiary> findAllStockDiaries(Pageable pageable) {
		SearchQuery searchQuery = new NativeSearchQueryBuilder().withQuery(matchAllQuery()).build();
		return elasticsearchOperations.queryForPage(searchQuery, StockDiary.class);
	}
	
	
	
	

}
