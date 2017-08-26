'' @ [25:14] ==> private constructor Variance(label: String, allowsInPosition: Boolean, allowsOutPosition: Boolean, superpositionFactor: Int) defined in org.jetbrains.kotlin.types.Variance[ClassConstructorDescriptorImpl]

'' @ [26:16] ==> private constructor Variance(label: String, allowsInPosition: Boolean, allowsOutPosition: Boolean, superpositionFactor: Int) defined in org.jetbrains.kotlin.types.Variance[ClassConstructorDescriptorImpl]

'-' @ [26:36] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'' @ [27:17] ==> private constructor Variance(label: String, allowsInPosition: Boolean, allowsOutPosition: Boolean, superpositionFactor: Int) defined in org.jetbrains.kotlin.types.Variance[ClassConstructorDescriptorImpl]

'+' @ [27:38] ==> public final operator fun unaryPlus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'when (position) {
                IN_VARIANCE -> allowsInPosition
                OUT_VARIANCE -> allowsOutPosition
                INVARIANT -> allowsInPosition && allowsOutPosition
            }' @ [30:15] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'position' @ [30:21] ==> value-parameter position: Variance defined in org.jetbrains.kotlin.types.Variance.allowsPosition[ValueParameterDescriptorImpl]

'IN_VARIANCE' @ [31:17] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'allowsInPosition' @ [31:32] ==> public final val allowsInPosition: Boolean defined in org.jetbrains.kotlin.types.Variance[PropertyDescriptorImpl]

'OUT_VARIANCE' @ [32:17] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'allowsOutPosition' @ [32:33] ==> public final val allowsOutPosition: Boolean defined in org.jetbrains.kotlin.types.Variance[PropertyDescriptorImpl]

'INVARIANT' @ [33:17] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'allowsInPosition' @ [33:30] ==> public final val allowsInPosition: Boolean defined in org.jetbrains.kotlin.types.Variance[PropertyDescriptorImpl]

'allowsOutPosition' @ [33:50] ==> public final val allowsOutPosition: Boolean defined in org.jetbrains.kotlin.types.Variance[PropertyDescriptorImpl]

'this' @ [37:17] ==> <this> defined in org.jetbrains.kotlin.types.Variance[LazyClassReceiverParameterDescriptor]

'superpositionFactor' @ [37:22] ==> private final val superpositionFactor: Int defined in org.jetbrains.kotlin.types.Variance[PropertyDescriptorImpl]

'other' @ [37:44] ==> value-parameter other: Variance defined in org.jetbrains.kotlin.types.Variance.superpose[ValueParameterDescriptorImpl]

'superpositionFactor' @ [37:50] ==> private final val superpositionFactor: Int defined in org.jetbrains.kotlin.types.Variance[PropertyDescriptorImpl]

'when (r) {
            0 -> INVARIANT
            -1 -> IN_VARIANCE
            +1 -> OUT_VARIANCE
            else -> throw IllegalStateException("Illegal factor: $r")
        }' @ [38:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Variance, entry1: Variance, entry2: Variance, entry3: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Variance

'r' @ [38:22] ==> val r: Int defined in org.jetbrains.kotlin.types.Variance.superpose[LocalVariableDescriptor]

'INVARIANT' @ [39:18] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'-' @ [40:13] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'IN_VARIANCE' @ [40:19] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'+' @ [41:13] ==> public final operator fun unaryPlus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'OUT_VARIANCE' @ [41:19] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IllegalStateException' @ [42:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'r' @ [42:67] ==> val r: Int defined in org.jetbrains.kotlin.types.Variance.superpose[LocalVariableDescriptor]

'when (this) {
            INVARIANT -> INVARIANT
            IN_VARIANCE -> OUT_VARIANCE
            OUT_VARIANCE -> IN_VARIANCE
        }' @ [47:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Variance, entry1: Variance, entry2: Variance): Variance[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Variance

'this' @ [47:22] ==> <this> defined in org.jetbrains.kotlin.types.Variance[LazyClassReceiverParameterDescriptor]

'INVARIANT' @ [48:13] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'INVARIANT' @ [48:26] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [49:13] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [49:28] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'OUT_VARIANCE' @ [50:13] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'IN_VARIANCE' @ [50:29] ==> enum entry IN_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'label' @ [54:31] ==> public final val label: String defined in org.jetbrains.kotlin.types.Variance[PropertyDescriptorImpl]

