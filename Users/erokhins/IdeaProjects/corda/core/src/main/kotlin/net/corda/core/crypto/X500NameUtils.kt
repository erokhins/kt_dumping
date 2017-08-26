'JvmName' @ [1:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'mutateCommonName' @ [18:65] ==> private fun X500Name.mutateCommonName(mutator: (ASN1Encodable) -> String): X500Name defined in net.corda.core.crypto[SimpleFunctionDescriptorImpl]

'attr' @ [18:92] ==> value-parameter attr: ASN1Encodable defined in net.corda.core.crypto.appendToCommonName.<anonymous>[ValueParameterDescriptorImpl]

'toString' @ [18:97] ==> public open fun toString(): String defined in org.bouncycastle.asn1.ASN1Encodable[DeserializedSimpleFunctionDescriptor]

'commonName' @ [18:110] ==> value-parameter commonName: String defined in net.corda.core.crypto.appendToCommonName[ValueParameterDescriptorImpl]

'mutateCommonName' @ [25:64] ==> private fun X500Name.mutateCommonName(mutator: (ASN1Encodable) -> String): X500Name defined in net.corda.core.crypto[SimpleFunctionDescriptorImpl]

'commonName' @ [25:88] ==> value-parameter commonName: String defined in net.corda.core.crypto.replaceCommonName[ValueParameterDescriptorImpl]

'X500NameBuilder' @ [34:19] ==> public constructor X500NameBuilder(p0: (X500NameStyle..X500NameStyle?)) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaClassConstructorDescriptor]

'INSTANCE' @ [34:43] ==> public final val INSTANCE: (X500NameStyle..X500NameStyle?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'this' @ [36:5] ==> <this> defined in net.corda.core.crypto.mutateCommonName[ReceiverParameterDescriptorImpl]

'rdNs' @ [36:10] ==> public final val X500Name.rdNs: (Array<(RDN..RDN?)>..Array<out (RDN..RDN?)>?)[MyPropertyDescriptor]

'forEach' @ [36:15] ==> public inline fun <T> Array<out (RDN..RDN?)>.forEach(action: ((RDN..RDN?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.bouncycastle.asn1.x500.RDN..org.bouncycastle.asn1.x500.RDN?)

'rdn' @ [37:9] ==> value-parameter rdn: (RDN..RDN?) defined in net.corda.core.crypto.mutateCommonName.<anonymous>[ValueParameterDescriptorImpl]

'typesAndValues' @ [37:13] ==> public final val RDN.typesAndValues: (Array<(AttributeTypeAndValue..AttributeTypeAndValue?)>..Array<out (AttributeTypeAndValue..AttributeTypeAndValue?)>?)[MyPropertyDescriptor]

'forEach' @ [37:28] ==> public inline fun <T> Array<out (AttributeTypeAndValue..AttributeTypeAndValue?)>.forEach(action: ((AttributeTypeAndValue..AttributeTypeAndValue?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.bouncycastle.asn1.x500.AttributeTypeAndValue..org.bouncycastle.asn1.x500.AttributeTypeAndValue?)

'when (typeAndValue.type) {
                BCStyle.CN -> {
                    matched = true
                    builder.addRDN(typeAndValue.type, mutator(typeAndValue.value))
                }
                else -> {
                    builder.addRDN(typeAndValue)
                }
            }' @ [38:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (X500NameBuilder..X500NameBuilder?), entry1: (X500NameBuilder..X500NameBuilder?)): (X500NameBuilder..X500NameBuilder?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.bouncycastle.asn1.x500.X500NameBuilder..org.bouncycastle.asn1.x500.X500NameBuilder?)

'typeAndValue' @ [38:19] ==> value-parameter typeAndValue: (AttributeTypeAndValue..AttributeTypeAndValue?) defined in net.corda.core.crypto.mutateCommonName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [38:32] ==> public final val AttributeTypeAndValue.type: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)[MyPropertyDescriptor]

'CN' @ [39:25] ==> public final val CN: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'matched' @ [40:21] ==> var matched: Boolean defined in net.corda.core.crypto.mutateCommonName[LocalVariableDescriptor]

'builder' @ [41:21] ==> val builder: X500NameBuilder defined in net.corda.core.crypto.mutateCommonName[LocalVariableDescriptor]

'addRDN' @ [41:29] ==> public open fun addRDN(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: (String..String?)): (X500NameBuilder..X500NameBuilder?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

'typeAndValue' @ [41:36] ==> value-parameter typeAndValue: (AttributeTypeAndValue..AttributeTypeAndValue?) defined in net.corda.core.crypto.mutateCommonName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [41:49] ==> public final val AttributeTypeAndValue.type: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)[MyPropertyDescriptor]

'invoke' @ [41:55] ==> public abstract operator fun invoke(p1: ASN1Encodable): String defined in kotlin.Function1[FunctionInvokeDescriptor]

'typeAndValue' @ [41:63] ==> value-parameter typeAndValue: (AttributeTypeAndValue..AttributeTypeAndValue?) defined in net.corda.core.crypto.mutateCommonName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [41:76] ==> public final val AttributeTypeAndValue.value: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'builder' @ [44:21] ==> val builder: X500NameBuilder defined in net.corda.core.crypto.mutateCommonName[LocalVariableDescriptor]

'addRDN' @ [44:29] ==> public open fun addRDN(p0: (AttributeTypeAndValue..AttributeTypeAndValue?)): (X500NameBuilder..X500NameBuilder?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

'typeAndValue' @ [44:36] ==> value-parameter typeAndValue: (AttributeTypeAndValue..AttributeTypeAndValue?) defined in net.corda.core.crypto.mutateCommonName.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'require' @ [49:5] ==> @InlineOnly public inline fun require(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'matched' @ [49:13] ==> var matched: Boolean defined in net.corda.core.crypto.mutateCommonName[LocalVariableDescriptor]

'this' @ [49:87] ==> <this> defined in net.corda.core.crypto.mutateCommonName[ReceiverParameterDescriptorImpl]

'builder' @ [50:12] ==> val builder: X500NameBuilder defined in net.corda.core.crypto.mutateCommonName[LocalVariableDescriptor]

'build' @ [50:20] ==> public open fun build(): (X500Name..X500Name?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

'getRDNs' @ [53:41] ==> public open fun getRDNs(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)): (Array<(RDN..RDN?)>..Array<out (RDN..RDN?)>?) defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'CN' @ [53:57] ==> public final val CN: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'first' @ [53:61] ==> public fun <T> Array<out (RDN..RDN?)>.first(): (RDN..RDN?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.bouncycastle.asn1.x500.RDN..org.bouncycastle.asn1.x500.RDN?)

'first' @ [53:69] ==> public final val RDN.first: (AttributeTypeAndValue..AttributeTypeAndValue?)[MyPropertyDescriptor]

'value' @ [53:75] ==> public final val AttributeTypeAndValue.value: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'toString' @ [53:81] ==> public open fun toString(): String defined in org.bouncycastle.asn1.ASN1Encodable[DeserializedSimpleFunctionDescriptor]

'getRDNs' @ [54:39] ==> public open fun getRDNs(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)): (Array<(RDN..RDN?)>..Array<out (RDN..RDN?)>?) defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'O' @ [54:55] ==> public final val O: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'firstOrNull' @ [54:58] ==> public fun <T> Array<out (RDN..RDN?)>.firstOrNull(): RDN? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.bouncycastle.asn1.x500.RDN..org.bouncycastle.asn1.x500.RDN?)

'first' @ [54:73] ==> public final val RDN.first: (AttributeTypeAndValue..AttributeTypeAndValue?)[MyPropertyDescriptor]

'value' @ [54:80] ==> public final val AttributeTypeAndValue.value: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'toString' @ [54:87] ==> public open fun toString(): String defined in org.bouncycastle.asn1.ASN1Encodable[DeserializedSimpleFunctionDescriptor]

'getRDNs' @ [55:39] ==> public open fun getRDNs(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?)): (Array<(RDN..RDN?)>..Array<out (RDN..RDN?)>?) defined in org.bouncycastle.asn1.x500.X500Name[JavaMethodDescriptor]

'L' @ [55:55] ==> public final val L: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'first' @ [55:58] ==> public fun <T> Array<out (RDN..RDN?)>.first(): (RDN..RDN?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.bouncycastle.asn1.x500.RDN..org.bouncycastle.asn1.x500.RDN?)

'first' @ [55:66] ==> public final val RDN.first: (AttributeTypeAndValue..AttributeTypeAndValue?)[MyPropertyDescriptor]

'value' @ [55:72] ==> public final val AttributeTypeAndValue.value: (ASN1Encodable..ASN1Encodable?)[MyPropertyDescriptor]

'toString' @ [55:78] ==> public open fun toString(): String defined in org.bouncycastle.asn1.ASN1Encodable[DeserializedSimpleFunctionDescriptor]

'location' @ [57:5] ==> public val X500Name.location: String defined in net.corda.core.crypto in file X500NameUtils.kt[PropertyDescriptorImpl]

'toX509CertHolder' @ [61:47] ==> public fun Certificate.toX509CertHolder(): X509CertificateHolder defined in net.corda.core.internal[SimpleFunctionDescriptorImpl]

'subject' @ [61:66] ==> public final val X509CertificateHolder.subject: (X500Name..X500Name?)[MyPropertyDescriptor]

'JcaX509CertificateConverter' @ [62:57] ==> public constructor JcaX509CertificateConverter() defined in org.bouncycastle.cert.jcajce.JcaX509CertificateConverter[JavaClassConstructorDescriptor]

'getCertificate' @ [62:87] ==> public open fun getCertificate(p0: (X509CertificateHolder..X509CertificateHolder?)): (X509Certificate..X509Certificate?) defined in org.bouncycastle.cert.jcajce.JcaX509CertificateConverter[JavaMethodDescriptor]

'this' @ [62:102] ==> <this> defined in net.corda.core.crypto.cert[ReceiverParameterDescriptorImpl]

'JvmOverloads' @ [67:1] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'X500NameBuilder' @ [69:12] ==> public constructor X500NameBuilder(p0: (X500NameStyle..X500NameStyle?)) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaClassConstructorDescriptor]

'INSTANCE' @ [69:36] ==> public final val INSTANCE: (X500NameStyle..X500NameStyle?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'let' @ [69:46] ==> @InlineOnly public inline fun <T, R> X500NameBuilder.let(block: (X500NameBuilder) -> (X500Name..X500Name?)): (X500Name..X500Name?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> X500NameBuilder
    <R> -> (org.bouncycastle.asn1.x500.X500Name..org.bouncycastle.asn1.x500.X500Name?)

'builder' @ [70:9] ==> value-parameter builder: X500NameBuilder defined in net.corda.core.crypto.getX509Name.<anonymous>[ValueParameterDescriptorImpl]

'addRDN' @ [70:17] ==> public open fun addRDN(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: (String..String?)): (X500NameBuilder..X500NameBuilder?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

'CN' @ [70:32] ==> public final val CN: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'myLegalName' @ [70:36] ==> value-parameter myLegalName: String defined in net.corda.core.crypto.getX509Name[ValueParameterDescriptorImpl]

'builder' @ [71:9] ==> value-parameter builder: X500NameBuilder defined in net.corda.core.crypto.getX509Name.<anonymous>[ValueParameterDescriptorImpl]

'addRDN' @ [71:17] ==> public open fun addRDN(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: (String..String?)): (X500NameBuilder..X500NameBuilder?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

'L' @ [71:32] ==> public final val L: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'nearestCity' @ [71:35] ==> value-parameter nearestCity: String defined in net.corda.core.crypto.getX509Name[ValueParameterDescriptorImpl]

'country' @ [72:9] ==> value-parameter country: String? = ... defined in net.corda.core.crypto.getX509Name[ValueParameterDescriptorImpl]

'let' @ [72:18] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> (X500NameBuilder..X500NameBuilder?)): (X500NameBuilder..X500NameBuilder?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> (org.bouncycastle.asn1.x500.X500NameBuilder..org.bouncycastle.asn1.x500.X500NameBuilder?)

'builder' @ [72:24] ==> value-parameter builder: X500NameBuilder defined in net.corda.core.crypto.getX509Name.<anonymous>[ValueParameterDescriptorImpl]

'addRDN' @ [72:32] ==> public open fun addRDN(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: (String..String?)): (X500NameBuilder..X500NameBuilder?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

'C' @ [72:47] ==> public final val C: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'it' @ [72:50] ==> value-parameter it: String defined in net.corda.core.crypto.getX509Name.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'builder' @ [73:9] ==> value-parameter builder: X500NameBuilder defined in net.corda.core.crypto.getX509Name.<anonymous>[ValueParameterDescriptorImpl]

'addRDN' @ [73:17] ==> public open fun addRDN(p0: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?), p1: (String..String?)): (X500NameBuilder..X500NameBuilder?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

'E' @ [73:32] ==> public final val E: (ASN1ObjectIdentifier..ASN1ObjectIdentifier?) defined in org.bouncycastle.asn1.x500.style.BCStyle[JavaPropertyDescriptor]

'email' @ [73:35] ==> value-parameter email: String defined in net.corda.core.crypto.getX509Name[ValueParameterDescriptorImpl]

'builder' @ [74:9] ==> value-parameter builder: X500NameBuilder defined in net.corda.core.crypto.getX509Name.<anonymous>[ValueParameterDescriptorImpl]

'build' @ [74:17] ==> public open fun build(): (X500Name..X500Name?) defined in org.bouncycastle.asn1.x500.X500NameBuilder[JavaMethodDescriptor]

