package kg.chinodev.storesitrun.network.models

data class HomeReponse(
    val clearanceSaleProductList: List<HomeListItem>,
    val discountProductList: List<HomeListItem>,
    val hitProductList: List<HomeListItem>,
    val incomeProductList: List<HomeListItem>,
    val newProductList: List<HomeListItem>,
    val recommendProductList: List<HomeListItem>,
    val giftProductList: List<HomeListItem>,
    val nowBuyingProductList: List<HomeListItem>
)