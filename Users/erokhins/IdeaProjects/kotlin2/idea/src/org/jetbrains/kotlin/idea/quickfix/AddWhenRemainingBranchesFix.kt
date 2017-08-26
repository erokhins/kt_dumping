'KotlinQuickFixAction<KtWhenExpression>' @ [33:67] ==> public constructor KotlinQuickFixAction<out T : PsiElement>(element: KtWhenExpression) defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[ClassConstructorDescriptorImpl]
Inferred types:
    <out T : PsiElement> -> KtWhenExpression

'expression' @ [33:106] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.<init>[ValueParameterDescriptorImpl]

'element' @ [40:23] ==> protected final val element: KtWhenExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix[PropertyDescriptorImpl]

'super' @ [41:16] ==> <this> defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix[LazyClassReceiverParameterDescriptor]

'isAvailable' @ [41:22] ==> public open fun isAvailable(project: Project, editor: Editor?, file: PsiFile): Boolean defined in org.jetbrains.kotlin.idea.quickfix.KotlinQuickFixAction[SimpleFunctionDescriptorImpl]

'project' @ [41:34] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.isAvailable[ValueParameterDescriptorImpl]

'editor' @ [41:43] ==> value-parameter editor: Editor? defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.isAvailable[ValueParameterDescriptorImpl]

'file' @ [41:51] ==> value-parameter file: PsiFile defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.isAvailable[ValueParameterDescriptorImpl]

'element' @ [41:60] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.isAvailable[LocalVariableDescriptor]

'closeBrace' @ [41:68] ==> public final val KtWhenExpression.closeBrace: PsiElement?[MyPropertyDescriptor]

'with' @ [42:16] ==> @InlineOnly public inline fun <T, R> with(receiver: List<WhenMissingCase>, block: List<WhenMissingCase>.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<WhenMissingCase>
    <R> -> Boolean

'getMissingCases' @ [42:33] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenChecker[DeserializedSimpleFunctionDescriptor]

'element' @ [42:49] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.isAvailable[LocalVariableDescriptor]

'element' @ [42:58] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.isAvailable[LocalVariableDescriptor]

'analyze' @ [42:66] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'isNotEmpty' @ [42:80] ==> @InlineOnly public inline fun <T> Collection<WhenMissingCase>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'!' @ [42:96] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasUnknown' @ [42:97] ==> public val List<WhenMissingCase>.hasUnknown: Boolean defined in org.jetbrains.kotlin.cfg[DeserializedPropertyDescriptor]

'element' @ [46:23] ==> protected final val element: KtWhenExpression? defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix[PropertyDescriptorImpl]

'WhenChecker' @ [47:28] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg[FakeCallableDescriptorForObject]

'getMissingCases' @ [47:40] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenChecker[DeserializedSimpleFunctionDescriptor]

'element' @ [47:56] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'element' @ [47:65] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'analyze' @ [47:73] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'element' @ [49:30] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'closeBrace' @ [49:38] ==> public final val KtWhenExpression.closeBrace: PsiElement?[MyPropertyDescriptor]

'AssertionError' @ [49:58] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'KtPsiFactory' @ [50:26] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'file' @ [50:39] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[ValueParameterDescriptorImpl]

'missingCases' @ [52:22] ==> val missingCases: List<WhenMissingCase> defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'when (case) {
                UnknownMissingCase, NullMissingCase, is BooleanMissingCase ->
                    case.branchConditionText
                is ClassMissingCase ->
                    if (case.classIsSingleton) {
                        case.classFqName.quoteIfNeeded().asString()
                    }
                    else {
                        "is " + case.classFqName.quoteIfNeeded().asString()
                    }
            }' @ [53:39] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'case' @ [53:45] ==> val case: WhenMissingCase defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'UnknownMissingCase' @ [54:17] ==> public object UnknownMissingCase : WhenMissingCase defined in org.jetbrains.kotlin.cfg[FakeCallableDescriptorForObject]

'NullMissingCase' @ [54:37] ==> public object NullMissingCase : WhenMissingCase defined in org.jetbrains.kotlin.cfg[FakeCallableDescriptorForObject]

'case' @ [55:21] ==> val case: WhenMissingCase defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'branchConditionText' @ [55:26] ==> public abstract val branchConditionText: String defined in org.jetbrains.kotlin.cfg.WhenMissingCase[DeserializedPropertyDescriptor]

'if (case.classIsSingleton) {
                        case.classFqName.quoteIfNeeded().asString()
                    }
                    else {
                        "is " + case.classFqName.quoteIfNeeded().asString()
                    }' @ [57:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'case' @ [57:25] ==> val case: WhenMissingCase defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'classIsSingleton' @ [57:30] ==> public final val classIsSingleton: Boolean defined in org.jetbrains.kotlin.cfg.ClassMissingCase[DeserializedPropertyDescriptor]

'case' @ [58:25] ==> val case: WhenMissingCase defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'classFqName' @ [58:30] ==> public final val classFqName: FqName defined in org.jetbrains.kotlin.cfg.ClassMissingCase[DeserializedPropertyDescriptor]

'quoteIfNeeded' @ [58:42] ==> public fun FqName.quoteIfNeeded(): FqName defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'asString' @ [58:58] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'+' @ [61:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'case' @ [61:33] ==> val case: WhenMissingCase defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'classFqName' @ [61:38] ==> public final val classFqName: FqName defined in org.jetbrains.kotlin.cfg.ClassMissingCase[DeserializedPropertyDescriptor]

'quoteIfNeeded' @ [61:50] ==> public fun FqName.quoteIfNeeded(): FqName defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]

'asString' @ [61:66] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'psiFactory' @ [64:25] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'createWhenEntry' @ [64:36] ==> public final fun createWhenEntry(entryText: String): KtWhenEntry defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'branchConditionText' @ [64:54] ==> val branchConditionText: String defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'element' @ [65:13] ==> val element: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'addBefore' @ [65:21] ==> public open fun addBefore(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtWhenExpression[JavaMethodDescriptor]

'entry' @ [65:31] ==> val entry: KtWhenEntry defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'whenCloseBrace' @ [65:38] ==> val whenCloseBrace: PsiElement defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.invoke[LocalVariableDescriptor]

'KotlinSingleIntentionActionFactory' @ [69:24] ==> public constructor KotlinSingleIntentionActionFactory() defined in org.jetbrains.kotlin.idea.quickfix.KotlinSingleIntentionActionFactory[ClassConstructorDescriptorImpl]

'diagnostic' @ [71:34] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.Companion.createAction[ValueParameterDescriptorImpl]

'psiElement' @ [71:45] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'getNonStrictParentOfType' @ [71:56] ==> public inline fun <reified T : PsiElement> PsiElement.getNonStrictParentOfType(): KtWhenExpression? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtWhenExpression

'AddWhenRemainingBranchesFix' @ [72:20] ==> public constructor AddWhenRemainingBranchesFix(expression: KtWhenExpression) defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix[ClassConstructorDescriptorImpl]

'whenExpression' @ [72:48] ==> val whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.idea.quickfix.AddWhenRemainingBranchesFix.Companion.createAction[LocalVariableDescriptor]

