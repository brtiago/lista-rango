package dev.tiago.lista_rango.controller.dto;

import dev.tiago.lista_rango.model.Restaurant;


public record RestaurantDto(Long id, String name, String address
        //List<OperatingHoursDto> operatingHours
        ) {

    public RestaurantDto(Restaurant model) {
        this(model.getId(),model.getName(), model.getAddress());
    }

    public Restaurant toModel() {
        Restaurant model = new Restaurant();
        model.setId(this.id);
        model.setName(this.name);
        model.setAddress(this.address);
        //model.setAccount(ofNullable(this.account).map(AccountDto::toModel).orElse(null));
        //model.setCard(ofNullable(this.card).map(CardDto::toModel).orElse(null));
        //model.setFeatures(ofNullable(this.features).orElse(emptyList()).stream().map(FeatureDto::toModel).collect(toList()));
        //model.setNews(ofNullable(this.news).orElse(emptyList()).stream().map(NewsDto::toModel).collect(toList()));
        return model;
    }

}
