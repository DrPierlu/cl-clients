package io.commercelayer.api.operation.common;

import io.commercelayer.api.codegen.source.classes.operation.*;
import io.commercelayer.api.operation.DeleteAccountAddressesId;
import io.commercelayer.api.operation.DeleteAccountApplicationsId;
import io.commercelayer.api.operation.DeleteAccountCatalogsId;
import io.commercelayer.api.operation.DeleteAccountChannelsId;
import io.commercelayer.api.operation.DeleteAccountConsumerRolesId;
import io.commercelayer.api.operation.DeleteAccountCountriesId;
import io.commercelayer.api.operation.DeleteAccountCountryGroupsId;
import io.commercelayer.api.operation.DeleteAccountCountryLanguagesId;
import io.commercelayer.api.operation.DeleteAccountCreditCardsId;
import io.commercelayer.api.operation.DeleteAccountCurrenciesId;
import io.commercelayer.api.operation.DeleteAccountCustomersId;
import io.commercelayer.api.operation.DeleteAccountEnvironmentsId;
import io.commercelayer.api.operation.DeleteAccountImagesId;
import io.commercelayer.api.operation.DeleteAccountLanguagesId;
import io.commercelayer.api.operation.DeleteAccountLineItemStocksId;
import io.commercelayer.api.operation.DeleteAccountLineItemsId;
import io.commercelayer.api.operation.DeleteAccountMarketPaymentTypesId;
import io.commercelayer.api.operation.DeleteAccountMarketShippingServicesId;
import io.commercelayer.api.operation.DeleteAccountMarketStockLocationsId;
import io.commercelayer.api.operation.DeleteAccountMarketsId;
import io.commercelayer.api.operation.DeleteAccountMerchandisingRulesId;
import io.commercelayer.api.operation.DeleteAccountMerchantsId;
import io.commercelayer.api.operation.DeleteAccountOptionTypesId;
import io.commercelayer.api.operation.DeleteAccountOptionValuesId;
import io.commercelayer.api.operation.DeleteAccountOrderValidatorsId;
import io.commercelayer.api.operation.DeleteAccountOrdersId;
import io.commercelayer.api.operation.DeleteAccountOrganizationsId;
import io.commercelayer.api.operation.DeleteAccountPaymentMethodsId;
import io.commercelayer.api.operation.DeleteAccountPaymentTypesId;
import io.commercelayer.api.operation.DeleteAccountPermissionsId;
import io.commercelayer.api.operation.DeleteAccountPriceListsId;
import io.commercelayer.api.operation.DeleteAccountPricesId;
import io.commercelayer.api.operation.DeleteAccountProductPropertiesId;
import io.commercelayer.api.operation.DeleteAccountProductTypesId;
import io.commercelayer.api.operation.DeleteAccountProductsId;
import io.commercelayer.api.operation.DeleteAccountPropertyTypesId;
import io.commercelayer.api.operation.DeleteAccountPropertyValuesId;
import io.commercelayer.api.operation.DeleteAccountResourceImagesId;
import io.commercelayer.api.operation.DeleteAccountRolesId;
import io.commercelayer.api.operation.DeleteAccountShipmentsId;
import io.commercelayer.api.operation.DeleteAccountShippingCarrierTypesId;
import io.commercelayer.api.operation.DeleteAccountShippingCarriersId;
import io.commercelayer.api.operation.DeleteAccountShippingCategoriesId;
import io.commercelayer.api.operation.DeleteAccountShippingLabelsId;
import io.commercelayer.api.operation.DeleteAccountShippingMethodsId;
import io.commercelayer.api.operation.DeleteAccountShippingPackagesId;
import io.commercelayer.api.operation.DeleteAccountShippingServiceCategoriesId;
import io.commercelayer.api.operation.DeleteAccountShippingServiceStockLocationsId;
import io.commercelayer.api.operation.DeleteAccountShippingServiceZonesId;
import io.commercelayer.api.operation.DeleteAccountShippingServicesId;
import io.commercelayer.api.operation.DeleteAccountShippingZonesId;
import io.commercelayer.api.operation.DeleteAccountStatesId;
import io.commercelayer.api.operation.DeleteAccountStockItemsId;
import io.commercelayer.api.operation.DeleteAccountStockLocationsId;
import io.commercelayer.api.operation.DeleteAccountTaxonomiesId;
import io.commercelayer.api.operation.DeleteAccountTaxonsId;
import io.commercelayer.api.operation.DeleteAccountTransactionsId;
import io.commercelayer.api.operation.DeleteAccountUsersId;
import io.commercelayer.api.operation.DeleteAccountVariantOptionsId;
import io.commercelayer.api.operation.DeleteAccountVariantsId;
import io.commercelayer.api.operation.DeleteAccountWebhooksId;
import io.commercelayer.api.operation.DeleteChannelLineItemsId;
import io.commercelayer.api.operation.DeleteChannelPaymentMethodsId;
import io.commercelayer.api.operation.DeleteChannelShippingMethodsId;
import io.commercelayer.api.operation.GetAccount;
import io.commercelayer.api.operation.GetAccountAddresses;
import io.commercelayer.api.operation.GetAccountAddressesId;
import io.commercelayer.api.operation.GetAccountApplications;
import io.commercelayer.api.operation.GetAccountApplicationsId;
import io.commercelayer.api.operation.GetAccountCatalogs;
import io.commercelayer.api.operation.GetAccountCatalogsId;
import io.commercelayer.api.operation.GetAccountChannels;
import io.commercelayer.api.operation.GetAccountChannelsId;
import io.commercelayer.api.operation.GetAccountConsumerRoles;
import io.commercelayer.api.operation.GetAccountConsumerRolesId;
import io.commercelayer.api.operation.GetAccountCountries;
import io.commercelayer.api.operation.GetAccountCountriesId;
import io.commercelayer.api.operation.GetAccountCountryGroups;
import io.commercelayer.api.operation.GetAccountCountryGroupsId;
import io.commercelayer.api.operation.GetAccountCountryLanguages;
import io.commercelayer.api.operation.GetAccountCountryLanguagesId;
import io.commercelayer.api.operation.GetAccountCreditCards;
import io.commercelayer.api.operation.GetAccountCreditCardsId;
import io.commercelayer.api.operation.GetAccountCurrencies;
import io.commercelayer.api.operation.GetAccountCurrenciesId;
import io.commercelayer.api.operation.GetAccountCustomers;
import io.commercelayer.api.operation.GetAccountCustomersId;
import io.commercelayer.api.operation.GetAccountEnvironments;
import io.commercelayer.api.operation.GetAccountEnvironmentsId;
import io.commercelayer.api.operation.GetAccountImages;
import io.commercelayer.api.operation.GetAccountImagesId;
import io.commercelayer.api.operation.GetAccountLanguages;
import io.commercelayer.api.operation.GetAccountLanguagesId;
import io.commercelayer.api.operation.GetAccountLineItemStocks;
import io.commercelayer.api.operation.GetAccountLineItemStocksId;
import io.commercelayer.api.operation.GetAccountLineItems;
import io.commercelayer.api.operation.GetAccountLineItemsId;
import io.commercelayer.api.operation.GetAccountMarketPaymentTypes;
import io.commercelayer.api.operation.GetAccountMarketPaymentTypesId;
import io.commercelayer.api.operation.GetAccountMarketShippingServices;
import io.commercelayer.api.operation.GetAccountMarketShippingServicesId;
import io.commercelayer.api.operation.GetAccountMarketStockLocations;
import io.commercelayer.api.operation.GetAccountMarketStockLocationsId;
import io.commercelayer.api.operation.GetAccountMarkets;
import io.commercelayer.api.operation.GetAccountMarketsId;
import io.commercelayer.api.operation.GetAccountMerchandisingRules;
import io.commercelayer.api.operation.GetAccountMerchandisingRulesId;
import io.commercelayer.api.operation.GetAccountMerchants;
import io.commercelayer.api.operation.GetAccountMerchantsId;
import io.commercelayer.api.operation.GetAccountOptionTypes;
import io.commercelayer.api.operation.GetAccountOptionTypesId;
import io.commercelayer.api.operation.GetAccountOptionValues;
import io.commercelayer.api.operation.GetAccountOptionValuesId;
import io.commercelayer.api.operation.GetAccountOrderValidators;
import io.commercelayer.api.operation.GetAccountOrderValidatorsId;
import io.commercelayer.api.operation.GetAccountOrders;
import io.commercelayer.api.operation.GetAccountOrdersId;
import io.commercelayer.api.operation.GetAccountOrganizations;
import io.commercelayer.api.operation.GetAccountOrganizationsId;
import io.commercelayer.api.operation.GetAccountPaymentMethods;
import io.commercelayer.api.operation.GetAccountPaymentMethodsId;
import io.commercelayer.api.operation.GetAccountPaymentTypes;
import io.commercelayer.api.operation.GetAccountPaymentTypesId;
import io.commercelayer.api.operation.GetAccountPermissions;
import io.commercelayer.api.operation.GetAccountPermissionsId;
import io.commercelayer.api.operation.GetAccountPriceLists;
import io.commercelayer.api.operation.GetAccountPriceListsId;
import io.commercelayer.api.operation.GetAccountPrices;
import io.commercelayer.api.operation.GetAccountPricesId;
import io.commercelayer.api.operation.GetAccountPricesIdExchanges;
import io.commercelayer.api.operation.GetAccountProductProperties;
import io.commercelayer.api.operation.GetAccountProductPropertiesId;
import io.commercelayer.api.operation.GetAccountProductTypes;
import io.commercelayer.api.operation.GetAccountProductTypesId;
import io.commercelayer.api.operation.GetAccountProducts;
import io.commercelayer.api.operation.GetAccountProductsId;
import io.commercelayer.api.operation.GetAccountPropertyTypes;
import io.commercelayer.api.operation.GetAccountPropertyTypesId;
import io.commercelayer.api.operation.GetAccountPropertyValues;
import io.commercelayer.api.operation.GetAccountPropertyValuesId;
import io.commercelayer.api.operation.GetAccountResourceImages;
import io.commercelayer.api.operation.GetAccountResourceImagesId;
import io.commercelayer.api.operation.GetAccountRoles;
import io.commercelayer.api.operation.GetAccountRolesId;
import io.commercelayer.api.operation.GetAccountShipments;
import io.commercelayer.api.operation.GetAccountShipmentsId;
import io.commercelayer.api.operation.GetAccountShippingCarrierTypes;
import io.commercelayer.api.operation.GetAccountShippingCarrierTypesId;
import io.commercelayer.api.operation.GetAccountShippingCarriers;
import io.commercelayer.api.operation.GetAccountShippingCarriersId;
import io.commercelayer.api.operation.GetAccountShippingCategories;
import io.commercelayer.api.operation.GetAccountShippingCategoriesId;
import io.commercelayer.api.operation.GetAccountShippingLabels;
import io.commercelayer.api.operation.GetAccountShippingLabelsId;
import io.commercelayer.api.operation.GetAccountShippingMethods;
import io.commercelayer.api.operation.GetAccountShippingMethodsId;
import io.commercelayer.api.operation.GetAccountShippingPackages;
import io.commercelayer.api.operation.GetAccountShippingPackagesId;
import io.commercelayer.api.operation.GetAccountShippingServiceCategories;
import io.commercelayer.api.operation.GetAccountShippingServiceCategoriesId;
import io.commercelayer.api.operation.GetAccountShippingServiceStockLocations;
import io.commercelayer.api.operation.GetAccountShippingServiceStockLocationsId;
import io.commercelayer.api.operation.GetAccountShippingServiceZones;
import io.commercelayer.api.operation.GetAccountShippingServiceZonesId;
import io.commercelayer.api.operation.GetAccountShippingServices;
import io.commercelayer.api.operation.GetAccountShippingServicesId;
import io.commercelayer.api.operation.GetAccountShippingZones;
import io.commercelayer.api.operation.GetAccountShippingZonesId;
import io.commercelayer.api.operation.GetAccountStates;
import io.commercelayer.api.operation.GetAccountStatesId;
import io.commercelayer.api.operation.GetAccountStockItems;
import io.commercelayer.api.operation.GetAccountStockItemsId;
import io.commercelayer.api.operation.GetAccountStockLocations;
import io.commercelayer.api.operation.GetAccountStockLocationsId;
import io.commercelayer.api.operation.GetAccountTaxonomies;
import io.commercelayer.api.operation.GetAccountTaxonomiesId;
import io.commercelayer.api.operation.GetAccountTaxons;
import io.commercelayer.api.operation.GetAccountTaxonsId;
import io.commercelayer.api.operation.GetAccountTransactions;
import io.commercelayer.api.operation.GetAccountTransactionsId;
import io.commercelayer.api.operation.GetAccountUsers;
import io.commercelayer.api.operation.GetAccountUsersId;
import io.commercelayer.api.operation.GetAccountVariantOptions;
import io.commercelayer.api.operation.GetAccountVariantOptionsId;
import io.commercelayer.api.operation.GetAccountVariants;
import io.commercelayer.api.operation.GetAccountVariantsId;
import io.commercelayer.api.operation.GetAccountWebhooks;
import io.commercelayer.api.operation.GetAccountWebhooksId;
import io.commercelayer.api.operation.GetAllCountries;
import io.commercelayer.api.operation.GetAllCurrencies;
import io.commercelayer.api.operation.GetAllGateways;
import io.commercelayer.api.operation.GetAllStates;
import io.commercelayer.api.operation.GetAllTaxCategories;
import io.commercelayer.api.operation.GetChannelLineItemStocksId;
import io.commercelayer.api.operation.GetChannelLineItemsId;
import io.commercelayer.api.operation.GetChannelLineItemsLineItemIdLineItemStocks;
import io.commercelayer.api.operation.GetChannelLineItemsLineItemIdShippingMethods;
import io.commercelayer.api.operation.GetChannelMarketsCurrent;
import io.commercelayer.api.operation.GetChannelOrdersOrderToken;
import io.commercelayer.api.operation.GetChannelOrdersOrderTokenLineItems;
import io.commercelayer.api.operation.GetChannelOrdersOrderTokenPaymentMethods;
import io.commercelayer.api.operation.GetChannelOrdersOrderTokenShippingMethods;
import io.commercelayer.api.operation.GetChannelPaymentMethodsId;
import io.commercelayer.api.operation.GetChannelProducts;
import io.commercelayer.api.operation.GetChannelShippingMethodsId;
import io.commercelayer.api.operation.GetSchema;
import io.commercelayer.api.operation.PostAccountAddresses;
import io.commercelayer.api.operation.PostAccountApplications;
import io.commercelayer.api.operation.PostAccountCatalogs;
import io.commercelayer.api.operation.PostAccountChannels;
import io.commercelayer.api.operation.PostAccountConsumerRoles;
import io.commercelayer.api.operation.PostAccountCountries;
import io.commercelayer.api.operation.PostAccountCountryGroups;
import io.commercelayer.api.operation.PostAccountCountryLanguages;
import io.commercelayer.api.operation.PostAccountCreditCards;
import io.commercelayer.api.operation.PostAccountCurrencies;
import io.commercelayer.api.operation.PostAccountCustomers;
import io.commercelayer.api.operation.PostAccountEnvironments;
import io.commercelayer.api.operation.PostAccountImages;
import io.commercelayer.api.operation.PostAccountLanguages;
import io.commercelayer.api.operation.PostAccountLineItemStocks;
import io.commercelayer.api.operation.PostAccountLineItems;
import io.commercelayer.api.operation.PostAccountMarketPaymentTypes;
import io.commercelayer.api.operation.PostAccountMarketShippingServices;
import io.commercelayer.api.operation.PostAccountMarketStockLocations;
import io.commercelayer.api.operation.PostAccountMarkets;
import io.commercelayer.api.operation.PostAccountMarketsIdResetIndex;
import io.commercelayer.api.operation.PostAccountMerchandisingRules;
import io.commercelayer.api.operation.PostAccountMerchants;
import io.commercelayer.api.operation.PostAccountOptionTypes;
import io.commercelayer.api.operation.PostAccountOptionValues;
import io.commercelayer.api.operation.PostAccountOrderValidators;
import io.commercelayer.api.operation.PostAccountOrders;
import io.commercelayer.api.operation.PostAccountOrganizations;
import io.commercelayer.api.operation.PostAccountPaymentMethods;
import io.commercelayer.api.operation.PostAccountPaymentTypes;
import io.commercelayer.api.operation.PostAccountPermissions;
import io.commercelayer.api.operation.PostAccountPriceLists;
import io.commercelayer.api.operation.PostAccountPrices;
import io.commercelayer.api.operation.PostAccountProductProperties;
import io.commercelayer.api.operation.PostAccountProductTypes;
import io.commercelayer.api.operation.PostAccountProducts;
import io.commercelayer.api.operation.PostAccountPropertyTypes;
import io.commercelayer.api.operation.PostAccountPropertyValues;
import io.commercelayer.api.operation.PostAccountResourceImages;
import io.commercelayer.api.operation.PostAccountRoles;
import io.commercelayer.api.operation.PostAccountShipments;
import io.commercelayer.api.operation.PostAccountShippingCarrierTypes;
import io.commercelayer.api.operation.PostAccountShippingCarriers;
import io.commercelayer.api.operation.PostAccountShippingCategories;
import io.commercelayer.api.operation.PostAccountShippingLabels;
import io.commercelayer.api.operation.PostAccountShippingMethods;
import io.commercelayer.api.operation.PostAccountShippingPackages;
import io.commercelayer.api.operation.PostAccountShippingServiceCategories;
import io.commercelayer.api.operation.PostAccountShippingServiceStockLocations;
import io.commercelayer.api.operation.PostAccountShippingServiceZones;
import io.commercelayer.api.operation.PostAccountShippingServices;
import io.commercelayer.api.operation.PostAccountShippingZones;
import io.commercelayer.api.operation.PostAccountStates;
import io.commercelayer.api.operation.PostAccountStockItems;
import io.commercelayer.api.operation.PostAccountStockLocations;
import io.commercelayer.api.operation.PostAccountTaxonomies;
import io.commercelayer.api.operation.PostAccountTaxons;
import io.commercelayer.api.operation.PostAccountTransactions;
import io.commercelayer.api.operation.PostAccountUsers;
import io.commercelayer.api.operation.PostAccountVariantOptions;
import io.commercelayer.api.operation.PostAccountVariants;
import io.commercelayer.api.operation.PostAccountWebhooks;
import io.commercelayer.api.operation.PostAccounts;
import io.commercelayer.api.operation.PostAuthToken;
import io.commercelayer.api.operation.PostChannelLineItemsLineItemIdShippingMethods;
import io.commercelayer.api.operation.PostChannelOrders;
import io.commercelayer.api.operation.PostChannelOrdersOrderTokenLineItems;
import io.commercelayer.api.operation.PostChannelOrdersOrderTokenPaymentMethods;
import io.commercelayer.api.operation.PostChannelOrdersOrderTokenPlace;
import io.commercelayer.api.operation.PostChannelOrdersOrderTokenShippingMethods;
import io.commercelayer.api.operation.PutAccountAddressesId;
import io.commercelayer.api.operation.PutAccountApplicationsId;
import io.commercelayer.api.operation.PutAccountCatalogsId;
import io.commercelayer.api.operation.PutAccountChannelsId;
import io.commercelayer.api.operation.PutAccountConsumerRolesId;
import io.commercelayer.api.operation.PutAccountConsumerRolesIdMoveAtPosition;
import io.commercelayer.api.operation.PutAccountConsumerRolesIdMoveBottom;
import io.commercelayer.api.operation.PutAccountConsumerRolesIdMoveDown;
import io.commercelayer.api.operation.PutAccountConsumerRolesIdMoveTop;
import io.commercelayer.api.operation.PutAccountConsumerRolesIdMoveUp;
import io.commercelayer.api.operation.PutAccountCountriesId;
import io.commercelayer.api.operation.PutAccountCountryGroupsId;
import io.commercelayer.api.operation.PutAccountCountryLanguagesId;
import io.commercelayer.api.operation.PutAccountCountryLanguagesIdMoveAtPosition;
import io.commercelayer.api.operation.PutAccountCountryLanguagesIdMoveBottom;
import io.commercelayer.api.operation.PutAccountCountryLanguagesIdMoveDown;
import io.commercelayer.api.operation.PutAccountCountryLanguagesIdMoveTop;
import io.commercelayer.api.operation.PutAccountCountryLanguagesIdMoveUp;
import io.commercelayer.api.operation.PutAccountCreditCardsId;
import io.commercelayer.api.operation.PutAccountCurrenciesId;
import io.commercelayer.api.operation.PutAccountCustomersId;
import io.commercelayer.api.operation.PutAccountEnvironmentsId;
import io.commercelayer.api.operation.PutAccountImagesId;
import io.commercelayer.api.operation.PutAccountLanguagesId;
import io.commercelayer.api.operation.PutAccountLineItemStocksId;
import io.commercelayer.api.operation.PutAccountLineItemsId;
import io.commercelayer.api.operation.PutAccountMarketPaymentTypesId;
import io.commercelayer.api.operation.PutAccountMarketShippingServicesId;
import io.commercelayer.api.operation.PutAccountMarketStockLocationsId;
import io.commercelayer.api.operation.PutAccountMarketsId;
import io.commercelayer.api.operation.PutAccountMerchandisingRulesId;
import io.commercelayer.api.operation.PutAccountMerchandisingRulesIdMoveAtPosition;
import io.commercelayer.api.operation.PutAccountMerchandisingRulesIdMoveBottom;
import io.commercelayer.api.operation.PutAccountMerchandisingRulesIdMoveDown;
import io.commercelayer.api.operation.PutAccountMerchandisingRulesIdMoveTop;
import io.commercelayer.api.operation.PutAccountMerchandisingRulesIdMoveUp;
import io.commercelayer.api.operation.PutAccountMerchantsId;
import io.commercelayer.api.operation.PutAccountOptionTypesId;
import io.commercelayer.api.operation.PutAccountOptionValuesId;
import io.commercelayer.api.operation.PutAccountOrderValidatorsId;
import io.commercelayer.api.operation.PutAccountOrdersId;
import io.commercelayer.api.operation.PutAccountOrganizationsId;
import io.commercelayer.api.operation.PutAccountPaymentMethodsId;
import io.commercelayer.api.operation.PutAccountPaymentTypesId;
import io.commercelayer.api.operation.PutAccountPermissionsId;
import io.commercelayer.api.operation.PutAccountPermissionsIdMoveAtPosition;
import io.commercelayer.api.operation.PutAccountPermissionsIdMoveBottom;
import io.commercelayer.api.operation.PutAccountPermissionsIdMoveDown;
import io.commercelayer.api.operation.PutAccountPermissionsIdMoveTop;
import io.commercelayer.api.operation.PutAccountPermissionsIdMoveUp;
import io.commercelayer.api.operation.PutAccountPriceListsId;
import io.commercelayer.api.operation.PutAccountPricesId;
import io.commercelayer.api.operation.PutAccountProductPropertiesId;
import io.commercelayer.api.operation.PutAccountProductTypesId;
import io.commercelayer.api.operation.PutAccountProductsId;
import io.commercelayer.api.operation.PutAccountPropertyTypesId;
import io.commercelayer.api.operation.PutAccountPropertyValuesId;
import io.commercelayer.api.operation.PutAccountResourceImagesId;
import io.commercelayer.api.operation.PutAccountResourceImagesIdMoveAtPosition;
import io.commercelayer.api.operation.PutAccountResourceImagesIdMoveBottom;
import io.commercelayer.api.operation.PutAccountResourceImagesIdMoveDown;
import io.commercelayer.api.operation.PutAccountResourceImagesIdMoveTop;
import io.commercelayer.api.operation.PutAccountResourceImagesIdMoveUp;
import io.commercelayer.api.operation.PutAccountRolesId;
import io.commercelayer.api.operation.PutAccountShipmentsId;
import io.commercelayer.api.operation.PutAccountShippingCarrierTypesId;
import io.commercelayer.api.operation.PutAccountShippingCarriersId;
import io.commercelayer.api.operation.PutAccountShippingCategoriesId;
import io.commercelayer.api.operation.PutAccountShippingLabelsId;
import io.commercelayer.api.operation.PutAccountShippingMethodsId;
import io.commercelayer.api.operation.PutAccountShippingPackagesId;
import io.commercelayer.api.operation.PutAccountShippingServiceCategoriesId;
import io.commercelayer.api.operation.PutAccountShippingServiceStockLocationsId;
import io.commercelayer.api.operation.PutAccountShippingServiceZonesId;
import io.commercelayer.api.operation.PutAccountShippingServicesId;
import io.commercelayer.api.operation.PutAccountShippingZonesId;
import io.commercelayer.api.operation.PutAccountStatesId;
import io.commercelayer.api.operation.PutAccountStockItemsId;
import io.commercelayer.api.operation.PutAccountStockLocationsId;
import io.commercelayer.api.operation.PutAccountStockLocationsIdMoveAtPosition;
import io.commercelayer.api.operation.PutAccountStockLocationsIdMoveBottom;
import io.commercelayer.api.operation.PutAccountStockLocationsIdMoveDown;
import io.commercelayer.api.operation.PutAccountStockLocationsIdMoveTop;
import io.commercelayer.api.operation.PutAccountStockLocationsIdMoveUp;
import io.commercelayer.api.operation.PutAccountTaxonomiesId;
import io.commercelayer.api.operation.PutAccountTaxonsId;
import io.commercelayer.api.operation.PutAccountTaxonsIdMoveAtPosition;
import io.commercelayer.api.operation.PutAccountTaxonsIdMoveBottom;
import io.commercelayer.api.operation.PutAccountTaxonsIdMoveDown;
import io.commercelayer.api.operation.PutAccountTaxonsIdMoveTop;
import io.commercelayer.api.operation.PutAccountTaxonsIdMoveUp;
import io.commercelayer.api.operation.PutAccountTransactionsId;
import io.commercelayer.api.operation.PutAccountUsersId;
import io.commercelayer.api.operation.PutAccountVariantOptionsId;
import io.commercelayer.api.operation.PutAccountVariantsId;
import io.commercelayer.api.operation.PutAccountWebhooksId;
import io.commercelayer.api.operation.PutChannelLineItemStocksId;
import io.commercelayer.api.operation.PutChannelLineItemsId;
import io.commercelayer.api.operation.PutChannelPaymentMethodsId;
import io.commercelayer.api.operation.PutChannelShippingMethodsId;

/**
 * ApiOperations
 */
public final class ApiOperations {

	/**
	 * GET /account
	 */
	public static GetAccount GetAccount() {
		return new GetAccount();
	}
	
	/**
	 * GET /account/addresses
	 */
	public static GetAccountAddresses GetAccountAddresses() {
		return new GetAccountAddresses();
	}
	
	/**
	 * POST /account/addresses
	 */
	public static PostAccountAddresses PostAccountAddresses() {
		return new PostAccountAddresses();
	}
	
	/**
	 * DELETE /account/addresses/{id}
	 */
	public static DeleteAccountAddressesId DeleteAccountAddressesId() {
		return new DeleteAccountAddressesId();
	}
	
	/**
	 * GET /account/addresses/{id}
	 */
	public static GetAccountAddressesId GetAccountAddressesId() {
		return new GetAccountAddressesId();
	}
	
	/**
	 * PUT /account/addresses/{id}
	 */
	public static PutAccountAddressesId PutAccountAddressesId() {
		return new PutAccountAddressesId();
	}
	
	/**
	 * GET /account/applications
	 */
	public static GetAccountApplications GetAccountApplications() {
		return new GetAccountApplications();
	}
	
	/**
	 * POST /account/applications
	 */
	public static PostAccountApplications PostAccountApplications() {
		return new PostAccountApplications();
	}
	
	/**
	 * DELETE /account/applications/{id}
	 */
	public static DeleteAccountApplicationsId DeleteAccountApplicationsId() {
		return new DeleteAccountApplicationsId();
	}
	
	/**
	 * GET /account/applications/{id}
	 */
	public static GetAccountApplicationsId GetAccountApplicationsId() {
		return new GetAccountApplicationsId();
	}
	
	/**
	 * PUT /account/applications/{id}
	 */
	public static PutAccountApplicationsId PutAccountApplicationsId() {
		return new PutAccountApplicationsId();
	}
	
	/**
	 * GET /account/catalogs
	 */
	public static GetAccountCatalogs GetAccountCatalogs() {
		return new GetAccountCatalogs();
	}
	
	/**
	 * POST /account/catalogs
	 */
	public static PostAccountCatalogs PostAccountCatalogs() {
		return new PostAccountCatalogs();
	}
	
	/**
	 * DELETE /account/catalogs/{id}
	 */
	public static DeleteAccountCatalogsId DeleteAccountCatalogsId() {
		return new DeleteAccountCatalogsId();
	}
	
	/**
	 * GET /account/catalogs/{id}
	 */
	public static GetAccountCatalogsId GetAccountCatalogsId() {
		return new GetAccountCatalogsId();
	}
	
	/**
	 * PUT /account/catalogs/{id}
	 */
	public static PutAccountCatalogsId PutAccountCatalogsId() {
		return new PutAccountCatalogsId();
	}
	
	/**
	 * GET /account/channels
	 */
	public static GetAccountChannels GetAccountChannels() {
		return new GetAccountChannels();
	}
	
	/**
	 * POST /account/channels
	 */
	public static PostAccountChannels PostAccountChannels() {
		return new PostAccountChannels();
	}
	
	/**
	 * DELETE /account/channels/{id}
	 */
	public static DeleteAccountChannelsId DeleteAccountChannelsId() {
		return new DeleteAccountChannelsId();
	}
	
	/**
	 * GET /account/channels/{id}
	 */
	public static GetAccountChannelsId GetAccountChannelsId() {
		return new GetAccountChannelsId();
	}
	
	/**
	 * PUT /account/channels/{id}
	 */
	public static PutAccountChannelsId PutAccountChannelsId() {
		return new PutAccountChannelsId();
	}
	
	/**
	 * GET /account/consumer_roles
	 */
	public static GetAccountConsumerRoles GetAccountConsumerRoles() {
		return new GetAccountConsumerRoles();
	}
	
	/**
	 * POST /account/consumer_roles
	 */
	public static PostAccountConsumerRoles PostAccountConsumerRoles() {
		return new PostAccountConsumerRoles();
	}
	
	/**
	 * DELETE /account/consumer_roles/{id}
	 */
	public static DeleteAccountConsumerRolesId DeleteAccountConsumerRolesId() {
		return new DeleteAccountConsumerRolesId();
	}
	
	/**
	 * GET /account/consumer_roles/{id}
	 */
	public static GetAccountConsumerRolesId GetAccountConsumerRolesId() {
		return new GetAccountConsumerRolesId();
	}
	
	/**
	 * PUT /account/consumer_roles/{id}
	 */
	public static PutAccountConsumerRolesId PutAccountConsumerRolesId() {
		return new PutAccountConsumerRolesId();
	}
	
	/**
	 * PUT /account/consumer_roles/{id}/move_at/{position}
	 */
	public static PutAccountConsumerRolesIdMoveAtPosition PutAccountConsumerRolesIdMoveAtPosition() {
		return new PutAccountConsumerRolesIdMoveAtPosition();
	}
	
	/**
	 * PUT /account/consumer_roles/{id}/move_bottom
	 */
	public static PutAccountConsumerRolesIdMoveBottom PutAccountConsumerRolesIdMoveBottom() {
		return new PutAccountConsumerRolesIdMoveBottom();
	}
	
	/**
	 * PUT /account/consumer_roles/{id}/move_down
	 */
	public static PutAccountConsumerRolesIdMoveDown PutAccountConsumerRolesIdMoveDown() {
		return new PutAccountConsumerRolesIdMoveDown();
	}
	
	/**
	 * PUT /account/consumer_roles/{id}/move_top
	 */
	public static PutAccountConsumerRolesIdMoveTop PutAccountConsumerRolesIdMoveTop() {
		return new PutAccountConsumerRolesIdMoveTop();
	}
	
	/**
	 * PUT /account/consumer_roles/{id}/move_up
	 */
	public static PutAccountConsumerRolesIdMoveUp PutAccountConsumerRolesIdMoveUp() {
		return new PutAccountConsumerRolesIdMoveUp();
	}
	
	/**
	 * GET /account/countries
	 */
	public static GetAccountCountries GetAccountCountries() {
		return new GetAccountCountries();
	}
	
	/**
	 * POST /account/countries
	 */
	public static PostAccountCountries PostAccountCountries() {
		return new PostAccountCountries();
	}
	
	/**
	 * DELETE /account/countries/{id}
	 */
	public static DeleteAccountCountriesId DeleteAccountCountriesId() {
		return new DeleteAccountCountriesId();
	}
	
	/**
	 * GET /account/countries/{id}
	 */
	public static GetAccountCountriesId GetAccountCountriesId() {
		return new GetAccountCountriesId();
	}
	
	/**
	 * PUT /account/countries/{id}
	 */
	public static PutAccountCountriesId PutAccountCountriesId() {
		return new PutAccountCountriesId();
	}
	
	/**
	 * GET /account/country_groups
	 */
	public static GetAccountCountryGroups GetAccountCountryGroups() {
		return new GetAccountCountryGroups();
	}
	
	/**
	 * POST /account/country_groups
	 */
	public static PostAccountCountryGroups PostAccountCountryGroups() {
		return new PostAccountCountryGroups();
	}
	
	/**
	 * DELETE /account/country_groups/{id}
	 */
	public static DeleteAccountCountryGroupsId DeleteAccountCountryGroupsId() {
		return new DeleteAccountCountryGroupsId();
	}
	
	/**
	 * GET /account/country_groups/{id}
	 */
	public static GetAccountCountryGroupsId GetAccountCountryGroupsId() {
		return new GetAccountCountryGroupsId();
	}
	
	/**
	 * PUT /account/country_groups/{id}
	 */
	public static PutAccountCountryGroupsId PutAccountCountryGroupsId() {
		return new PutAccountCountryGroupsId();
	}
	
	/**
	 * GET /account/country_languages
	 */
	public static GetAccountCountryLanguages GetAccountCountryLanguages() {
		return new GetAccountCountryLanguages();
	}
	
	/**
	 * POST /account/country_languages
	 */
	public static PostAccountCountryLanguages PostAccountCountryLanguages() {
		return new PostAccountCountryLanguages();
	}
	
	/**
	 * DELETE /account/country_languages/{id}
	 */
	public static DeleteAccountCountryLanguagesId DeleteAccountCountryLanguagesId() {
		return new DeleteAccountCountryLanguagesId();
	}
	
	/**
	 * GET /account/country_languages/{id}
	 */
	public static GetAccountCountryLanguagesId GetAccountCountryLanguagesId() {
		return new GetAccountCountryLanguagesId();
	}
	
	/**
	 * PUT /account/country_languages/{id}
	 */
	public static PutAccountCountryLanguagesId PutAccountCountryLanguagesId() {
		return new PutAccountCountryLanguagesId();
	}
	
	/**
	 * PUT /account/country_languages/{id}/move_at/{position}
	 */
	public static PutAccountCountryLanguagesIdMoveAtPosition PutAccountCountryLanguagesIdMoveAtPosition() {
		return new PutAccountCountryLanguagesIdMoveAtPosition();
	}
	
	/**
	 * PUT /account/country_languages/{id}/move_bottom
	 */
	public static PutAccountCountryLanguagesIdMoveBottom PutAccountCountryLanguagesIdMoveBottom() {
		return new PutAccountCountryLanguagesIdMoveBottom();
	}
	
	/**
	 * PUT /account/country_languages/{id}/move_down
	 */
	public static PutAccountCountryLanguagesIdMoveDown PutAccountCountryLanguagesIdMoveDown() {
		return new PutAccountCountryLanguagesIdMoveDown();
	}
	
	/**
	 * PUT /account/country_languages/{id}/move_top
	 */
	public static PutAccountCountryLanguagesIdMoveTop PutAccountCountryLanguagesIdMoveTop() {
		return new PutAccountCountryLanguagesIdMoveTop();
	}
	
	/**
	 * PUT /account/country_languages/{id}/move_up
	 */
	public static PutAccountCountryLanguagesIdMoveUp PutAccountCountryLanguagesIdMoveUp() {
		return new PutAccountCountryLanguagesIdMoveUp();
	}
	
	/**
	 * GET /account/credit_cards
	 */
	public static GetAccountCreditCards GetAccountCreditCards() {
		return new GetAccountCreditCards();
	}
	
	/**
	 * POST /account/credit_cards
	 */
	public static PostAccountCreditCards PostAccountCreditCards() {
		return new PostAccountCreditCards();
	}
	
	/**
	 * DELETE /account/credit_cards/{id}
	 */
	public static DeleteAccountCreditCardsId DeleteAccountCreditCardsId() {
		return new DeleteAccountCreditCardsId();
	}
	
	/**
	 * GET /account/credit_cards/{id}
	 */
	public static GetAccountCreditCardsId GetAccountCreditCardsId() {
		return new GetAccountCreditCardsId();
	}
	
	/**
	 * PUT /account/credit_cards/{id}
	 */
	public static PutAccountCreditCardsId PutAccountCreditCardsId() {
		return new PutAccountCreditCardsId();
	}
	
	/**
	 * GET /account/currencies
	 */
	public static GetAccountCurrencies GetAccountCurrencies() {
		return new GetAccountCurrencies();
	}
	
	/**
	 * POST /account/currencies
	 */
	public static PostAccountCurrencies PostAccountCurrencies() {
		return new PostAccountCurrencies();
	}
	
	/**
	 * DELETE /account/currencies/{id}
	 */
	public static DeleteAccountCurrenciesId DeleteAccountCurrenciesId() {
		return new DeleteAccountCurrenciesId();
	}
	
	/**
	 * GET /account/currencies/{id}
	 */
	public static GetAccountCurrenciesId GetAccountCurrenciesId() {
		return new GetAccountCurrenciesId();
	}
	
	/**
	 * PUT /account/currencies/{id}
	 */
	public static PutAccountCurrenciesId PutAccountCurrenciesId() {
		return new PutAccountCurrenciesId();
	}
	
	/**
	 * GET /account/customers
	 */
	public static GetAccountCustomers GetAccountCustomers() {
		return new GetAccountCustomers();
	}
	
	/**
	 * POST /account/customers
	 */
	public static PostAccountCustomers PostAccountCustomers() {
		return new PostAccountCustomers();
	}
	
	/**
	 * DELETE /account/customers/{id}
	 */
	public static DeleteAccountCustomersId DeleteAccountCustomersId() {
		return new DeleteAccountCustomersId();
	}
	
	/**
	 * GET /account/customers/{id}
	 */
	public static GetAccountCustomersId GetAccountCustomersId() {
		return new GetAccountCustomersId();
	}
	
	/**
	 * PUT /account/customers/{id}
	 */
	public static PutAccountCustomersId PutAccountCustomersId() {
		return new PutAccountCustomersId();
	}
	
	/**
	 * GET /account/environments
	 */
	public static GetAccountEnvironments GetAccountEnvironments() {
		return new GetAccountEnvironments();
	}
	
	/**
	 * POST /account/environments
	 */
	public static PostAccountEnvironments PostAccountEnvironments() {
		return new PostAccountEnvironments();
	}
	
	/**
	 * DELETE /account/environments/{id}
	 */
	public static DeleteAccountEnvironmentsId DeleteAccountEnvironmentsId() {
		return new DeleteAccountEnvironmentsId();
	}
	
	/**
	 * GET /account/environments/{id}
	 */
	public static GetAccountEnvironmentsId GetAccountEnvironmentsId() {
		return new GetAccountEnvironmentsId();
	}
	
	/**
	 * PUT /account/environments/{id}
	 */
	public static PutAccountEnvironmentsId PutAccountEnvironmentsId() {
		return new PutAccountEnvironmentsId();
	}
	
	/**
	 * GET /account/images
	 */
	public static GetAccountImages GetAccountImages() {
		return new GetAccountImages();
	}
	
	/**
	 * POST /account/images
	 */
	public static PostAccountImages PostAccountImages() {
		return new PostAccountImages();
	}
	
	/**
	 * DELETE /account/images/{id}
	 */
	public static DeleteAccountImagesId DeleteAccountImagesId() {
		return new DeleteAccountImagesId();
	}
	
	/**
	 * GET /account/images/{id}
	 */
	public static GetAccountImagesId GetAccountImagesId() {
		return new GetAccountImagesId();
	}
	
	/**
	 * PUT /account/images/{id}
	 */
	public static PutAccountImagesId PutAccountImagesId() {
		return new PutAccountImagesId();
	}
	
	/**
	 * GET /account/languages
	 */
	public static GetAccountLanguages GetAccountLanguages() {
		return new GetAccountLanguages();
	}
	
	/**
	 * POST /account/languages
	 */
	public static PostAccountLanguages PostAccountLanguages() {
		return new PostAccountLanguages();
	}
	
	/**
	 * DELETE /account/languages/{id}
	 */
	public static DeleteAccountLanguagesId DeleteAccountLanguagesId() {
		return new DeleteAccountLanguagesId();
	}
	
	/**
	 * GET /account/languages/{id}
	 */
	public static GetAccountLanguagesId GetAccountLanguagesId() {
		return new GetAccountLanguagesId();
	}
	
	/**
	 * PUT /account/languages/{id}
	 */
	public static PutAccountLanguagesId PutAccountLanguagesId() {
		return new PutAccountLanguagesId();
	}
	
	/**
	 * GET /account/line_item_stocks
	 */
	public static GetAccountLineItemStocks GetAccountLineItemStocks() {
		return new GetAccountLineItemStocks();
	}
	
	/**
	 * POST /account/line_item_stocks
	 */
	public static PostAccountLineItemStocks PostAccountLineItemStocks() {
		return new PostAccountLineItemStocks();
	}
	
	/**
	 * DELETE /account/line_item_stocks/{id}
	 */
	public static DeleteAccountLineItemStocksId DeleteAccountLineItemStocksId() {
		return new DeleteAccountLineItemStocksId();
	}
	
	/**
	 * GET /account/line_item_stocks/{id}
	 */
	public static GetAccountLineItemStocksId GetAccountLineItemStocksId() {
		return new GetAccountLineItemStocksId();
	}
	
	/**
	 * PUT /account/line_item_stocks/{id}
	 */
	public static PutAccountLineItemStocksId PutAccountLineItemStocksId() {
		return new PutAccountLineItemStocksId();
	}
	
	/**
	 * GET /account/line_items
	 */
	public static GetAccountLineItems GetAccountLineItems() {
		return new GetAccountLineItems();
	}
	
	/**
	 * POST /account/line_items
	 */
	public static PostAccountLineItems PostAccountLineItems() {
		return new PostAccountLineItems();
	}
	
	/**
	 * DELETE /account/line_items/{id}
	 */
	public static DeleteAccountLineItemsId DeleteAccountLineItemsId() {
		return new DeleteAccountLineItemsId();
	}
	
	/**
	 * GET /account/line_items/{id}
	 */
	public static GetAccountLineItemsId GetAccountLineItemsId() {
		return new GetAccountLineItemsId();
	}
	
	/**
	 * PUT /account/line_items/{id}
	 */
	public static PutAccountLineItemsId PutAccountLineItemsId() {
		return new PutAccountLineItemsId();
	}
	
	/**
	 * GET /account/market_payment_types
	 */
	public static GetAccountMarketPaymentTypes GetAccountMarketPaymentTypes() {
		return new GetAccountMarketPaymentTypes();
	}
	
	/**
	 * POST /account/market_payment_types
	 */
	public static PostAccountMarketPaymentTypes PostAccountMarketPaymentTypes() {
		return new PostAccountMarketPaymentTypes();
	}
	
	/**
	 * DELETE /account/market_payment_types/{id}
	 */
	public static DeleteAccountMarketPaymentTypesId DeleteAccountMarketPaymentTypesId() {
		return new DeleteAccountMarketPaymentTypesId();
	}
	
	/**
	 * GET /account/market_payment_types/{id}
	 */
	public static GetAccountMarketPaymentTypesId GetAccountMarketPaymentTypesId() {
		return new GetAccountMarketPaymentTypesId();
	}
	
	/**
	 * PUT /account/market_payment_types/{id}
	 */
	public static PutAccountMarketPaymentTypesId PutAccountMarketPaymentTypesId() {
		return new PutAccountMarketPaymentTypesId();
	}
	
	/**
	 * GET /account/market_shipping_services
	 */
	public static GetAccountMarketShippingServices GetAccountMarketShippingServices() {
		return new GetAccountMarketShippingServices();
	}
	
	/**
	 * POST /account/market_shipping_services
	 */
	public static PostAccountMarketShippingServices PostAccountMarketShippingServices() {
		return new PostAccountMarketShippingServices();
	}
	
	/**
	 * DELETE /account/market_shipping_services/{id}
	 */
	public static DeleteAccountMarketShippingServicesId DeleteAccountMarketShippingServicesId() {
		return new DeleteAccountMarketShippingServicesId();
	}
	
	/**
	 * GET /account/market_shipping_services/{id}
	 */
	public static GetAccountMarketShippingServicesId GetAccountMarketShippingServicesId() {
		return new GetAccountMarketShippingServicesId();
	}
	
	/**
	 * PUT /account/market_shipping_services/{id}
	 */
	public static PutAccountMarketShippingServicesId PutAccountMarketShippingServicesId() {
		return new PutAccountMarketShippingServicesId();
	}
	
	/**
	 * GET /account/market_stock_locations
	 */
	public static GetAccountMarketStockLocations GetAccountMarketStockLocations() {
		return new GetAccountMarketStockLocations();
	}
	
	/**
	 * POST /account/market_stock_locations
	 */
	public static PostAccountMarketStockLocations PostAccountMarketStockLocations() {
		return new PostAccountMarketStockLocations();
	}
	
	/**
	 * DELETE /account/market_stock_locations/{id}
	 */
	public static DeleteAccountMarketStockLocationsId DeleteAccountMarketStockLocationsId() {
		return new DeleteAccountMarketStockLocationsId();
	}
	
	/**
	 * GET /account/market_stock_locations/{id}
	 */
	public static GetAccountMarketStockLocationsId GetAccountMarketStockLocationsId() {
		return new GetAccountMarketStockLocationsId();
	}
	
	/**
	 * PUT /account/market_stock_locations/{id}
	 */
	public static PutAccountMarketStockLocationsId PutAccountMarketStockLocationsId() {
		return new PutAccountMarketStockLocationsId();
	}
	
	/**
	 * GET /account/markets
	 */
	public static GetAccountMarkets GetAccountMarkets() {
		return new GetAccountMarkets();
	}
	
	/**
	 * POST /account/markets
	 */
	public static PostAccountMarkets PostAccountMarkets() {
		return new PostAccountMarkets();
	}
	
	/**
	 * DELETE /account/markets/{id}
	 */
	public static DeleteAccountMarketsId DeleteAccountMarketsId() {
		return new DeleteAccountMarketsId();
	}
	
	/**
	 * GET /account/markets/{id}
	 */
	public static GetAccountMarketsId GetAccountMarketsId() {
		return new GetAccountMarketsId();
	}
	
	/**
	 * PUT /account/markets/{id}
	 */
	public static PutAccountMarketsId PutAccountMarketsId() {
		return new PutAccountMarketsId();
	}
	
	/**
	 * POST /account/markets/{id}/reset_index
	 */
	public static PostAccountMarketsIdResetIndex PostAccountMarketsIdResetIndex() {
		return new PostAccountMarketsIdResetIndex();
	}
	
	/**
	 * GET /account/merchandising_rules
	 */
	public static GetAccountMerchandisingRules GetAccountMerchandisingRules() {
		return new GetAccountMerchandisingRules();
	}
	
	/**
	 * POST /account/merchandising_rules
	 */
	public static PostAccountMerchandisingRules PostAccountMerchandisingRules() {
		return new PostAccountMerchandisingRules();
	}
	
	/**
	 * DELETE /account/merchandising_rules/{id}
	 */
	public static DeleteAccountMerchandisingRulesId DeleteAccountMerchandisingRulesId() {
		return new DeleteAccountMerchandisingRulesId();
	}
	
	/**
	 * GET /account/merchandising_rules/{id}
	 */
	public static GetAccountMerchandisingRulesId GetAccountMerchandisingRulesId() {
		return new GetAccountMerchandisingRulesId();
	}
	
	/**
	 * PUT /account/merchandising_rules/{id}
	 */
	public static PutAccountMerchandisingRulesId PutAccountMerchandisingRulesId() {
		return new PutAccountMerchandisingRulesId();
	}
	
	/**
	 * PUT /account/merchandising_rules/{id}/move_at/{position}
	 */
	public static PutAccountMerchandisingRulesIdMoveAtPosition PutAccountMerchandisingRulesIdMoveAtPosition() {
		return new PutAccountMerchandisingRulesIdMoveAtPosition();
	}
	
	/**
	 * PUT /account/merchandising_rules/{id}/move_bottom
	 */
	public static PutAccountMerchandisingRulesIdMoveBottom PutAccountMerchandisingRulesIdMoveBottom() {
		return new PutAccountMerchandisingRulesIdMoveBottom();
	}
	
	/**
	 * PUT /account/merchandising_rules/{id}/move_down
	 */
	public static PutAccountMerchandisingRulesIdMoveDown PutAccountMerchandisingRulesIdMoveDown() {
		return new PutAccountMerchandisingRulesIdMoveDown();
	}
	
	/**
	 * PUT /account/merchandising_rules/{id}/move_top
	 */
	public static PutAccountMerchandisingRulesIdMoveTop PutAccountMerchandisingRulesIdMoveTop() {
		return new PutAccountMerchandisingRulesIdMoveTop();
	}
	
	/**
	 * PUT /account/merchandising_rules/{id}/move_up
	 */
	public static PutAccountMerchandisingRulesIdMoveUp PutAccountMerchandisingRulesIdMoveUp() {
		return new PutAccountMerchandisingRulesIdMoveUp();
	}
	
	/**
	 * GET /account/merchants
	 */
	public static GetAccountMerchants GetAccountMerchants() {
		return new GetAccountMerchants();
	}
	
	/**
	 * POST /account/merchants
	 */
	public static PostAccountMerchants PostAccountMerchants() {
		return new PostAccountMerchants();
	}
	
	/**
	 * DELETE /account/merchants/{id}
	 */
	public static DeleteAccountMerchantsId DeleteAccountMerchantsId() {
		return new DeleteAccountMerchantsId();
	}
	
	/**
	 * GET /account/merchants/{id}
	 */
	public static GetAccountMerchantsId GetAccountMerchantsId() {
		return new GetAccountMerchantsId();
	}
	
	/**
	 * PUT /account/merchants/{id}
	 */
	public static PutAccountMerchantsId PutAccountMerchantsId() {
		return new PutAccountMerchantsId();
	}
	
	/**
	 * GET /account/option_types
	 */
	public static GetAccountOptionTypes GetAccountOptionTypes() {
		return new GetAccountOptionTypes();
	}
	
	/**
	 * POST /account/option_types
	 */
	public static PostAccountOptionTypes PostAccountOptionTypes() {
		return new PostAccountOptionTypes();
	}
	
	/**
	 * DELETE /account/option_types/{id}
	 */
	public static DeleteAccountOptionTypesId DeleteAccountOptionTypesId() {
		return new DeleteAccountOptionTypesId();
	}
	
	/**
	 * GET /account/option_types/{id}
	 */
	public static GetAccountOptionTypesId GetAccountOptionTypesId() {
		return new GetAccountOptionTypesId();
	}
	
	/**
	 * PUT /account/option_types/{id}
	 */
	public static PutAccountOptionTypesId PutAccountOptionTypesId() {
		return new PutAccountOptionTypesId();
	}
	
	/**
	 * GET /account/option_values
	 */
	public static GetAccountOptionValues GetAccountOptionValues() {
		return new GetAccountOptionValues();
	}
	
	/**
	 * POST /account/option_values
	 */
	public static PostAccountOptionValues PostAccountOptionValues() {
		return new PostAccountOptionValues();
	}
	
	/**
	 * DELETE /account/option_values/{id}
	 */
	public static DeleteAccountOptionValuesId DeleteAccountOptionValuesId() {
		return new DeleteAccountOptionValuesId();
	}
	
	/**
	 * GET /account/option_values/{id}
	 */
	public static GetAccountOptionValuesId GetAccountOptionValuesId() {
		return new GetAccountOptionValuesId();
	}
	
	/**
	 * PUT /account/option_values/{id}
	 */
	public static PutAccountOptionValuesId PutAccountOptionValuesId() {
		return new PutAccountOptionValuesId();
	}
	
	/**
	 * GET /account/order_validators
	 */
	public static GetAccountOrderValidators GetAccountOrderValidators() {
		return new GetAccountOrderValidators();
	}
	
	/**
	 * POST /account/order_validators
	 */
	public static PostAccountOrderValidators PostAccountOrderValidators() {
		return new PostAccountOrderValidators();
	}
	
	/**
	 * DELETE /account/order_validators/{id}
	 */
	public static DeleteAccountOrderValidatorsId DeleteAccountOrderValidatorsId() {
		return new DeleteAccountOrderValidatorsId();
	}
	
	/**
	 * GET /account/order_validators/{id}
	 */
	public static GetAccountOrderValidatorsId GetAccountOrderValidatorsId() {
		return new GetAccountOrderValidatorsId();
	}
	
	/**
	 * PUT /account/order_validators/{id}
	 */
	public static PutAccountOrderValidatorsId PutAccountOrderValidatorsId() {
		return new PutAccountOrderValidatorsId();
	}
	
	/**
	 * GET /account/orders
	 */
	public static GetAccountOrders GetAccountOrders() {
		return new GetAccountOrders();
	}
	
	/**
	 * POST /account/orders
	 */
	public static PostAccountOrders PostAccountOrders() {
		return new PostAccountOrders();
	}
	
	/**
	 * DELETE /account/orders/{id}
	 */
	public static DeleteAccountOrdersId DeleteAccountOrdersId() {
		return new DeleteAccountOrdersId();
	}
	
	/**
	 * GET /account/orders/{id}
	 */
	public static GetAccountOrdersId GetAccountOrdersId() {
		return new GetAccountOrdersId();
	}
	
	/**
	 * PUT /account/orders/{id}
	 */
	public static PutAccountOrdersId PutAccountOrdersId() {
		return new PutAccountOrdersId();
	}
	
	/**
	 * GET /account/organizations
	 */
	public static GetAccountOrganizations GetAccountOrganizations() {
		return new GetAccountOrganizations();
	}
	
	/**
	 * POST /account/organizations
	 */
	public static PostAccountOrganizations PostAccountOrganizations() {
		return new PostAccountOrganizations();
	}
	
	/**
	 * DELETE /account/organizations/{id}
	 */
	public static DeleteAccountOrganizationsId DeleteAccountOrganizationsId() {
		return new DeleteAccountOrganizationsId();
	}
	
	/**
	 * GET /account/organizations/{id}
	 */
	public static GetAccountOrganizationsId GetAccountOrganizationsId() {
		return new GetAccountOrganizationsId();
	}
	
	/**
	 * PUT /account/organizations/{id}
	 */
	public static PutAccountOrganizationsId PutAccountOrganizationsId() {
		return new PutAccountOrganizationsId();
	}
	
	/**
	 * GET /account/payment_methods
	 */
	public static GetAccountPaymentMethods GetAccountPaymentMethods() {
		return new GetAccountPaymentMethods();
	}
	
	/**
	 * POST /account/payment_methods
	 */
	public static PostAccountPaymentMethods PostAccountPaymentMethods() {
		return new PostAccountPaymentMethods();
	}
	
	/**
	 * DELETE /account/payment_methods/{id}
	 */
	public static DeleteAccountPaymentMethodsId DeleteAccountPaymentMethodsId() {
		return new DeleteAccountPaymentMethodsId();
	}
	
	/**
	 * GET /account/payment_methods/{id}
	 */
	public static GetAccountPaymentMethodsId GetAccountPaymentMethodsId() {
		return new GetAccountPaymentMethodsId();
	}
	
	/**
	 * PUT /account/payment_methods/{id}
	 */
	public static PutAccountPaymentMethodsId PutAccountPaymentMethodsId() {
		return new PutAccountPaymentMethodsId();
	}
	
	/**
	 * GET /account/payment_types
	 */
	public static GetAccountPaymentTypes GetAccountPaymentTypes() {
		return new GetAccountPaymentTypes();
	}
	
	/**
	 * POST /account/payment_types
	 */
	public static PostAccountPaymentTypes PostAccountPaymentTypes() {
		return new PostAccountPaymentTypes();
	}
	
	/**
	 * DELETE /account/payment_types/{id}
	 */
	public static DeleteAccountPaymentTypesId DeleteAccountPaymentTypesId() {
		return new DeleteAccountPaymentTypesId();
	}
	
	/**
	 * GET /account/payment_types/{id}
	 */
	public static GetAccountPaymentTypesId GetAccountPaymentTypesId() {
		return new GetAccountPaymentTypesId();
	}
	
	/**
	 * PUT /account/payment_types/{id}
	 */
	public static PutAccountPaymentTypesId PutAccountPaymentTypesId() {
		return new PutAccountPaymentTypesId();
	}
	
	/**
	 * GET /account/permissions
	 */
	public static GetAccountPermissions GetAccountPermissions() {
		return new GetAccountPermissions();
	}
	
	/**
	 * POST /account/permissions
	 */
	public static PostAccountPermissions PostAccountPermissions() {
		return new PostAccountPermissions();
	}
	
	/**
	 * DELETE /account/permissions/{id}
	 */
	public static DeleteAccountPermissionsId DeleteAccountPermissionsId() {
		return new DeleteAccountPermissionsId();
	}
	
	/**
	 * GET /account/permissions/{id}
	 */
	public static GetAccountPermissionsId GetAccountPermissionsId() {
		return new GetAccountPermissionsId();
	}
	
	/**
	 * PUT /account/permissions/{id}
	 */
	public static PutAccountPermissionsId PutAccountPermissionsId() {
		return new PutAccountPermissionsId();
	}
	
	/**
	 * PUT /account/permissions/{id}/move_at/{position}
	 */
	public static PutAccountPermissionsIdMoveAtPosition PutAccountPermissionsIdMoveAtPosition() {
		return new PutAccountPermissionsIdMoveAtPosition();
	}
	
	/**
	 * PUT /account/permissions/{id}/move_bottom
	 */
	public static PutAccountPermissionsIdMoveBottom PutAccountPermissionsIdMoveBottom() {
		return new PutAccountPermissionsIdMoveBottom();
	}
	
	/**
	 * PUT /account/permissions/{id}/move_down
	 */
	public static PutAccountPermissionsIdMoveDown PutAccountPermissionsIdMoveDown() {
		return new PutAccountPermissionsIdMoveDown();
	}
	
	/**
	 * PUT /account/permissions/{id}/move_top
	 */
	public static PutAccountPermissionsIdMoveTop PutAccountPermissionsIdMoveTop() {
		return new PutAccountPermissionsIdMoveTop();
	}
	
	/**
	 * PUT /account/permissions/{id}/move_up
	 */
	public static PutAccountPermissionsIdMoveUp PutAccountPermissionsIdMoveUp() {
		return new PutAccountPermissionsIdMoveUp();
	}
	
	/**
	 * GET /account/price_lists
	 */
	public static GetAccountPriceLists GetAccountPriceLists() {
		return new GetAccountPriceLists();
	}
	
	/**
	 * POST /account/price_lists
	 */
	public static PostAccountPriceLists PostAccountPriceLists() {
		return new PostAccountPriceLists();
	}
	
	/**
	 * DELETE /account/price_lists/{id}
	 */
	public static DeleteAccountPriceListsId DeleteAccountPriceListsId() {
		return new DeleteAccountPriceListsId();
	}
	
	/**
	 * GET /account/price_lists/{id}
	 */
	public static GetAccountPriceListsId GetAccountPriceListsId() {
		return new GetAccountPriceListsId();
	}
	
	/**
	 * PUT /account/price_lists/{id}
	 */
	public static PutAccountPriceListsId PutAccountPriceListsId() {
		return new PutAccountPriceListsId();
	}
	
	/**
	 * GET /account/prices
	 */
	public static GetAccountPrices GetAccountPrices() {
		return new GetAccountPrices();
	}
	
	/**
	 * POST /account/prices
	 */
	public static PostAccountPrices PostAccountPrices() {
		return new PostAccountPrices();
	}
	
	/**
	 * DELETE /account/prices/{id}
	 */
	public static DeleteAccountPricesId DeleteAccountPricesId() {
		return new DeleteAccountPricesId();
	}
	
	/**
	 * GET /account/prices/{id}
	 */
	public static GetAccountPricesId GetAccountPricesId() {
		return new GetAccountPricesId();
	}
	
	/**
	 * PUT /account/prices/{id}
	 */
	public static PutAccountPricesId PutAccountPricesId() {
		return new PutAccountPricesId();
	}
	
	/**
	 * GET /account/prices/{id}/exchanges
	 */
	public static GetAccountPricesIdExchanges GetAccountPricesIdExchanges() {
		return new GetAccountPricesIdExchanges();
	}
	
	/**
	 * GET /account/product_properties
	 */
	public static GetAccountProductProperties GetAccountProductProperties() {
		return new GetAccountProductProperties();
	}
	
	/**
	 * POST /account/product_properties
	 */
	public static PostAccountProductProperties PostAccountProductProperties() {
		return new PostAccountProductProperties();
	}
	
	/**
	 * DELETE /account/product_properties/{id}
	 */
	public static DeleteAccountProductPropertiesId DeleteAccountProductPropertiesId() {
		return new DeleteAccountProductPropertiesId();
	}
	
	/**
	 * GET /account/product_properties/{id}
	 */
	public static GetAccountProductPropertiesId GetAccountProductPropertiesId() {
		return new GetAccountProductPropertiesId();
	}
	
	/**
	 * PUT /account/product_properties/{id}
	 */
	public static PutAccountProductPropertiesId PutAccountProductPropertiesId() {
		return new PutAccountProductPropertiesId();
	}
	
	/**
	 * GET /account/product_types
	 */
	public static GetAccountProductTypes GetAccountProductTypes() {
		return new GetAccountProductTypes();
	}
	
	/**
	 * POST /account/product_types
	 */
	public static PostAccountProductTypes PostAccountProductTypes() {
		return new PostAccountProductTypes();
	}
	
	/**
	 * DELETE /account/product_types/{id}
	 */
	public static DeleteAccountProductTypesId DeleteAccountProductTypesId() {
		return new DeleteAccountProductTypesId();
	}
	
	/**
	 * GET /account/product_types/{id}
	 */
	public static GetAccountProductTypesId GetAccountProductTypesId() {
		return new GetAccountProductTypesId();
	}
	
	/**
	 * PUT /account/product_types/{id}
	 */
	public static PutAccountProductTypesId PutAccountProductTypesId() {
		return new PutAccountProductTypesId();
	}
	
	/**
	 * GET /account/products
	 */
	public static GetAccountProducts GetAccountProducts() {
		return new GetAccountProducts();
	}
	
	/**
	 * POST /account/products
	 */
	public static PostAccountProducts PostAccountProducts() {
		return new PostAccountProducts();
	}
	
	/**
	 * DELETE /account/products/{id}
	 */
	public static DeleteAccountProductsId DeleteAccountProductsId() {
		return new DeleteAccountProductsId();
	}
	
	/**
	 * GET /account/products/{id}
	 */
	public static GetAccountProductsId GetAccountProductsId() {
		return new GetAccountProductsId();
	}
	
	/**
	 * PUT /account/products/{id}
	 */
	public static PutAccountProductsId PutAccountProductsId() {
		return new PutAccountProductsId();
	}
	
	/**
	 * GET /account/property_types
	 */
	public static GetAccountPropertyTypes GetAccountPropertyTypes() {
		return new GetAccountPropertyTypes();
	}
	
	/**
	 * POST /account/property_types
	 */
	public static PostAccountPropertyTypes PostAccountPropertyTypes() {
		return new PostAccountPropertyTypes();
	}
	
	/**
	 * DELETE /account/property_types/{id}
	 */
	public static DeleteAccountPropertyTypesId DeleteAccountPropertyTypesId() {
		return new DeleteAccountPropertyTypesId();
	}
	
	/**
	 * GET /account/property_types/{id}
	 */
	public static GetAccountPropertyTypesId GetAccountPropertyTypesId() {
		return new GetAccountPropertyTypesId();
	}
	
	/**
	 * PUT /account/property_types/{id}
	 */
	public static PutAccountPropertyTypesId PutAccountPropertyTypesId() {
		return new PutAccountPropertyTypesId();
	}
	
	/**
	 * GET /account/property_values
	 */
	public static GetAccountPropertyValues GetAccountPropertyValues() {
		return new GetAccountPropertyValues();
	}
	
	/**
	 * POST /account/property_values
	 */
	public static PostAccountPropertyValues PostAccountPropertyValues() {
		return new PostAccountPropertyValues();
	}
	
	/**
	 * DELETE /account/property_values/{id}
	 */
	public static DeleteAccountPropertyValuesId DeleteAccountPropertyValuesId() {
		return new DeleteAccountPropertyValuesId();
	}
	
	/**
	 * GET /account/property_values/{id}
	 */
	public static GetAccountPropertyValuesId GetAccountPropertyValuesId() {
		return new GetAccountPropertyValuesId();
	}
	
	/**
	 * PUT /account/property_values/{id}
	 */
	public static PutAccountPropertyValuesId PutAccountPropertyValuesId() {
		return new PutAccountPropertyValuesId();
	}
	
	/**
	 * GET /account/resource_images
	 */
	public static GetAccountResourceImages GetAccountResourceImages() {
		return new GetAccountResourceImages();
	}
	
	/**
	 * POST /account/resource_images
	 */
	public static PostAccountResourceImages PostAccountResourceImages() {
		return new PostAccountResourceImages();
	}
	
	/**
	 * DELETE /account/resource_images/{id}
	 */
	public static DeleteAccountResourceImagesId DeleteAccountResourceImagesId() {
		return new DeleteAccountResourceImagesId();
	}
	
	/**
	 * GET /account/resource_images/{id}
	 */
	public static GetAccountResourceImagesId GetAccountResourceImagesId() {
		return new GetAccountResourceImagesId();
	}
	
	/**
	 * PUT /account/resource_images/{id}
	 */
	public static PutAccountResourceImagesId PutAccountResourceImagesId() {
		return new PutAccountResourceImagesId();
	}
	
	/**
	 * PUT /account/resource_images/{id}/move_at/{position}
	 */
	public static PutAccountResourceImagesIdMoveAtPosition PutAccountResourceImagesIdMoveAtPosition() {
		return new PutAccountResourceImagesIdMoveAtPosition();
	}
	
	/**
	 * PUT /account/resource_images/{id}/move_bottom
	 */
	public static PutAccountResourceImagesIdMoveBottom PutAccountResourceImagesIdMoveBottom() {
		return new PutAccountResourceImagesIdMoveBottom();
	}
	
	/**
	 * PUT /account/resource_images/{id}/move_down
	 */
	public static PutAccountResourceImagesIdMoveDown PutAccountResourceImagesIdMoveDown() {
		return new PutAccountResourceImagesIdMoveDown();
	}
	
	/**
	 * PUT /account/resource_images/{id}/move_top
	 */
	public static PutAccountResourceImagesIdMoveTop PutAccountResourceImagesIdMoveTop() {
		return new PutAccountResourceImagesIdMoveTop();
	}
	
	/**
	 * PUT /account/resource_images/{id}/move_up
	 */
	public static PutAccountResourceImagesIdMoveUp PutAccountResourceImagesIdMoveUp() {
		return new PutAccountResourceImagesIdMoveUp();
	}
	
	/**
	 * GET /account/roles
	 */
	public static GetAccountRoles GetAccountRoles() {
		return new GetAccountRoles();
	}
	
	/**
	 * POST /account/roles
	 */
	public static PostAccountRoles PostAccountRoles() {
		return new PostAccountRoles();
	}
	
	/**
	 * DELETE /account/roles/{id}
	 */
	public static DeleteAccountRolesId DeleteAccountRolesId() {
		return new DeleteAccountRolesId();
	}
	
	/**
	 * GET /account/roles/{id}
	 */
	public static GetAccountRolesId GetAccountRolesId() {
		return new GetAccountRolesId();
	}
	
	/**
	 * PUT /account/roles/{id}
	 */
	public static PutAccountRolesId PutAccountRolesId() {
		return new PutAccountRolesId();
	}
	
	/**
	 * GET /account/shipments
	 */
	public static GetAccountShipments GetAccountShipments() {
		return new GetAccountShipments();
	}
	
	/**
	 * POST /account/shipments
	 */
	public static PostAccountShipments PostAccountShipments() {
		return new PostAccountShipments();
	}
	
	/**
	 * DELETE /account/shipments/{id}
	 */
	public static DeleteAccountShipmentsId DeleteAccountShipmentsId() {
		return new DeleteAccountShipmentsId();
	}
	
	/**
	 * GET /account/shipments/{id}
	 */
	public static GetAccountShipmentsId GetAccountShipmentsId() {
		return new GetAccountShipmentsId();
	}
	
	/**
	 * PUT /account/shipments/{id}
	 */
	public static PutAccountShipmentsId PutAccountShipmentsId() {
		return new PutAccountShipmentsId();
	}
	
	/**
	 * GET /account/shipping_carrier_types
	 */
	public static GetAccountShippingCarrierTypes GetAccountShippingCarrierTypes() {
		return new GetAccountShippingCarrierTypes();
	}
	
	/**
	 * POST /account/shipping_carrier_types
	 */
	public static PostAccountShippingCarrierTypes PostAccountShippingCarrierTypes() {
		return new PostAccountShippingCarrierTypes();
	}
	
	/**
	 * DELETE /account/shipping_carrier_types/{id}
	 */
	public static DeleteAccountShippingCarrierTypesId DeleteAccountShippingCarrierTypesId() {
		return new DeleteAccountShippingCarrierTypesId();
	}
	
	/**
	 * GET /account/shipping_carrier_types/{id}
	 */
	public static GetAccountShippingCarrierTypesId GetAccountShippingCarrierTypesId() {
		return new GetAccountShippingCarrierTypesId();
	}
	
	/**
	 * PUT /account/shipping_carrier_types/{id}
	 */
	public static PutAccountShippingCarrierTypesId PutAccountShippingCarrierTypesId() {
		return new PutAccountShippingCarrierTypesId();
	}
	
	/**
	 * GET /account/shipping_carriers
	 */
	public static GetAccountShippingCarriers GetAccountShippingCarriers() {
		return new GetAccountShippingCarriers();
	}
	
	/**
	 * POST /account/shipping_carriers
	 */
	public static PostAccountShippingCarriers PostAccountShippingCarriers() {
		return new PostAccountShippingCarriers();
	}
	
	/**
	 * DELETE /account/shipping_carriers/{id}
	 */
	public static DeleteAccountShippingCarriersId DeleteAccountShippingCarriersId() {
		return new DeleteAccountShippingCarriersId();
	}
	
	/**
	 * GET /account/shipping_carriers/{id}
	 */
	public static GetAccountShippingCarriersId GetAccountShippingCarriersId() {
		return new GetAccountShippingCarriersId();
	}
	
	/**
	 * PUT /account/shipping_carriers/{id}
	 */
	public static PutAccountShippingCarriersId PutAccountShippingCarriersId() {
		return new PutAccountShippingCarriersId();
	}
	
	/**
	 * GET /account/shipping_categories
	 */
	public static GetAccountShippingCategories GetAccountShippingCategories() {
		return new GetAccountShippingCategories();
	}
	
	/**
	 * POST /account/shipping_categories
	 */
	public static PostAccountShippingCategories PostAccountShippingCategories() {
		return new PostAccountShippingCategories();
	}
	
	/**
	 * DELETE /account/shipping_categories/{id}
	 */
	public static DeleteAccountShippingCategoriesId DeleteAccountShippingCategoriesId() {
		return new DeleteAccountShippingCategoriesId();
	}
	
	/**
	 * GET /account/shipping_categories/{id}
	 */
	public static GetAccountShippingCategoriesId GetAccountShippingCategoriesId() {
		return new GetAccountShippingCategoriesId();
	}
	
	/**
	 * PUT /account/shipping_categories/{id}
	 */
	public static PutAccountShippingCategoriesId PutAccountShippingCategoriesId() {
		return new PutAccountShippingCategoriesId();
	}
	
	/**
	 * GET /account/shipping_labels
	 */
	public static GetAccountShippingLabels GetAccountShippingLabels() {
		return new GetAccountShippingLabels();
	}
	
	/**
	 * POST /account/shipping_labels
	 */
	public static PostAccountShippingLabels PostAccountShippingLabels() {
		return new PostAccountShippingLabels();
	}
	
	/**
	 * DELETE /account/shipping_labels/{id}
	 */
	public static DeleteAccountShippingLabelsId DeleteAccountShippingLabelsId() {
		return new DeleteAccountShippingLabelsId();
	}
	
	/**
	 * GET /account/shipping_labels/{id}
	 */
	public static GetAccountShippingLabelsId GetAccountShippingLabelsId() {
		return new GetAccountShippingLabelsId();
	}
	
	/**
	 * PUT /account/shipping_labels/{id}
	 */
	public static PutAccountShippingLabelsId PutAccountShippingLabelsId() {
		return new PutAccountShippingLabelsId();
	}
	
	/**
	 * GET /account/shipping_methods
	 */
	public static GetAccountShippingMethods GetAccountShippingMethods() {
		return new GetAccountShippingMethods();
	}
	
	/**
	 * POST /account/shipping_methods
	 */
	public static PostAccountShippingMethods PostAccountShippingMethods() {
		return new PostAccountShippingMethods();
	}
	
	/**
	 * DELETE /account/shipping_methods/{id}
	 */
	public static DeleteAccountShippingMethodsId DeleteAccountShippingMethodsId() {
		return new DeleteAccountShippingMethodsId();
	}
	
	/**
	 * GET /account/shipping_methods/{id}
	 */
	public static GetAccountShippingMethodsId GetAccountShippingMethodsId() {
		return new GetAccountShippingMethodsId();
	}
	
	/**
	 * PUT /account/shipping_methods/{id}
	 */
	public static PutAccountShippingMethodsId PutAccountShippingMethodsId() {
		return new PutAccountShippingMethodsId();
	}
	
	/**
	 * GET /account/shipping_packages
	 */
	public static GetAccountShippingPackages GetAccountShippingPackages() {
		return new GetAccountShippingPackages();
	}
	
	/**
	 * POST /account/shipping_packages
	 */
	public static PostAccountShippingPackages PostAccountShippingPackages() {
		return new PostAccountShippingPackages();
	}
	
	/**
	 * DELETE /account/shipping_packages/{id}
	 */
	public static DeleteAccountShippingPackagesId DeleteAccountShippingPackagesId() {
		return new DeleteAccountShippingPackagesId();
	}
	
	/**
	 * GET /account/shipping_packages/{id}
	 */
	public static GetAccountShippingPackagesId GetAccountShippingPackagesId() {
		return new GetAccountShippingPackagesId();
	}
	
	/**
	 * PUT /account/shipping_packages/{id}
	 */
	public static PutAccountShippingPackagesId PutAccountShippingPackagesId() {
		return new PutAccountShippingPackagesId();
	}
	
	/**
	 * GET /account/shipping_service_categories
	 */
	public static GetAccountShippingServiceCategories GetAccountShippingServiceCategories() {
		return new GetAccountShippingServiceCategories();
	}
	
	/**
	 * POST /account/shipping_service_categories
	 */
	public static PostAccountShippingServiceCategories PostAccountShippingServiceCategories() {
		return new PostAccountShippingServiceCategories();
	}
	
	/**
	 * DELETE /account/shipping_service_categories/{id}
	 */
	public static DeleteAccountShippingServiceCategoriesId DeleteAccountShippingServiceCategoriesId() {
		return new DeleteAccountShippingServiceCategoriesId();
	}
	
	/**
	 * GET /account/shipping_service_categories/{id}
	 */
	public static GetAccountShippingServiceCategoriesId GetAccountShippingServiceCategoriesId() {
		return new GetAccountShippingServiceCategoriesId();
	}
	
	/**
	 * PUT /account/shipping_service_categories/{id}
	 */
	public static PutAccountShippingServiceCategoriesId PutAccountShippingServiceCategoriesId() {
		return new PutAccountShippingServiceCategoriesId();
	}
	
	/**
	 * GET /account/shipping_service_stock_locations
	 */
	public static GetAccountShippingServiceStockLocations GetAccountShippingServiceStockLocations() {
		return new GetAccountShippingServiceStockLocations();
	}
	
	/**
	 * POST /account/shipping_service_stock_locations
	 */
	public static PostAccountShippingServiceStockLocations PostAccountShippingServiceStockLocations() {
		return new PostAccountShippingServiceStockLocations();
	}
	
	/**
	 * DELETE /account/shipping_service_stock_locations/{id}
	 */
	public static DeleteAccountShippingServiceStockLocationsId DeleteAccountShippingServiceStockLocationsId() {
		return new DeleteAccountShippingServiceStockLocationsId();
	}
	
	/**
	 * GET /account/shipping_service_stock_locations/{id}
	 */
	public static GetAccountShippingServiceStockLocationsId GetAccountShippingServiceStockLocationsId() {
		return new GetAccountShippingServiceStockLocationsId();
	}
	
	/**
	 * PUT /account/shipping_service_stock_locations/{id}
	 */
	public static PutAccountShippingServiceStockLocationsId PutAccountShippingServiceStockLocationsId() {
		return new PutAccountShippingServiceStockLocationsId();
	}
	
	/**
	 * GET /account/shipping_service_zones
	 */
	public static GetAccountShippingServiceZones GetAccountShippingServiceZones() {
		return new GetAccountShippingServiceZones();
	}
	
	/**
	 * POST /account/shipping_service_zones
	 */
	public static PostAccountShippingServiceZones PostAccountShippingServiceZones() {
		return new PostAccountShippingServiceZones();
	}
	
	/**
	 * DELETE /account/shipping_service_zones/{id}
	 */
	public static DeleteAccountShippingServiceZonesId DeleteAccountShippingServiceZonesId() {
		return new DeleteAccountShippingServiceZonesId();
	}
	
	/**
	 * GET /account/shipping_service_zones/{id}
	 */
	public static GetAccountShippingServiceZonesId GetAccountShippingServiceZonesId() {
		return new GetAccountShippingServiceZonesId();
	}
	
	/**
	 * PUT /account/shipping_service_zones/{id}
	 */
	public static PutAccountShippingServiceZonesId PutAccountShippingServiceZonesId() {
		return new PutAccountShippingServiceZonesId();
	}
	
	/**
	 * GET /account/shipping_services
	 */
	public static GetAccountShippingServices GetAccountShippingServices() {
		return new GetAccountShippingServices();
	}
	
	/**
	 * POST /account/shipping_services
	 */
	public static PostAccountShippingServices PostAccountShippingServices() {
		return new PostAccountShippingServices();
	}
	
	/**
	 * DELETE /account/shipping_services/{id}
	 */
	public static DeleteAccountShippingServicesId DeleteAccountShippingServicesId() {
		return new DeleteAccountShippingServicesId();
	}
	
	/**
	 * GET /account/shipping_services/{id}
	 */
	public static GetAccountShippingServicesId GetAccountShippingServicesId() {
		return new GetAccountShippingServicesId();
	}
	
	/**
	 * PUT /account/shipping_services/{id}
	 */
	public static PutAccountShippingServicesId PutAccountShippingServicesId() {
		return new PutAccountShippingServicesId();
	}
	
	/**
	 * GET /account/shipping_zones
	 */
	public static GetAccountShippingZones GetAccountShippingZones() {
		return new GetAccountShippingZones();
	}
	
	/**
	 * POST /account/shipping_zones
	 */
	public static PostAccountShippingZones PostAccountShippingZones() {
		return new PostAccountShippingZones();
	}
	
	/**
	 * DELETE /account/shipping_zones/{id}
	 */
	public static DeleteAccountShippingZonesId DeleteAccountShippingZonesId() {
		return new DeleteAccountShippingZonesId();
	}
	
	/**
	 * GET /account/shipping_zones/{id}
	 */
	public static GetAccountShippingZonesId GetAccountShippingZonesId() {
		return new GetAccountShippingZonesId();
	}
	
	/**
	 * PUT /account/shipping_zones/{id}
	 */
	public static PutAccountShippingZonesId PutAccountShippingZonesId() {
		return new PutAccountShippingZonesId();
	}
	
	/**
	 * GET /account/states
	 */
	public static GetAccountStates GetAccountStates() {
		return new GetAccountStates();
	}
	
	/**
	 * POST /account/states
	 */
	public static PostAccountStates PostAccountStates() {
		return new PostAccountStates();
	}
	
	/**
	 * DELETE /account/states/{id}
	 */
	public static DeleteAccountStatesId DeleteAccountStatesId() {
		return new DeleteAccountStatesId();
	}
	
	/**
	 * GET /account/states/{id}
	 */
	public static GetAccountStatesId GetAccountStatesId() {
		return new GetAccountStatesId();
	}
	
	/**
	 * PUT /account/states/{id}
	 */
	public static PutAccountStatesId PutAccountStatesId() {
		return new PutAccountStatesId();
	}
	
	/**
	 * GET /account/stock_items
	 */
	public static GetAccountStockItems GetAccountStockItems() {
		return new GetAccountStockItems();
	}
	
	/**
	 * POST /account/stock_items
	 */
	public static PostAccountStockItems PostAccountStockItems() {
		return new PostAccountStockItems();
	}
	
	/**
	 * DELETE /account/stock_items/{id}
	 */
	public static DeleteAccountStockItemsId DeleteAccountStockItemsId() {
		return new DeleteAccountStockItemsId();
	}
	
	/**
	 * GET /account/stock_items/{id}
	 */
	public static GetAccountStockItemsId GetAccountStockItemsId() {
		return new GetAccountStockItemsId();
	}
	
	/**
	 * PUT /account/stock_items/{id}
	 */
	public static PutAccountStockItemsId PutAccountStockItemsId() {
		return new PutAccountStockItemsId();
	}
	
	/**
	 * GET /account/stock_locations
	 */
	public static GetAccountStockLocations GetAccountStockLocations() {
		return new GetAccountStockLocations();
	}
	
	/**
	 * POST /account/stock_locations
	 */
	public static PostAccountStockLocations PostAccountStockLocations() {
		return new PostAccountStockLocations();
	}
	
	/**
	 * DELETE /account/stock_locations/{id}
	 */
	public static DeleteAccountStockLocationsId DeleteAccountStockLocationsId() {
		return new DeleteAccountStockLocationsId();
	}
	
	/**
	 * GET /account/stock_locations/{id}
	 */
	public static GetAccountStockLocationsId GetAccountStockLocationsId() {
		return new GetAccountStockLocationsId();
	}
	
	/**
	 * PUT /account/stock_locations/{id}
	 */
	public static PutAccountStockLocationsId PutAccountStockLocationsId() {
		return new PutAccountStockLocationsId();
	}
	
	/**
	 * PUT /account/stock_locations/{id}/move_at/{position}
	 */
	public static PutAccountStockLocationsIdMoveAtPosition PutAccountStockLocationsIdMoveAtPosition() {
		return new PutAccountStockLocationsIdMoveAtPosition();
	}
	
	/**
	 * PUT /account/stock_locations/{id}/move_bottom
	 */
	public static PutAccountStockLocationsIdMoveBottom PutAccountStockLocationsIdMoveBottom() {
		return new PutAccountStockLocationsIdMoveBottom();
	}
	
	/**
	 * PUT /account/stock_locations/{id}/move_down
	 */
	public static PutAccountStockLocationsIdMoveDown PutAccountStockLocationsIdMoveDown() {
		return new PutAccountStockLocationsIdMoveDown();
	}
	
	/**
	 * PUT /account/stock_locations/{id}/move_top
	 */
	public static PutAccountStockLocationsIdMoveTop PutAccountStockLocationsIdMoveTop() {
		return new PutAccountStockLocationsIdMoveTop();
	}
	
	/**
	 * PUT /account/stock_locations/{id}/move_up
	 */
	public static PutAccountStockLocationsIdMoveUp PutAccountStockLocationsIdMoveUp() {
		return new PutAccountStockLocationsIdMoveUp();
	}
	
	/**
	 * GET /account/taxonomies
	 */
	public static GetAccountTaxonomies GetAccountTaxonomies() {
		return new GetAccountTaxonomies();
	}
	
	/**
	 * POST /account/taxonomies
	 */
	public static PostAccountTaxonomies PostAccountTaxonomies() {
		return new PostAccountTaxonomies();
	}
	
	/**
	 * DELETE /account/taxonomies/{id}
	 */
	public static DeleteAccountTaxonomiesId DeleteAccountTaxonomiesId() {
		return new DeleteAccountTaxonomiesId();
	}
	
	/**
	 * GET /account/taxonomies/{id}
	 */
	public static GetAccountTaxonomiesId GetAccountTaxonomiesId() {
		return new GetAccountTaxonomiesId();
	}
	
	/**
	 * PUT /account/taxonomies/{id}
	 */
	public static PutAccountTaxonomiesId PutAccountTaxonomiesId() {
		return new PutAccountTaxonomiesId();
	}
	
	/**
	 * GET /account/taxons
	 */
	public static GetAccountTaxons GetAccountTaxons() {
		return new GetAccountTaxons();
	}
	
	/**
	 * POST /account/taxons
	 */
	public static PostAccountTaxons PostAccountTaxons() {
		return new PostAccountTaxons();
	}
	
	/**
	 * DELETE /account/taxons/{id}
	 */
	public static DeleteAccountTaxonsId DeleteAccountTaxonsId() {
		return new DeleteAccountTaxonsId();
	}
	
	/**
	 * GET /account/taxons/{id}
	 */
	public static GetAccountTaxonsId GetAccountTaxonsId() {
		return new GetAccountTaxonsId();
	}
	
	/**
	 * PUT /account/taxons/{id}
	 */
	public static PutAccountTaxonsId PutAccountTaxonsId() {
		return new PutAccountTaxonsId();
	}
	
	/**
	 * PUT /account/taxons/{id}/move_at/{position}
	 */
	public static PutAccountTaxonsIdMoveAtPosition PutAccountTaxonsIdMoveAtPosition() {
		return new PutAccountTaxonsIdMoveAtPosition();
	}
	
	/**
	 * PUT /account/taxons/{id}/move_bottom
	 */
	public static PutAccountTaxonsIdMoveBottom PutAccountTaxonsIdMoveBottom() {
		return new PutAccountTaxonsIdMoveBottom();
	}
	
	/**
	 * PUT /account/taxons/{id}/move_down
	 */
	public static PutAccountTaxonsIdMoveDown PutAccountTaxonsIdMoveDown() {
		return new PutAccountTaxonsIdMoveDown();
	}
	
	/**
	 * PUT /account/taxons/{id}/move_top
	 */
	public static PutAccountTaxonsIdMoveTop PutAccountTaxonsIdMoveTop() {
		return new PutAccountTaxonsIdMoveTop();
	}
	
	/**
	 * PUT /account/taxons/{id}/move_up
	 */
	public static PutAccountTaxonsIdMoveUp PutAccountTaxonsIdMoveUp() {
		return new PutAccountTaxonsIdMoveUp();
	}
	
	/**
	 * GET /account/transactions
	 */
	public static GetAccountTransactions GetAccountTransactions() {
		return new GetAccountTransactions();
	}
	
	/**
	 * POST /account/transactions
	 */
	public static PostAccountTransactions PostAccountTransactions() {
		return new PostAccountTransactions();
	}
	
	/**
	 * DELETE /account/transactions/{id}
	 */
	public static DeleteAccountTransactionsId DeleteAccountTransactionsId() {
		return new DeleteAccountTransactionsId();
	}
	
	/**
	 * GET /account/transactions/{id}
	 */
	public static GetAccountTransactionsId GetAccountTransactionsId() {
		return new GetAccountTransactionsId();
	}
	
	/**
	 * PUT /account/transactions/{id}
	 */
	public static PutAccountTransactionsId PutAccountTransactionsId() {
		return new PutAccountTransactionsId();
	}
	
	/**
	 * GET /account/users
	 */
	public static GetAccountUsers GetAccountUsers() {
		return new GetAccountUsers();
	}
	
	/**
	 * POST /account/users
	 */
	public static PostAccountUsers PostAccountUsers() {
		return new PostAccountUsers();
	}
	
	/**
	 * DELETE /account/users/{id}
	 */
	public static DeleteAccountUsersId DeleteAccountUsersId() {
		return new DeleteAccountUsersId();
	}
	
	/**
	 * GET /account/users/{id}
	 */
	public static GetAccountUsersId GetAccountUsersId() {
		return new GetAccountUsersId();
	}
	
	/**
	 * PUT /account/users/{id}
	 */
	public static PutAccountUsersId PutAccountUsersId() {
		return new PutAccountUsersId();
	}
	
	/**
	 * GET /account/variant_options
	 */
	public static GetAccountVariantOptions GetAccountVariantOptions() {
		return new GetAccountVariantOptions();
	}
	
	/**
	 * POST /account/variant_options
	 */
	public static PostAccountVariantOptions PostAccountVariantOptions() {
		return new PostAccountVariantOptions();
	}
	
	/**
	 * DELETE /account/variant_options/{id}
	 */
	public static DeleteAccountVariantOptionsId DeleteAccountVariantOptionsId() {
		return new DeleteAccountVariantOptionsId();
	}
	
	/**
	 * GET /account/variant_options/{id}
	 */
	public static GetAccountVariantOptionsId GetAccountVariantOptionsId() {
		return new GetAccountVariantOptionsId();
	}
	
	/**
	 * PUT /account/variant_options/{id}
	 */
	public static PutAccountVariantOptionsId PutAccountVariantOptionsId() {
		return new PutAccountVariantOptionsId();
	}
	
	/**
	 * GET /account/variants
	 */
	public static GetAccountVariants GetAccountVariants() {
		return new GetAccountVariants();
	}
	
	/**
	 * POST /account/variants
	 */
	public static PostAccountVariants PostAccountVariants() {
		return new PostAccountVariants();
	}
	
	/**
	 * DELETE /account/variants/{id}
	 */
	public static DeleteAccountVariantsId DeleteAccountVariantsId() {
		return new DeleteAccountVariantsId();
	}
	
	/**
	 * GET /account/variants/{id}
	 */
	public static GetAccountVariantsId GetAccountVariantsId() {
		return new GetAccountVariantsId();
	}
	
	/**
	 * PUT /account/variants/{id}
	 */
	public static PutAccountVariantsId PutAccountVariantsId() {
		return new PutAccountVariantsId();
	}
	
	/**
	 * GET /account/webhooks
	 */
	public static GetAccountWebhooks GetAccountWebhooks() {
		return new GetAccountWebhooks();
	}
	
	/**
	 * POST /account/webhooks
	 */
	public static PostAccountWebhooks PostAccountWebhooks() {
		return new PostAccountWebhooks();
	}
	
	/**
	 * DELETE /account/webhooks/{id}
	 */
	public static DeleteAccountWebhooksId DeleteAccountWebhooksId() {
		return new DeleteAccountWebhooksId();
	}
	
	/**
	 * GET /account/webhooks/{id}
	 */
	public static GetAccountWebhooksId GetAccountWebhooksId() {
		return new GetAccountWebhooksId();
	}
	
	/**
	 * PUT /account/webhooks/{id}
	 */
	public static PutAccountWebhooksId PutAccountWebhooksId() {
		return new PutAccountWebhooksId();
	}
	
	/**
	 * POST /accounts
	 */
	public static PostAccounts PostAccounts() {
		return new PostAccounts();
	}
	
	/**
	 * GET /all/countries
	 */
	public static GetAllCountries GetAllCountries() {
		return new GetAllCountries();
	}
	
	/**
	 * GET /all/currencies
	 */
	public static GetAllCurrencies GetAllCurrencies() {
		return new GetAllCurrencies();
	}
	
	/**
	 * GET /all/gateways
	 */
	public static GetAllGateways GetAllGateways() {
		return new GetAllGateways();
	}
	
	/**
	 * GET /all/states
	 */
	public static GetAllStates GetAllStates() {
		return new GetAllStates();
	}
	
	/**
	 * GET /all/tax_categories
	 */
	public static GetAllTaxCategories GetAllTaxCategories() {
		return new GetAllTaxCategories();
	}
	
	/**
	 * POST /auth/token
	 */
	public static PostAuthToken PostAuthToken() {
		return new PostAuthToken();
	}
	
	/**
	 * GET /channel/line_item_stocks/{id}
	 */
	public static GetChannelLineItemStocksId GetChannelLineItemStocksId() {
		return new GetChannelLineItemStocksId();
	}
	
	/**
	 * PUT /channel/line_item_stocks/{id}
	 */
	public static PutChannelLineItemStocksId PutChannelLineItemStocksId() {
		return new PutChannelLineItemStocksId();
	}
	
	/**
	 * DELETE /channel/line_items/{id}
	 */
	public static DeleteChannelLineItemsId DeleteChannelLineItemsId() {
		return new DeleteChannelLineItemsId();
	}
	
	/**
	 * GET /channel/line_items/{id}
	 */
	public static GetChannelLineItemsId GetChannelLineItemsId() {
		return new GetChannelLineItemsId();
	}
	
	/**
	 * PUT /channel/line_items/{id}
	 */
	public static PutChannelLineItemsId PutChannelLineItemsId() {
		return new PutChannelLineItemsId();
	}
	
	/**
	 * GET /channel/line_items/{line_item_id}/line_item_stocks
	 */
	public static GetChannelLineItemsLineItemIdLineItemStocks GetChannelLineItemsLineItemIdLineItemStocks() {
		return new GetChannelLineItemsLineItemIdLineItemStocks();
	}
	
	/**
	 * GET /channel/line_items/{line_item_id}/shipping_methods
	 */
	public static GetChannelLineItemsLineItemIdShippingMethods GetChannelLineItemsLineItemIdShippingMethods() {
		return new GetChannelLineItemsLineItemIdShippingMethods();
	}
	
	/**
	 * POST /channel/line_items/{line_item_id}/shipping_methods
	 */
	public static PostChannelLineItemsLineItemIdShippingMethods PostChannelLineItemsLineItemIdShippingMethods() {
		return new PostChannelLineItemsLineItemIdShippingMethods();
	}
	
	/**
	 * GET /channel/markets/current
	 */
	public static GetChannelMarketsCurrent GetChannelMarketsCurrent() {
		return new GetChannelMarketsCurrent();
	}
	
	/**
	 * POST /channel/orders
	 */
	public static PostChannelOrders PostChannelOrders() {
		return new PostChannelOrders();
	}
	
	/**
	 * GET /channel/orders/{order_token}
	 */
	public static GetChannelOrdersOrderToken GetChannelOrdersOrderToken() {
		return new GetChannelOrdersOrderToken();
	}
	
	/**
	 * GET /channel/orders/{order_token}/line_items
	 */
	public static GetChannelOrdersOrderTokenLineItems GetChannelOrdersOrderTokenLineItems() {
		return new GetChannelOrdersOrderTokenLineItems();
	}
	
	/**
	 * POST /channel/orders/{order_token}/line_items
	 */
	public static PostChannelOrdersOrderTokenLineItems PostChannelOrdersOrderTokenLineItems() {
		return new PostChannelOrdersOrderTokenLineItems();
	}
	
	/**
	 * GET /channel/orders/{order_token}/payment_methods
	 */
	public static GetChannelOrdersOrderTokenPaymentMethods GetChannelOrdersOrderTokenPaymentMethods() {
		return new GetChannelOrdersOrderTokenPaymentMethods();
	}
	
	/**
	 * POST /channel/orders/{order_token}/payment_methods
	 */
	public static PostChannelOrdersOrderTokenPaymentMethods PostChannelOrdersOrderTokenPaymentMethods() {
		return new PostChannelOrdersOrderTokenPaymentMethods();
	}
	
	/**
	 * POST /channel/orders/{order_token}/place
	 */
	public static PostChannelOrdersOrderTokenPlace PostChannelOrdersOrderTokenPlace() {
		return new PostChannelOrdersOrderTokenPlace();
	}
	
	/**
	 * GET /channel/orders/{order_token}/shipping_methods
	 */
	public static GetChannelOrdersOrderTokenShippingMethods GetChannelOrdersOrderTokenShippingMethods() {
		return new GetChannelOrdersOrderTokenShippingMethods();
	}
	
	/**
	 * POST /channel/orders/{order_token}/shipping_methods
	 */
	public static PostChannelOrdersOrderTokenShippingMethods PostChannelOrdersOrderTokenShippingMethods() {
		return new PostChannelOrdersOrderTokenShippingMethods();
	}
	
	/**
	 * DELETE /channel/payment_methods/{id}
	 */
	public static DeleteChannelPaymentMethodsId DeleteChannelPaymentMethodsId() {
		return new DeleteChannelPaymentMethodsId();
	}
	
	/**
	 * GET /channel/payment_methods/{id}
	 */
	public static GetChannelPaymentMethodsId GetChannelPaymentMethodsId() {
		return new GetChannelPaymentMethodsId();
	}
	
	/**
	 * PUT /channel/payment_methods/{id}
	 */
	public static PutChannelPaymentMethodsId PutChannelPaymentMethodsId() {
		return new PutChannelPaymentMethodsId();
	}
	
	/**
	 * GET /channel/products
	 */
	public static GetChannelProducts GetChannelProducts() {
		return new GetChannelProducts();
	}
	
	/**
	 * DELETE /channel/shipping_methods/{id}
	 */
	public static DeleteChannelShippingMethodsId DeleteChannelShippingMethodsId() {
		return new DeleteChannelShippingMethodsId();
	}
	
	/**
	 * GET /channel/shipping_methods/{id}
	 */
	public static GetChannelShippingMethodsId GetChannelShippingMethodsId() {
		return new GetChannelShippingMethodsId();
	}
	
	/**
	 * PUT /channel/shipping_methods/{id}
	 */
	public static PutChannelShippingMethodsId PutChannelShippingMethodsId() {
		return new PutChannelShippingMethodsId();
	}
	
	/**
	 * GET /schema
	 */
	public static GetSchema GetSchema() {
		return new GetSchema();
	}
	
}
