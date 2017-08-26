'AbstractKotlinInspection' @ [28:43] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [30:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [32:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitNamedFunction' @ [32:27] ==> public open fun visitNamedFunction(@NotNull p0: KtNamedFunction): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'function' @ [32:46] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'function' @ [33:38] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'funKeyword' @ [33:47] ==> public final val KtNamedFunction.funKeyword: PsiElement?[MyPropertyDescriptor]

'function' @ [34:40] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'modifierList' @ [34:49] ==> public final val KtNamedFunction.modifierList: KtModifierList?[MyPropertyDescriptor]

'!' @ [35:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'modifierList' @ [35:26] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'hasModifier' @ [35:39] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [35:60] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MODIFIER_EXCLUDE_OVERRIDE' @ [36:25] ==> private final val MODIFIER_EXCLUDE_OVERRIDE: List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.Companion[PropertyDescriptorImpl]

'any' @ [36:51] ==> public inline fun <T> Iterable<(KtModifierKeywordToken..KtModifierKeywordToken?)>.any(predicate: ((KtModifierKeywordToken..KtModifierKeywordToken?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'modifierList' @ [36:57] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'hasModifier' @ [36:70] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'it' @ [36:82] ==> value-parameter it: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction.<anonymous>[ValueParameterDescriptorImpl]

'function' @ [37:25] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'annotationEntries' @ [37:34] ==> public final val KtNamedFunction.annotationEntries: (MutableList<(KtAnnotationEntry..KtAnnotationEntry?)>..List<(KtAnnotationEntry..KtAnnotationEntry?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [37:52] ==> @InlineOnly public inline fun <T> Collection<(KtAnnotationEntry..KtAnnotationEntry?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtAnnotationEntry..org.jetbrains.kotlin.psi.KtAnnotationEntry?)

'function' @ [39:42] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'bodyExpression' @ [39:51] ==> public final val KtNamedFunction.bodyExpression: KtExpression?[MyPropertyDescriptor]

'when (bodyExpression) {
                        is KtDotQualifiedExpression -> bodyExpression
                        is KtBlockExpression -> {
                            val body = bodyExpression.statements.singleOrNull()
                            when (body) {
                                is KtReturnExpression -> body.returnedExpression
                                is KtDotQualifiedExpression -> body.takeIf {
                                    function.typeReference.let { it == null || it.text == "Unit" }
                                }
                                else -> null
                            }

                        }
                        else -> null
                    }' @ [40:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'bodyExpression' @ [40:53] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'bodyExpression' @ [41:56] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'bodyExpression' @ [43:40] ==> val bodyExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'statements' @ [43:55] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'singleOrNull' @ [43:66] ==> public fun <T> List<(KtExpression..KtExpression?)>.singleOrNull(): KtExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)

'when (body) {
                                is KtReturnExpression -> body.returnedExpression
                                is KtDotQualifiedExpression -> body.takeIf {
                                    function.typeReference.let { it == null || it.text == "Unit" }
                                }
                                else -> null
                            }' @ [44:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtExpression?, entry1: KtExpression?, entry2: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtExpression?

'body' @ [44:35] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'body' @ [45:58] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'returnedExpression' @ [45:63] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'body' @ [46:64] ==> val body: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'takeIf' @ [46:69] ==> @InlineOnly @SinceKotlin public inline fun <T> KtDotQualifiedExpression.takeIf(predicate: (KtDotQualifiedExpression) -> Boolean): KtDotQualifiedExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtDotQualifiedExpression

'function' @ [47:37] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'typeReference' @ [47:46] ==> public final var KtNamedFunction.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [47:60] ==> @InlineOnly public inline fun <T, R> KtTypeReference?.let(block: (KtTypeReference?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference?
    <R> -> Boolean

'it' @ [47:66] ==> value-parameter it: KtTypeReference? defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [47:80] ==> value-parameter it: KtTypeReference? defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [47:83] ==> public final val KtTypeReference.text: (String..String?)[MyPropertyDescriptor]

'qualifiedExpression' @ [56:43] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'receiverExpression' @ [56:63] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'superExpression' @ [57:25] ==> val superExpression: KtSuperExpression defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'superTypeQualifier' @ [57:41] ==> public final val KtSuperExpression.superTypeQualifier: KtTypeReference?[MyPropertyDescriptor]

'qualifiedExpression' @ [59:44] ==> val qualifiedExpression: KtDotQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'selectorExpression' @ [59:64] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtDotQualifiedExpression[DeserializedPropertyDescriptor]

'!' @ [60:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSameFunctionName' @ [60:26] ==> private final fun isSameFunctionName(superSelectorExpression: KtCallElement, function: KtNamedFunction): Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection[SimpleFunctionDescriptorImpl]

'superCallElement' @ [60:45] ==> val superCallElement: KtCallElement defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'function' @ [60:63] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'!' @ [61:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSameArguments' @ [61:26] ==> private final fun isSameArguments(superCallElement: KtCallElement, function: KtNamedFunction): Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection[SimpleFunctionDescriptorImpl]

'superCallElement' @ [61:42] ==> val superCallElement: KtCallElement defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'function' @ [61:60] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'holder' @ [63:38] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [63:45] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [63:53] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @Nullable p1: TextRange?, @NotNull @Nls p2: String, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'function' @ [64:29] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'TextRange' @ [65:29] ==> public constructor TextRange(p0: Int, p1: Int) defined in com.intellij.openapi.util.TextRange[JavaClassConstructorDescriptor]

'modifierList' @ [65:39] ==> val modifierList: KtModifierList defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'startOffsetInParent' @ [65:52] ==> public final val KtModifierList.startOffsetInParent: Int[MyPropertyDescriptor]

'funKeyword' @ [65:73] ==> val funKeyword: PsiElement defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'endOffset' @ [65:84] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'function' @ [65:96] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[ValueParameterDescriptorImpl]

'startOffset' @ [65:105] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'LIKE_UNUSED_SYMBOL' @ [67:50] ==> enum entry LIKE_UNUSED_SYMBOL defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [68:29] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor[ValueParameterDescriptorImpl]

'RedundantOverrideFix' @ [69:29] ==> public constructor RedundantOverrideFix() defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.RedundantOverrideFix[ClassConstructorDescriptorImpl]

'holder' @ [71:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [71:28] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'descriptor' @ [71:44] ==> val descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.buildVisitor.<no name provided>.visitNamedFunction[LocalVariableDescriptor]

'superCallElement' @ [76:25] ==> value-parameter superCallElement: KtCallElement defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments[ValueParameterDescriptorImpl]

'valueArguments' @ [76:42] ==> public final val KtCallElement.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'function' @ [77:26] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments[ValueParameterDescriptorImpl]

'valueParameters' @ [77:35] ==> public final val KtNamedFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'arguments' @ [78:13] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments[LocalVariableDescriptor]

'size' @ [78:23] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'parameters' @ [78:31] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments[LocalVariableDescriptor]

'size' @ [78:42] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'arguments' @ [79:16] ==> val arguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>) defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments[LocalVariableDescriptor]

'zip' @ [79:26] ==> public infix fun <T, R> Iterable<(ValueArgument..ValueArgument?)>.zip(other: Iterable<(KtParameter..KtParameter?)>): List<Pair<(ValueArgument..ValueArgument?), (KtParameter..KtParameter?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)
    <R> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'parameters' @ [79:30] ==> val parameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>) defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments[LocalVariableDescriptor]

'all' @ [79:42] ==> public inline fun <T> Iterable<Pair<(ValueArgument..ValueArgument?), (KtParameter..KtParameter?)>>.all(predicate: (Pair<(ValueArgument..ValueArgument?), (KtParameter..KtParameter?)>) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?), (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)>

'component1' @ [79:49] ==> public final operator fun component1(): (ValueArgument..ValueArgument?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [79:59] ==> public final operator fun component2(): (KtParameter..KtParameter?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'argument' @ [80:13] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments.<anonymous>[LocalVariableDescriptor]

'getArgumentExpression' @ [80:22] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'text' @ [80:47] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'parameter' @ [80:55] ==> val parameter: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameArguments.<anonymous>[LocalVariableDescriptor]

'name' @ [80:65] ==> public final val KtParameter.name: String?[MyPropertyDescriptor]

'superSelectorExpression' @ [85:35] ==> value-parameter superSelectorExpression: KtCallElement defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameFunctionName[ValueParameterDescriptorImpl]

'getCallNameExpression' @ [85:59] ==> public fun KtCallElement.getCallNameExpression(): KtSimpleNameExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'text' @ [85:84] ==> public final val KtSimpleNameExpression.text: (String..String?)[MyPropertyDescriptor]

'function' @ [86:16] ==> value-parameter function: KtNamedFunction defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameFunctionName[ValueParameterDescriptorImpl]

'name' @ [86:25] ==> public final val KtNamedFunction.name: String?[MyPropertyDescriptor]

'superCallMethodName' @ [86:33] ==> val superCallMethodName: String defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.isSameFunctionName[LocalVariableDescriptor]

'name' @ [91:40] ==> public final val KotlinRedundantOverrideInspection.RedundantOverrideFix.name: String[MyPropertyDescriptor]

'descriptor' @ [94:13] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.KotlinRedundantOverrideInspection.RedundantOverrideFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [94:24] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delete' @ [94:35] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'-' @ [99:49] ==> public operator fun <T> Iterable<(KtModifierKeywordToken..KtModifierKeywordToken?)>.minus(element: (KtModifierKeywordToken..KtModifierKeywordToken?)): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'MODIFIER_KEYWORDS_ARRAY' @ [99:58] ==> public final val MODIFIER_KEYWORDS_ARRAY: (Array<(KtModifierKeywordToken..KtModifierKeywordToken?)>..Array<out (KtModifierKeywordToken..KtModifierKeywordToken?)>?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'asList' @ [99:82] ==> public fun <T> Array<out (KtModifierKeywordToken..KtModifierKeywordToken?)>.asList(): List<(KtModifierKeywordToken..KtModifierKeywordToken?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'OVERRIDE_KEYWORD' @ [99:102] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

