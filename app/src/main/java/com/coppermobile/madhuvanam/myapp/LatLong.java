package com.coppermobile.madhuvanam.myapp;

import java.util.List;

/**
 * Created by madhuvanam on 10/15/15.
 */
public class LatLong {

    private String status;
    private List<ResultsEntity> results;

    public void setStatus(String status) {
        this.status = status;
    }

    public void setResults(List<ResultsEntity> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public List<ResultsEntity> getResults() {
        return results;
    }

    public static class ResultsEntity {
        private String formatted_address;
        private GeometryEntity geometry;
        private String place_id;
        private List<AddressComponentsEntity> address_components;
        private List<String> types;

        public void setFormatted_address(String formatted_address) {
            this.formatted_address = formatted_address;
        }

        public void setGeometry(GeometryEntity geometry) {
            this.geometry = geometry;
        }

        public void setPlace_id(String place_id) {
            this.place_id = place_id;
        }

        public void setAddress_components(List<AddressComponentsEntity> address_components) {
            this.address_components = address_components;
        }

        public void setTypes(List<String> types) {
            this.types = types;
        }

        public String getFormatted_address() {
            return formatted_address;
        }

        public GeometryEntity getGeometry() {
            return geometry;
        }

        public String getPlace_id() {
            return place_id;
        }

        public List<AddressComponentsEntity> getAddress_components() {
            return address_components;
        }

        public List<String> getTypes() {
            return types;
        }

        public static class GeometryEntity {
            private BoundsEntity bounds;
            private LocationEntity location;
            private String location_type;
            private ViewportEntity viewport;

            public void setBounds(BoundsEntity bounds) {
                this.bounds = bounds;
            }

            public void setLocation(LocationEntity location) {
                this.location = location;
            }

            public void setLocation_type(String location_type) {
                this.location_type = location_type;
            }

            public void setViewport(ViewportEntity viewport) {
                this.viewport = viewport;
            }

            public BoundsEntity getBounds() {
                return bounds;
            }

            public LocationEntity getLocation() {
                return location;
            }

            public String getLocation_type() {
                return location_type;
            }

            public ViewportEntity getViewport() {
                return viewport;
            }

            public static class BoundsEntity {

                private NortheastEntity northeast;
                private SouthwestEntity southwest;

                public void setNortheast(NortheastEntity northeast) {
                    this.northeast = northeast;
                }

                public void setSouthwest(SouthwestEntity southwest) {
                    this.southwest = southwest;
                }

                public NortheastEntity getNortheast() {
                    return northeast;
                }

                public SouthwestEntity getSouthwest() {
                    return southwest;
                }

                public static class NortheastEntity {

                    private double lat;
                    private double lng;

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }

                public static class SouthwestEntity {

                    private double lat;
                    private double lng;

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }
            }

            public static class LocationEntity {

                private double lat;
                private double lng;

                public void setLat(double lat) {
                    this.lat = lat;
                }

                public void setLng(double lng) {
                    this.lng = lng;
                }

                public double getLat() {
                    return lat;
                }

                public double getLng() {
                    return lng;
                }
            }

            public static class ViewportEntity {

                private NortheastEntity northeast;
                private SouthwestEntity southwest;

                public void setNortheast(NortheastEntity northeast) {
                    this.northeast = northeast;
                }

                public void setSouthwest(SouthwestEntity southwest) {
                    this.southwest = southwest;
                }

                public NortheastEntity getNortheast() {
                    return northeast;
                }

                public SouthwestEntity getSouthwest() {
                    return southwest;
                }

                public static class NortheastEntity {

                    private double lat;
                    private double lng;

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }

                public static class SouthwestEntity {
                    private double lat;
                    private double lng;

                    public void setLat(double lat) {
                        this.lat = lat;
                    }

                    public void setLng(double lng) {
                        this.lng = lng;
                    }

                    public double getLat() {
                        return lat;
                    }

                    public double getLng() {
                        return lng;
                    }
                }
            }
        }

        public static class AddressComponentsEntity {

            private String long_name;
            private String short_name;
            private List<String> types;

            public void setLong_name(String long_name) {
                this.long_name = long_name;
            }

            public void setShort_name(String short_name) {
                this.short_name = short_name;
            }

            public void setTypes(List<String> types) {
                this.types = types;
            }

            public String getLong_name() {
                return long_name;
            }

            public String getShort_name() {
                return short_name;
            }

            public List<String> getTypes() {
                return types;
            }
        }
    }
}
