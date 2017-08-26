'KtPsiFactory' @ [31:27] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [31:40] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.<init>[ValueParameterDescriptorImpl]

'typeReplacement' @ [33:35] ==> value-parameter typeReplacement: KtUserType? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.<init>[ValueParameterDescriptorImpl]

'takeIf' @ [33:52] ==> @InlineOnly @SinceKotlin public inline fun <T> KtUserType.takeIf(predicate: (KtUserType) -> Boolean): KtUserType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtUserType

'it' @ [33:61] ==> value-parameter it: KtUserType defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.typeReplacement.<anonymous>[ValueParameterDescriptorImpl]

'referenceExpression' @ [33:64] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'typeReplacement' @ [34:56] ==> value-parameter typeReplacement: KtUserType? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.<init>[ValueParameterDescriptorImpl]

'qualifier' @ [34:73] ==> public final val KtUserType.qualifier: KtUserType?[MyPropertyDescriptor]

'let' @ [34:84] ==> @InlineOnly public inline fun <T, R> KtUserType.let(block: (KtUserType) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtUserType
    <R> -> KtExpression

'factory' @ [34:90] ==> private final val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'createExpression' @ [34:98] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'it' @ [34:115] ==> value-parameter it: KtUserType defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.typeReplacementQualifierAsExpression.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [34:118] ==> public final val KtUserType.text: (String..String?)[MyPropertyDescriptor]

'constructorReplacement' @ [36:50] ==> value-parameter constructorReplacement: CodeToInline? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.<init>[ValueParameterDescriptorImpl]

'let' @ [36:74] ==> @InlineOnly public inline fun <T, R> CodeToInline.let(block: (CodeToInline) -> CallableUsageReplacementStrategy): CallableUsageReplacementStrategy defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CodeToInline
    <R> -> CallableUsageReplacementStrategy

'usage' @ [39:13] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'constructorReplacementStrategy' @ [41:9] ==> private final val constructorReplacementStrategy: CallableUsageReplacementStrategy? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'createReplacer' @ [41:41] ==> public open fun createReplacer(usage: KtSimpleNameExpression): (() -> KtElement?)? defined in org.jetbrains.kotlin.idea.codeInliner.CallableUsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'usage' @ [41:56] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'let' @ [41:64] ==> @InlineOnly public inline fun <T, R> (() -> KtElement?).let(block: (() -> KtElement?) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Function0<KtElement?>
    <R> -> Nothing

'it' @ [41:77] ==> value-parameter it: () -> KtElement? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer.<anonymous>[ValueParameterDescriptorImpl]

'usage' @ [43:22] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'parent' @ [43:28] ==> public final val KtNameReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
            is KtUserType -> {
                if (typeReplacement == null) return null
                return {
                    val replaced = parent.replaced(typeReplacement)
                    ShortenReferences.DEFAULT.process(replaced)
                } //TODO: type arguments and type arguments of outer class are lost
            }

            is KtCallExpression -> {
                if (usage != parent.calleeExpression) return null
                when {
//                    constructorReplacementStrategy != null -> return constructorReplacementStrategy.createReplacer(usage)
                    constructorReplacementStrategy == null && typeReplacement != null -> return { replaceConstructorCallWithOtherTypeConstruction(parent) }
                    else -> return null
                }
            }

            else -> return null //TODO
        }' @ [44:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'parent' @ [44:15] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'typeReplacement' @ [46:21] ==> private final val typeReplacement: KtUserType? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'parent' @ [48:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'replaced' @ [48:43] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtUserType): KtUserType defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtUserType

'typeReplacement' @ [48:52] ==> private final val typeReplacement: KtUserType? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'ShortenReferences' @ [49:21] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [49:39] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [49:47] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'replaced' @ [49:55] ==> val replaced: KtUserType defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer.<anonymous>[LocalVariableDescriptor]

'usage' @ [54:21] ==> value-parameter usage: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[ValueParameterDescriptorImpl]

'parent' @ [54:30] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'calleeExpression' @ [54:37] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'when {
//                    constructorReplacementStrategy != null -> return constructorReplacementStrategy.createReplacer(usage)
                    constructorReplacementStrategy == null && typeReplacement != null -> return { replaceConstructorCallWithOtherTypeConstruction(parent) }
                    else -> return null
                }' @ [55:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'constructorReplacementStrategy' @ [57:21] ==> private final val constructorReplacementStrategy: CallableUsageReplacementStrategy? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'typeReplacement' @ [57:63] ==> private final val typeReplacement: KtUserType? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'replaceConstructorCallWithOtherTypeConstruction' @ [57:99] ==> private final fun replaceConstructorCallWithOtherTypeConstruction(callExpression: KtCallExpression): KtElement defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[SimpleFunctionDescriptorImpl]

'parent' @ [57:147] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.createReplacer[LocalVariableDescriptor]

'callExpression' @ [67:9] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[ValueParameterDescriptorImpl]

'calleeExpression' @ [67:24] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'replace' @ [67:43] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtExpression[JavaMethodDescriptor]

'typeReplacement' @ [67:51] ==> private final val typeReplacement: KtUserType? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'referenceExpression' @ [67:69] ==> public final val KtUserType.referenceExpression: KtSimpleNameExpression?[MyPropertyDescriptor]

'callExpression' @ [69:35] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[ValueParameterDescriptorImpl]

'getQualifiedExpressionForSelectorOrThis' @ [69:50] ==> public fun KtExpression.getQualifiedExpressionForSelectorOrThis(): KtExpression defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'if (typeReplacementQualifierAsExpression != null)
            factory.createExpressionByPattern("$0.$1", typeReplacementQualifierAsExpression, callExpression)
        else
            callExpression' @ [70:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'typeReplacementQualifierAsExpression' @ [70:33] ==> private final val typeReplacementQualifierAsExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'factory' @ [71:13] ==> private final val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'createExpressionByPattern' @ [71:21] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'typeReplacementQualifierAsExpression' @ [71:56] ==> private final val typeReplacementQualifierAsExpression: KtExpression? defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy[PropertyDescriptorImpl]

'callExpression' @ [71:94] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[ValueParameterDescriptorImpl]

'callExpression' @ [73:13] ==> value-parameter callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[ValueParameterDescriptorImpl]

'if (expressionToReplace != newExpression) {
            expressionToReplace.replaced(newExpression)
        }
        else {
            expressionToReplace
        }' @ [75:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'expressionToReplace' @ [75:26] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[LocalVariableDescriptor]

'newExpression' @ [75:49] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[LocalVariableDescriptor]

'expressionToReplace' @ [76:13] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[LocalVariableDescriptor]

'replaced' @ [76:33] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'newExpression' @ [76:42] ==> val newExpression: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[LocalVariableDescriptor]

'expressionToReplace' @ [79:13] ==> val expressionToReplace: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[LocalVariableDescriptor]

'ShortenReferences' @ [82:16] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [82:34] ==> @field:JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[DeserializedPropertyDescriptor]

'process' @ [82:42] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[DeserializedSimpleFunctionDescriptor]

'result' @ [82:50] ==> val result: KtExpression defined in org.jetbrains.kotlin.idea.codeInliner.ClassUsageReplacementStrategy.replaceConstructorCallWithOtherTypeConstruction[LocalVariableDescriptor]

