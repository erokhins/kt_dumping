'JvmOverloads' @ [33:22] ==> public constructor JvmOverloads() defined in kotlin.jvm.JvmOverloads[DeserializedClassConstructorDescriptor]

'dataFlowInfo' @ [37:42] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.<init>[ValueParameterDescriptorImpl]

'replaceType' @ [40:23] ==> public final fun replaceType(type: KotlinType?): KotlinTypeInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[SimpleFunctionDescriptorImpl]

'KotlinTypeInfo' @ [43:42] ==> @JvmOverloads public constructor KotlinTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpOutPossible: Boolean = ..., jumpFlowInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [43:57] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceType[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [43:63] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'jumpOutPossible' @ [43:77] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'jumpFlowInfo' @ [43:94] ==> public final val jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'if (jumpOutPossible == this.jumpOutPossible) this else KotlinTypeInfo(type, dataFlowInfo, jumpOutPossible, jumpFlowInfo)' @ [46:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinTypeInfo, elseBranch: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinTypeInfo

'jumpOutPossible' @ [46:17] ==> value-parameter jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceJumpOutPossible[ValueParameterDescriptorImpl]

'this' @ [46:36] ==> <this> defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[LazyClassReceiverParameterDescriptor]

'jumpOutPossible' @ [46:41] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'this' @ [46:58] ==> <this> defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[LazyClassReceiverParameterDescriptor]

'KotlinTypeInfo' @ [46:68] ==> @JvmOverloads public constructor KotlinTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpOutPossible: Boolean = ..., jumpFlowInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [46:83] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'dataFlowInfo' @ [46:89] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'jumpOutPossible' @ [46:103] ==> value-parameter jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceJumpOutPossible[ValueParameterDescriptorImpl]

'jumpFlowInfo' @ [46:120] ==> public final val jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'if (jumpFlowInfo == this.jumpFlowInfo) this else KotlinTypeInfo(type, dataFlowInfo, jumpOutPossible, jumpFlowInfo)' @ [49:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinTypeInfo, elseBranch: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinTypeInfo

'jumpFlowInfo' @ [49:17] ==> value-parameter jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceJumpFlowInfo[ValueParameterDescriptorImpl]

'this' @ [49:33] ==> <this> defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[LazyClassReceiverParameterDescriptor]

'jumpFlowInfo' @ [49:38] ==> public final val jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'this' @ [49:52] ==> <this> defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[LazyClassReceiverParameterDescriptor]

'KotlinTypeInfo' @ [49:62] ==> @JvmOverloads public constructor KotlinTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpOutPossible: Boolean = ..., jumpFlowInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [49:77] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'dataFlowInfo' @ [49:83] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'jumpOutPossible' @ [49:97] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'jumpFlowInfo' @ [49:114] ==> value-parameter jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceJumpFlowInfo[ValueParameterDescriptorImpl]

'when (this.dataFlowInfo) {
        // Nothing changed
        dataFlowInfo -> this
        // Jump info is the same as data flow info: change both
        jumpFlowInfo -> KotlinTypeInfo(type, dataFlowInfo, jumpOutPossible, dataFlowInfo)
        // Jump info is not the same: change data flow info only
        else -> KotlinTypeInfo(type, dataFlowInfo, jumpOutPossible, jumpFlowInfo)
    }' @ [51:59] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinTypeInfo, entry1: KotlinTypeInfo, entry2: KotlinTypeInfo): KotlinTypeInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinTypeInfo

'this' @ [51:65] ==> <this> defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[LazyClassReceiverParameterDescriptor]

'dataFlowInfo' @ [51:70] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'dataFlowInfo' @ [53:9] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceDataFlowInfo[ValueParameterDescriptorImpl]

'this' @ [53:25] ==> <this> defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[LazyClassReceiverParameterDescriptor]

'jumpFlowInfo' @ [55:9] ==> public final val jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'KotlinTypeInfo' @ [55:25] ==> @JvmOverloads public constructor KotlinTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpOutPossible: Boolean = ..., jumpFlowInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [55:40] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'dataFlowInfo' @ [55:46] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceDataFlowInfo[ValueParameterDescriptorImpl]

'jumpOutPossible' @ [55:60] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'dataFlowInfo' @ [55:77] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceDataFlowInfo[ValueParameterDescriptorImpl]

'KotlinTypeInfo' @ [57:17] ==> @JvmOverloads public constructor KotlinTypeInfo(type: KotlinType?, dataFlowInfo: DataFlowInfo, jumpOutPossible: Boolean = ..., jumpFlowInfo: DataFlowInfo = ...) defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[ClassConstructorDescriptorImpl]

'type' @ [57:32] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'dataFlowInfo' @ [57:38] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo.replaceDataFlowInfo[ValueParameterDescriptorImpl]

'jumpOutPossible' @ [57:52] ==> public final val jumpOutPossible: Boolean defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'jumpFlowInfo' @ [57:69] ==> public final val jumpFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

