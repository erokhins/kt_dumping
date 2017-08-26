'OperatorReferenceSearcher<KtCallExpression>' @ [42:5] ==> public constructor OperatorReferenceSearcher<TReferenceElement : KtElement>(targetDeclaration: PsiElement, searchScope: SearchScope, consumer: Processor<PsiReference>, optimizer: SearchRequestCollector, options: KotlinReferencesSearchOptions, wordsToSearch: List<String>) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.OperatorReferenceSearcher[ClassConstructorDescriptorImpl]
Inferred types:
    <TReferenceElement : KtElement> -> KtCallExpression

'targetFunction' @ [42:49] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'searchScope' @ [42:65] ==> value-parameter searchScope: SearchScope defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'consumer' @ [42:78] ==> value-parameter consumer: Processor<PsiReference> defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'optimizer' @ [42:88] ==> value-parameter optimizer: SearchRequestCollector defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'options' @ [42:99] ==> value-parameter options: KotlinReferencesSearchOptions defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'emptyList' @ [42:124] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'getService' @ [46:42] ==> public open fun <T : (Any..Any?)> getService(@NotNull p0: Project, @NotNull p1: Class<(UastContext..UastContext?)>): (UastContext..UastContext?) defined in com.intellij.openapi.components.ServiceManager[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> UastContext

'targetFunction' @ [46:66] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'project' @ [46:81] ==> public final val PsiElement.project: Project[MyPropertyDescriptor]

'UastContext' @ [46:90] ==> private companion object defined in org.jetbrains.uast.UastContext[FakeCallableDescriptorForObject]

'java' @ [46:109] ==> public val <T> KClass<UastContext>.java: Class<UastContext> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> UastContext

'callArgumentsSize' @ [47:9] ==> private final val callArgumentsSize: Int? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher[PropertyDescriptorImpl]

'when {
            uastContext != null -> {
                val uMethod = uastContext.convertOpt<UMethod>(targetDeclaration, null)
                val uastParameters = uMethod?.uastParameters

                val isStableNumberOfArguments = uastParameters != null && uastParameters.none { it.uastInitializer != null || it.isVarArgs }
                if (isStableNumberOfArguments) {
                    val numberOfArguments = uastParameters!!.size
                    when {
                        targetFunction.isExtensionDeclaration() -> numberOfArguments - 1
                        else -> numberOfArguments
                    }
                }
                else null
            }

            else -> null
        }' @ [47:29] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int?, entry1: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int?

'uastContext' @ [48:13] ==> val uastContext: (UastContext..UastContext?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'uastContext' @ [49:31] ==> val uastContext: (UastContext..UastContext?) defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'convertOpt' @ [49:43] ==> public inline fun <reified T : UElement> UastLanguagePlugin.convertOpt(element: PsiElement?, parent: UElement?): UMethod? defined in org.jetbrains.uast[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : UElement> -> UMethod

'targetDeclaration' @ [49:63] ==> protected final val targetDeclaration: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher[PropertyDescriptorImpl]

'uMethod' @ [50:38] ==> val uMethod: UMethod? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'uastParameters' @ [50:47] ==> public abstract val uastParameters: List<UParameter> defined in org.jetbrains.uast.UMethod[DeserializedPropertyDescriptor]

'uastParameters' @ [52:49] ==> val uastParameters: List<UParameter>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'uastParameters' @ [52:75] ==> val uastParameters: List<UParameter>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'none' @ [52:90] ==> public inline fun <T> Iterable<UParameter>.none(predicate: (UParameter) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UParameter

'it' @ [52:97] ==> value-parameter it: UParameter defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>.<anonymous>[ValueParameterDescriptorImpl]

'uastInitializer' @ [52:100] ==> public abstract val uastInitializer: UExpression? defined in org.jetbrains.uast.UParameter[DeserializedPropertyDescriptor]

'it' @ [52:127] ==> value-parameter it: UParameter defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>.<anonymous>[ValueParameterDescriptorImpl]

'isVarArgs' @ [52:130] ==> public final val UParameter.isVarArgs: Boolean[MyPropertyDescriptor]

'if (isStableNumberOfArguments) {
                    val numberOfArguments = uastParameters!!.size
                    when {
                        targetFunction.isExtensionDeclaration() -> numberOfArguments - 1
                        else -> numberOfArguments
                    }
                }
                else null' @ [53:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Int?, elseBranch: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Int?

'isStableNumberOfArguments' @ [53:21] ==> val isStableNumberOfArguments: Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'uastParameters' @ [54:45] ==> val uastParameters: List<UParameter>? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'size' @ [54:62] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'when {
                        targetFunction.isExtensionDeclaration() -> numberOfArguments - 1
                        else -> numberOfArguments
                    }' @ [55:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'targetFunction' @ [56:25] ==> value-parameter targetFunction: PsiElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[ValueParameterDescriptorImpl]

'isExtensionDeclaration' @ [56:40] ==> public fun PsiElement.isExtensionDeclaration(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'numberOfArguments' @ [56:68] ==> val numberOfArguments: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'numberOfArguments' @ [57:33] ==> val numberOfArguments: Int defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.<init>[LocalVariableDescriptor]

'expression' @ [68:30] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.processPossibleReceiverExpression[ValueParameterDescriptorImpl]

'parent' @ [68:41] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'processReferenceElement' @ [69:9] ==> protected final fun processReferenceElement(element: KtCallExpression): Boolean defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher[SimpleFunctionDescriptorImpl]

'callExpression' @ [69:33] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.processPossibleReceiverExpression[LocalVariableDescriptor]

'ref' @ [72:58] ==> value-parameter ref: PsiReference defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.isReferenceToCheck[ValueParameterDescriptorImpl]

'element' @ [75:30] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.extractReference[ValueParameterDescriptorImpl]

'callArgumentsSize' @ [77:13] ==> private final val callArgumentsSize: Int? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher[PropertyDescriptorImpl]

'callArgumentsSize' @ [77:42] ==> private final val callArgumentsSize: Int? defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher[PropertyDescriptorImpl]

'callExpression' @ [77:63] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'valueArguments' @ [77:78] ==> public final val KtCallExpression.valueArguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'size' @ [77:93] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'callExpression' @ [81:16] ==> val callExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.search.usagesSearch.operators.InvokeOperatorReferenceSearcher.extractReference[LocalVariableDescriptor]

'references' @ [81:31] ==> public final val KtCallExpression.references: (Array<(PsiReference..PsiReference?)>..Array<out (PsiReference..PsiReference?)>)[MyPropertyDescriptor]

'firstIsInstance' @ [81:42] ==> public inline fun <reified T> Array<*>.firstIsInstance(): KtInvokeFunctionReference defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> KtInvokeFunctionReference

