'IdeaReferenceSearcher' @ [29:17] ==> public object IdeaReferenceSearcher : ReferenceSearcher defined in org.jetbrains.kotlin.idea.j2k in file IdeaReferenceSearcher.kt[FakeCallableDescriptorForObject]

'IdeaSuperMethodSearcher' @ [32:17] ==> public object IdeaSuperMethodSearcher : SuperMethodsSearcher defined in org.jetbrains.kotlin.idea.j2k in file IdeaJavaToKotlinServices.kt[FakeCallableDescriptorForObject]

'IdeaResolverForConverter' @ [35:17] ==> public object IdeaResolverForConverter : ResolverForConverter defined in org.jetbrains.kotlin.idea.j2k in file IdeaResolverForConverter.kt[FakeCallableDescriptorForObject]

'IdeaDocCommentConverter' @ [38:17] ==> public object IdeaDocCommentConverter : DocCommentConverter defined in org.jetbrains.kotlin.idea.j2k[FakeCallableDescriptorForObject]

'IdeaJavaDataFlowAnalyzerFacade' @ [41:17] ==> private object IdeaJavaDataFlowAnalyzerFacade : JavaDataFlowAnalyzerFacade defined in org.jetbrains.kotlin.idea.j2k in file IdeaJavaToKotlinServices.kt[FakeCallableDescriptorForObject]

'method' @ [45:63] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.j2k.IdeaSuperMethodSearcher.findDeepestSuperMethods[ValueParameterDescriptorImpl]

'findDeepestSuperMethods' @ [45:70] ==> @NotNull public abstract fun findDeepestSuperMethods(): (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>) defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'asList' @ [45:96] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.asList(): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'checkNullness' @ [50:21] ==> @NotNull public open fun checkNullness(@Nullable p0: PsiVariable?, @Nullable p1: PsiElement?): Nullness defined in com.intellij.codeInspection.dataFlow.DfaUtil[JavaMethodDescriptor]

'variable' @ [50:35] ==> value-parameter variable: PsiVariable defined in org.jetbrains.kotlin.idea.j2k.IdeaJavaDataFlowAnalyzerFacade.variableNullability[ValueParameterDescriptorImpl]

'context' @ [50:45] ==> value-parameter context: PsiElement defined in org.jetbrains.kotlin.idea.j2k.IdeaJavaDataFlowAnalyzerFacade.variableNullability[ValueParameterDescriptorImpl]

'toNullability' @ [50:54] ==> private final fun Nullness.toNullability(): Nullability defined in org.jetbrains.kotlin.idea.j2k.IdeaJavaDataFlowAnalyzerFacade[SimpleFunctionDescriptorImpl]

'inferMethodNullity' @ [53:21] ==> @NotNull public open fun inferMethodNullity(p0: (PsiMethod..PsiMethod?)): Nullness defined in com.intellij.codeInspection.dataFlow.DfaUtil[JavaMethodDescriptor]

'method' @ [53:40] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.idea.j2k.IdeaJavaDataFlowAnalyzerFacade.methodNullability[ValueParameterDescriptorImpl]

'toNullability' @ [53:48] ==> private final fun Nullness.toNullability(): Nullability defined in org.jetbrains.kotlin.idea.j2k.IdeaJavaDataFlowAnalyzerFacade[SimpleFunctionDescriptorImpl]

'when (this) {
        Nullness.UNKNOWN -> Nullability.Default
        Nullness.NOT_NULL -> Nullability.NotNull
        Nullness.NULLABLE -> Nullability.Nullable
    }' @ [55:44] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nullability, entry1: Nullability, entry2: Nullability): Nullability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nullability

'this' @ [55:50] ==> <this> defined in org.jetbrains.kotlin.idea.j2k.IdeaJavaDataFlowAnalyzerFacade.toNullability[ReceiverParameterDescriptorImpl]

'UNKNOWN' @ [56:18] ==> enum entry UNKNOWN defined in com.intellij.codeInspection.dataFlow.Nullness[FakeCallableDescriptorForObject]

'Default' @ [56:41] ==> enum entry Default defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'NOT_NULL' @ [57:18] ==> enum entry NOT_NULL defined in com.intellij.codeInspection.dataFlow.Nullness[FakeCallableDescriptorForObject]

'NotNull' @ [57:42] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'NULLABLE' @ [58:18] ==> enum entry NULLABLE defined in com.intellij.codeInspection.dataFlow.Nullness[FakeCallableDescriptorForObject]

'Nullable' @ [58:42] ==> enum entry Nullable defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

