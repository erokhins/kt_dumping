'Converter' @ [14:1] ==> public constructor Converter(autoApply: Boolean = ...) defined in javax.persistence.Converter[JavaClassConstructorDescriptor]

'lazy' @ [17:53] ==> public fun <T> lazy(initializer: () -> IdentityService): Lazy<IdentityService> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IdentityService

'invoke' @ [18:9] ==> public abstract operator fun invoke(): IdentityService defined in kotlin.Function0[FunctionInvokeDescriptor]

'loggerFor' @ [22:19] ==> public inline fun <reified T : Any> loggerFor(): Logger defined in net.corda.core.utilities[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : Any> -> AbstractPartyToX500NameAsStringConverter

'party' @ [26:9] ==> value-parameter party: AbstractParty? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToDatabaseColumn[ValueParameterDescriptorImpl]

'let' @ [26:16] ==> @InlineOnly public inline fun <T, R> AbstractParty.let(block: (AbstractParty) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbstractParty
    <R> -> Unit

'identityService' @ [27:29] ==> private final val identityService: IdentityService defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter[PropertyDescriptorImpl]

'partyFromAnonymous' @ [27:45] ==> public abstract fun partyFromAnonymous(party: AbstractParty): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'party' @ [27:64] ==> value-parameter party: AbstractParty? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToDatabaseColumn[ValueParameterDescriptorImpl]

'toString' @ [27:72] ==> public open fun toString(): String defined in net.corda.core.identity.Party[SimpleFunctionDescriptorImpl]

'if (partyName != null) return partyName
            else log.warn ("Identity service unable to resolve AbstractParty: $party")' @ [28:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'partyName' @ [28:17] ==> val partyName: String? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToDatabaseColumn.<anonymous>[LocalVariableDescriptor]

'partyName' @ [28:43] ==> val partyName: String? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToDatabaseColumn.<anonymous>[LocalVariableDescriptor]

'log' @ [29:18] ==> public final val log: Logger defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.Companion[PropertyDescriptorImpl]

'warn' @ [29:22] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'party' @ [29:80] ==> value-parameter party: AbstractParty? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToDatabaseColumn[ValueParameterDescriptorImpl]

'dbData' @ [35:9] ==> value-parameter dbData: String? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToEntityAttribute[ValueParameterDescriptorImpl]

'let' @ [35:17] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> Unit

'identityService' @ [36:25] ==> private final val identityService: IdentityService defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter[PropertyDescriptorImpl]

'partyFromX500Name' @ [36:41] ==> public abstract fun partyFromX500Name(principal: X500Name): Party? defined in net.corda.core.node.services.IdentityService[SimpleFunctionDescriptorImpl]

'X500Name' @ [36:59] ==> public constructor X500Name(p0: (String..String?)) defined in org.bouncycastle.asn1.x500.X500Name[JavaClassConstructorDescriptor]

'dbData' @ [36:68] ==> value-parameter dbData: String? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToEntityAttribute[ValueParameterDescriptorImpl]

'if (party != null) return party
            else log.warn ("Identity service unable to resolve X500name: $dbData")' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'party' @ [37:17] ==> val party: Party? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToEntityAttribute.<anonymous>[LocalVariableDescriptor]

'party' @ [37:39] ==> val party: Party? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToEntityAttribute.<anonymous>[LocalVariableDescriptor]

'log' @ [38:18] ==> public final val log: Logger defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.Companion[PropertyDescriptorImpl]

'warn' @ [38:22] ==> public abstract fun warn(p0: (String..String?)): Unit defined in org.slf4j.Logger[JavaMethodDescriptor]

'dbData' @ [38:75] ==> value-parameter dbData: String? defined in net.corda.core.schemas.converters.AbstractPartyToX500NameAsStringConverter.convertToEntityAttribute[ValueParameterDescriptorImpl]

