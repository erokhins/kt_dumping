'ObjectMapper' @ [52:125] ==> public constructor ObjectMapper(p0: (JsonFactory..JsonFactory?)) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaClassConstructorDescriptor]

'factory' @ [52:138] ==> value-parameter factory: JsonFactory defined in net.corda.jackson.JacksonSupport.RpcObjectMapper.<init>[ValueParameterDescriptorImpl]

'rpc' @ [53:66] ==> public final val rpc: CordaRPCOps defined in net.corda.jackson.JacksonSupport.RpcObjectMapper[PropertyDescriptorImpl]

'partyFromX500Name' @ [53:70] ==> public abstract fun partyFromX500Name(x500Name: X500Name): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'name' @ [53:88] ==> value-parameter name: X500Name defined in net.corda.jackson.JacksonSupport.RpcObjectMapper.partyFromX500Name[ValueParameterDescriptorImpl]

'rpc' @ [54:67] ==> public final val rpc: CordaRPCOps defined in net.corda.jackson.JacksonSupport.RpcObjectMapper[PropertyDescriptorImpl]

'partyFromKey' @ [54:71] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'owningKey' @ [54:84] ==> value-parameter owningKey: PublicKey defined in net.corda.jackson.JacksonSupport.RpcObjectMapper.partyFromKey[ValueParameterDescriptorImpl]

'rpc' @ [55:55] ==> public final val rpc: CordaRPCOps defined in net.corda.jackson.JacksonSupport.RpcObjectMapper[PropertyDescriptorImpl]

'partiesFromName' @ [55:59] ==> public abstract fun partiesFromName(query: String, exactMatch: Boolean): Set<Party> defined in net.corda.core.messaging.CordaRPCOps[DeserializedSimpleFunctionDescriptor]

'query' @ [55:75] ==> value-parameter query: String defined in net.corda.jackson.JacksonSupport.RpcObjectMapper.partiesFromName[ValueParameterDescriptorImpl]

'fuzzyIdentityMatch' @ [55:82] ==> public final val fuzzyIdentityMatch: Boolean defined in net.corda.jackson.JacksonSupport.RpcObjectMapper[PropertyDescriptorImpl]

'ObjectMapper' @ [58:146] ==> public constructor ObjectMapper(p0: (JsonFactory..JsonFactory?)) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaClassConstructorDescriptor]

'factory' @ [58:159] ==> value-parameter factory: JsonFactory defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper.<init>[ValueParameterDescriptorImpl]

'identityService' @ [59:66] ==> public final val identityService: IdentityService defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper[PropertyDescriptorImpl]

'partyFromX500Name' @ [59:82] ==> public abstract fun partyFromX500Name(principal: X500Name): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'name' @ [59:100] ==> value-parameter name: X500Name defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper.partyFromX500Name[ValueParameterDescriptorImpl]

'identityService' @ [60:67] ==> public final val identityService: IdentityService defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper[PropertyDescriptorImpl]

'partyFromKey' @ [60:83] ==> public abstract fun partyFromKey(key: PublicKey): Party? defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'owningKey' @ [60:96] ==> value-parameter owningKey: PublicKey defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper.partyFromKey[ValueParameterDescriptorImpl]

'identityService' @ [61:55] ==> public final val identityService: IdentityService defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper[PropertyDescriptorImpl]

'partiesFromName' @ [61:71] ==> public abstract fun partiesFromName(query: String, exactMatch: Boolean): Set<Party> defined in net.corda.core.node.services.IdentityService[DeserializedSimpleFunctionDescriptor]

'query' @ [61:87] ==> value-parameter query: String defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper.partiesFromName[ValueParameterDescriptorImpl]

'fuzzyIdentityMatch' @ [61:94] ==> public final val fuzzyIdentityMatch: Boolean defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper[PropertyDescriptorImpl]

'ObjectMapper' @ [64:74] ==> public constructor ObjectMapper(p0: (JsonFactory..JsonFactory?)) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaClassConstructorDescriptor]

'factory' @ [64:87] ==> value-parameter factory: JsonFactory defined in net.corda.jackson.JacksonSupport.NoPartyObjectMapper.<init>[ValueParameterDescriptorImpl]

'UnsupportedOperationException' @ [65:72] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [66:73] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'UnsupportedOperationException' @ [67:61] ==> public final fun <init>(): UnsupportedOperationException /* = UnsupportedOperationException */ defined in kotlin.UnsupportedOperationException[TypeAliasConstructorDescriptorImpl]

'getValue' @ [70:32] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'SimpleModule' @ [71:9] ==> public constructor SimpleModule(p0: (String..String?)) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaClassConstructorDescriptor]

'apply' @ [71:30] ==> @InlineOnly public inline fun <T> SimpleModule.apply(block: SimpleModule.() -> Unit): SimpleModule defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleModule

'addSerializer' @ [72:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (AnonymousParty..AnonymousParty?)>..Class<out (AnonymousParty..AnonymousParty?)>?), p1: (JsonSerializer<(AnonymousParty..AnonymousParty?)>..JsonSerializer<(AnonymousParty..AnonymousParty?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.identity.AnonymousParty..net.corda.core.identity.AnonymousParty?)

'AnonymousParty' @ [72:27] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'java' @ [72:49] ==> public val <T> KClass<AnonymousParty>.java: Class<AnonymousParty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AnonymousParty

'AnonymousPartySerializer' @ [72:55] ==> public object AnonymousPartySerializer : JsonSerializer<AnonymousParty> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [73:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(AnonymousParty..AnonymousParty?)>..Class<(AnonymousParty..AnonymousParty?)>?), p1: (JsonDeserializer<out (AnonymousParty..AnonymousParty?)>..JsonDeserializer<out (AnonymousParty..AnonymousParty?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.identity.AnonymousParty..net.corda.core.identity.AnonymousParty?)

'AnonymousParty' @ [73:29] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'java' @ [73:51] ==> public val <T> KClass<AnonymousParty>.java: Class<AnonymousParty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AnonymousParty

'AnonymousPartyDeserializer' @ [73:57] ==> public object AnonymousPartyDeserializer : JsonDeserializer<AnonymousParty> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [74:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (Party..Party?)>..Class<out (Party..Party?)>?), p1: (JsonSerializer<(Party..Party?)>..JsonSerializer<(Party..Party?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'java' @ [74:40] ==> public val <T> KClass<Party>.java: Class<Party> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Party

'PartySerializer' @ [74:46] ==> public object PartySerializer : JsonSerializer<Party> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [75:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(Party..Party?)>..Class<(Party..Party?)>?), p1: (JsonDeserializer<out (Party..Party?)>..JsonDeserializer<out (Party..Party?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.identity.Party..net.corda.core.identity.Party?)

'java' @ [75:42] ==> public val <T> KClass<Party>.java: Class<Party> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Party

'PartyDeserializer' @ [75:48] ==> public object PartyDeserializer : JsonDeserializer<Party> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [76:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(AbstractParty..AbstractParty?)>..Class<(AbstractParty..AbstractParty?)>?), p1: (JsonDeserializer<out (AbstractParty..AbstractParty?)>..JsonDeserializer<out (AbstractParty..AbstractParty?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.identity.AbstractParty..net.corda.core.identity.AbstractParty?)

'AbstractParty' @ [76:29] ==> public constructor AbstractParty(owningKey: PublicKey) defined in net.corda.core.identity.AbstractParty[DeserializedClassConstructorDescriptor]

'java' @ [76:50] ==> public val <T> KClass<AbstractParty>.java: Class<AbstractParty> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AbstractParty

'PartyDeserializer' @ [76:56] ==> public object PartyDeserializer : JsonDeserializer<Party> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [77:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (Any..Any?)>..Class<out (Any..Any?)>?), p1: (JsonSerializer<(Any..Any?)>..JsonSerializer<(Any..Any?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'java' @ [77:45] ==> public val <T> KClass<BigDecimal>.java: Class<BigDecimal> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BigDecimal

'ToStringSerializer' @ [77:51] ==> public object ToStringSerializer : JsonSerializer<Any> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [78:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(BigDecimal..BigDecimal?)>..Class<(BigDecimal..BigDecimal?)>?), p1: (JsonDeserializer<out (BigDecimal..BigDecimal?)>..JsonDeserializer<out (BigDecimal..BigDecimal?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (java.math.BigDecimal..java.math.BigDecimal?)

'java' @ [78:47] ==> public val <T> KClass<BigDecimal>.java: Class<BigDecimal> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> BigDecimal

'BigDecimalDeserializer' @ [78:73] ==> public constructor BigDecimalDeserializer() defined in com.fasterxml.jackson.databind.deser.std.NumberDeserializers.BigDecimalDeserializer[JavaClassConstructorDescriptor]

'addSerializer' @ [79:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (SecureHash..SecureHash?)>..Class<out (SecureHash..SecureHash?)>?), p1: (JsonSerializer<(SecureHash..SecureHash?)>..JsonSerializer<(SecureHash..SecureHash?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.crypto.SecureHash..net.corda.core.crypto.SecureHash?)

'SecureHash' @ [79:27] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'java' @ [79:45] ==> public val <T> KClass<SecureHash>.java: Class<SecureHash> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SecureHash

'SecureHashSerializer' @ [79:51] ==> public object SecureHashSerializer : JsonSerializer<SecureHash> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [80:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (SecureHash..SecureHash?)>..Class<out (SecureHash..SecureHash?)>?), p1: (JsonSerializer<(SecureHash..SecureHash?)>..JsonSerializer<(SecureHash..SecureHash?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.crypto.SecureHash..net.corda.core.crypto.SecureHash?)

'SecureHash' @ [80:27] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'SHA256' @ [80:38] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedClassConstructorDescriptor]

'java' @ [80:52] ==> public val <T> KClass<SecureHash.SHA256>.java: Class<SecureHash.SHA256> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SHA256

'SecureHashSerializer' @ [80:58] ==> public object SecureHashSerializer : JsonSerializer<SecureHash> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [81:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(SecureHash..SecureHash?)>..Class<(SecureHash..SecureHash?)>?), p1: (JsonDeserializer<out (SecureHash..SecureHash?)>..JsonDeserializer<out (SecureHash..SecureHash?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.crypto.SecureHash..net.corda.core.crypto.SecureHash?)

'SecureHash' @ [81:29] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'java' @ [81:47] ==> public val <T> KClass<SecureHash>.java: Class<SecureHash> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SecureHash

'SecureHashDeserializer' @ [81:53] ==> public constructor SecureHashDeserializer<T : SecureHash>() defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer[ClassConstructorDescriptorImpl]
Inferred types:
    <T : SecureHash> -> SecureHash

'addDeserializer' @ [82:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(SecureHash.SHA256..SecureHash.SHA256?)>..Class<(SecureHash.SHA256..SecureHash.SHA256?)>?), p1: (JsonDeserializer<out (SecureHash.SHA256..SecureHash.SHA256?)>..JsonDeserializer<out (SecureHash.SHA256..SecureHash.SHA256?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.crypto.SecureHash.SHA256..net.corda.core.crypto.SecureHash.SHA256?)

'SecureHash' @ [82:29] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'SHA256' @ [82:40] ==> public constructor SHA256(bytes: ByteArray) defined in net.corda.core.crypto.SecureHash.SHA256[DeserializedClassConstructorDescriptor]

'java' @ [82:54] ==> public val <T> KClass<SecureHash.SHA256>.java: Class<SecureHash.SHA256> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SHA256

'SecureHashDeserializer' @ [82:60] ==> public constructor SecureHashDeserializer<T : SecureHash>() defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer[ClassConstructorDescriptorImpl]
Inferred types:
    <T : SecureHash> -> SHA256

'addSerializer' @ [85:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (EdDSAPublicKey..EdDSAPublicKey?)>..Class<out (EdDSAPublicKey..EdDSAPublicKey?)>?), p1: (JsonSerializer<(EdDSAPublicKey..EdDSAPublicKey?)>..JsonSerializer<(EdDSAPublicKey..EdDSAPublicKey?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.i2p.crypto.eddsa.EdDSAPublicKey..net.i2p.crypto.eddsa.EdDSAPublicKey?)

'java' @ [85:49] ==> public val <T> KClass<EdDSAPublicKey>.java: Class<EdDSAPublicKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> EdDSAPublicKey

'PublicKeySerializer' @ [85:55] ==> public object PublicKeySerializer : JsonSerializer<EdDSAPublicKey> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [86:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(EdDSAPublicKey..EdDSAPublicKey?)>..Class<(EdDSAPublicKey..EdDSAPublicKey?)>?), p1: (JsonDeserializer<out (EdDSAPublicKey..EdDSAPublicKey?)>..JsonDeserializer<out (EdDSAPublicKey..EdDSAPublicKey?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.i2p.crypto.eddsa.EdDSAPublicKey..net.i2p.crypto.eddsa.EdDSAPublicKey?)

'java' @ [86:51] ==> public val <T> KClass<EdDSAPublicKey>.java: Class<EdDSAPublicKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> EdDSAPublicKey

'PublicKeyDeserializer' @ [86:57] ==> public object PublicKeyDeserializer : JsonDeserializer<EdDSAPublicKey> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [89:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (CompositeKey..CompositeKey?)>..Class<out (CompositeKey..CompositeKey?)>?), p1: (JsonSerializer<(CompositeKey..CompositeKey?)>..JsonSerializer<(CompositeKey..CompositeKey?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.crypto.composite.CompositeKey..net.corda.core.crypto.composite.CompositeKey?)

'CompositeKey' @ [89:27] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'java' @ [89:47] ==> public val <T> KClass<CompositeKey>.java: Class<CompositeKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompositeKey

'CompositeKeySerializer' @ [89:53] ==> public object CompositeKeySerializer : JsonSerializer<CompositeKey> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [90:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(CompositeKey..CompositeKey?)>..Class<(CompositeKey..CompositeKey?)>?), p1: (JsonDeserializer<out (CompositeKey..CompositeKey?)>..JsonDeserializer<out (CompositeKey..CompositeKey?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.crypto.composite.CompositeKey..net.corda.core.crypto.composite.CompositeKey?)

'CompositeKey' @ [90:29] ==> public companion object defined in net.corda.core.crypto.composite.CompositeKey[FakeCallableDescriptorForObject]

'java' @ [90:49] ==> public val <T> KClass<CompositeKey>.java: Class<CompositeKey> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> CompositeKey

'CompositeKeyDeserializer' @ [90:55] ==> public object CompositeKeyDeserializer : JsonDeserializer<CompositeKey> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [94:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (NodeInfo..NodeInfo?)>..Class<out (NodeInfo..NodeInfo?)>?), p1: (JsonSerializer<(NodeInfo..NodeInfo?)>..JsonSerializer<(NodeInfo..NodeInfo?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.NodeInfo..net.corda.core.node.NodeInfo?)

'NodeInfo' @ [94:27] ==> public constructor NodeInfo(addresses: List<NetworkHostAndPort>, legalIdentityAndCert: PartyAndCertificate, legalIdentitiesAndCerts: NonEmptySet<PartyAndCertificate>, platformVersion: Int, advertisedServices: List<ServiceEntry> = ..., worldMapLocation: WorldMapLocation? = ...) defined in net.corda.core.node.NodeInfo[DeserializedClassConstructorDescriptor]

'java' @ [94:43] ==> public val <T> KClass<NodeInfo>.java: Class<NodeInfo> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NodeInfo

'NodeInfoSerializer' @ [94:49] ==> public object NodeInfoSerializer : JsonSerializer<NodeInfo> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [95:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(NodeInfo..NodeInfo?)>..Class<(NodeInfo..NodeInfo?)>?), p1: (JsonDeserializer<out (NodeInfo..NodeInfo?)>..JsonDeserializer<out (NodeInfo..NodeInfo?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.node.NodeInfo..net.corda.core.node.NodeInfo?)

'NodeInfo' @ [95:29] ==> public constructor NodeInfo(addresses: List<NetworkHostAndPort>, legalIdentityAndCert: PartyAndCertificate, legalIdentitiesAndCerts: NonEmptySet<PartyAndCertificate>, platformVersion: Int, advertisedServices: List<ServiceEntry> = ..., worldMapLocation: WorldMapLocation? = ...) defined in net.corda.core.node.NodeInfo[DeserializedClassConstructorDescriptor]

'java' @ [95:45] ==> public val <T> KClass<NodeInfo>.java: Class<NodeInfo> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NodeInfo

'NodeInfoDeserializer' @ [95:51] ==> public object NodeInfoDeserializer : JsonDeserializer<NodeInfo> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [98:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (Amount<*>..Amount<*>?)>..Class<out (Amount<*>..Amount<*>?)>?), p1: (JsonSerializer<(Amount<*>..Amount<*>?)>..JsonSerializer<(Amount<*>..Amount<*>?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.contracts.Amount<*>..net.corda.core.contracts.Amount<*>?)

'Amount' @ [98:27] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'java' @ [98:41] ==> public val <T> KClass<Amount<*>>.java: Class<Amount<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Amount<*>

'AmountSerializer' @ [98:47] ==> public object AmountSerializer : JsonSerializer<Amount<*>> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [99:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(Amount<*>..Amount<*>?)>..Class<(Amount<*>..Amount<*>?)>?), p1: (JsonDeserializer<out (Amount<*>..Amount<*>?)>..JsonDeserializer<out (Amount<*>..Amount<*>?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.contracts.Amount<*>..net.corda.core.contracts.Amount<*>?)

'Amount' @ [99:29] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'java' @ [99:43] ==> public val <T> KClass<Amount<*>>.java: Class<Amount<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Amount<*>

'AmountDeserializer' @ [99:49] ==> public object AmountDeserializer : JsonDeserializer<Amount<*>> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [102:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(OpaqueBytes..OpaqueBytes?)>..Class<(OpaqueBytes..OpaqueBytes?)>?), p1: (JsonDeserializer<out (OpaqueBytes..OpaqueBytes?)>..JsonDeserializer<out (OpaqueBytes..OpaqueBytes?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)

'OpaqueBytes' @ [102:29] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'java' @ [102:48] ==> public val <T> KClass<OpaqueBytes>.java: Class<OpaqueBytes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> OpaqueBytes

'OpaqueBytesDeserializer' @ [102:54] ==> public object OpaqueBytesDeserializer : JsonDeserializer<OpaqueBytes> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [103:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (OpaqueBytes..OpaqueBytes?)>..Class<out (OpaqueBytes..OpaqueBytes?)>?), p1: (JsonSerializer<(OpaqueBytes..OpaqueBytes?)>..JsonSerializer<(OpaqueBytes..OpaqueBytes?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (net.corda.core.utilities.OpaqueBytes..net.corda.core.utilities.OpaqueBytes?)

'OpaqueBytes' @ [103:27] ==> public companion object defined in net.corda.core.utilities.OpaqueBytes[FakeCallableDescriptorForObject]

'java' @ [103:46] ==> public val <T> KClass<OpaqueBytes>.java: Class<OpaqueBytes> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> OpaqueBytes

'OpaqueBytesSerializer' @ [103:52] ==> public object OpaqueBytesSerializer : JsonSerializer<OpaqueBytes> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addDeserializer' @ [106:13] ==> public open fun <T : (Any..Any?)> addDeserializer(p0: (Class<(X500Name..X500Name?)>..Class<(X500Name..X500Name?)>?), p1: (JsonDeserializer<out (X500Name..X500Name?)>..JsonDeserializer<out (X500Name..X500Name?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.bouncycastle.asn1.x500.X500Name..org.bouncycastle.asn1.x500.X500Name?)

'java' @ [106:45] ==> public val <T> KClass<X500Name>.java: Class<X500Name> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> X500Name

'X500NameDeserializer' @ [106:51] ==> public object X500NameDeserializer : JsonDeserializer<X500Name> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'addSerializer' @ [107:13] ==> public open fun <T : (Any..Any?)> addSerializer(p0: (Class<out (X500Name..X500Name?)>..Class<out (X500Name..X500Name?)>?), p1: (JsonSerializer<(X500Name..X500Name?)>..JsonSerializer<(X500Name..X500Name?)>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.bouncycastle.asn1.x500.X500Name..org.bouncycastle.asn1.x500.X500Name?)

'java' @ [107:43] ==> public val <T> KClass<X500Name>.java: Class<X500Name> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> X500Name

'X500NameSerializer' @ [107:49] ==> public object X500NameSerializer : JsonSerializer<X500Name> defined in net.corda.jackson.JacksonSupport[FakeCallableDescriptorForObject]

'setMixInAnnotation' @ [110:13] ==> public open fun setMixInAnnotation(p0: (Class<*>..Class<*>?), p1: (Class<*>..Class<*>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]

'java' @ [110:57] ==> public val <T> KClass<SignedTransaction>.java: Class<SignedTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SignedTransaction

'SignedTransactionMixin' @ [110:63] ==> public constructor SignedTransactionMixin() defined in net.corda.jackson.JacksonSupport.SignedTransactionMixin[ClassConstructorDescriptorImpl]

'java' @ [110:93] ==> public val <T> KClass<JacksonSupport.SignedTransactionMixin>.java: Class<JacksonSupport.SignedTransactionMixin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> SignedTransactionMixin

'setMixInAnnotation' @ [111:13] ==> public open fun setMixInAnnotation(p0: (Class<*>..Class<*>?), p1: (Class<*>..Class<*>?)): (SimpleModule..SimpleModule?) defined in com.fasterxml.jackson.databind.module.SimpleModule[JavaMethodDescriptor]

'WireTransaction' @ [111:32] ==> public constructor WireTransaction(inputs: List<StateRef>, attachments: List<SecureHash>, outputs: List<TransactionState<ContractState>>, commands: List<Command<*>>, notary: Party?, timeWindow: TimeWindow?, privacySalt: PrivacySalt = ...) defined in net.corda.core.transactions.WireTransaction[DeserializedClassConstructorDescriptor]

'java' @ [111:55] ==> public val <T> KClass<WireTransaction>.java: Class<WireTransaction> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> WireTransaction

'WireTransactionMixin' @ [111:61] ==> public constructor WireTransactionMixin() defined in net.corda.jackson.JacksonSupport.WireTransactionMixin[ClassConstructorDescriptorImpl]

'java' @ [111:89] ==> public val <T> KClass<JacksonSupport.WireTransactionMixin>.java: Class<JacksonSupport.WireTransactionMixin> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> WireTransactionMixin

'JvmStatic' @ [122:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [122:16] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'JsonFactory' @ [123:70] ==> public constructor JsonFactory() defined in com.fasterxml.jackson.core.JsonFactory[JavaClassConstructorDescriptor]

'configureMapper' @ [124:82] ==> private final fun configureMapper(mapper: ObjectMapper): ObjectMapper defined in net.corda.jackson.JacksonSupport[SimpleFunctionDescriptorImpl]

'RpcObjectMapper' @ [124:98] ==> public constructor RpcObjectMapper(rpc: CordaRPCOps, factory: JsonFactory, fuzzyIdentityMatch: Boolean) defined in net.corda.jackson.JacksonSupport.RpcObjectMapper[ClassConstructorDescriptorImpl]

'rpc' @ [124:114] ==> value-parameter rpc: CordaRPCOps defined in net.corda.jackson.JacksonSupport.createDefaultMapper[ValueParameterDescriptorImpl]

'factory' @ [124:119] ==> value-parameter factory: JsonFactory = ... defined in net.corda.jackson.JacksonSupport.createDefaultMapper[ValueParameterDescriptorImpl]

'fuzzyIdentityMatch' @ [124:128] ==> value-parameter fuzzyIdentityMatch: Boolean = ... defined in net.corda.jackson.JacksonSupport.createDefaultMapper[ValueParameterDescriptorImpl]

'JvmStatic' @ [127:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [127:16] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'JsonFactory' @ [128:51] ==> public constructor JsonFactory() defined in com.fasterxml.jackson.core.JsonFactory[JavaClassConstructorDescriptor]

'configureMapper' @ [128:82] ==> private final fun configureMapper(mapper: ObjectMapper): ObjectMapper defined in net.corda.jackson.JacksonSupport[SimpleFunctionDescriptorImpl]

'NoPartyObjectMapper' @ [128:98] ==> public constructor NoPartyObjectMapper(factory: JsonFactory) defined in net.corda.jackson.JacksonSupport.NoPartyObjectMapper[ClassConstructorDescriptorImpl]

'factory' @ [128:118] ==> value-parameter factory: JsonFactory = ... defined in net.corda.jackson.JacksonSupport.createNonRpcMapper[ValueParameterDescriptorImpl]

'JvmStatic' @ [137:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'JvmOverloads' @ [137:16] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'JsonFactory' @ [138:87] ==> public constructor JsonFactory() defined in com.fasterxml.jackson.core.JsonFactory[JavaClassConstructorDescriptor]

'configureMapper' @ [139:69] ==> private final fun configureMapper(mapper: ObjectMapper): ObjectMapper defined in net.corda.jackson.JacksonSupport[SimpleFunctionDescriptorImpl]

'IdentityObjectMapper' @ [139:85] ==> public constructor IdentityObjectMapper(identityService: IdentityService, factory: JsonFactory, fuzzyIdentityMatch: Boolean) defined in net.corda.jackson.JacksonSupport.IdentityObjectMapper[ClassConstructorDescriptorImpl]

'identityService' @ [139:106] ==> value-parameter identityService: IdentityService defined in net.corda.jackson.JacksonSupport.createInMemoryMapper[ValueParameterDescriptorImpl]

'factory' @ [139:123] ==> value-parameter factory: JsonFactory = ... defined in net.corda.jackson.JacksonSupport.createInMemoryMapper[ValueParameterDescriptorImpl]

'fuzzyIdentityMatch' @ [139:132] ==> value-parameter fuzzyIdentityMatch: Boolean = ... defined in net.corda.jackson.JacksonSupport.createInMemoryMapper[ValueParameterDescriptorImpl]

'mapper' @ [141:71] ==> value-parameter mapper: ObjectMapper defined in net.corda.jackson.JacksonSupport.configureMapper[ValueParameterDescriptorImpl]

'apply' @ [141:78] ==> @InlineOnly public inline fun <T> ObjectMapper.apply(block: ObjectMapper.() -> Unit): ObjectMapper defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ObjectMapper

'enable' @ [142:9] ==> public open fun enable(p0: (SerializationFeature..SerializationFeature?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'INDENT_OUTPUT' @ [142:37] ==> enum entry INDENT_OUTPUT defined in com.fasterxml.jackson.databind.SerializationFeature[FakeCallableDescriptorForObject]

'enable' @ [143:9] ==> public open fun enable(p0: (DeserializationFeature..DeserializationFeature?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'ACCEPT_SINGLE_VALUE_AS_ARRAY' @ [143:39] ==> enum entry ACCEPT_SINGLE_VALUE_AS_ARRAY defined in com.fasterxml.jackson.databind.DeserializationFeature[FakeCallableDescriptorForObject]

'enable' @ [144:9] ==> public open fun enable(p0: (DeserializationFeature..DeserializationFeature?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'USE_BIG_DECIMAL_FOR_FLOATS' @ [144:39] ==> enum entry USE_BIG_DECIMAL_FOR_FLOATS defined in com.fasterxml.jackson.databind.DeserializationFeature[FakeCallableDescriptorForObject]

'registerModule' @ [146:9] ==> public open fun registerModule(p0: (Module..Module?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'JavaTimeModule' @ [146:24] ==> public constructor JavaTimeModule() defined in com.fasterxml.jackson.datatype.jsr310.JavaTimeModule[JavaClassConstructorDescriptor]

'registerModule' @ [147:9] ==> public open fun registerModule(p0: (Module..Module?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'cordaModule' @ [147:24] ==> public final val cordaModule: Module defined in net.corda.jackson.JacksonSupport[PropertyDescriptorImpl]

'registerModule' @ [148:9] ==> public open fun registerModule(p0: (Module..Module?)): (ObjectMapper..ObjectMapper?) defined in com.fasterxml.jackson.databind.ObjectMapper[JavaMethodDescriptor]

'KotlinModule' @ [148:24] ==> public constructor KotlinModule(reflectionCacheSize: Int = ...) defined in com.fasterxml.jackson.module.kotlin.KotlinModule[DeserializedClassConstructorDescriptor]

'JsonSerializer<Any>' @ [151:33] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'generator' @ [153:13] ==> value-parameter generator: JsonGenerator defined in net.corda.jackson.JacksonSupport.ToStringSerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [153:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'obj' @ [153:35] ==> value-parameter obj: Any defined in net.corda.jackson.JacksonSupport.ToStringSerializer.serialize[ValueParameterDescriptorImpl]

'toString' @ [153:39] ==> public open fun toString(): String defined in kotlin.Any[DeserializedSimpleFunctionDescriptor]

'JsonSerializer<AnonymousParty>' @ [157:39] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AnonymousParty

'generator' @ [159:13] ==> value-parameter generator: JsonGenerator defined in net.corda.jackson.JacksonSupport.AnonymousPartySerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [159:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'obj' @ [159:35] ==> value-parameter obj: AnonymousParty defined in net.corda.jackson.JacksonSupport.AnonymousPartySerializer.serialize[ValueParameterDescriptorImpl]

'owningKey' @ [159:39] ==> public final val owningKey: PublicKey defined in net.corda.core.identity.AnonymousParty[DeserializedPropertyDescriptor]

'toBase58String' @ [159:49] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'JsonDeserializer<AnonymousParty>' @ [163:41] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> AnonymousParty

'parser' @ [165:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.AnonymousPartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'currentToken' @ [165:24] ==> public final val JsonParser.currentToken: (JsonToken..JsonToken?)[MyPropertyDescriptor]

'FIELD_NAME' @ [165:50] ==> enum entry FIELD_NAME defined in com.fasterxml.jackson.core.JsonToken[FakeCallableDescriptorForObject]

'parser' @ [166:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.AnonymousPartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'nextToken' @ [166:24] ==> public abstract fun nextToken(): (JsonToken..JsonToken?) defined in com.fasterxml.jackson.core.JsonParser[JavaMethodDescriptor]

'parsePublicKeyBase58' @ [170:23] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'parser' @ [170:44] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.AnonymousPartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [170:51] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'AnonymousParty' @ [171:20] ==> public constructor AnonymousParty(owningKey: PublicKey) defined in net.corda.core.identity.AnonymousParty[DeserializedClassConstructorDescriptor]

'key' @ [171:35] ==> val key: PublicKey defined in net.corda.jackson.JacksonSupport.AnonymousPartyDeserializer.deserialize[LocalVariableDescriptor]

'JsonSerializer<Party>' @ [175:30] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Party

'generator' @ [177:13] ==> value-parameter generator: JsonGenerator defined in net.corda.jackson.JacksonSupport.PartySerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [177:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'obj' @ [177:35] ==> value-parameter obj: Party defined in net.corda.jackson.JacksonSupport.PartySerializer.serialize[ValueParameterDescriptorImpl]

'name' @ [177:39] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'toString' @ [177:44] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'JsonDeserializer<Party>' @ [181:32] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Party

'parser' @ [183:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'currentToken' @ [183:24] ==> public final val JsonParser.currentToken: (JsonToken..JsonToken?)[MyPropertyDescriptor]

'FIELD_NAME' @ [183:50] ==> enum entry FIELD_NAME defined in com.fasterxml.jackson.core.JsonToken[FakeCallableDescriptorForObject]

'parser' @ [184:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'nextToken' @ [184:24] ==> public abstract fun nextToken(): (JsonToken..JsonToken?) defined in com.fasterxml.jackson.core.JsonParser[JavaMethodDescriptor]

'parser' @ [187:26] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'codec' @ [187:33] ==> public final var JsonParser.codec: (ObjectCodec..ObjectCodec?)[MyPropertyDescriptor]

'if (parser.text.contains("=")) {
                val principal = X500Name(parser.text)
                mapper.partyFromX500Name(principal) ?: throw JsonParseException(parser, "Could not find a Party with name $principal")
            } else {
                val nameMatches = mapper.partiesFromName(parser.text)
                if (nameMatches.isEmpty()) {
                    val key = try {
                        parsePublicKeyBase58(parser.text)
                    } catch (e: Exception) {
                        throw JsonParseException(parser, "Could not find a matching party for '${parser.text}' and is not a base58 encoded public key")
                    }
                    mapper.partyFromKey(key) ?: throw JsonParseException(parser, "Could not find a Party with key ${key.toStringShort()}")
                } else if (nameMatches.size == 1) {
                    nameMatches.first()
                } else {
                    throw JsonParseException(parser, "Ambiguous name match '${parser.text}': could be any of " + nameMatches.map { it.name }.joinToString(" ... or ..."))
                }
            }' @ [191:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party, elseBranch: Party): Party[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party

'parser' @ [191:24] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [191:31] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'contains' @ [191:36] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'X500Name' @ [192:33] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'parser' @ [192:42] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [192:49] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'mapper' @ [193:17] ==> val mapper: JacksonSupport.PartyObjectMapper defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'partyFromX500Name' @ [193:24] ==> public abstract fun partyFromX500Name(name: X500Name): Party? defined in net.corda.jackson.JacksonSupport.PartyObjectMapper[SimpleFunctionDescriptorImpl]

'principal' @ [193:42] ==> val principal: X500Name defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'JsonParseException' @ [193:62] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [193:81] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'principal' @ [193:124] ==> val principal: X500Name defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'mapper' @ [195:35] ==> val mapper: JacksonSupport.PartyObjectMapper defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'partiesFromName' @ [195:42] ==> public abstract fun partiesFromName(query: String): Set<Party> defined in net.corda.jackson.JacksonSupport.PartyObjectMapper[SimpleFunctionDescriptorImpl]

'parser' @ [195:58] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [195:65] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'if (nameMatches.isEmpty()) {
                    val key = try {
                        parsePublicKeyBase58(parser.text)
                    } catch (e: Exception) {
                        throw JsonParseException(parser, "Could not find a matching party for '${parser.text}' and is not a base58 encoded public key")
                    }
                    mapper.partyFromKey(key) ?: throw JsonParseException(parser, "Could not find a Party with key ${key.toStringShort()}")
                } else if (nameMatches.size == 1) {
                    nameMatches.first()
                } else {
                    throw JsonParseException(parser, "Ambiguous name match '${parser.text}': could be any of " + nameMatches.map { it.name }.joinToString(" ... or ..."))
                }' @ [196:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party, elseBranch: Party): Party[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party

'nameMatches' @ [196:21] ==> val nameMatches: Set<Party> defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'isEmpty' @ [196:33] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'parsePublicKeyBase58' @ [198:25] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'parser' @ [198:46] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [198:53] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'JsonParseException' @ [200:31] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [200:50] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [200:98] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [200:105] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'mapper' @ [202:21] ==> val mapper: JacksonSupport.PartyObjectMapper defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'partyFromKey' @ [202:28] ==> public abstract fun partyFromKey(owningKey: PublicKey): Party? defined in net.corda.jackson.JacksonSupport.PartyObjectMapper[SimpleFunctionDescriptorImpl]

'key' @ [202:41] ==> val key: PublicKey defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'JsonParseException' @ [202:55] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [202:74] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'key' @ [202:117] ==> val key: PublicKey defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'toStringShort' @ [202:121] ==> public fun PublicKey.toStringShort(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'if (nameMatches.size == 1) {
                    nameMatches.first()
                } else {
                    throw JsonParseException(parser, "Ambiguous name match '${parser.text}': could be any of " + nameMatches.map { it.name }.joinToString(" ... or ..."))
                }' @ [203:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Party, elseBranch: Party): Party[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Party

'nameMatches' @ [203:28] ==> val nameMatches: Set<Party> defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'size' @ [203:40] ==> public abstract val size: Int defined in kotlin.collections.Set[DeserializedPropertyDescriptor]

'nameMatches' @ [204:21] ==> val nameMatches: Set<Party> defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'first' @ [204:33] ==> public fun <T> Iterable<Party>.first(): Party defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party

'JsonParseException' @ [206:27] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [206:46] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'+' @ [206:54] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'parser' @ [206:79] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [206:86] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'nameMatches' @ [206:114] ==> val nameMatches: Set<Party> defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize[LocalVariableDescriptor]

'map' @ [206:126] ==> public inline fun <T, R> Iterable<Party>.map(transform: (Party) -> X500Name): List<X500Name> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Party
    <R> -> X500Name

'it' @ [206:132] ==> value-parameter it: Party defined in net.corda.jackson.JacksonSupport.PartyDeserializer.deserialize.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [206:135] ==> public final val name: X500Name defined in net.corda.core.identity.Party[DeserializedPropertyDescriptor]

'joinToString' @ [206:142] ==> public fun <T> Iterable<X500Name>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((X500Name) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X500Name

'JsonSerializer<X500Name>' @ [212:33] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X500Name

'generator' @ [214:13] ==> value-parameter generator: JsonGenerator defined in net.corda.jackson.JacksonSupport.X500NameSerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [214:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'obj' @ [214:35] ==> value-parameter obj: X500Name defined in net.corda.jackson.JacksonSupport.X500NameSerializer.serialize[ValueParameterDescriptorImpl]

'toString' @ [214:39] ==> public open fun toString(): String defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'JsonDeserializer<X500Name>' @ [218:35] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> X500Name

'parser' @ [220:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.X500NameDeserializer.deserialize[ValueParameterDescriptorImpl]

'currentToken' @ [220:24] ==> public final val JsonParser.currentToken: (JsonToken..JsonToken?)[MyPropertyDescriptor]

'FIELD_NAME' @ [220:50] ==> enum entry FIELD_NAME defined in com.fasterxml.jackson.core.JsonToken[FakeCallableDescriptorForObject]

'parser' @ [221:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.X500NameDeserializer.deserialize[ValueParameterDescriptorImpl]

'nextToken' @ [221:24] ==> public abstract fun nextToken(): (JsonToken..JsonToken?) defined in com.fasterxml.jackson.core.JsonParser[JavaMethodDescriptor]

'X500Name' @ [225:17] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'parser' @ [225:26] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.X500NameDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [225:33] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'JsonParseException' @ [227:23] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?), p2: (Throwable..Throwable?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [227:42] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.X500NameDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [227:72] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.X500NameDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [227:79] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'ex' @ [227:88] ==> val ex: IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.jackson.JacksonSupport.X500NameDeserializer.deserialize[LocalVariableDescriptor]

'message' @ [227:91] ==> public open val message: String? defined in java.lang.IllegalArgumentException[DeserializedPropertyDescriptor]

'ex' @ [227:102] ==> val ex: IllegalArgumentException /* = IllegalArgumentException */ defined in net.corda.jackson.JacksonSupport.X500NameDeserializer.deserialize[LocalVariableDescriptor]

'JsonSerializer<NodeInfo>' @ [232:33] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo

'gen' @ [234:13] ==> value-parameter gen: JsonGenerator defined in net.corda.jackson.JacksonSupport.NodeInfoSerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [234:17] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'encode' @ [234:36] ==> public open fun encode(p0: (ByteArray..ByteArray?)): (String..String?) defined in net.corda.core.crypto.Base58[JavaMethodDescriptor]

'value' @ [234:43] ==> value-parameter value: NodeInfo defined in net.corda.jackson.JacksonSupport.NodeInfoSerializer.serialize[ValueParameterDescriptorImpl]

'serialize' @ [234:49] ==> public fun <T : Any> NodeInfo.serialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): SerializedBytes<NodeInfo> defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> NodeInfo

'bytes' @ [234:61] ==> public open val bytes: ByteArray defined in net.corda.core.serialization.SerializedBytes[DeserializedPropertyDescriptor]

'JsonDeserializer<NodeInfo>' @ [238:35] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NodeInfo

'parser' @ [240:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.NodeInfoDeserializer.deserialize[ValueParameterDescriptorImpl]

'currentToken' @ [240:24] ==> public final val JsonParser.currentToken: (JsonToken..JsonToken?)[MyPropertyDescriptor]

'FIELD_NAME' @ [240:50] ==> enum entry FIELD_NAME defined in com.fasterxml.jackson.core.JsonToken[FakeCallableDescriptorForObject]

'parser' @ [241:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.NodeInfoDeserializer.deserialize[ValueParameterDescriptorImpl]

'nextToken' @ [241:24] ==> public abstract fun nextToken(): (JsonToken..JsonToken?) defined in com.fasterxml.jackson.core.JsonParser[JavaMethodDescriptor]

'decode' @ [244:31] ==> public open fun decode(p0: (String..String?)): (ByteArray..ByteArray?) defined in net.corda.core.crypto.Base58[JavaMethodDescriptor]

'parser' @ [244:38] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.NodeInfoDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [244:45] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'deserialize' @ [244:51] ==> public inline fun <reified T : Any> ByteArray.deserialize(serializationFactory: SerializationFactory = ..., context: SerializationContext = ...): NodeInfo defined in net.corda.core.serialization[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> NodeInfo

'JsonParseException' @ [246:23] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [246:42] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.NodeInfoDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [246:70] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.NodeInfoDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [246:77] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'e' @ [246:86] ==> val e: Exception /* = Exception */ defined in net.corda.jackson.JacksonSupport.NodeInfoDeserializer.deserialize[LocalVariableDescriptor]

'message' @ [246:88] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'JsonSerializer<SecureHash>' @ [251:35] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> SecureHash

'generator' @ [253:13] ==> value-parameter generator: JsonGenerator defined in net.corda.jackson.JacksonSupport.SecureHashSerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [253:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'obj' @ [253:35] ==> value-parameter obj: SecureHash defined in net.corda.jackson.JacksonSupport.SecureHashSerializer.serialize[ValueParameterDescriptorImpl]

'toString' @ [253:39] ==> public open fun toString(): String defined in net.corda.core.crypto.SecureHash[DeserializedSimpleFunctionDescriptor]

'JsonDeserializer<T>' @ [260:52] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'parser' @ [262:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer.deserialize[ValueParameterDescriptorImpl]

'currentToken' @ [262:24] ==> public final val JsonParser.currentToken: (JsonToken..JsonToken?)[MyPropertyDescriptor]

'FIELD_NAME' @ [262:50] ==> enum entry FIELD_NAME defined in com.fasterxml.jackson.core.JsonToken[FakeCallableDescriptorForObject]

'parser' @ [263:17] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer.deserialize[ValueParameterDescriptorImpl]

'nextToken' @ [263:24] ==> public abstract fun nextToken(): (JsonToken..JsonToken?) defined in com.fasterxml.jackson.core.JsonParser[JavaMethodDescriptor]

'Suppress' @ [266:17] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'SecureHash' @ [267:24] ==> public companion object defined in net.corda.core.crypto.SecureHash[FakeCallableDescriptorForObject]

'parse' @ [267:35] ==> @JvmStatic public final fun parse(str: String): SecureHash.SHA256 defined in net.corda.core.crypto.SecureHash.Companion[DeserializedSimpleFunctionDescriptor]

'parser' @ [267:41] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [267:48] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'JsonParseException' @ [269:23] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [269:42] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [269:66] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [269:73] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'e' @ [269:82] ==> val e: Exception /* = Exception */ defined in net.corda.jackson.JacksonSupport.SecureHashDeserializer.deserialize[LocalVariableDescriptor]

'message' @ [269:84] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'JsonSerializer<EdDSAPublicKey>' @ [274:34] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> EdDSAPublicKey

'check' @ [276:13] ==> @InlineOnly public inline fun check(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'obj' @ [276:19] ==> value-parameter obj: EdDSAPublicKey defined in net.corda.jackson.JacksonSupport.PublicKeySerializer.serialize[ValueParameterDescriptorImpl]

'params' @ [276:23] ==> public final val EdDSAPublicKey.params: (EdDSAParameterSpec..EdDSAParameterSpec?)[MyPropertyDescriptor]

'EDDSA_ED25519_SHA512' @ [276:40] ==> @field:JvmField public final val EDDSA_ED25519_SHA512: SignatureScheme defined in net.corda.core.crypto.Crypto[DeserializedPropertyDescriptor]

'algSpec' @ [276:61] ==> public final val algSpec: AlgorithmParameterSpec? defined in net.corda.core.crypto.SignatureScheme[DeserializedPropertyDescriptor]

'generator' @ [277:13] ==> value-parameter generator: JsonGenerator defined in net.corda.jackson.JacksonSupport.PublicKeySerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [277:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'obj' @ [277:35] ==> value-parameter obj: EdDSAPublicKey defined in net.corda.jackson.JacksonSupport.PublicKeySerializer.serialize[ValueParameterDescriptorImpl]

'toBase58String' @ [277:39] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'JsonDeserializer<EdDSAPublicKey>' @ [281:36] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> EdDSAPublicKey

'parsePublicKeyBase58' @ [284:17] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'parser' @ [284:38] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PublicKeyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [284:45] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'JsonParseException' @ [286:23] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [286:42] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PublicKeyDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [286:72] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.PublicKeyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [286:79] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'e' @ [286:88] ==> val e: Exception /* = Exception */ defined in net.corda.jackson.JacksonSupport.PublicKeyDeserializer.deserialize[LocalVariableDescriptor]

'message' @ [286:90] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'JsonSerializer<CompositeKey>' @ [291:37] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompositeKey

'generator' @ [293:13] ==> value-parameter generator: JsonGenerator defined in net.corda.jackson.JacksonSupport.CompositeKeySerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [293:23] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'obj' @ [293:35] ==> value-parameter obj: CompositeKey defined in net.corda.jackson.JacksonSupport.CompositeKeySerializer.serialize[ValueParameterDescriptorImpl]

'toBase58String' @ [293:39] ==> public fun PublicKey.toBase58String(): String defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'JsonDeserializer<CompositeKey>' @ [297:39] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> CompositeKey

'parsePublicKeyBase58' @ [300:17] ==> public fun parsePublicKeyBase58(base58String: String): PublicKey defined in net.corda.core.crypto[DeserializedSimpleFunctionDescriptor]

'parser' @ [300:38] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.CompositeKeyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [300:45] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'JsonParseException' @ [302:23] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [302:42] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.CompositeKeyDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [302:75] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.CompositeKeyDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [302:82] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'e' @ [302:91] ==> val e: Exception /* = Exception */ defined in net.corda.jackson.JacksonSupport.CompositeKeyDeserializer.deserialize[LocalVariableDescriptor]

'message' @ [302:93] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'JsonSerializer<Amount<*>>' @ [307:31] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Amount<*>

'gen' @ [309:13] ==> value-parameter gen: JsonGenerator defined in net.corda.jackson.JacksonSupport.AmountSerializer.serialize[ValueParameterDescriptorImpl]

'writeString' @ [309:17] ==> public abstract fun writeString(p0: (String..String?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'value' @ [309:29] ==> value-parameter value: Amount<*> defined in net.corda.jackson.JacksonSupport.AmountSerializer.serialize[ValueParameterDescriptorImpl]

'toString' @ [309:35] ==> public open fun toString(): String defined in net.corda.core.contracts.Amount[DeserializedSimpleFunctionDescriptor]

'JsonDeserializer<Amount<*>>' @ [313:33] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Amount<*>

'Amount' @ [316:24] ==> public companion object defined in net.corda.core.contracts.Amount[FakeCallableDescriptorForObject]

'parseCurrency' @ [316:31] ==> @JvmStatic public final fun parseCurrency(input: String): Amount<Currency> defined in net.corda.core.contracts.Amount.Companion[DeserializedSimpleFunctionDescriptor]

'parser' @ [316:45] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [316:52] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'parser' @ [319:32] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[ValueParameterDescriptorImpl]

'readValueAsTree' @ [319:39] ==> public open fun <T : (TreeNode..TreeNode?)> readValueAsTree(): (JsonNode..JsonNode?) defined in com.fasterxml.jackson.core.JsonParser[JavaMethodDescriptor]
Inferred types:
    <T : (TreeNode..TreeNode?)> -> JsonNode

'require' @ [320:21] ==> @InlineOnly public inline fun require(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'tree' @ [320:29] ==> val tree: (JsonNode..JsonNode?) defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'canConvertToLong' @ [320:46] ==> public open fun canConvertToLong(): Boolean defined in com.fasterxml.jackson.databind.JsonNode[JavaMethodDescriptor]

'tree' @ [320:68] ==> val tree: (JsonNode..JsonNode?) defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'asText' @ [320:82] ==> public abstract fun asText(): (String..String?) defined in com.fasterxml.jackson.databind.JsonNode[JavaMethodDescriptor]

'isNotBlank' @ [320:91] ==> @InlineOnly public inline fun CharSequence.isNotBlank(): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'tree' @ [321:36] ==> val tree: (JsonNode..JsonNode?) defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'asLong' @ [321:53] ==> public open fun asLong(): Long defined in com.fasterxml.jackson.databind.JsonNode[JavaMethodDescriptor]

'tree' @ [322:33] ==> val tree: (JsonNode..JsonNode?) defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'asText' @ [322:47] ==> public abstract fun asText(): (String..String?) defined in com.fasterxml.jackson.databind.JsonNode[JavaMethodDescriptor]

'getInstance' @ [324:45] ==> public open fun getInstance(p0: (String..String?)): (Currency..Currency?) defined in java.util.Currency[JavaMethodDescriptor]

'token' @ [324:57] ==> val token: (String..String?) defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'Amount' @ [325:28] ==> public constructor Amount<T : Any>(tokenQuantity: Long, token: (Currency..Currency?)) defined in net.corda.core.contracts.Amount[DeserializedClassConstructorDescriptor]
Inferred types:
    <T : Any> -> (java.util.Currency..java.util.Currency?)

'quantity' @ [325:35] ==> val quantity: Long defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'currency' @ [325:45] ==> val currency: (Currency..Currency?) defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'JsonParseException' @ [327:27] ==> public constructor JsonParseException(p0: (JsonParser..JsonParser?), p1: (String..String?), p2: (Throwable..Throwable?)) defined in com.fasterxml.jackson.core.JsonParseException[JavaClassConstructorDescriptor]

'parser' @ [327:46] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[ValueParameterDescriptorImpl]

'parser' @ [327:72] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [327:79] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'e2' @ [327:87] ==> val e2: Exception /* = Exception */ defined in net.corda.jackson.JacksonSupport.AmountDeserializer.deserialize[LocalVariableDescriptor]

'JsonDeserializer<OpaqueBytes>' @ [333:38] ==> public constructor JsonDeserializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonDeserializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> OpaqueBytes

'OpaqueBytes' @ [335:20] ==> public constructor OpaqueBytes(bytes: ByteArray) defined in net.corda.core.utilities.OpaqueBytes[DeserializedClassConstructorDescriptor]

'parser' @ [335:32] ==> value-parameter parser: JsonParser defined in net.corda.jackson.JacksonSupport.OpaqueBytesDeserializer.deserialize[ValueParameterDescriptorImpl]

'text' @ [335:39] ==> public final val JsonParser.text: (String..String?)[MyPropertyDescriptor]

'toByteArray' @ [335:44] ==> @InlineOnly public inline fun String.toByteArray(charset: Charset = ...): ByteArray defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'JsonSerializer<OpaqueBytes>' @ [339:36] ==> public constructor JsonSerializer<T : (Any..Any?)>() defined in com.fasterxml.jackson.databind.JsonSerializer[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> OpaqueBytes

'gen' @ [341:13] ==> value-parameter gen: JsonGenerator defined in net.corda.jackson.JacksonSupport.OpaqueBytesSerializer.serialize[ValueParameterDescriptorImpl]

'writeBinary' @ [341:17] ==> public open fun writeBinary(p0: (ByteArray..ByteArray?)): Unit defined in com.fasterxml.jackson.core.JsonGenerator[JavaMethodDescriptor]

'value' @ [341:29] ==> value-parameter value: OpaqueBytes defined in net.corda.jackson.JacksonSupport.OpaqueBytesSerializer.serialize[ValueParameterDescriptorImpl]

'bytes' @ [341:35] ==> public open val bytes: ByteArray defined in net.corda.core.utilities.OpaqueBytes[DeserializedPropertyDescriptor]

'JsonIgnore' @ [346:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonProperty' @ [347:9] ==> public constructor JsonProperty(value: String = ..., required: Boolean = ..., index: Int = ..., defaultValue: String = ..., access: JsonProperty.Access = ...) defined in com.fasterxml.jackson.annotation.JsonProperty[JavaClassConstructorDescriptor]

'JsonProperty' @ [348:9] ==> public constructor JsonProperty(value: String = ..., required: Boolean = ..., index: Int = ..., defaultValue: String = ..., access: JsonProperty.Access = ...) defined in com.fasterxml.jackson.annotation.JsonProperty[JavaClassConstructorDescriptor]

'JsonIgnore' @ [349:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [350:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [351:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [352:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [353:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [354:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [358:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [359:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [360:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

'JsonIgnore' @ [361:9] ==> public constructor JsonIgnore(value: Boolean = ...) defined in com.fasterxml.jackson.annotation.JsonIgnore[JavaClassConstructorDescriptor]

