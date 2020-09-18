package br.com.caelum.casadocodigoapi.controller.dto.output;

public class DashboardOutputDto {

	private Long bookCount;
	private Long authorCount;
	private Long productCount;
	private Long categoryCount;

	public DashboardOutputDto(Long bookCount, Long authorCount, Long productCount, Long categoryCount) {
		this.bookCount = bookCount;
		this.authorCount = authorCount;
		this.productCount = productCount;
		this.categoryCount = categoryCount;
	}

	public Long getBookCount() {
		return bookCount;
	}

	public Long getAuthorCount() {
		return authorCount;
	}

	public Long getProductCount() {
		return productCount;
	}

	public Long getCategoryCount() {
		return categoryCount;
	}

}
