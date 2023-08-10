/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package net.chrisrichardson.ftgo.apis.model.restaurantservice;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import net.chrisrichardson.ftgo.apis.model.restaurantservice.MenuItem;

/**
 * RestaurantMenu
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-08-10T16:37:11.001+09:00[Asia/Seoul]")
public class RestaurantMenu {
  @JsonProperty("menuItems")
  private List<MenuItem> menuItems = null;

  public RestaurantMenu menuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
    return this;
  }

  public RestaurantMenu addMenuItemsItem(MenuItem menuItemsItem) {
    if (this.menuItems == null) {
      this.menuItems = new ArrayList<MenuItem>();
    }
    this.menuItems.add(menuItemsItem);
    return this;
  }

   /**
   * Get menuItems
   * @return menuItems
  **/
  @ApiModelProperty(value = "")
  public List<MenuItem> getMenuItems() {
    return menuItems;
  }

  public void setMenuItems(List<MenuItem> menuItems) {
    this.menuItems = menuItems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestaurantMenu restaurantMenu = (RestaurantMenu) o;
    return Objects.equals(this.menuItems, restaurantMenu.menuItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(menuItems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestaurantMenu {\n");
    
    sb.append("    menuItems: ").append(toIndentedString(menuItems)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

