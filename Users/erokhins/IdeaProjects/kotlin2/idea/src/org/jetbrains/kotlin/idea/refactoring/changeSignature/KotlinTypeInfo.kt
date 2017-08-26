'when {
        text != null -> text
        type != null -> renderType()
        else -> ""
    }' @ [25:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'text' @ [26:9] ==> public final val text: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'text' @ [26:25] ==> public final val text: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'type' @ [27:9] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'renderType' @ [27:25] ==> private fun KotlinTypeInfo.renderType(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'if (isCovariant) IdeDescriptorRenderers.SOURCE_CODE else IdeDescriptorRenderers.SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION' @ [33:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DescriptorRenderer, elseBranch: DescriptorRenderer): DescriptorRenderer[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DescriptorRenderer

'isCovariant' @ [33:24] ==> public final val isCovariant: Boolean defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'IdeDescriptorRenderers' @ [33:37] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE' @ [33:60] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'IdeDescriptorRenderers' @ [33:77] ==> public object IdeDescriptorRenderers defined in org.jetbrains.kotlin.idea.util[FakeCallableDescriptorForObject]

'SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION' @ [33:100] ==> @field:JvmField public final val SOURCE_CODE_NOT_NULL_TYPE_APPROXIMATION: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderer' @ [34:12] ==> val renderer: DescriptorRenderer defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.renderType[LocalVariableDescriptor]

'renderType' @ [34:21] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [34:32] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'if (type != null && other.type != null) renderType() == other.renderType() else text == other.text' @ [38:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'type' @ [38:16] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'other' @ [38:32] ==> value-parameter other: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isEquivalentTo[ValueParameterDescriptorImpl]

'type' @ [38:38] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'renderType' @ [38:52] ==> private fun KotlinTypeInfo.renderType(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'other' @ [38:68] ==> value-parameter other: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isEquivalentTo[ValueParameterDescriptorImpl]

'renderType' @ [38:74] ==> private fun KotlinTypeInfo.renderType(): String defined in org.jetbrains.kotlin.idea.refactoring.changeSignature in file KotlinTypeInfo.kt[SimpleFunctionDescriptorImpl]

'text' @ [38:92] ==> public final val text: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

'other' @ [38:100] ==> value-parameter other: KotlinTypeInfo defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.isEquivalentTo[ValueParameterDescriptorImpl]

'text' @ [38:106] ==> public final val text: String? defined in org.jetbrains.kotlin.idea.refactoring.changeSignature.KotlinTypeInfo[PropertyDescriptorImpl]

