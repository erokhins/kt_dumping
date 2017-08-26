'AbstractKotlinInspection' @ [33:46] ==> public constructor AbstractKotlinInspection() defined in org.jetbrains.kotlin.idea.inspections.AbstractKotlinInspection[DeserializedClassConstructorDescriptor]

'KtVisitorVoid' @ [35:25] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'registerProblemIfNeeded' @ [37:17] ==> private final fun registerProblemIfNeeded(declaration: KtDeclaration, targetForProblem: PsiElement): Unit defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'declaration' @ [37:41] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'declaration' @ [37:54] ==> value-parameter declaration: KtNamedDeclaration defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.visitNamedDeclaration[ValueParameterDescriptorImpl]

'nameIdentifier' @ [37:66] ==> public final val KtNamedDeclaration.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'registerProblemIfNeeded' @ [41:17] ==> private final fun registerProblemIfNeeded(declaration: KtDeclaration, targetForProblem: PsiElement): Unit defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>[SimpleFunctionDescriptorImpl]

'accessor' @ [41:41] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.visitPropertyAccessor[ValueParameterDescriptorImpl]

'accessor' @ [41:51] ==> value-parameter accessor: KtPropertyAccessor defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.visitPropertyAccessor[ValueParameterDescriptorImpl]

'namePlaceholder' @ [41:60] ==> public final val KtPropertyAccessor.namePlaceholder: PsiElement[MyPropertyDescriptor]

'declaration' @ [45:42] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.registerProblemIfNeeded[ValueParameterDescriptorImpl]

'resolveToDescriptorIfAny' @ [45:54] ==> public fun KtDeclaration.resolveToDescriptorIfAny(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'accessorDescriptor' @ [47:31] ==> val accessorDescriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.registerProblemIfNeeded[LocalVariableDescriptor]

'getDeprecations' @ [47:50] ==> public fun DeclarationDescriptor.getDeprecations(languageVersionSettings: LanguageVersionSettings): List<Deprecation> defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'declaration' @ [47:66] ==> value-parameter declaration: KtDeclaration defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.registerProblemIfNeeded[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [47:78] ==> public val KtElement.languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.idea.project[DeserializedPropertyDescriptor]

'firstOrNull' @ [48:40] ==> public fun <T> List<Deprecation>.firstOrNull(): Deprecation? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Deprecation

'deprecatedByOverriddenMessage' @ [49:41] ==> public fun Deprecation.deprecatedByOverriddenMessage(): String? defined in org.jetbrains.kotlin.resolve[DeserializedSimpleFunctionDescriptor]

'holder' @ [50:31] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor[ValueParameterDescriptorImpl]

'manager' @ [50:38] ==> public final val ProblemsHolder.manager: InspectionManager[MyPropertyDescriptor]

'createProblemDescriptor' @ [50:46] ==> @NotNull @Contract public abstract fun createProblemDescriptor(@NotNull p0: PsiElement, @NotNull @Nls p1: String, p2: Boolean, @NotNull p3: ProblemHighlightType, p4: Boolean, vararg p5: (LocalQuickFix..LocalQuickFix?)): ProblemDescriptor defined in com.intellij.codeInspection.InspectionManager[JavaMethodDescriptor]

'targetForProblem' @ [51:25] ==> value-parameter targetForProblem: PsiElement defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.registerProblemIfNeeded[ValueParameterDescriptorImpl]

'message' @ [52:25] ==> val message: String defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.registerProblemIfNeeded[LocalVariableDescriptor]

'LIKE_DEPRECATED' @ [54:46] ==> enum entry LIKE_DEPRECATED defined in com.intellij.codeInspection.ProblemHighlightType[FakeCallableDescriptorForObject]

'isOnTheFly' @ [55:25] ==> value-parameter isOnTheFly: Boolean defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor[ValueParameterDescriptorImpl]

'holder' @ [57:17] ==> value-parameter holder: ProblemsHolder defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor[ValueParameterDescriptorImpl]

'registerProblem' @ [57:24] ==> public open fun registerProblem(@NotNull p0: ProblemDescriptor): Unit defined in com.intellij.codeInspection.ProblemsHolder[JavaMethodDescriptor]

'problem' @ [57:40] ==> val problem: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.OverridingDeprecatedMemberInspection.buildVisitor.<no name provided>.registerProblemIfNeeded[LocalVariableDescriptor]

