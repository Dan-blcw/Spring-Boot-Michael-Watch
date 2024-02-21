package com.alibou.security;

import com.alibou.security.model.dto.CartDtos;
import com.alibou.security.model.dto.Ob.ObDtos;
import com.alibou.security.model.dto.global.Cart_Info;
import com.alibou.security.model.dto.global.Cart_Product;
import com.alibou.security.service.AuthenticationService;
import com.alibou.security.model.dto.global.RegisterDtos;
import com.alibou.security.service.CartSFService;
import com.alibou.security.service.ObService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import java.util.ArrayList;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
public class SecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecurityApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(
			AuthenticationService service,
			ObService observice,
			CartSFService cartSFService
	) {
		return args -> {


			var admin = RegisterDtos.builder()
					.fullName("Admin")
					.username("Admin")
					.email("admin@mail.com")
					.password("password")
					.build();
			System.out.println("Admin token: " + service.createAdmin(admin));

			var user = RegisterDtos.builder()
					.fullName("dan")
					.username("blcw")
					.email("user@mail.com")
					.password("password")
					.build();
			System.out.println("User token: " + service.register(user).getJwt());


			var ob = ObDtos.builder()
					.name("Rolex Submariner")
					.price(12999)
					.color("Black")
					.country("Switzerland")
					.brand("Rolex")
					.pictureURL("https://i.pinimg.com/564x/60/95/1c/60951c6acf113c84b9a87802e1c8fb7c.jpg")

					.description("The Rolex Submariner is a classic diving watch, known for its durability and precision. It features a black dial, a rotating bezel, and a steel bracelet.")
					.build();
			var ob1 = ObDtos.builder()
					.name("Casio G-Shock")
					.price(159)
					.color("Red")
					.country("Japan")
					.brand("Casio")
					.pictureURL("https://i.pinimg.com/564x/6a/1c/b5/6a1cb5f9adacfd4095eb36edf9ddb53b.jpg")
					.description("The Casio G-Shock is a rugged digital watch, designed to withstand shock and water. It features a red resin case, a digital display, and a stopwatch.")
					.build();
			var ob2 = ObDtos.builder()
					.name("Cartier Tank Francais")
					.price(7999)
					.color("Gold")
					.country("France")
					.brand("Cartier")
					.pictureURL("https://i.pinimg.com/564x/7d/7a/0b/7d7a0b62a88351a30973ce7324c1849d.jpg")
					.description("The Cartier Tank Francais is a classic dress watch, known for its elegant design. It features a gold case, a white dial, and a leather strap.")
					.build();
			var ob3 = ObDtos.builder()
					.name("Calvin Klein Quartz")
					.price(199)
					.color("Silver")
					.country("Switzerland")
					.brand("Calvin Klein")
					.pictureURL("https://i.pinimg.com/564x/fa/f2/71/faf2714c658ca02e92926badc1d06982.jpg")
					.description("The Calvin Klein Quartz is a sleek and modern watch, designed for everyday wear. It features a silver case, a quartz movement, and a leather strap.")
					.build();
			var ob4 = ObDtos.builder()
					.name("Longines Conquest")
					.price(2799)
					.color("Stainless Steel")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/564x/64/77/eb/6477eb28f6dc6ccc68a78ac1176924e9.jpg")
					.description("The Longines Conquest is a sporty and elegant watch, designed for active lifestyles. It features a stainless steel case, a silver dial, and a steel bracelet.")
					.build();
			var ob5 = ObDtos.builder()
					.name("Apple Watch Series 6")
					.price(749)
					.color("Blue")
					.country("USA")
					.brand("Apple")
					.pictureURL("https://i.pinimg.com/564x/fb/4b/53/fb4b5399cae67e7f3df5496a69a3426f.jpg")
					.description("The Apple Watch Series 6 is a smartwatch, designed for health and fitness tracking. It features a blue aluminum case, a Retina display, and a range of fitness apps.")
					.build();
			var ob6 = ObDtos.builder()
					.name("Rolex Daytona")
					.price(17999)
					.color("Gold")
					.country("Switzerland")
					.brand("Rolex")
					.pictureURL("https://i.pinimg.com/564x/96/0e/e6/960ee6581ad199bb957346915c20cbdf.jpg")
					.description("The Rolex Daytona is a classic chronograph watch, known for its precision and style. It features a gold case, a black dial, and a steel bracelet.")
					.build();
			var ob7 = ObDtos.builder()
					.name("Casio Pro Trek")
					.price(199)
					.color("Black")
					.country("Japan")
					.brand("Casio")
					.pictureURL("https://i.pinimg.com/564x/f6/33/7b/f6337b1576cbf9dddb0ab5a49fbcadc8.jpg")
					.description("The Casio Pro Trek is a rugged outdoor watch, designed for adventure. It features a black resin case, a digital display, and a range of outdoor functions.")
					.build();
//
			var ob8 = ObDtos.builder()
					.name("Cartier Roadster")
					.price(7999)
					.color("Gold")
					.country("France")
					.brand("Cartier")
					.pictureURL("https://i.pinimg.com/564x/a2/2a/cc/a22acc1ee293e989f59c7a4f3398ae4b.jpg")
					.description("The Cartier Roadster is a sporty and elegant watch, designed for active lifestyles. It features a gold case, a silver dial, and a steel bracelet.")
					.build();
			var ob9 = ObDtos.builder()
					.name("Jaeger-LeCoultre Reverso")
					.price(7500)
					.color("Gold")
					.country("Switzerland")
					.brand("Jaeger-LeCoultre")
					.pictureURL("https://i.pinimg.com/564x/89/5a/2b/895a2b83e6d2bc3f07ecd57d269298bd.jpg")
					.description("The Jaeger-LeCoultre Reverso is an iconic timepiece, featuring a reversible case design that allows the wearer to flip the watch face to protect it. It's a blend of art deco style and technical innovation, representing the pinnacle of watchmaking excellence.")
					.build();
			var ob10 = ObDtos.builder()
					.name("Cartier Santos")
					.price(7500)
					.color("Silver")
					.country("Switzerland")
					.brand("Cartier")
					.pictureURL("https://i.pinimg.com/564x/a8/eb/d7/a8ebd7713994b6634733f07a4dce5335.jpg")
					.description("The Cartier Santos is a legendary timepiece, originally created for aviator Alberto Santos-Dumont. It features a distinctive square case, exposed screws, and a leather strap. With its rich history and timeless design, it's a true icon of style and elegance.")
					.build();
			var ob11 = ObDtos.builder()
					.name("Calvin Klein Minimal Silver Mesh")
					.price(249)
					.color("Blue")
					.country("USA")
					.brand("Calvin Klein")
					.pictureURL("https://i.pinimg.com/564x/83/2b/b6/832bb6a5b05ecf850da726a0d29028c7.jpg")
					.description("The Calvin Klein Minimal Silver Mesh is a contemporary timepiece, featuring a silver-tone case and a mesh bracelet. Its clean and minimalist design adds a touch of sophistication to any outfit, making it ideal for both casual and formal wear.")
					.build();
			var ob12 = ObDtos.builder()
					.name("Longines Conquest Classic")
					.price(1800)
					.color("Blue")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/564x/2b/99/14/2b99141406a4c6db8f24e7e108a7053b.jpg")
					.description("The Longines Conquest Classic is a sporty yet elegant timepiece, featuring a blue dial and a stainless steel bracelet. It combines precision and performance with timeless style, making it suitable for any occasion, from the boardroom to the beach.")
					.build();
			var ob13 = ObDtos.builder()
					.name("Jaeger-LeCoultre Master Ultra Thin Moon")
					.price(12500)
					.color("Silver")
					.country("USA")
					.brand("Jaeger-LeCoultre")
					.pictureURL("https://i.pinimg.com/564x/52/2b/22/522b2261e23bcd2b0027c0e517e5f61e.jpg")
					.description("The Jaeger-LeCoultre Master Ultra Thin Moon is a refined and understated timepiece, featuring a moon phase complication and a slim stainless steel case. With its classic design and technical excellence, it's a symbol of luxury and sophistication.")
					.build();
			var ob14 = ObDtos.builder()
					.name("Apple Watch SE")
					.price(279)
					.color("Silver")
					.country("Apple")
					.brand("tagheuer")
					.pictureURL("https://i.pinimg.com/564x/fd/f0/3f/fdf03f41865ca22edf8f441bffd450f0.jpg")
					.description("The Apple Watch SE is a more affordable alternative to the flagship Series 7, offering many of the same features in a sleek and stylish package. With its customizable watch faces and comprehensive health tracking capabilities, it's the perfect companion for an active lifestyle.")
					.build();
			var ob15 = ObDtos.builder()
					.name("Rolex Datejust")
					.price(13500)
					.color("Silver")
					.country("USA")
					.brand("Rolex")
					.pictureURL("https://i.pinimg.com/564x/cb/24/7e/cb247e8204ba559a1b9f30064ec60bce.jpg")
					.description("The Rolex Datejust is an iconic timepiece, featuring a classic design with a date window at 3 o'clock and a stainless steel case. With its timeless elegance and versatile style, it's a watch that can be worn for any occasion.")
					.build();
			var ob16 = ObDtos.builder()
					.name("Casio Edifice")
					.price(2999)
					.color("Silver")
					.country("Japan")
					.brand("Casio")
					.pictureURL("https://i.pinimg.com/564x/f4/29/69/f42969fc3f1fbc9468a432bddc30b2ad.jpg")
					.description("The Casio Edifice is a stylish and sophisticated watch, featuring a stainless steel case and a chronograph function. It's designed for the modern man who values both style and functionality.")
					.build();
			var ob17 = ObDtos.builder()
					.name("Cartier Ballon Bleu")
					.price(9500)
					.color("Silver")
					.country("France")
					.brand("Cartier")
					.pictureURL("https://i.pinimg.com/564x/d0/e1/d0/d0e1d0df0db508090d61b6179e55f0cf.jpg")
					.description("The Cartier Ballon Bleu is a luxurious timepiece, featuring a distinctive round case and a blue cabochon crown. It's a symbol of timeless elegance and sophistication, making it a favorite among discerning watch enthusiasts.")
					.build();
			var ob18 = ObDtos.builder()
					.name("Calvin Klein Infinite")
					.price(100)
					.color("Black")
					.country("USA")
					.brand("Calvin Klein")
					.pictureURL("https://i.pinimg.com/564x/48/29/78/482978e640de58746de49f78b07178df.jpg")
					.description("The Calvin Klein Infinite is a sleek and modern watch, featuring a black dial and a stainless steel bracelet. Its minimalist design and refined aesthetics make it the perfect accessory for the modern man.")
					.build();
			var ob19 = ObDtos.builder()
					.name("Longines HydroConquest")
					.price(1400)
					.color("Blue")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/564x/f3/f0/21/f3f0214d89e81d80ab66cc33eb3a664e.jpg")
					.description("The Longines HydroConquest is a sporty and versatile timepiece, featuring a blue dial and a stainless steel bracelet. With its water resistance and durable construction, it's the perfect watch for water sports and outdoor adventures.")
					.build();
			var ob20 = ObDtos.builder()
					.name("Jaeger-LeCoultre Polaris")
					.price(11700)
					.color("Black")
					.country("Switzerland")
					.brand("Jaeger-LeCoultre")
					.pictureURL("https://i.pinimg.com/564x/87/0e/39/870e39d940cbd835f6f775644633489a.jpg")
					.description("The Jaeger-LeCoultre Polaris is a modern reinterpretation of a classic timepiece, featuring a black dial and a stainless steel case. With its vintage-inspired design and contemporary technology, it's a watch that pays homage to the spirit of adventure.")
					.build();
			var ob22 = ObDtos.builder()
					.name("Rolex Explorer II")
					.price(10200)
					.color("White")
					.country("Switzerland")
					.brand("Rolex")
					.pictureURL("https://i.pinimg.com/736x/14/35/d3/1435d361ce576767e89e8e54961dbd53.jpg")
					.description("The Rolex Explorer II is a rugged and reliable timepiece, designed for adventurers and explorers. It features a white dial, a stainless steel case, and a 24-hour bezel. With its durable construction and precision movement, it's the ultimate tool watch for outdoor enthusiasts.")
					.build();
			var ob23 = ObDtos.builder()
					.name("Casio Baby-G")
					.price(79)
					.color("Pink")
					.country("Japan")
					.brand("Casio")
					.pictureURL("https://i.pinimg.com/736x/0f/ec/0d/0fec0ddf934789c225a36eec84c7083c.jpg")
					.description("The Casio Baby-G is a fun and colorful watch, designed for active women with a sense of style. It features a shock-resistant case, water resistance, and a variety of vibrant colors to choose from. With its combination of fashion and functionality, it's the perfect accessory for any outfit.")
					.build();
			var ob24 = ObDtos.builder()
					.name("Calvin Klein Stately")
					.price(319)
					.color("Blue")
					.country("USA")
					.brand("Calvin Klein")
					.pictureURL("https://i.pinimg.com/564x/a2/55/8e/a2558e535f192e04a2c8cbe78f8b01a0.jpg")
					.description("The Calvin Klein Stately is a refined and elegant watch, featuring a blue dial and a stainless steel case. Its minimalist design and sophisticated aesthetics make it the perfect accessory for both formal and casual occasions.")
					.build();
			var ob25 = ObDtos.builder()
					.name("Cartier Pasha de Cartier")
					.price(17500)
					.color("Gold")
					.country("France")
					.brand("Cartier")
					.pictureURL("https://i.pinimg.com/736x/2a/1c/c3/2a1cc301643cd9d2129033b8e3eb8a3d.jpg")
					.description("The Cartier Pasha de Cartier is a luxurious timepiece, featuring a distinctive round case and a gold bracelet. It's a symbol of sophistication and elegance, with its timeless design and impeccable craftsmanship. This iconic watch is sure to make a statement wherever you go.")
					.build();
			var ob26 = ObDtos.builder()
					.name("Longines Flagship Heritage")
					.price(2600)
					.color("Silver")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/564x/e9/88/37/e9883732b76b88642884365525ca7d0d.jpg")
					.description("The Longines Flagship Heritage is a classic and timeless timepiece, featuring a silver dial and a stainless steel bracelet. With its vintage-inspired design and modern technology, it's a watch that appeals to those who appreciate traditional craftsmanship and timeless style.")
					.build();
			var ob27 = ObDtos.builder()
					.name("Jaeger-LeCoultre Rendez-Vous Night & Day")
					.price(17500)
					.color("Rose Gold")
					.country("Switzerland")
					.brand("Jaeger-LeCoultre")
					.pictureURL("https://i.pinimg.com/564x/6c/35/b2/6c35b27b3e20dc388405c4379a7cac16.jpg")
					.description("The Jaeger-LeCoultre Rendez-Vous Night & Day is an exquisite and feminine timepiece, featuring a rose gold case and a mother-of-pearl dial. With its elegant design and delicate details, it's a watch that captures the essence of luxury and sophistication.")
					.build();
			var ob28 = ObDtos.builder()
					.name("Rolex Sky-Dweller")
					.price(46000)
					.color("Champagne")
					.country("Switzerland")
					.brand("Rolex")
					.pictureURL("https://i.pinimg.com/736x/98/57/93/985793b91811d950a3c6702e77a87a3c.jpg")
					.description("The Rolex Sky-Dweller is a luxurious and innovative timepiece, featuring a champagne dial and an annual calendar complication. With its dual time zone function and elegant design, it's a watch that is both practical and sophisticated, perfect for the modern globetrotter.")
					.build();
			var ob29 = ObDtos.builder()
					.name("Apple Watch Hermes")
					.price(1399)
					.color("Brown")
					.country("USA")
					.brand("Apple")
					.pictureURL("https://i.pinimg.com/564x/b5/13/fc/b513fc4c6006621e9d0465c7a2860c49.jpg")
					.description("The Apple Watch Hermes is a collaboration between Apple and the luxury fashion house Hermes, featuring exclusive Hermes watch faces and leather bands. It combines the cutting-edge technology of Apple with the timeless craftsmanship of Hermes, resulting in a watch that is both stylish and sophisticated.")
					.build();
			var ob30 = ObDtos.builder()
					.name("Rolex GMT-Master II")
					.price(16700)
					.color("Black and Blue")
					.country("Switzerland")
					.brand("Rolex")
					.pictureURL("https://i.pinimg.com/564x/67/ca/02/67ca0252187d4ba0f03778eae05d01d2.jpg")
					.description("The Rolex GMT-Master II is a legendary timepiece, originally designed for professional pilots. It features a black and blue ceramic bezel, a stainless steel case, and a GMT function. With its iconic design and practical functionality, it's a watch that is both stylish and versatile.")
					.build();
			var ob31 = ObDtos.builder()
					.name("Casio Sheen")
					.price(129)
					.color("Rose Gold")
					.country("Japan")
					.brand("Casio")
					.pictureURL("https://i.pinimg.com/736x/61/b6/c6/61b6c61968cd00b5f333a1d8cb0a8a3b.jpg")
					.description("The Casio Sheen is a chic and feminine watch, featuring a rose gold-tone case and a shimmering dial. It's designed for the modern woman who values both style and functionality, making it the perfect accessory for any occasion.")
					.build();
			var ob32 = ObDtos.builder()
					.name("Cartier Drive de Cartier")
					.price(9500)
					.color("Silver")
					.country("France")
					.brand("Cartier")
					.pictureURL("https://i.pinimg.com/564x/85/51/5a/85515ad1c485a469aa6f29fa12c2c4f7.jpg")
					.description("The Cartier Drive de Cartier is a sophisticated and masculine timepiece, featuring a cushion-shaped case and a silver dial. With its classic design and impeccable craftsmanship, it's a watch that exudes luxury and refinement.")
					.build();
			var ob33 = ObDtos.builder()
					.name("Calvin Klein Minimal Gold")
					.price(299)
					.color("Gold")
					.country("USA")
					.brand("Calvin Klein")
					.pictureURL("https://i.pinimg.com/564x/95/63/d0/9563d0dbb2ecbc29938c861b8bf0a83a.jpg")
					.description("The Calvin Klein Minimal Gold is a sleek and modern watch, featuring a gold-tone case and a minimalist dial. Its understated elegance and timeless design make it the perfect accessory for any occasion, adding a touch of sophistication to any ensemble.")
					.build();
			var ob34 = ObDtos.builder()
					.name("Longines Master Moonphase")
					.price(3300)
					.color("Silver")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/564x/7f/bb/4f/7fbb4f8a241d211c6bc2c4829caeba82.jpg")
					.description("The Longines Master Moonphase is a classic and elegant timepiece, featuring a moon phase complication and a stainless steel case. With its timeless design and sophisticated functionality, it's a watch that appeals to those with a passion for traditional craftsmanship and fine watchmaking.")
					.build();
			var ob35 = ObDtos.builder()
					.name("Jaeger-LeCoultre Master Control")
					.price(8450)
					.color("Silver")
					.country("Switzerland")
					.brand("Jaeger-LeCoultre")
					.pictureURL("https://i.pinimg.com/564x/ec/7e/7a/ec7e7a1c4a22ab145445d9e2d43d1d71.jpg")
					.description("The Jaeger-LeCoultre Master Control is a refined and understated timepiece, featuring a silver dial and a stainless steel case. With its classic design and technical excellence, it's a watch that embodies the spirit of Swiss watchmaking tradition.")
					.build();
			var ob36 = ObDtos.builder()
					.name("Apple Watch Edition Titanium")
					.price(799)
					.color("Titanium")
					.country("USA")
					.brand("Apple")
					.pictureURL("https://i.pinimg.com/564x/af/f3/ac/aff3ac6613a25a8516d573347a78a9e6.jpg")
					.description("The Apple Watch Edition Titanium is a premium version of the popular smartwatch, featuring a titanium case and a variety of exclusive watch faces and bands. With its luxurious materials and cutting-edge technology, it's the ultimate accessory for the discerning individual.")
					.build();
			var ob37 = ObDtos.builder()
					.name("Rolex Yacht-Master")
					.price(13500)
					.color("Platinum")
					.country("Switzerland")
					.brand("Rolex")
					.pictureURL("https://i.pinimg.com/564x/60/3e/0c/603e0c4fc0150c829f696bb94e22a0e1.jpg")
					.description("The Rolex Yacht-Master is a luxurious timepiece designed for sailing enthusiasts, featuring a platinum case and a rotating bezel with raised numerals. With its durable construction and precision movement, it's the ultimate watch for navigating the high seas.")
					.build();
			var ob38 = ObDtos.builder()
					.name("Casio G-Shock Mudmaster")
					.price(340)
					.color("Black")
					.country("Japan")
					.brand("Casio")
					.pictureURL("https://i.pinimg.com/564x/4e/1f/6d/4e1f6d01d8d3e6b8902cb4db3163b28f.jpg")
					.description("The Casio G-Shock Mudmaster is a rugged and durable watch, designed to withstand the toughest outdoor conditions. It features shock resistance, mud resistance, and a variety of useful functions for outdoor adventurers. With its tough construction and reliable performance, it's the perfect companion for any adventure.")
					.build();
			var ob39 = ObDtos.builder()
					.name("Cartier Tank Solo")
					.price(3100)
					.color("Silver")
					.country("France")
					.brand("Cartier")
					.pictureURL("https://i.pinimg.com/564x/5b/8f/c4/5b8fc427c7dbba5b564244eb6fc09ce1.jpg")
					.description("The Cartier Tank Solo is a classic and elegant timepiece, featuring a rectangular case and a silver dial. With its timeless design and sophisticated aesthetics, it's a watch that exudes luxury and refinement.")
					.build();
			var ob40 = ObDtos.builder()
					.name("Calvin Klein Minimal White")
					.price(289)
					.color("White")
					.country("USA")
					.brand("Calvin Klein")
					.pictureURL("https://i.pinimg.com/564x/99/27/a4/9927a4900f35c8f471910f9842d6bf90.jpg")
					.description("The Calvin Klein Minimal White is a sleek and modern watch, featuring a white dial and a stainless steel case. Its minimalist design and clean lines make it the perfect accessory for any outfit, adding a touch of sophistication to your look.")
					.build();
			var ob41 = ObDtos.builder()
					.name("Longines Master Moonphase Retrograde")
					.price(4200)
					.color("Silver")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/736x/4b/95/ed/4b95ed805e051ff25a1b3312819056ed.jpg")
					.description("The Longines Master Moonphase Retrograde is a sophisticated and elegant timepiece, featuring a moon phase complication and a retrograde day indicator. With its classic design and technical excellence, it's a watch that appeals to those with a passion for traditional craftsmanship and fine watchmaking.")
					.build();
			var ob42 = ObDtos.builder()
					.name("Jaeger-LeCoultre Polaris Chronograph")
					.price(11500)
					.color("Blue")
					.country("Switzerland")
					.brand("Jaeger-LeCoultre")
					.pictureURL("https://i.pinimg.com/564x/ac/96/ea/ac96eab5a0c0dd38703146ec8aa2c7b9.jpg")
					.description("The Jaeger-LeCoultre Polaris Chronograph is a sporty and versatile timepiece, featuring a blue dial and a stainless steel case. With its chronograph function and rugged construction, it's the perfect watch for those who live an active lifestyle.")
					.build();
			var ob43 = ObDtos.builder()
					.name("Apple Watch SE Nike")
					.price(329)
					.color("Black")
					.country("USA")
					.brand("Apple")
					.pictureURL("https://i.pinimg.com/564x/10/9a/b4/109ab41d60986854fb579b1b519c67c2.jpg")
					.description("The Apple Watch SE Nike is a special edition of the popular smartwatch, featuring exclusive Nike watch faces and bands. Designed for athletes and fitness enthusiasts, it offers advanced workout tracking features and seamless integration with the Nike Run Club app.")
					.build();
			var ob44 = ObDtos.builder()
					.name("Casio Vintage")
					.price(49)
					.color("Gold")
					.country("Japan")
					.brand("Casio")
					.pictureURL("https://i.pinimg.com/564x/c9/cc/d7/c9ccd79a50bdc8f11a20eda164318f82.jpg")
					.description("The Casio Vintage is a retro-inspired watch, featuring a gold-tone case and a digital display. With its nostalgic design and affordable price point, it's a watch that appeals to both fashion-conscious individuals and vintage enthusiasts.")
					.build();
			var ob45 = ObDtos.builder()
					.name("Calvin Klein Colore")
					.price(159)
					.color("Blue")
					.country("USA")
					.brand("Calvin Klein")
					.pictureURL("https://i.pinimg.com/564x/fc/e2/2f/fce22f65ab22ef39a4fbc8f847f97708.jpg")
					.description("The Calvin Klein Color is a vibrant and playful watch, featuring a colorful dial and a silicone strap. Its bold design and youthful energy make it the perfect accessory for adding a pop of color to your look.")
					.build();
			var ob46 = ObDtos.builder()
					.name("Longines Heritage Classic")
					.price(2250)
					.color("Silver")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/564x/72/39/58/72395896f17e45114c5b8fded8aeec8c.jpg")
					.description("The Longines Heritage Classic is a vintage-inspired timepiece, featuring a silver dial and a stainless steel case. With its retro design and modern technology, it's a watch that pays tribute to the brand's rich heritage while remaining relevant for today's wearer.")
					.build();
			var ob47 = ObDtos.builder()
					.name("Longines Conquest V.H.P.")
					.price(1150)
					.color("Black")
					.country("Switzerland")
					.brand("Longines")
					.pictureURL("https://i.pinimg.com/564x/41/07/d0/4107d0a8aa7212f3ad7c3831e1b8b1c3.jpg")
					.description("The Longines Conquest V.H.P. (Very High Precision) is a sporty and reliable watch, featuring a black dial and a stainless steel case. With its precise quartz movement and rugged construction, it's a watch that is built to withstand the demands of everyday wear.")
					.build();
			var ob48 = ObDtos.builder()
					.name("Jaeger-LeCoultre Reverso Classic")
					.price(6800)
					.color("Black")
					.country("Switzerland")
					.brand("Jaeger-LeCoultre")
					.pictureURL("https://i.pinimg.com/564x/89/5a/2b/895a2b83e6d2bc3f07ecd57d269298bd.jpg")
					.description("The Jaeger-LeCoultre Reverso Classic is an iconic timepiece, featuring a reversible case and a black dial. With its Art Deco-inspired design and mechanical excellence, it's a watch that has stood the test of time.")
					.build();
			var ob49 = ObDtos.builder()
					.name("Apple Watch Series 7 Hermes")
					.price(1299)
					.color("Black")
					.country("USA")
					.brand("Apple")
					.pictureURL("https://i.pinimg.com/564x/30/be/a3/30bea31f62fa055b97b2fb2305363f82.jpg")
					.description("The Apple Watch Series 7 Hermes is a collaboration between Apple and the luxury fashion house Hermes, featuring exclusive Hermes watch faces and leather bands. With its premium materials and sophisticated design, it's the ultimate expression of luxury and style.")
					.build();
			var ob50 = ObDtos.builder()
					.name("Apple Watch Brand")
					.price(279)
					.color("Silver")
					.country("USA")
					.brand("Apple")
					.pictureURL("https://i.pinimg.com/564x/ab/b5/2b/abb52bd8781f33c6ae7f0425267c9fe0.jpg")
					.description("The Apple Watch SE is a more affordable version of the popular smartwatch, featuring a silver aluminum case and a variety of interchangeable bands. With its advanced features and sleek design, it's the perfect companion for staying connected and staying active.")
					.build();
			var ob51 = ObDtos.builder()
					.name("Apple Watch Series 7")
					.price(279)
					.color("Silver")
					.country("USA")
					.brand("Apple")
					.pictureURL("https://i.pinimg.com/564x/a3/3b/a5/a33ba5484455186796ed6111fa17336d.jpg")
					.description("The Apple Watch Series 7 is the latest model of the popular smartwatch, featuring a sleek design and a variety of advanced features. With its larger display and improved durability, it's the ultimate accessory for staying connected and staying healthy.")
					.build();

			observice.save(ob38);
			observice.save(ob39);
			observice.save(ob40);
			observice.save(ob41);
			observice.save(ob42);
			observice.save(ob43);
			observice.save(ob25);
			observice.save(ob26);
			observice.save(ob27);
			observice.save(ob28);
			observice.save(ob29);
			observice.save(ob30);
			observice.save(ob31);
			observice.save(ob32);
			observice.save(ob33);
			observice.save(ob34);
			observice.save(ob35);
			observice.save(ob36);
			observice.save(ob37);
			observice.save(ob20);
			observice.save(ob51);
			observice.save(ob22);
			observice.save(ob23);
			observice.save(ob24);
			observice.save(ob);
			observice.save(ob1);
			observice.save(ob2);
			observice.save(ob3);
			observice.save(ob4);
			observice.save(ob5);
			observice.save(ob6);
			observice.save(ob7);
			observice.save(ob8);
			observice.save(ob9);
			observice.save(ob10);
			observice.save(ob11);
			observice.save(ob12);
			observice.save(ob13);
			observice.save(ob14);
			observice.save(ob15);
			observice.save(ob16);
			observice.save(ob17);
			observice.save(ob18);

			observice.save(ob44);
			observice.save(ob45);
			observice.save(ob46);
			observice.save(ob47);
			observice.save(ob48);
			observice.save(ob49);
			observice.save(ob50);


			System.out.println("Ob name: " + ob.toString());

			var info = Cart_Info.builder()
					.code_Bill("Invoice_RK35623")
					.email("Dan646@gmail.com").name("Dan")
					.telephoneNumber("0345345345")
					.address_to("Thanh Xuan, Ha Noi")
					.build();
			var list = new ArrayList<Cart_Product>();
			list.add(new Cart_Product(1,1,"Rolex Submariner","https://i.pinimg.com/564x/60/95/1c/60951c6acf113c84b9a87802e1c8fb7c.jpg",12999.0f,12999.0f));
			list.add(new Cart_Product(2,4,"Calvin Klein Quartz","https://i.pinimg.com/564x/60/95/1c/60951c6acf113c84b9a87802e1c8fb7c.jpg",299.0f,598.0f));
			list.add(new Cart_Product(1,5,"Longines Conquest","https://i.pinimg.com/564x/60/95/1c/60951c6acf113c84b9a87802e1c8fb7c.jpg",599.0f,599.0f));
			var cart_demo = CartDtos.builder().info(info).cart_list(list).build();
			var cart_id = cartSFService.save_SF(cart_demo);
			cartSFService.save_DT(cart_demo,cart_id);

			System.out.println("Invoice Demo successfully" );
		};
	}
}
