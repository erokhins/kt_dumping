'QueryExecutorBase<PsiReference, MethodReferencesSearch.SearchParameters>' @ [37:64] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>(p0: Boolean) defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> PsiReference
    <Params : (Any..Any?)> -> SearchParameters

'isAnnotationMethod' @ [39:25] ==> public open fun isAnnotationMethod(p0: (PsiElement..PsiElement?)): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'this' @ [39:44] ==> <this> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.isDefaultAnnotationMethod[ReceiverParameterDescriptorImpl]

'name' @ [39:53] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'DEFAULT_REFERENCED_METHOD_NAME' @ [39:75] ==> @NonNls public const final val DEFAULT_REFERENCED_METHOD_NAME: String defined in com.intellij.psi.PsiAnnotation[JavaPropertyDescriptor]

'parameterList' @ [39:109] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [39:123] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'ReadActionProcessor<PsiReference>' @ [41:88] ==> public constructor ReadActionProcessor<T : (Any..Any?)>() defined in com.intellij.openapi.application.ReadActionProcessor[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiReference

'reference' @ [43:17] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.createReferenceProcessor.<no name provided>.processInReadAction[ValueParameterDescriptorImpl]

'reference' @ [44:35] ==> value-parameter reference: PsiReference defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.createReferenceProcessor.<no name provided>.processInReadAction[ValueParameterDescriptorImpl]

'expression' @ [44:45] ==> public final val expression: KtSimpleNameExpression defined in org.jetbrains.kotlin.idea.references.KtSimpleNameReference[DeserializedPropertyDescriptor]

'getParentOfTypeAndBranch' @ [44:56] ==> public inline fun <reified T : PsiElement> PsiElement.getParentOfTypeAndBranch(strict: Boolean = ..., noinline branch: KtAnnotationEntry.() -> PsiElement?): KtAnnotationEntry? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtAnnotationEntry

'typeReference' @ [44:102] ==> public final val KtAnnotationEntry.typeReference: KtTypeReference?[MyPropertyDescriptor]

'annotationEntry' @ [45:28] ==> val annotationEntry: KtAnnotationEntry defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.createReferenceProcessor.<no name provided>.processInReadAction[LocalVariableDescriptor]

'valueArguments' @ [45:44] ==> public final val KtAnnotationEntry.valueArguments: (MutableList<out (ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [45:59] ==> public fun <T> List<(ValueArgument..ValueArgument?)>.singleOrNull(): ValueArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.ValueArgument..org.jetbrains.kotlin.psi.ValueArgument?)

'argument' @ [46:31] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.createReferenceProcessor.<no name provided>.processInReadAction[LocalVariableDescriptor]

'references' @ [46:40] ==> public final val KtValueArgument.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstanceOrNull' @ [46:51] ==> public inline fun <reified T : Any> Array<*>.firstIsInstanceOrNull(): KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> ReferenceImpl

'consumer' @ [47:20] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.createReferenceProcessor[ValueParameterDescriptorImpl]

'process' @ [47:29] ==> public abstract fun process(p0: (PsiReference..PsiReference?)): Boolean defined in com.intellij.util.Processor[JavaMethodDescriptor]

'implicitRef' @ [47:37] ==> val implicitRef: KotlinDefaultAnnotationMethodImplicitReferenceContributor.ReferenceImpl defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.createReferenceProcessor.<no name provided>.processInReadAction[LocalVariableDescriptor]

'runReadAction' @ [52:9] ==> public fun <T> runReadAction(action: () -> Query<(PsiReference..PsiReference?)>?): Query<(PsiReference..PsiReference?)>? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Query<(com.intellij.psi.PsiReference..com.intellij.psi.PsiReference?)>?

'queryParameters' @ [53:26] ==> value-parameter queryParameters: MethodReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.processQuery[ValueParameterDescriptorImpl]

'method' @ [53:42] ==> public final val MethodReferencesSearch.SearchParameters.method: PsiMethod[MyPropertyDescriptor]

'!' @ [54:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'method' @ [54:18] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.processQuery.<anonymous>[LocalVariableDescriptor]

'isDefaultAnnotationMethod' @ [54:25] ==> private final val PsiMethod.isDefaultAnnotationMethod: Boolean defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher[PropertyDescriptorImpl]

'method' @ [55:35] ==> val method: PsiMethod defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.processQuery.<anonymous>[LocalVariableDescriptor]

'containingClass' @ [55:42] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'queryParameters' @ [56:31] ==> value-parameter queryParameters: MethodReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.processQuery[ValueParameterDescriptorImpl]

'effectiveSearchScope' @ [56:47] ==> public final val MethodReferencesSearch.SearchParameters.effectiveSearchScope: SearchScope[MyPropertyDescriptor]

'restrictToKotlinSources' @ [56:68] ==> public fun SearchScope.restrictToKotlinSources(): SearchScope defined in org.jetbrains.kotlin.idea.search[DeserializedSimpleFunctionDescriptor]

'search' @ [57:30] ==> @NotNull public open fun search(@NotNull p0: PsiElement, @NotNull p1: SearchScope): Query<(PsiReference..PsiReference?)> defined in com.intellij.psi.search.searches.ReferencesSearch[JavaMethodDescriptor]

'annotationClass' @ [57:37] ==> val annotationClass: PsiClass defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.processQuery.<anonymous>[LocalVariableDescriptor]

'searchScope' @ [57:54] ==> val searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.processQuery.<anonymous>[LocalVariableDescriptor]

'forEach' @ [58:12] ==> public abstract fun forEach(@NotNull p0: Processor<(PsiReference..PsiReference?)>): Boolean defined in com.intellij.util.Query[JavaMethodDescriptor]

'createReferenceProcessor' @ [58:20] ==> private final fun createReferenceProcessor(consumer: Processor<PsiReference>): <no name provided> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher[SimpleFunctionDescriptorImpl]

'consumer' @ [58:45] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.DefaultAnnotationMethodKotlinImplicitReferenceSearcher.processQuery[ValueParameterDescriptorImpl]

