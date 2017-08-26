'CordaSerializable' @ [19:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'randomUUID' @ [20:81] ==> public open fun randomUUID(): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'if (externalId != null) "${externalId}_$id" else id.toString()' @ [21:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'externalId' @ [21:43] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'externalId' @ [21:66] ==> public final val externalId: String? defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'id' @ [21:79] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'id' @ [21:88] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'toString' @ [21:91] ==> public open fun toString(): String defined in java.util.UUID[JavaMethodDescriptor]

'VisibleForTesting' @ [25:9] ==> public constructor VisibleForTesting() defined in net.corda.core.internal.VisibleForTesting[ClassConstructorDescriptorImpl]

'UniqueIdentifier' @ [26:58] ==> public constructor UniqueIdentifier(externalId: String? = ..., id: UUID = ...) defined in net.corda.core.contracts.UniqueIdentifier[ClassConstructorDescriptorImpl]

'fromString' @ [26:86] ==> public open fun fromString(p0: (String..String?)): (UUID..UUID?) defined in java.util.UUID[JavaMethodDescriptor]

'name' @ [26:97] ==> value-parameter name: String defined in net.corda.core.contracts.UniqueIdentifier.Companion.fromString[ValueParameterDescriptorImpl]

'id' @ [29:60] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'compareTo' @ [29:63] ==> public open fun compareTo(other: (UUID..UUID?)): Int defined in java.util.UUID[JavaMethodDescriptor]

'other' @ [29:73] ==> value-parameter other: UniqueIdentifier defined in net.corda.core.contracts.UniqueIdentifier.compareTo[ValueParameterDescriptorImpl]

'id' @ [29:79] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'if (other is UniqueIdentifier)
            id == other.id
        else
            false' @ [32:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'other' @ [32:20] ==> value-parameter other: Any? defined in net.corda.core.contracts.UniqueIdentifier.equals[ValueParameterDescriptorImpl]

'id' @ [33:13] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'other' @ [33:19] ==> value-parameter other: Any? defined in net.corda.core.contracts.UniqueIdentifier.equals[ValueParameterDescriptorImpl]

'id' @ [33:25] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'id' @ [38:36] ==> public final val id: UUID defined in net.corda.core.contracts.UniqueIdentifier[PropertyDescriptorImpl]

'hashCode' @ [38:39] ==> public open fun hashCode(): Int defined in java.util.UUID[JavaMethodDescriptor]

