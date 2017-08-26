'AbstractKotlinInspection' @ [36:31] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [38:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'expression' @ [40:31] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'analyzeFully' @ [40:42] ==> public fun KtElement.analyzeFully(): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [41:45] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'get' @ [41:53] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(KtExpression..KtExpression?), (LeakingThisDescriptor..LeakingThisDescriptor?)>..ReadOnlySlice<(KtExpression..KtExpression?), (LeakingThisDescriptor..LeakingThisDescriptor?)>?), p1: (KtExpression..KtExpression?)): LeakingThisDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.cfg.LeakingThisDescriptor..org.jetbrains.kotlin.cfg.LeakingThisDescriptor?)

'LEAKING_THIS' @ [41:57] ==> public final val LEAKING_THIS: (WritableSlice<(KtExpression..KtExpression?), (LeakingThisDescriptor..LeakingThisDescriptor?)>..WritableSlice<(KtExpression..KtExpression?), (LeakingThisDescriptor..LeakingThisDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [41:71] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'when (leakingThisDescriptor) {
                    is NonFinalClass ->
                        if (expression is KtThisExpression)
                            "Leaking 'this' in constructor of non-final class ${leakingThisDescriptor.klass.name}"
                        else
                            return // Not supported yet
                    is NonFinalProperty ->
                        "Accessing non-final property ${leakingThisDescriptor.property.name} in constructor"
                    is NonFinalFunction ->
                        "Calling non-final function ${leakingThisDescriptor.function.name} in constructor"
                    else -> return // Not supported yet
                }' @ [42:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'leakingThisDescriptor' @ [42:41] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'if (expression is KtThisExpression)
                            "Leaking 'this' in constructor of non-final class ${leakingThisDescriptor.klass.name}"
                        else
                            return' @ [44:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'expression' @ [44:29] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'leakingThisDescriptor' @ [45:81] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'klass' @ [45:103] ==> public final val klass: ClassDescriptor defined in org.jetbrains.kotlin.cfg.LeakingThisDescriptor.NonFinalClass[DeserializedPropertyDescriptor]

'name' @ [45:109] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'leakingThisDescriptor' @ [49:57] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'property' @ [49:79] ==> public final val property: PropertyDescriptor defined in org.jetbrains.kotlin.cfg.LeakingThisDescriptor.NonFinalProperty[DeserializedPropertyDescriptor]

'name' @ [49:88] ==> public final val PropertyDescriptor.name: Name[MyPropertyDescriptor]

'leakingThisDescriptor' @ [51:55] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'function' @ [51:77] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.LeakingThisDescriptor.NonFinalFunction[DeserializedPropertyDescriptor]

'name' @ [51:86] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'when (leakingThisDescriptor) {
                    is NonFinalProperty -> leakingThisDescriptor.property
                    is NonFinalFunction -> leakingThisDescriptor.function
                    else -> null
                }' @ [54:45] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableMemberDescriptor?, entry1: CallableMemberDescriptor?, entry2: CallableMemberDescriptor?): CallableMemberDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableMemberDescriptor?

'leakingThisDescriptor' @ [54:51] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'leakingThisDescriptor' @ [55:44] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'property' @ [55:66] ==> public final val property: PropertyDescriptor defined in org.jetbrains.kotlin.cfg.LeakingThisDescriptor.NonFinalProperty[DeserializedPropertyDescriptor]

'leakingThisDescriptor' @ [56:44] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'function' @ [56:66] ==> public final val function: FunctionDescriptor defined in org.jetbrains.kotlin.cfg.LeakingThisDescriptor.NonFinalFunction[DeserializedPropertyDescriptor]

'memberDescriptorToFix' @ [59:33] ==> val memberDescriptorToFix: CallableMemberDescriptor? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'let' @ [59:56] ==> @InlineOnly public inline fun <T, R> CallableMemberDescriptor.let(block: (CallableMemberDescriptor) -> IntentionWrapper?): IntentionWrapper? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableMemberDescriptor
    <R> -> IntentionWrapper?

'if (it.modality == Modality.OPEN) {
                        val modifierListOwner = DescriptorToSourceUtils.descriptorToDeclaration(it) as? KtDeclaration
                        createMakeFinalFix(modifierListOwner)
                    }
                    else null' @ [60:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntentionWrapper?, elseBranch: IntentionWrapper?): IntentionWrapper?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntentionWrapper?

'it' @ [60:25] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [60:28] ==> public final val CallableMemberDescriptor.modality: Modality[MyPropertyDescriptor]

'OPEN' @ [60:49] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'DescriptorToSourceUtils' @ [61:49] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [61:73] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[DeserializedSimpleFunctionDescriptor]

'it' @ [61:97] ==> value-parameter it: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression.<anonymous>[ValueParameterDescriptorImpl]

'createMakeFinalFix' @ [62:25] ==> private final fun createMakeFinalFix(declaration: KtDeclaration?): IntentionWrapper? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion[SimpleFunctionDescriptorImpl]

'modifierListOwner' @ [62:44] ==> val modifierListOwner: KtDeclaration? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression.<anonymous>[LocalVariableDescriptor]

'leakingThisDescriptor' @ [67:29] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'classOrObject' @ [67:51] ==> public abstract val classOrObject: KtClassOrObject defined in org.jetbrains.kotlin.cfg.LeakingThisDescriptor[DeserializedPropertyDescriptor]

'if (klass != null && klass.hasModifier(KtTokens.OPEN_KEYWORD)) {
                            createMakeFinalFix(klass)
                        }
                        else null' @ [69:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: IntentionWrapper?, elseBranch: IntentionWrapper?): IntentionWrapper?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> IntentionWrapper?

'klass' @ [69:29] ==> val klass: KtClass? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'klass' @ [69:46] ==> val klass: KtClass? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'hasModifier' @ [69:52] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClass[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [69:73] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'createMakeFinalFix' @ [70:29] ==> private final fun createMakeFinalFix(declaration: KtDeclaration?): IntentionWrapper? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion[SimpleFunctionDescriptorImpl]

'klass' @ [70:48] ==> val klass: KtClass? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'holder' @ [74:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [74:24] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'expression' @ [75:25] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[ValueParameterDescriptorImpl]

'description' @ [75:37] ==> val description: String defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'when (leakingThisDescriptor) {
                            is NonFinalProperty, is NonFinalFunction -> GENERIC_ERROR_OR_WARNING
                            else -> WEAK_WARNING
                        }' @ [76:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ProblemHighlightType, entry1: ProblemHighlightType): ProblemHighlightType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ProblemHighlightType

'leakingThisDescriptor' @ [76:31] ==> val leakingThisDescriptor: LeakingThisDescriptor defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'GENERIC_ERROR_OR_WARNING' @ [77:73] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'WEAK_WARNING' @ [78:37] ==> enum entry WEAK_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'arrayOf' @ [80:27] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: IntentionWrapper?): Array<IntentionWrapper?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> IntentionWrapper?

'memberFix' @ [80:35] ==> val memberFix: IntentionWrapper? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'classFix' @ [80:46] ==> val classFix: IntentionWrapper? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.buildVisitor.<no name provided>.visitExpression[LocalVariableDescriptor]

'filterNotNull' @ [80:56] ==> public fun <T : Any> Array<out IntentionWrapper?>.filterNotNull(): List<IntentionWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> IntentionWrapper

'toTypedArray' @ [80:72] ==> public inline fun <reified T> Collection<IntentionWrapper>.toTypedArray(): Array<IntentionWrapper> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> IntentionWrapper

'declaration' @ [89:13] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion.createMakeFinalFix[ValueParameterDescriptorImpl]

'declaration' @ [90:28] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion.createMakeFinalFix[ValueParameterDescriptorImpl]

'useScope' @ [90:40] ==> public final val KtDeclaration.useScope: SearchScope[MyPropertyDescriptor]

'!=' @ [91:17] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiElement[DeserializedSimpleFunctionDescriptor]

'search' @ [91:41] ==> public open fun search(p0: (PsiElement..PsiElement?), p1: (SearchScope..SearchScope?)): (Query<(PsiElement..PsiElement?)>..Query<(PsiElement..PsiElement?)>?) defined in com.intellij.psi.search.searches.DefinitionsScopedSearch[JavaMethodDescriptor]

'declaration' @ [91:48] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion.createMakeFinalFix[ValueParameterDescriptorImpl]

'useScope' @ [91:61] ==> val useScope: SearchScope defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion.createMakeFinalFix[LocalVariableDescriptor]

'findFirst' @ [91:71] ==> @Nullable public abstract fun findFirst(): PsiElement? defined in com.intellij.util.Query[JavaMethodDescriptor]

'?:' @ [92:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'declaration' @ [92:18] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion.createMakeFinalFix[ValueParameterDescriptorImpl]

'containingClassOrObject' @ [92:30] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'isInterface' @ [92:68] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'IntentionWrapper' @ [93:20] ==> public constructor IntentionWrapper(@NotNull p0: IntentionAction, @NotNull p1: PsiFile) defined in com.intellij.codeInspection.IntentionWrapper[JavaClassConstructorDescriptor]

'AddModifierFix' @ [93:37] ==> public constructor AddModifierFix(element: KtModifierListOwner, modifier: KtModifierKeywordToken) defined in org.jetbrains.kotlin.idea.quickfix.AddModifierFix[ClassConstructorDescriptorImpl]

'declaration' @ [93:52] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion.createMakeFinalFix[ValueParameterDescriptorImpl]

'FINAL_KEYWORD' @ [93:74] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'declaration' @ [93:90] ==> value-parameter declaration: KtDeclaration? defined in org.jetbrains.kotlin.idea.inspections.LeakingThisInspection.Companion.createMakeFinalFix[ValueParameterDescriptorImpl]

'containingFile' @ [93:102] ==> public final val KtDeclaration.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

