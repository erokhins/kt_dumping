'QueryExecutorBase<PsiReference, MethodReferencesSearch.SearchParameters>' @ [25:50] ==> protected/*protected and package*/ constructor QueryExecutorBase<Result : (Any..Any?), Params : (Any..Any?)>(p0: Boolean) defined in com.intellij.openapi.application.QueryExecutorBase[JavaClassConstructorDescriptor]
Inferred types:
    <Result : (Any..Any?)> -> PsiReference
    <Params : (Any..Any?)> -> SearchParameters

'OperatorReferenceSearcher' @ [27:32] ==> public companion object defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[FakeCallableDescriptorForObject]

'create' @ [27:58] ==> public final fun create(declaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions): OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher.Companion[DeserializedSimpleFunctionDescriptor]

'queryParameters' @ [28:17] ==> value-parameter queryParameters: MethodReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConventionMethodReferencesSearcher.processQuery[ValueParameterDescriptorImpl]

'method' @ [28:33] ==> public final val MethodReferencesSearch.SearchParameters.method: PsiMethod[MyPropertyDescriptor]

'queryParameters' @ [29:17] ==> value-parameter queryParameters: MethodReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConventionMethodReferencesSearcher.processQuery[ValueParameterDescriptorImpl]

'effectiveSearchScope' @ [29:33] ==> public final val MethodReferencesSearch.SearchParameters.effectiveSearchScope: SearchScope[MyPropertyDescriptor]

'consumer' @ [30:17] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConventionMethodReferencesSearcher.processQuery[ValueParameterDescriptorImpl]

'queryParameters' @ [31:17] ==> value-parameter queryParameters: MethodReferencesSearch.SearchParameters defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConventionMethodReferencesSearcher.processQuery[ValueParameterDescriptorImpl]

'optimizer' @ [31:33] ==> public final val MethodReferencesSearch.SearchParameters.optimizer: (SearchRequestCollector..SearchRequestCollector?)[MyPropertyDescriptor]

'KotlinReferencesSearchOptions' @ [32:17] ==> public constructor KotlinReferencesSearchOptions(acceptCallableOverrides: Boolean = ..., acceptOverloads: Boolean = ..., acceptExtensionsOfDeclarationClass: Boolean = ..., acceptCompanionObjectMembers: Boolean = ..., searchForComponentConventions: Boolean = ..., searchForOperatorConventions: Boolean = ..., searchNamedArguments: Boolean = ...) defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinReferencesSearchOptions[DeserializedClassConstructorDescriptor]

'operatorSearcher' @ [34:9] ==> val operatorSearcher: OperatorReferenceSearcher<*>? defined in org.jetbrains.kotlin.idea.search.ideaExtensions.KotlinConventionMethodReferencesSearcher.processQuery[LocalVariableDescriptor]

'run' @ [34:27] ==> public final fun run(): Unit defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[DeserializedSimpleFunctionDescriptor]

