import java.util.Formatter;

public class Order {
    // One line comment
    /* Multiple line coment
    Hey Hey
     */

    //---------------------ATTRIBUTES-------------------
private double totalPrice;
 private double wight;
 private double volume;
 private int itemCount;
 private double widtht;
 private double depth;
 private String address;
 private boolean deliveryRequested;

// -------------------- GETTERS/SETTERS------------


 public double getTotalPrice() {
  return totalPrice;
 }

 public void setTotalPrice(double totalPrice) {
  this.totalPrice = totalPrice;
 }

 public double getWight() {
  return wight;
 }

 public void setWight(double wight) {
  this.wight = wight;
 }

 public double getVolume() {
  return volume;
 }

 public void setVolume(double volume) {
  this.volume = volume;
 }

 public int getItemCount() {
  return itemCount;
 }

 public void setItemCount(int itemCount) {
  this.itemCount = itemCount;
 }

 public double getWidtht() {
  return widtht;
 }

 public void setWidtht(double widtht) {
  this.widtht = widtht;
 }

 public double getDepth() {
  return depth;
 }

 public void setDepth(double depth) {
  this.depth = depth;
 }

 public String getAddress() {
  return address;
 }

 public void setAddress(String address) {
  this.address = address;
 }

 public boolean isDeliveryRequested() {
  return deliveryRequested;
 }

 public void setDeliveryRequested(boolean deliveryRequested) {
  this.deliveryRequested = deliveryRequested;
 }
}
