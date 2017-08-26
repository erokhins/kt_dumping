'this' @ [31:26] ==> <this> defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[ReceiverParameterDescriptorImpl]

'parent' @ [31:31] ==> public final val KtFunctionLiteral.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [31:61] ==> public final val KtLambdaExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [34:22] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (parent is KtValueArgumentList) parent else this' @ [35:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElementImpl, elseBranch: KtElementImpl): KtElementImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElementImpl

'parent' @ [35:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.findLabelAndCall.callExpression[LocalVariableDescriptor]

'parent' @ [35:52] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.findLabelAndCall.callExpression[LocalVariableDescriptor]

'this' @ [35:64] ==> <this> defined in org.jetbrains.kotlin.idea.util.findLabelAndCall.callExpression[ReceiverParameterDescriptorImpl]

'parent' @ [35:70] ==> public final val KtElementImpl.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (literalParent) {
        is KtLabeledExpression -> {
            val callExpression = (literalParent.parent as? KtValueArgument)?.callExpression()
            return Pair(literalParent.getLabelNameAsName(), callExpression)
        }

        is KtValueArgument -> {
            val callExpression = literalParent.callExpression()
            val label = (callExpression?.calleeExpression as? KtSimpleNameExpression)?.getReferencedNameAsName()
            return Pair(label, callExpression)
        }

        else -> {
            return Pair(null, null)
        }
    }' @ [38:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'literalParent' @ [38:11] ==> val literalParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'literalParent' @ [40:35] ==> val literalParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'parent' @ [40:49] ==> public final val KtLabeledExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'callExpression' @ [40:78] ==> local final fun KtValueArgument.callExpression(): KtCallExpression? defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[SimpleFunctionDescriptorImpl]

'Pair' @ [41:20] ==> public constructor Pair<out A, out B>(first: Name?, second: KtCallExpression?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Name?
    <out B> -> KtCallExpression?

'literalParent' @ [41:25] ==> val literalParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'getLabelNameAsName' @ [41:39] ==> public final fun getLabelNameAsName(): Name? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[DeserializedSimpleFunctionDescriptor]

'callExpression' @ [41:61] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'literalParent' @ [45:34] ==> val literalParent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'callExpression' @ [45:48] ==> local final fun KtValueArgument.callExpression(): KtCallExpression? defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[SimpleFunctionDescriptorImpl]

'callExpression' @ [46:26] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'calleeExpression' @ [46:42] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'getReferencedNameAsName' @ [46:88] ==> public abstract fun getReferencedNameAsName(): Name defined in org.jetbrains.kotlin.psi.KtSimpleNameExpression[DeserializedSimpleFunctionDescriptor]

'Pair' @ [47:20] ==> public constructor Pair<out A, out B>(first: Name?, second: KtCallExpression?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Name?
    <out B> -> KtCallExpression?

'label' @ [47:25] ==> val label: Name? defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'callExpression' @ [47:32] ==> val callExpression: KtCallExpression? defined in org.jetbrains.kotlin.idea.util.findLabelAndCall[LocalVariableDescriptor]

'Pair' @ [51:20] ==> public constructor Pair<out A, out B>(first: Nothing?, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Nothing?
    <out B> -> Nothing?

'getSmartCastVariants' @ [62:20] ==> public final fun getSmartCastVariants(receiverToCast: ReceiverValue, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor, dataFlowInfo: DataFlowInfo): List<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[DeserializedSimpleFunctionDescriptor]

'receiverToCast' @ [62:41] ==> value-parameter receiverToCast: ReceiverValue defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded[ValueParameterDescriptorImpl]

'bindingContext' @ [62:57] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [62:73] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [62:104] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded[ValueParameterDescriptorImpl]

'variants' @ [63:12] ==> val variants: List<KotlinType> defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded[LocalVariableDescriptor]

'filter' @ [63:21] ==> public inline fun <T> Iterable<KotlinType>.filter(predicate: (KotlinType) -> Boolean): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'variants' @ [64:9] ==> val variants: List<KotlinType> defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded[LocalVariableDescriptor]

'all' @ [64:18] ==> public inline fun <T> Iterable<KotlinType>.all(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'another' @ [64:35] ==> value-parameter another: KotlinType defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [64:47] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded.<anonymous>[ValueParameterDescriptorImpl]

'chooseMoreSpecific' @ [64:55] ==> private fun chooseMoreSpecific(type1: KotlinType, type2: KotlinType): KotlinType? defined in org.jetbrains.kotlin.idea.util in file Utils.kt[SimpleFunctionDescriptorImpl]

'type' @ [64:74] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded.<anonymous>[ValueParameterDescriptorImpl]

'another' @ [64:80] ==> value-parameter another: KotlinType defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [64:89] ==> @InlineOnly public inline fun <T, R> KotlinType?.let(block: (KotlinType?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?
    <R> -> Boolean

'it' @ [64:95] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [64:109] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [64:116] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.util.getSmartCastVariantsWithLessSpecificExcluded.<anonymous>[ValueParameterDescriptorImpl]

'DEFAULT' @ [69:44] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [69:52] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'type1' @ [69:64] ==> value-parameter type1: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'type2' @ [69:71] ==> value-parameter type2: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'DEFAULT' @ [70:44] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [70:52] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'type2' @ [70:64] ==> value-parameter type2: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'type1' @ [70:71] ==> value-parameter type1: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'when {
        type1IsSubtype && !type2IsSubtype -> return type1

        type2IsSubtype && !type1IsSubtype -> return type2

        !type1IsSubtype && !type2IsSubtype -> return null

        else -> { // type1IsSubtype && type2IsSubtype
            val flexible1 = type1.unwrap() as? FlexibleType
            val flexible2 = type2.unwrap() as? FlexibleType
            return when {
                flexible1 != null && flexible2 == null -> type2
                flexible2 != null && flexible1 == null -> type1
                else -> null //TODO?
            }
        }
    }' @ [72:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing, entry3: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'type1IsSubtype' @ [73:9] ==> val type1IsSubtype: Boolean defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'!' @ [73:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type2IsSubtype' @ [73:28] ==> val type2IsSubtype: Boolean defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'type1' @ [73:53] ==> value-parameter type1: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'type2IsSubtype' @ [75:9] ==> val type2IsSubtype: Boolean defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'!' @ [75:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type1IsSubtype' @ [75:28] ==> val type1IsSubtype: Boolean defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'type2' @ [75:53] ==> value-parameter type2: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'!' @ [77:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type1IsSubtype' @ [77:10] ==> val type1IsSubtype: Boolean defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'!' @ [77:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type2IsSubtype' @ [77:29] ==> val type2IsSubtype: Boolean defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'type1' @ [80:29] ==> value-parameter type1: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'unwrap' @ [80:35] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'type2' @ [81:29] ==> value-parameter type2: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'unwrap' @ [81:35] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'when {
                flexible1 != null && flexible2 == null -> type2
                flexible2 != null && flexible1 == null -> type1
                else -> null //TODO?
            }' @ [82:20] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?, entry2: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'flexible1' @ [83:17] ==> val flexible1: FlexibleType? defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'flexible2' @ [83:38] ==> val flexible2: FlexibleType? defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'type2' @ [83:59] ==> value-parameter type2: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

'flexible2' @ [84:17] ==> val flexible2: FlexibleType? defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'flexible1' @ [84:38] ==> val flexible1: FlexibleType? defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[LocalVariableDescriptor]

'type1' @ [84:59] ==> value-parameter type1: KotlinType defined in org.jetbrains.kotlin.idea.util.chooseMoreSpecific[ValueParameterDescriptorImpl]

