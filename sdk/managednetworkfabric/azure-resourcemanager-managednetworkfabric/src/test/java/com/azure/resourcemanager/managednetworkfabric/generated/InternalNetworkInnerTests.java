// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.managednetworkfabric.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.managednetworkfabric.fluent.models.InternalNetworkInner;
import com.azure.resourcemanager.managednetworkfabric.models.AllowASOverride;
import com.azure.resourcemanager.managednetworkfabric.models.BfdConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.BooleanEnumProperty;
import com.azure.resourcemanager.managednetworkfabric.models.ConnectedSubnet;
import com.azure.resourcemanager.managednetworkfabric.models.ExportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.Extension;
import com.azure.resourcemanager.managednetworkfabric.models.ImportRoutePolicy;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesBgpConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.InternalNetworkPropertiesStaticRouteConfiguration;
import com.azure.resourcemanager.managednetworkfabric.models.IsMonitoringEnabled;
import com.azure.resourcemanager.managednetworkfabric.models.NeighborAddress;
import com.azure.resourcemanager.managednetworkfabric.models.StaticRouteProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class InternalNetworkInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        InternalNetworkInner model = BinaryData.fromString(
            "{\"properties\":{\"vlanId\":618849667,\"bgpConfiguration\":{\"bfdConfiguration\":{\"administrativeState\":\"Enabled\",\"intervalInMilliSeconds\":844410077,\"multiplier\":518669807},\"defaultRouteOriginate\":\"False\",\"allowAS\":814563749,\"allowASOverride\":\"Enable\",\"fabricASN\":6282947498031082528,\"peerASN\":7342344521942896071,\"ipv4ListenRangePrefixes\":[\"kwhbgxve\",\"lvulnxdmnitmujdt\",\"mcl\",\"ymffhmjpddnyx\"],\"ipv6ListenRangePrefixes\":[\"v\",\"zmzqmzjqrb\",\"pv\",\"mdyfoebojtj\"],\"ipv4NeighborAddress\":[{\"address\":\"aohoqkpjtnq\",\"configurationState\":\"Rejected\"}],\"ipv6NeighborAddress\":[{\"address\":\"kdcwmqsyrilmhx\",\"configurationState\":\"Deprovisioning\"},{\"address\":\"lfylnkkbjpjvlyw\",\"configurationState\":\"Failed\"},{\"address\":\"wob\",\"configurationState\":\"Accepted\"}],\"annotation\":\"lwyjfnqzocrdz\"},\"staticRouteConfiguration\":{\"extension\":\"NPB\",\"bfdConfiguration\":{\"administrativeState\":\"MAT\",\"intervalInMilliSeconds\":2043111108,\"multiplier\":1214725859},\"ipv4Routes\":[{\"prefix\":\"q\",\"nextHop\":[\"iekoif\",\"vnyttzgi\",\"gyrihlgm\",\"behlqtxnr\"]},{\"prefix\":\"lkndrndpgfjodh\",\"nextHop\":[\"qotwfh\",\"pxwgsa\",\"vcipo\",\"zafczuumljci\"]}],\"ipv6Routes\":[{\"prefix\":\"efy\",\"nextHop\":[\"veitit\"]},{\"prefix\":\"nsxzajlns\",\"nextHop\":[\"wjuyxx\",\"xqvmvuay\",\"uadx\",\"xeqbwp\"]}]},\"configurationState\":\"Accepted\",\"provisioningState\":\"Deleting\",\"administrativeState\":\"Enabled\",\"mtu\":1797006304,\"connectedIPv4Subnets\":[{\"prefix\":\"rnxsluvlzlad\",\"annotation\":\"x\"},{\"prefix\":\"pbqhvfdqqjwkr\",\"annotation\":\"zdanojis\"},{\"prefix\":\"glmvoka\",\"annotation\":\"ztjctibpvbkae\"}],\"connectedIPv6Subnets\":[{\"prefix\":\"mzy\",\"annotation\":\"fwakw\"}],\"importRoutePolicyId\":\"ivmakx\",\"exportRoutePolicyId\":\"so\",\"importRoutePolicy\":{\"importIpv4RoutePolicyId\":\"ux\",\"importIpv6RoutePolicyId\":\"bectvtfjmskdch\"},\"exportRoutePolicy\":{\"exportIpv4RoutePolicyId\":\"ubavlzwp\",\"exportIpv6RoutePolicyId\":\"mfalkzazmgok\"},\"ingressAclId\":\"gjqafkmkrokzr\",\"egressAclId\":\"qetwpqrtvaozn\",\"isMonitoringEnabled\":\"True\",\"extension\":\"NoExtension\",\"annotation\":\"zeagmceituuge\"},\"id\":\"fpjstlzmb\",\"name\":\"syjdeolctae\",\"type\":\"fsyrledjc\"}")
            .toObject(InternalNetworkInner.class);
        Assertions.assertEquals(618849667, model.vlanId());
        Assertions.assertEquals("lwyjfnqzocrdz", model.bgpConfiguration().annotation());
        Assertions.assertEquals(844410077, model.bgpConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(518669807, model.bgpConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(814563749, model.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.ENABLE, model.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(7342344521942896071L, model.bgpConfiguration().peerAsn());
        Assertions.assertEquals("kwhbgxve", model.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("v", model.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("aohoqkpjtnq", model.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("kdcwmqsyrilmhx", model.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals(2043111108,
            model.staticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1214725859, model.staticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("q", model.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("iekoif", model.staticRouteConfiguration().ipv4Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("efy", model.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("veitit", model.staticRouteConfiguration().ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals(Extension.NPB, model.staticRouteConfiguration().extension());
        Assertions.assertEquals(1797006304, model.mtu());
        Assertions.assertEquals("x", model.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("rnxsluvlzlad", model.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("fwakw", model.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("mzy", model.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("ivmakx", model.importRoutePolicyId());
        Assertions.assertEquals("so", model.exportRoutePolicyId());
        Assertions.assertEquals("ux", model.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("bectvtfjmskdch", model.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("ubavlzwp", model.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("mfalkzazmgok", model.exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("gjqafkmkrokzr", model.ingressAclId());
        Assertions.assertEquals("qetwpqrtvaozn", model.egressAclId());
        Assertions.assertEquals(IsMonitoringEnabled.TRUE, model.isMonitoringEnabled());
        Assertions.assertEquals(Extension.NO_EXTENSION, model.extension());
        Assertions.assertEquals("zeagmceituuge", model.annotation());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        InternalNetworkInner model = new InternalNetworkInner().withVlanId(618849667)
            .withBgpConfiguration(new InternalNetworkPropertiesBgpConfiguration().withAnnotation("lwyjfnqzocrdz")
                .withBfdConfiguration(
                    new BfdConfiguration().withIntervalInMilliSeconds(844410077).withMultiplier(518669807))
                .withDefaultRouteOriginate(BooleanEnumProperty.FALSE)
                .withAllowAS(814563749)
                .withAllowASOverride(AllowASOverride.ENABLE)
                .withPeerAsn(7342344521942896071L)
                .withIpv4ListenRangePrefixes(Arrays.asList("kwhbgxve", "lvulnxdmnitmujdt", "mcl", "ymffhmjpddnyx"))
                .withIpv6ListenRangePrefixes(Arrays.asList("v", "zmzqmzjqrb", "pv", "mdyfoebojtj"))
                .withIpv4NeighborAddress(Arrays.asList(new NeighborAddress().withAddress("aohoqkpjtnq")))
                .withIpv6NeighborAddress(Arrays.asList(new NeighborAddress().withAddress("kdcwmqsyrilmhx"),
                    new NeighborAddress().withAddress("lfylnkkbjpjvlyw"), new NeighborAddress().withAddress("wob"))))
            .withStaticRouteConfiguration(new InternalNetworkPropertiesStaticRouteConfiguration()
                .withBfdConfiguration(
                    new BfdConfiguration().withIntervalInMilliSeconds(2043111108).withMultiplier(1214725859))
                .withIpv4Routes(Arrays.asList(
                    new StaticRouteProperties().withPrefix("q")
                        .withNextHop(Arrays.asList("iekoif", "vnyttzgi", "gyrihlgm", "behlqtxnr")),
                    new StaticRouteProperties().withPrefix("lkndrndpgfjodh")
                        .withNextHop(Arrays.asList("qotwfh", "pxwgsa", "vcipo", "zafczuumljci"))))
                .withIpv6Routes(
                    Arrays.asList(new StaticRouteProperties().withPrefix("efy").withNextHop(Arrays.asList("veitit")),
                        new StaticRouteProperties().withPrefix("nsxzajlns")
                            .withNextHop(Arrays.asList("wjuyxx", "xqvmvuay", "uadx", "xeqbwp"))))
                .withExtension(Extension.NPB))
            .withMtu(1797006304)
            .withConnectedIPv4Subnets(
                Arrays.asList(new ConnectedSubnet().withAnnotation("x").withPrefix("rnxsluvlzlad"),
                    new ConnectedSubnet().withAnnotation("zdanojis").withPrefix("pbqhvfdqqjwkr"),
                    new ConnectedSubnet().withAnnotation("ztjctibpvbkae").withPrefix("glmvoka")))
            .withConnectedIPv6Subnets(Arrays.asList(new ConnectedSubnet().withAnnotation("fwakw").withPrefix("mzy")))
            .withImportRoutePolicyId("ivmakx")
            .withExportRoutePolicyId("so")
            .withImportRoutePolicy(
                new ImportRoutePolicy().withImportIpv4RoutePolicyId("ux").withImportIpv6RoutePolicyId("bectvtfjmskdch"))
            .withExportRoutePolicy(new ExportRoutePolicy().withExportIpv4RoutePolicyId("ubavlzwp")
                .withExportIpv6RoutePolicyId("mfalkzazmgok"))
            .withIngressAclId("gjqafkmkrokzr")
            .withEgressAclId("qetwpqrtvaozn")
            .withIsMonitoringEnabled(IsMonitoringEnabled.TRUE)
            .withExtension(Extension.NO_EXTENSION)
            .withAnnotation("zeagmceituuge");
        model = BinaryData.fromObject(model).toObject(InternalNetworkInner.class);
        Assertions.assertEquals(618849667, model.vlanId());
        Assertions.assertEquals("lwyjfnqzocrdz", model.bgpConfiguration().annotation());
        Assertions.assertEquals(844410077, model.bgpConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(518669807, model.bgpConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals(BooleanEnumProperty.FALSE, model.bgpConfiguration().defaultRouteOriginate());
        Assertions.assertEquals(814563749, model.bgpConfiguration().allowAS());
        Assertions.assertEquals(AllowASOverride.ENABLE, model.bgpConfiguration().allowASOverride());
        Assertions.assertEquals(7342344521942896071L, model.bgpConfiguration().peerAsn());
        Assertions.assertEquals("kwhbgxve", model.bgpConfiguration().ipv4ListenRangePrefixes().get(0));
        Assertions.assertEquals("v", model.bgpConfiguration().ipv6ListenRangePrefixes().get(0));
        Assertions.assertEquals("aohoqkpjtnq", model.bgpConfiguration().ipv4NeighborAddress().get(0).address());
        Assertions.assertEquals("kdcwmqsyrilmhx", model.bgpConfiguration().ipv6NeighborAddress().get(0).address());
        Assertions.assertEquals(2043111108,
            model.staticRouteConfiguration().bfdConfiguration().intervalInMilliSeconds());
        Assertions.assertEquals(1214725859, model.staticRouteConfiguration().bfdConfiguration().multiplier());
        Assertions.assertEquals("q", model.staticRouteConfiguration().ipv4Routes().get(0).prefix());
        Assertions.assertEquals("iekoif", model.staticRouteConfiguration().ipv4Routes().get(0).nextHop().get(0));
        Assertions.assertEquals("efy", model.staticRouteConfiguration().ipv6Routes().get(0).prefix());
        Assertions.assertEquals("veitit", model.staticRouteConfiguration().ipv6Routes().get(0).nextHop().get(0));
        Assertions.assertEquals(Extension.NPB, model.staticRouteConfiguration().extension());
        Assertions.assertEquals(1797006304, model.mtu());
        Assertions.assertEquals("x", model.connectedIPv4Subnets().get(0).annotation());
        Assertions.assertEquals("rnxsluvlzlad", model.connectedIPv4Subnets().get(0).prefix());
        Assertions.assertEquals("fwakw", model.connectedIPv6Subnets().get(0).annotation());
        Assertions.assertEquals("mzy", model.connectedIPv6Subnets().get(0).prefix());
        Assertions.assertEquals("ivmakx", model.importRoutePolicyId());
        Assertions.assertEquals("so", model.exportRoutePolicyId());
        Assertions.assertEquals("ux", model.importRoutePolicy().importIpv4RoutePolicyId());
        Assertions.assertEquals("bectvtfjmskdch", model.importRoutePolicy().importIpv6RoutePolicyId());
        Assertions.assertEquals("ubavlzwp", model.exportRoutePolicy().exportIpv4RoutePolicyId());
        Assertions.assertEquals("mfalkzazmgok", model.exportRoutePolicy().exportIpv6RoutePolicyId());
        Assertions.assertEquals("gjqafkmkrokzr", model.ingressAclId());
        Assertions.assertEquals("qetwpqrtvaozn", model.egressAclId());
        Assertions.assertEquals(IsMonitoringEnabled.TRUE, model.isMonitoringEnabled());
        Assertions.assertEquals(Extension.NO_EXTENSION, model.extension());
        Assertions.assertEquals("zeagmceituuge", model.annotation());
    }
}
