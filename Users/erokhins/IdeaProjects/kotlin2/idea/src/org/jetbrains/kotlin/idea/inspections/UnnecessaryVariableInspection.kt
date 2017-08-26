'AbstractKotlinInspection' @ [37:39] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [40:22] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'super' @ [42:21] ==> <this> defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.buildVisitor.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitProperty' @ [42:27] ==> public open fun visitProperty(@NotNull p0: KtProperty): Unit defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaMethodDescriptor]

'property' @ [42:41] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'property' @ [44:42] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'nameIdentifier' @ [44:51] ==> public final val KtProperty.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'statusFor' @ [45:34] ==> private final fun statusFor(property: KtProperty): UnnecessaryVariableInspection.Companion.Status? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion[SimpleFunctionDescriptorImpl]

'property' @ [45:44] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.buildVisitor.<no name provided>.visitProperty[ValueParameterDescriptorImpl]

'holder' @ [46:21] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [46:28] ==> public open fun registerProblem(@NotNull p0: PsiElement, @NotNull @Nls p1: String, @NotNull p2: ProblemHighlightType, @Nullable vararg p3: (LocalQuickFix..LocalQuickFix?)): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'nameIdentifier' @ [47:29] ==> val nameIdentifier: PsiElement defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'when (status) {
                                UnnecessaryVariableInspection.Companion.Status.RETURN_ONLY ->
                                    "Variable used only in following return and can be inlined"
                                UnnecessaryVariableInspection.Companion.Status.EXACT_COPY ->
                                    "Variable is an exact copy of another variable and can be inlined"
                            }' @ [48:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'status' @ [48:35] ==> val status: UnnecessaryVariableInspection.Companion.Status defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.buildVisitor.<no name provided>.visitProperty[LocalVariableDescriptor]

'UnnecessaryVariableInspection' @ [49:33] ==> public companion object defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection[FakeCallableDescriptorForObject]

'RETURN_ONLY' @ [49:80] ==> enum entry RETURN_ONLY defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.Status[FakeCallableDescriptorForObject]

'UnnecessaryVariableInspection' @ [51:33] ==> public companion object defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection[FakeCallableDescriptorForObject]

'EXACT_COPY' @ [51:80] ==> enum entry EXACT_COPY defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.Status[FakeCallableDescriptorForObject]

'GENERIC_ERROR_OR_WARNING' @ [54:50] ==> enum entry GENERIC_ERROR_OR_WARNING defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'InlineVariableFix' @ [55:29] ==> public constructor InlineVariableFix() defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.InlineVariableFix[ClassConstructorDescriptorImpl]

'?:' @ [67:36] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtElement?, right: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtElement

'getEnclosingElementForLocalDeclaration' @ [67:46] ==> @Nullable public open fun getEnclosingElementForLocalDeclaration(@NotNull p0: KtDeclaration): KtElement? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'property' @ [67:85] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'property' @ [68:31] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'initializer' @ [68:40] ==> public final var KtProperty.initializer: KtExpression?[MyPropertyDescriptor]

'!' @ [70:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'property' @ [70:18] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'isVar' @ [70:27] ==> public final val KtProperty.isVar: Boolean[MyPropertyDescriptor]

'initializer' @ [70:36] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'property' @ [70:80] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'typeReference' @ [70:89] ==> public final var KtProperty.typeReference: KtTypeReference?[MyPropertyDescriptor]

'property' @ [71:31] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'analyze' @ [71:40] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [72:45] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [72:53] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'initializer' @ [72:71] ==> val initializer: KtExpression defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'initializerDescriptor' @ [73:21] ==> val initializerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'!' @ [74:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'initializerDescriptor' @ [74:26] ==> val initializerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'isVar' @ [74:48] ==> public final val VariableDescriptor.isVar: Boolean[MyPropertyDescriptor]

'initializerDescriptor' @ [74:57] ==> val initializerDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'containingDeclaration' @ [74:79] ==> public final val VariableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'!=' @ [75:29] ==> public open fun equals(other: Any?): Boolean defined in com.intellij.psi.PsiReference[DeserializedSimpleFunctionDescriptor]

'search' @ [75:46] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'property' @ [75:53] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'LocalSearchScope' @ [75:63] ==> public constructor LocalSearchScope(@NotNull p0: PsiElement) defined in com.intellij.psi.search.LocalSearchScope[JavaClassConstructorDescriptor]

'enclosingElement' @ [75:80] ==> val enclosingElement: KtElement defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'findFirst' @ [75:99] ==> @Nullable public abstract fun findFirst(): PsiReference? defined in com.intellij.util.Query[JavaMethodDescriptor]

'EXACT_COPY' @ [76:43] ==> enum entry EXACT_COPY defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.Status[FakeCallableDescriptorForObject]

'property' @ [82:33] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'getNextSiblingIgnoringWhitespaceAndComments' @ [82:42] ==> public fun PsiElement.getNextSiblingIgnoringWhitespaceAndComments(withItself: Boolean = ...): PsiElement? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'nextStatement' @ [83:17] ==> val nextStatement: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'nextStatement' @ [84:32] ==> val nextStatement: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'returnedExpression' @ [84:46] ==> public final val KtReturnExpression.returnedExpression: KtExpression?[MyPropertyDescriptor]

'returned' @ [85:21] ==> val returned: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'nextStatement' @ [86:35] ==> val nextStatement: PsiElement? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'analyze' @ [86:49] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'context' @ [87:25] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'REFERENCE_TARGET' @ [87:33] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'returned' @ [87:51] ==> val returned: KtExpression? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'context' @ [87:64] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [87:72] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'property' @ [87:99] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.statusFor[ValueParameterDescriptorImpl]

'RETURN_ONLY' @ [88:39] ==> enum entry RETURN_ONLY defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.Status[FakeCallableDescriptorForObject]

'statusFor' @ [96:49] ==> private final fun statusFor(property: KtProperty): UnnecessaryVariableInspection.Companion.Status? defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion[SimpleFunctionDescriptorImpl]

'property' @ [96:59] ==> value-parameter property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.Companion.isActiveFor[ValueParameterDescriptorImpl]

'name' @ [103:40] ==> public final val UnnecessaryVariableInspection.InlineVariableFix.name: String[MyPropertyDescriptor]

'descriptor' @ [108:28] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.InlineVariableFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [108:39] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'getParentOfType' @ [108:50] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfType(strict: Boolean): KtProperty? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtProperty

'KotlinInlineValHandler' @ [109:13] ==> public constructor KotlinInlineValHandler() defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineValHandler[ClassConstructorDescriptorImpl]

'inlineElement' @ [109:38] ==> public open fun inlineElement(project: Project, editor: Editor?, element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.refactoring.inline.KotlinInlineValHandler[SimpleFunctionDescriptorImpl]

'project' @ [109:52] ==> value-parameter project: Project defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.InlineVariableFix.applyFix[ValueParameterDescriptorImpl]

'property' @ [109:61] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.InlineVariableFix.applyFix[LocalVariableDescriptor]

'findExistingEditor' @ [109:70] ==> public fun PsiElement.findExistingEditor(): Editor? defined in org.jetbrains.kotlin.idea.inspections[DeserializedSimpleFunctionDescriptor]

'property' @ [109:92] ==> val property: KtProperty defined in org.jetbrains.kotlin.idea.inspections.UnnecessaryVariableInspection.InlineVariableFix.applyFix[LocalVariableDescriptor]

