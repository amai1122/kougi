package valid;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Renge;
import javax.validation.constraints.URL;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

public class mondai6_1Form {


	@Size(min=1, max=10, message="「会社名」は{min}{0}文字以上、{max}文字以内で入力してください。")
	private String name;
//	@Url
	private String url;
	@Range(min=2, max=3, message="「会社に対する満足度」は、整数{max}桁、少数{min}桁までで入力してください。")
	private Double  satis;

	@URL(, message="「会社のURL」の形式が不正です。")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Double getSatis() {
		return satis;
	}

	public void setSatis(Double satis) {
		this.satis = satis;
	}


}
