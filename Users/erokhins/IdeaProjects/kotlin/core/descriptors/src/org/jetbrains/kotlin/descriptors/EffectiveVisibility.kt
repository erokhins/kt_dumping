'name' @ [27:31] ==> public final val name: String defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[PropertyDescriptorImpl]

'EffectiveVisibility' @ [42:22] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'if (this == other || Local == other) Permissiveness.SAME else Permissiveness.LESS' @ [44:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility.Permissiveness, elseBranch: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Permissiveness

'this' @ [44:21] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Private[LazyClassReceiverParameterDescriptor]

'other' @ [44:29] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Private.relation[ValueParameterDescriptorImpl]

'Local' @ [44:38] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'other' @ [44:47] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Private.relation[ValueParameterDescriptorImpl]

'SAME' @ [44:69] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'LESS' @ [44:94] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'PRIVATE' @ [46:52] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'EffectiveVisibility' @ [50:20] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'if (this == other || Private == other) Permissiveness.SAME else Permissiveness.LESS' @ [52:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility.Permissiveness, elseBranch: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Permissiveness

'this' @ [52:21] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Local[LazyClassReceiverParameterDescriptor]

'other' @ [52:29] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Local.relation[ValueParameterDescriptorImpl]

'Private' @ [52:38] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'other' @ [52:49] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Local.relation[ValueParameterDescriptorImpl]

'SAME' @ [52:71] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'LESS' @ [52:96] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'LOCAL' @ [54:52] ==> @NotNull public final val LOCAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'EffectiveVisibility' @ [57:21] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'if (this == other) Permissiveness.SAME else Permissiveness.MORE' @ [59:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility.Permissiveness, elseBranch: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Permissiveness

'this' @ [59:21] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Public[LazyClassReceiverParameterDescriptor]

'other' @ [59:29] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Public.relation[ValueParameterDescriptorImpl]

'SAME' @ [59:51] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'MORE' @ [59:76] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'PUBLIC' @ [61:52] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'EffectiveVisibility' @ [64:81] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'if (internal) "internal" else "public/*package*/"' @ [65:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'internal' @ [65:17] ==> value-parameter internal: Boolean defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage.<init>[ValueParameterDescriptorImpl]

'when (other) {
            Public -> Permissiveness.LESS
            Private, Local, InternalProtectedBound, is InternalProtected -> Permissiveness.MORE
            is InternalOrPackage -> Permissiveness.SAME
            ProtectedBound, is Protected -> Permissiveness.UNKNOWN
        }' @ [67:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility.Permissiveness, entry1: EffectiveVisibility.Permissiveness, entry2: EffectiveVisibility.Permissiveness, entry3: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Permissiveness

'other' @ [67:67] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage.relation[ValueParameterDescriptorImpl]

'Public' @ [68:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'LESS' @ [68:38] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'Private' @ [69:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [69:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [69:29] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'MORE' @ [69:92] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'SAME' @ [70:52] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'ProtectedBound' @ [71:13] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'UNKNOWN' @ [71:60] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'when (other) {
            Public -> this
            Private, Local, InternalProtectedBound, is InternalOrPackage, is InternalProtected -> other
            is Protected -> InternalProtected(other.container)
            ProtectedBound -> InternalProtectedBound
        }' @ [74:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility, entry3: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'other' @ [74:69] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage.lowerBound[ValueParameterDescriptorImpl]

'Public' @ [75:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'this' @ [75:23] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage[LazyClassReceiverParameterDescriptor]

'Private' @ [76:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [76:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [76:29] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'other' @ [76:99] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage.lowerBound[ValueParameterDescriptorImpl]

'InternalProtected' @ [77:29] ==> public constructor InternalProtected(container: ClassDescriptor?) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[ClassConstructorDescriptorImpl]

'other' @ [77:47] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage.lowerBound[ValueParameterDescriptorImpl]

'container' @ [77:53] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'ProtectedBound' @ [78:13] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [78:31] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalOrPackage' @ [82:23] ==> protected constructor InternalOrPackage(internal: Boolean) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage[ClassConstructorDescriptorImpl]

'INTERNAL' @ [83:52] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'InternalOrPackage' @ [86:29] ==> protected constructor InternalOrPackage(internal: Boolean) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalOrPackage[ClassConstructorDescriptorImpl]

'PRIVATE' @ [87:52] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'EffectiveVisibility' @ [90:56] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'other' @ [92:45] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.equals[ValueParameterDescriptorImpl]

'container' @ [92:67] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'other' @ [92:80] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.equals[ValueParameterDescriptorImpl]

'container' @ [92:86] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'container' @ [94:35] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'hashCode' @ [94:46] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedSimpleFunctionDescriptor]

'super' @ [96:38] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[LazyClassReceiverParameterDescriptor]

'toString' @ [96:44] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[SimpleFunctionDescriptorImpl]

'container' @ [96:62] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'name' @ [96:73] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'when (other) {
            Public -> Permissiveness.LESS
            Private, Local, ProtectedBound, InternalProtectedBound -> Permissiveness.MORE
            is Protected -> containerRelation(container, other.container)
            is InternalProtected -> when (containerRelation(container, other.container)) {
                // Protected never can be less permissive than internal & protected
                Permissiveness.SAME, Permissiveness.MORE -> Permissiveness.MORE
                Permissiveness.UNKNOWN, Permissiveness.LESS -> Permissiveness.UNKNOWN
            }
            is InternalOrPackage -> Permissiveness.UNKNOWN
        }' @ [98:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility.Permissiveness, entry1: EffectiveVisibility.Permissiveness, entry2: EffectiveVisibility.Permissiveness, entry3: EffectiveVisibility.Permissiveness, entry4: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Permissiveness

'other' @ [98:67] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.relation[ValueParameterDescriptorImpl]

'Public' @ [99:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'LESS' @ [99:38] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'Private' @ [100:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [100:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'ProtectedBound' @ [100:29] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [100:45] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'MORE' @ [100:86] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'containerRelation' @ [101:29] ==> internal fun containerRelation(first: ClassDescriptor?, second: ClassDescriptor?): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'container' @ [101:47] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'other' @ [101:58] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.relation[ValueParameterDescriptorImpl]

'container' @ [101:64] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'when (containerRelation(container, other.container)) {
                // Protected never can be less permissive than internal & protected
                Permissiveness.SAME, Permissiveness.MORE -> Permissiveness.MORE
                Permissiveness.UNKNOWN, Permissiveness.LESS -> Permissiveness.UNKNOWN
            }' @ [102:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility.Permissiveness, entry1: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Permissiveness

'containerRelation' @ [102:43] ==> internal fun containerRelation(first: ClassDescriptor?, second: ClassDescriptor?): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'container' @ [102:61] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'other' @ [102:72] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.relation[ValueParameterDescriptorImpl]

'container' @ [102:78] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'SAME' @ [104:32] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'MORE' @ [104:53] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'MORE' @ [104:76] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [105:32] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'LESS' @ [105:56] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [105:79] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [107:52] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'when (other) {
            Public -> this
            Private, Local, ProtectedBound, InternalProtectedBound -> other
            is Protected -> when (relation(other)) {
                Permissiveness.SAME, Permissiveness.MORE -> this
                Permissiveness.LESS -> other
                Permissiveness.UNKNOWN -> ProtectedBound
            }
            is InternalProtected -> when (relation(other)) {
                Permissiveness.LESS -> other
                else -> InternalProtectedBound
            }
            is InternalOrPackage -> InternalProtected(container)
        }' @ [110:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility, entry3: EffectiveVisibility, entry4: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'other' @ [110:69] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.lowerBound[ValueParameterDescriptorImpl]

'Public' @ [111:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'this' @ [111:23] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[LazyClassReceiverParameterDescriptor]

'Private' @ [112:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [112:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'ProtectedBound' @ [112:29] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [112:45] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'other' @ [112:71] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.lowerBound[ValueParameterDescriptorImpl]

'when (relation(other)) {
                Permissiveness.SAME, Permissiveness.MORE -> this
                Permissiveness.LESS -> other
                Permissiveness.UNKNOWN -> ProtectedBound
            }' @ [113:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'relation' @ [113:35] ==> public open fun relation(other: EffectiveVisibility): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[SimpleFunctionDescriptorImpl]

'other' @ [113:44] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.lowerBound[ValueParameterDescriptorImpl]

'SAME' @ [114:32] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'MORE' @ [114:53] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'this' @ [114:61] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[LazyClassReceiverParameterDescriptor]

'LESS' @ [115:32] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'other' @ [115:40] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.lowerBound[ValueParameterDescriptorImpl]

'UNKNOWN' @ [116:32] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'ProtectedBound' @ [116:43] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'when (relation(other)) {
                Permissiveness.LESS -> other
                else -> InternalProtectedBound
            }' @ [118:37] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'relation' @ [118:43] ==> public open fun relation(other: EffectiveVisibility): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[SimpleFunctionDescriptorImpl]

'other' @ [118:52] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.lowerBound[ValueParameterDescriptorImpl]

'LESS' @ [119:32] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'other' @ [119:40] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected.lowerBound[ValueParameterDescriptorImpl]

'InternalProtectedBound' @ [120:25] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtected' @ [122:37] ==> public constructor InternalProtected(container: ClassDescriptor?) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[ClassConstructorDescriptorImpl]

'container' @ [122:55] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'PROTECTED' @ [125:52] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'EffectiveVisibility' @ [129:29] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'when (other) {
            Public, is Protected -> Permissiveness.LESS
            Private, Local, InternalProtectedBound -> Permissiveness.MORE
            ProtectedBound -> Permissiveness.SAME
            is InternalOrPackage, is InternalProtected -> Permissiveness.UNKNOWN
        }' @ [130:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility.Permissiveness, entry1: EffectiveVisibility.Permissiveness, entry2: EffectiveVisibility.Permissiveness, entry3: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Permissiveness

'other' @ [130:67] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.ProtectedBound.relation[ValueParameterDescriptorImpl]

'Public' @ [131:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'LESS' @ [131:52] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'Private' @ [132:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [132:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [132:29] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'MORE' @ [132:70] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'ProtectedBound' @ [133:13] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'SAME' @ [133:46] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [134:74] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'when (other) {
            Public, is Protected -> this
            Private, Local, ProtectedBound, InternalProtectedBound -> other
            is InternalOrPackage, is InternalProtected -> InternalProtectedBound
        }' @ [137:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'other' @ [137:69] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.ProtectedBound.lowerBound[ValueParameterDescriptorImpl]

'Public' @ [138:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'this' @ [138:37] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.ProtectedBound[LazyClassReceiverParameterDescriptor]

'Private' @ [139:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [139:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'ProtectedBound' @ [139:29] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [139:45] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'other' @ [139:71] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.ProtectedBound.lowerBound[ValueParameterDescriptorImpl]

'InternalProtectedBound' @ [140:59] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'PROTECTED' @ [143:52] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'EffectiveVisibility' @ [147:63] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'other' @ [149:45] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.equals[ValueParameterDescriptorImpl]

'container' @ [149:75] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'other' @ [149:88] ==> value-parameter other: Any? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.equals[ValueParameterDescriptorImpl]

'container' @ [149:94] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'container' @ [151:35] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'hashCode' @ [151:46] ==> public open fun hashCode(): Int defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[DeserializedSimpleFunctionDescriptor]

'super' @ [153:38] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[LazyClassReceiverParameterDescriptor]

'toString' @ [153:44] ==> public open fun toString(): String defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[SimpleFunctionDescriptorImpl]

'container' @ [153:62] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'name' @ [153:73] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'when (other) {
            Public, is InternalOrPackage -> Permissiveness.LESS
            Private, Local, InternalProtectedBound -> Permissiveness.MORE
            is InternalProtected -> containerRelation(container, other.container)
            is Protected -> when (containerRelation(container, other.container)) {
                // Internal & protected never can be more permissive than just protected
                Permissiveness.SAME, Permissiveness.LESS -> Permissiveness.LESS
                Permissiveness.UNKNOWN, Permissiveness.MORE -> Permissiveness.UNKNOWN
            }
            ProtectedBound -> Permissiveness.UNKNOWN
        }' @ [155:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility.Permissiveness, entry1: EffectiveVisibility.Permissiveness, entry2: EffectiveVisibility.Permissiveness, entry3: EffectiveVisibility.Permissiveness, entry4: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Permissiveness

'other' @ [155:67] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.relation[ValueParameterDescriptorImpl]

'Public' @ [156:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'LESS' @ [156:60] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'Private' @ [157:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [157:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [157:29] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'MORE' @ [157:70] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'containerRelation' @ [158:37] ==> internal fun containerRelation(first: ClassDescriptor?, second: ClassDescriptor?): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'container' @ [158:55] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'other' @ [158:66] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.relation[ValueParameterDescriptorImpl]

'container' @ [158:72] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'when (containerRelation(container, other.container)) {
                // Internal & protected never can be more permissive than just protected
                Permissiveness.SAME, Permissiveness.LESS -> Permissiveness.LESS
                Permissiveness.UNKNOWN, Permissiveness.MORE -> Permissiveness.UNKNOWN
            }' @ [159:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility.Permissiveness, entry1: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Permissiveness

'containerRelation' @ [159:35] ==> internal fun containerRelation(first: ClassDescriptor?, second: ClassDescriptor?): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'container' @ [159:53] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[PropertyDescriptorImpl]

'other' @ [159:64] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.relation[ValueParameterDescriptorImpl]

'container' @ [159:70] ==> public final val container: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[PropertyDescriptorImpl]

'SAME' @ [161:32] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'LESS' @ [161:53] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'LESS' @ [161:76] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [162:32] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'MORE' @ [162:56] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [162:79] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'ProtectedBound' @ [164:13] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'UNKNOWN' @ [164:46] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'when (other) {
            Public, is InternalOrPackage -> this
            Private, Local, InternalProtectedBound -> other
            is Protected, is InternalProtected -> when (relation(other)) {
                Permissiveness.SAME, Permissiveness.MORE -> this
                Permissiveness.LESS -> other
                Permissiveness.UNKNOWN -> InternalProtectedBound
            }
            ProtectedBound -> InternalProtectedBound
        }' @ [167:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility, entry3: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'other' @ [167:69] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.lowerBound[ValueParameterDescriptorImpl]

'Public' @ [168:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'this' @ [168:45] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[LazyClassReceiverParameterDescriptor]

'Private' @ [169:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [169:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [169:29] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'other' @ [169:55] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.lowerBound[ValueParameterDescriptorImpl]

'when (relation(other)) {
                Permissiveness.SAME, Permissiveness.MORE -> this
                Permissiveness.LESS -> other
                Permissiveness.UNKNOWN -> InternalProtectedBound
            }' @ [170:51] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'relation' @ [170:57] ==> public open fun relation(other: EffectiveVisibility): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[SimpleFunctionDescriptorImpl]

'other' @ [170:66] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.lowerBound[ValueParameterDescriptorImpl]

'SAME' @ [171:32] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'MORE' @ [171:53] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'this' @ [171:61] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected[LazyClassReceiverParameterDescriptor]

'LESS' @ [172:32] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'other' @ [172:40] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtected.lowerBound[ValueParameterDescriptorImpl]

'UNKNOWN' @ [173:32] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [173:43] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'ProtectedBound' @ [175:13] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [175:31] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'PRIVATE' @ [178:52] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'EffectiveVisibility' @ [182:37] ==> private constructor EffectiveVisibility(name: String, publicApi: Boolean = ..., privateApi: Boolean = ...) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[ClassConstructorDescriptorImpl]

'when (other) {
            Public, is Protected, is InternalProtected, ProtectedBound, is InternalOrPackage -> Permissiveness.LESS
            Private, Local -> Permissiveness.MORE
            InternalProtectedBound -> Permissiveness.SAME
        }' @ [183:61] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility.Permissiveness, entry1: EffectiveVisibility.Permissiveness, entry2: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Permissiveness

'other' @ [183:67] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.InternalProtectedBound.relation[ValueParameterDescriptorImpl]

'Public' @ [184:13] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'ProtectedBound' @ [184:57] ==> public object ProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'LESS' @ [184:112] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'Private' @ [185:13] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Local' @ [185:22] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'MORE' @ [185:46] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'InternalProtectedBound' @ [186:13] ==> public object InternalProtectedBound : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'SAME' @ [186:54] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'PRIVATE' @ [189:52] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'when (relation(other)) {
        Permissiveness.SAME, Permissiveness.LESS -> this
        Permissiveness.MORE -> other
        Permissiveness.UNKNOWN -> Private
    }' @ [203:64] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'relation' @ [203:70] ==> public abstract fun relation(other: EffectiveVisibility): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[SimpleFunctionDescriptorImpl]

'other' @ [203:79] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.lowerBound[ValueParameterDescriptorImpl]

'SAME' @ [204:24] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'LESS' @ [204:45] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'this' @ [204:53] ==> <this> defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[LazyClassReceiverParameterDescriptor]

'MORE' @ [205:24] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'other' @ [205:32] ==> value-parameter other: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.lowerBound[ValueParameterDescriptorImpl]

'UNKNOWN' @ [206:24] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'Private' @ [206:35] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'if (first == null || second == null) {
            Permissiveness.UNKNOWN
        }
        else if (first == second) {
            Permissiveness.SAME
        }
        else if (DescriptorUtils.isSubclass(first, second)) {
            Permissiveness.LESS
        }
        else if (DescriptorUtils.isSubclass(second, first)) {
            Permissiveness.MORE
        }
        else {
            Permissiveness.UNKNOWN
        }' @ [211:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility.Permissiveness, elseBranch: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Permissiveness

'first' @ [211:13] ==> value-parameter first: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'second' @ [211:30] ==> value-parameter second: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'UNKNOWN' @ [212:28] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'if (first == second) {
            Permissiveness.SAME
        }
        else if (DescriptorUtils.isSubclass(first, second)) {
            Permissiveness.LESS
        }
        else if (DescriptorUtils.isSubclass(second, first)) {
            Permissiveness.MORE
        }
        else {
            Permissiveness.UNKNOWN
        }' @ [214:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility.Permissiveness, elseBranch: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Permissiveness

'first' @ [214:18] ==> value-parameter first: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'second' @ [214:27] ==> value-parameter second: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'SAME' @ [215:28] ==> enum entry SAME defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'if (DescriptorUtils.isSubclass(first, second)) {
            Permissiveness.LESS
        }
        else if (DescriptorUtils.isSubclass(second, first)) {
            Permissiveness.MORE
        }
        else {
            Permissiveness.UNKNOWN
        }' @ [217:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility.Permissiveness, elseBranch: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Permissiveness

'isSubclass' @ [217:34] ==> public open fun isSubclass(@NotNull subClass: ClassDescriptor, @NotNull superClass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'first' @ [217:45] ==> value-parameter first: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'second' @ [217:52] ==> value-parameter second: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'LESS' @ [218:28] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'if (DescriptorUtils.isSubclass(second, first)) {
            Permissiveness.MORE
        }
        else {
            Permissiveness.UNKNOWN
        }' @ [220:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility.Permissiveness, elseBranch: EffectiveVisibility.Permissiveness): EffectiveVisibility.Permissiveness[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Permissiveness

'isSubclass' @ [220:34] ==> public open fun isSubclass(@NotNull subClass: ClassDescriptor, @NotNull superClass: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'second' @ [220:45] ==> value-parameter second: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'first' @ [220:53] ==> value-parameter first: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.containerRelation[ValueParameterDescriptorImpl]

'MORE' @ [221:28] ==> enum entry MORE defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [224:28] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'first' @ [228:9] ==> value-parameter first: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'lowerBound' @ [228:15] ==> internal open fun lowerBound(other: EffectiveVisibility): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[SimpleFunctionDescriptorImpl]

'second' @ [228:26] ==> value-parameter second: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'args' @ [231:9] ==> value-parameter args: List<EffectiveVisibility> defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'fold' @ [231:14] ==> public inline fun <T, R> Iterable<EffectiveVisibility>.fold(initial: EffectiveVisibility, operation: (acc: EffectiveVisibility, EffectiveVisibility) -> EffectiveVisibility): EffectiveVisibility defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EffectiveVisibility
    <R> -> EffectiveVisibility

'first' @ [231:19] ==> value-parameter first: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'x' @ [231:36] ==> value-parameter x: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.lowerBound.<anonymous>[ValueParameterDescriptorImpl]

'lowerBound' @ [231:38] ==> internal open fun lowerBound(other: EffectiveVisibility): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[SimpleFunctionDescriptorImpl]

'y' @ [231:49] ==> value-parameter y: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.lowerBound.<anonymous>[ValueParameterDescriptorImpl]

'if (args.isEmpty()) Public else lowerBound(args.first(), args.subList(1, args.size))' @ [234:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility, elseBranch: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> EffectiveVisibility

'args' @ [234:13] ==> value-parameter args: List<EffectiveVisibility> defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'isEmpty' @ [234:18] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'Public' @ [234:29] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'lowerBound' @ [234:41] ==> private fun lowerBound(first: EffectiveVisibility, args: List<EffectiveVisibility>): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'args' @ [234:52] ==> value-parameter args: List<EffectiveVisibility> defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'first' @ [234:57] ==> public fun <T> List<EffectiveVisibility>.first(): EffectiveVisibility defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EffectiveVisibility

'args' @ [234:66] ==> value-parameter args: List<EffectiveVisibility> defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'subList' @ [234:71] ==> public abstract fun subList(fromIndex: Int, toIndex: Int): List<EffectiveVisibility> defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'args' @ [234:82] ==> value-parameter args: List<EffectiveVisibility> defined in org.jetbrains.kotlin.descriptors.lowerBound[ValueParameterDescriptorImpl]

'size' @ [234:87] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'when (this) {
            Visibilities.PRIVATE, Visibilities.PRIVATE_TO_THIS, Visibilities.INVISIBLE_FAKE -> Private
            Visibilities.PROTECTED -> Protected(descriptor.containingDeclaration as? ClassDescriptor)
            Visibilities.INTERNAL -> if (!checkPublishedApi ||
                                         !descriptor.isPublishedApi()) Internal else Public
            Visibilities.PUBLIC -> Public
            Visibilities.LOCAL -> Local
        // NB: visibility must be already normalized here, so e.g. no JavaVisibilities are possible at this point
            else -> throw AssertionError("Visibility $name is not allowed in forVisibility")
        }' @ [237:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: EffectiveVisibility, entry1: EffectiveVisibility, entry2: EffectiveVisibility, entry3: EffectiveVisibility, entry4: EffectiveVisibility, entry5: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> EffectiveVisibility

'this' @ [237:15] ==> <this> defined in org.jetbrains.kotlin.descriptors.forVisibility[ReceiverParameterDescriptorImpl]

'PRIVATE' @ [238:26] ==> @NotNull public final val PRIVATE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'PRIVATE_TO_THIS' @ [238:48] ==> @NotNull public final val PRIVATE_TO_THIS: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'INVISIBLE_FAKE' @ [238:78] ==> @NotNull public final val INVISIBLE_FAKE: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'Private' @ [238:96] ==> public object Private : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'PROTECTED' @ [239:26] ==> @NotNull public final val PROTECTED: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'Protected' @ [239:39] ==> public constructor Protected(container: ClassDescriptor?) defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Protected[ClassConstructorDescriptorImpl]

'descriptor' @ [239:49] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.descriptors.forVisibility[ValueParameterDescriptorImpl]

'containingDeclaration' @ [239:60] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'INTERNAL' @ [240:26] ==> @NotNull public final val INTERNAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'if (!checkPublishedApi ||
                                         !descriptor.isPublishedApi()) Internal else Public' @ [240:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility, elseBranch: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> EffectiveVisibility

'!' @ [240:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkPublishedApi' @ [240:43] ==> value-parameter checkPublishedApi: Boolean = ... defined in org.jetbrains.kotlin.descriptors.forVisibility[ValueParameterDescriptorImpl]

'!' @ [241:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [241:43] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.descriptors.forVisibility[ValueParameterDescriptorImpl]

'isPublishedApi' @ [241:54] ==> public fun DeclarationDescriptor.isPublishedApi(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil in file DescriptorUtils.kt[SimpleFunctionDescriptorImpl]

'Internal' @ [241:72] ==> public object Internal : EffectiveVisibility.InternalOrPackage defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'Public' @ [241:86] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'PUBLIC' @ [242:26] ==> @NotNull public final val PUBLIC: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'Public' @ [242:36] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'LOCAL' @ [243:26] ==> @NotNull public final val LOCAL: Visibility defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'Local' @ [243:35] ==> public object Local : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'AssertionError' @ [245:27] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'name' @ [245:55] ==> public final val name: String defined in org.jetbrains.kotlin.descriptors.Visibility[PropertyDescriptorImpl]

'visibility' @ [249:9] ==> value-parameter visibility: Visibility defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'forVisibility' @ [249:20] ==> private fun Visibility.forVisibility(descriptor: DeclarationDescriptor, checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [249:34] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'checkPublishedApi' @ [249:46] ==> value-parameter checkPublishedApi: Boolean = ... defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'' @ [252:16] ==> private constructor RelationToType(description: String) defined in org.jetbrains.kotlin.descriptors.RelationToType[ClassConstructorDescriptorImpl]

'' @ [253:14] ==> private constructor RelationToType(description: String) defined in org.jetbrains.kotlin.descriptors.RelationToType[ClassConstructorDescriptorImpl]

'' @ [254:13] ==> private constructor RelationToType(description: String) defined in org.jetbrains.kotlin.descriptors.RelationToType[ClassConstructorDescriptorImpl]

'' @ [255:23] ==> private constructor RelationToType(description: String) defined in org.jetbrains.kotlin.descriptors.RelationToType[ClassConstructorDescriptorImpl]

'when (this) {
        CONSTRUCTOR, CONTAINER -> CONTAINER
        ARGUMENT, ARGUMENT_CONTAINER -> ARGUMENT_CONTAINER
    }' @ [257:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: RelationToType, entry1: RelationToType): RelationToType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> RelationToType

'this' @ [257:37] ==> <this> defined in org.jetbrains.kotlin.descriptors.RelationToType[LazyClassReceiverParameterDescriptor]

'CONSTRUCTOR' @ [258:9] ==> enum entry CONSTRUCTOR defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'CONTAINER' @ [258:22] ==> enum entry CONTAINER defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'CONTAINER' @ [258:35] ==> enum entry CONTAINER defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'ARGUMENT' @ [259:9] ==> enum entry ARGUMENT defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'ARGUMENT_CONTAINER' @ [259:19] ==> enum entry ARGUMENT_CONTAINER defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'ARGUMENT_CONTAINER' @ [259:41] ==> enum entry ARGUMENT_CONTAINER defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'description' @ [262:31] ==> public final val description: String defined in org.jetbrains.kotlin.descriptors.RelationToType[PropertyDescriptorImpl]

'?:' @ [267:13] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: EffectiveVisibility?, right: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> EffectiveVisibility

'descriptor' @ [267:14] ==> public final val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[PropertyDescriptorImpl]

'visibility' @ [267:47] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'effectiveVisibility' @ [267:59] ==> public open fun effectiveVisibility(descriptor: DeclarationDescriptor, checkPublishedApi: Boolean): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.Visibility[SimpleFunctionDescriptorImpl]

'descriptor' @ [267:79] ==> public final val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[PropertyDescriptorImpl]

'Public' @ [267:101] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'relation' @ [269:33] ==> private final val relation: RelationToType defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[PropertyDescriptorImpl]

'descriptor' @ [269:44] ==> public final val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[PropertyDescriptorImpl]

'name' @ [269:55] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'setOf' @ [273:9] ==> public fun <T> setOf(element: DescriptorWithRelation): Set<DescriptorWithRelation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorWithRelation

'DescriptorWithRelation' @ [273:15] ==> public constructor DescriptorWithRelation(descriptor: ClassifierDescriptor, relation: RelationToType) defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[ClassConstructorDescriptorImpl]

'this' @ [273:38] ==> <this> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ReceiverParameterDescriptorImpl]

'ownRelation' @ [273:44] ==> value-parameter ownRelation: RelationToType defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ValueParameterDescriptorImpl]

'?:' @ [274:10] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Iterable<DescriptorWithRelation>?, right: Iterable<DescriptorWithRelation>): Iterable<DescriptorWithRelation>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Iterable<DescriptorWithRelation>

'this' @ [274:11] ==> <this> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [274:16] ==> public final val ClassifierDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'dependentDescriptors' @ [274:65] ==> private fun ClassifierDescriptor.dependentDescriptors(ownRelation: RelationToType): Set<DescriptorWithRelation> defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'ownRelation' @ [274:86] ==> value-parameter ownRelation: RelationToType defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ValueParameterDescriptorImpl]

'containerRelation' @ [274:98] ==> public final fun containerRelation(): RelationToType defined in org.jetbrains.kotlin.descriptors.RelationToType[SimpleFunctionDescriptorImpl]

'emptySet' @ [274:122] ==> public fun <T> emptySet(): Set<DescriptorWithRelation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorWithRelation

'effectiveVisibility' @ [276:79] ==> private fun ClassDescriptor.effectiveVisibility(classes: Set<ClassDescriptor>, checkPublishedApi: Boolean): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'emptySet' @ [276:99] ==> public fun <T> emptySet(): Set<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'checkPublishedApi' @ [276:111] ==> value-parameter checkPublishedApi: Boolean = ... defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'if (this in classes) Public
        else with(this.containingDeclaration as? ClassDescriptor) {
            lowerBound(visibility.effectiveVisibility(this@effectiveVisibility, checkPublishedApi), this?.effectiveVisibility(classes + this@effectiveVisibility, checkPublishedApi) ?: Public)
        }' @ [279:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: EffectiveVisibility, elseBranch: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> EffectiveVisibility

'this' @ [279:13] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ReceiverParameterDescriptorImpl]

'classes' @ [279:21] ==> value-parameter classes: Set<ClassDescriptor> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'Public' @ [279:30] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'with' @ [280:14] ==> @InlineOnly public inline fun <T, R> with(receiver: ClassDescriptor?, block: ClassDescriptor?.() -> EffectiveVisibility): EffectiveVisibility defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor?
    <R> -> EffectiveVisibility

'this' @ [280:19] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [280:24] ==> public final val ClassDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'lowerBound' @ [281:13] ==> private fun lowerBound(first: EffectiveVisibility, second: EffectiveVisibility): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'visibility' @ [281:24] ==> public final val ClassDescriptor.visibility: Visibility[MyPropertyDescriptor]

'effectiveVisibility' @ [281:35] ==> public open fun effectiveVisibility(descriptor: DeclarationDescriptor, checkPublishedApi: Boolean): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.Visibility[SimpleFunctionDescriptorImpl]

'this@effectiveVisibility' @ [281:55] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ReceiverParameterDescriptorImpl]

'checkPublishedApi' @ [281:81] ==> value-parameter checkPublishedApi: Boolean defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'this' @ [281:101] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility.<anonymous>[ReceiverParameterDescriptorImpl]

'effectiveVisibility' @ [281:107] ==> private fun ClassDescriptor.effectiveVisibility(classes: Set<ClassDescriptor>, checkPublishedApi: Boolean): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'classes' @ [281:127] ==> value-parameter classes: Set<ClassDescriptor> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'this@effectiveVisibility' @ [281:137] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ReceiverParameterDescriptorImpl]

'checkPublishedApi' @ [281:163] ==> value-parameter checkPublishedApi: Boolean defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'Public' @ [281:185] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

'dependentDescriptors' @ [285:49] ==> private fun KotlinType.dependentDescriptors(types: Set<KotlinType>, ownRelation: RelationToType): Set<DescriptorWithRelation> defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'emptySet' @ [285:70] ==> public fun <T> emptySet(): Set<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'CONSTRUCTOR' @ [285:82] ==> enum entry CONSTRUCTOR defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'this' @ [288:9] ==> <this> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ReceiverParameterDescriptorImpl]

'types' @ [288:17] ==> value-parameter types: Set<KotlinType> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ValueParameterDescriptorImpl]

'emptySet' @ [288:31] ==> public fun <T> emptySet(): Set<DescriptorWithRelation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorWithRelation

'constructor' @ [289:24] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'declarationDescriptor' @ [289:36] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'dependentDescriptors' @ [289:59] ==> private fun ClassifierDescriptor.dependentDescriptors(ownRelation: RelationToType): Set<DescriptorWithRelation> defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'ownRelation' @ [289:80] ==> value-parameter ownRelation: RelationToType defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ValueParameterDescriptorImpl]

'emptySet' @ [289:96] ==> public fun <T> emptySet(): Set<DescriptorWithRelation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorWithRelation

'arguments' @ [290:29] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[PropertyDescriptorImpl]

'map' @ [290:39] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> Set<DescriptorWithRelation>): List<Set<DescriptorWithRelation>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> Set<DescriptorWithRelation>

'it' @ [290:45] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.descriptors.dependentDescriptors.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [290:48] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'dependentDescriptors' @ [290:53] ==> private fun KotlinType.dependentDescriptors(types: Set<KotlinType>, ownRelation: RelationToType): Set<DescriptorWithRelation> defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'types' @ [290:74] ==> value-parameter types: Set<KotlinType> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ValueParameterDescriptorImpl]

'this' @ [290:82] ==> <this> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[ReceiverParameterDescriptorImpl]

'ARGUMENT' @ [290:88] ==> enum entry ARGUMENT defined in org.jetbrains.kotlin.descriptors.RelationToType[FakeCallableDescriptorForObject]

'flatten' @ [290:100] ==> public fun <T> Iterable<Iterable<DescriptorWithRelation>>.flatten(): List<DescriptorWithRelation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DescriptorWithRelation

'ownDependent' @ [291:12] ==> val ownDependent: Set<DescriptorWithRelation> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[LocalVariableDescriptor]

'argumentDependent' @ [291:27] ==> val argumentDependent: List<DescriptorWithRelation> defined in org.jetbrains.kotlin.descriptors.dependentDescriptors[LocalVariableDescriptor]

'this' @ [295:36] ==> <this> defined in org.jetbrains.kotlin.descriptors.leastPermissive[ReceiverParameterDescriptorImpl]

'descriptorWithRelation' @ [296:33] ==> val descriptorWithRelation: DescriptorWithRelation defined in org.jetbrains.kotlin.descriptors.leastPermissive[LocalVariableDescriptor]

'effectiveVisibility' @ [296:56] ==> public final fun effectiveVisibility(): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.DescriptorWithRelation[SimpleFunctionDescriptorImpl]

'when (currentVisibility.relation(base)) {
            Permissiveness.LESS, Permissiveness.UNKNOWN -> {
                return descriptorWithRelation
            }
            else -> {}
        }' @ [297:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'currentVisibility' @ [297:15] ==> val currentVisibility: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.leastPermissive[LocalVariableDescriptor]

'relation' @ [297:33] ==> public abstract fun relation(other: EffectiveVisibility): EffectiveVisibility.Permissiveness defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[SimpleFunctionDescriptorImpl]

'base' @ [297:42] ==> value-parameter base: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.leastPermissive[ValueParameterDescriptorImpl]

'LESS' @ [298:28] ==> enum entry LESS defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'UNKNOWN' @ [298:49] ==> enum entry UNKNOWN defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility.Permissiveness[FakeCallableDescriptorForObject]

'descriptorWithRelation' @ [299:24] ==> val descriptorWithRelation: DescriptorWithRelation defined in org.jetbrains.kotlin.descriptors.leastPermissive[LocalVariableDescriptor]

'dependentDescriptors' @ [307:71] ==> private fun KotlinType.dependentDescriptors(): Set<DescriptorWithRelation> defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'leastPermissive' @ [307:94] ==> private fun Set<DescriptorWithRelation>.leastPermissive(base: EffectiveVisibility): DescriptorWithRelation? defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'base' @ [307:110] ==> value-parameter base: EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.leastPermissiveDescriptor[ValueParameterDescriptorImpl]

'this' @ [310:34] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ReceiverParameterDescriptorImpl]

'visibility' @ [310:39] ==> public final val DeclarationDescriptorWithVisibility.visibility: Visibility[MyPropertyDescriptor]

'lowerBound' @ [312:9] ==> private fun lowerBound(first: EffectiveVisibility, second: EffectiveVisibility): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'visibility' @ [312:20] ==> value-parameter visibility: Visibility = ... defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'effectiveVisibility' @ [312:31] ==> public open fun effectiveVisibility(descriptor: DeclarationDescriptor, checkPublishedApi: Boolean): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.Visibility[SimpleFunctionDescriptorImpl]

'this' @ [312:51] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ReceiverParameterDescriptorImpl]

'checkPublishedApi' @ [312:57] ==> value-parameter checkPublishedApi: Boolean = ... defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'?:' @ [313:20] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: EffectiveVisibility?, right: EffectiveVisibility): EffectiveVisibility[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> EffectiveVisibility

'this' @ [313:21] ==> <this> defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [313:26] ==> public final val DeclarationDescriptorWithVisibility.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'effectiveVisibility' @ [313:70] ==> public fun ClassDescriptor.effectiveVisibility(checkPublishedApi: Boolean = ...): EffectiveVisibility defined in org.jetbrains.kotlin.descriptors in file EffectiveVisibility.kt[SimpleFunctionDescriptorImpl]

'checkPublishedApi' @ [313:90] ==> value-parameter checkPublishedApi: Boolean = ... defined in org.jetbrains.kotlin.descriptors.effectiveVisibility[ValueParameterDescriptorImpl]

'Public' @ [313:112] ==> public object Public : EffectiveVisibility defined in org.jetbrains.kotlin.descriptors.EffectiveVisibility[FakeCallableDescriptorForObject]

