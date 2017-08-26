'newName' @ [27:53] ==> public final val newName: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix[PropertyDescriptorImpl]

'name' @ [29:36] ==> public final val SimplifyCallChainFix.name: String[MyPropertyDescriptor]

'descriptor' @ [32:10] ==> value-parameter descriptor: ProblemDescriptor defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix[ValueParameterDescriptorImpl]

'psiElement' @ [32:21] ==> public final val ProblemDescriptor.psiElement: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [32:60] ==> @InlineOnly public inline fun <T, R> KtQualifiedExpression.let(block: (KtQualifiedExpression) -> KtExpression): KtExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtQualifiedExpression
    <R> -> KtExpression

'KtPsiFactory' @ [33:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'secondQualifiedExpression' @ [33:40] ==> value-parameter secondQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'secondQualifiedExpression' @ [34:44] ==> value-parameter secondQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'receiverExpression' @ [34:70] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'if (firstQualifiedExpression is KtSafeQualifiedExpression) "?." else "."' @ [35:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'firstQualifiedExpression' @ [35:37] ==> val firstQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'firstQualifiedExpression' @ [36:39] ==> val firstQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'selectorExpression' @ [36:64] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'secondQualifiedExpression' @ [37:40] ==> value-parameter secondQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'selectorExpression' @ [37:66] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'if (newName.startsWith("joinTo")) "transform = " else ""' @ [39:38] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'newName' @ [39:42] ==> public final val newName: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix[PropertyDescriptorImpl]

'startsWith' @ [39:50] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'secondCallExpression' @ [40:29] ==> val secondCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'valueArgumentList' @ [40:50] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'arguments' @ [40:69] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'orEmpty' @ [40:79] ==> @InlineOnly public inline fun <T> List<(KtValueArgument..KtValueArgument?)>?.orEmpty(): List<(KtValueArgument..KtValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'map' @ [40:89] ==> public inline fun <T, R> Iterable<(KtValueArgument..KtValueArgument?)>.map(transform: ((KtValueArgument..KtValueArgument?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [40:95] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [40:98] ==> public final val KtValueArgument.text: (String..String?)[MyPropertyDescriptor]

'firstCallExpression' @ [41:29] ==> val firstCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'valueArgumentList' @ [41:49] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'arguments' @ [41:68] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'orEmpty' @ [41:78] ==> @InlineOnly public inline fun <T> List<(KtValueArgument..KtValueArgument?)>?.orEmpty(): List<(KtValueArgument..KtValueArgument?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'map' @ [41:88] ==> public inline fun <T, R> Iterable<(KtValueArgument..KtValueArgument?)>.map(transform: ((KtValueArgument..KtValueArgument?)) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)
    <R> -> String

'lastArgumentPrefix' @ [41:96] ==> val lastArgumentPrefix: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'it' @ [41:116] ==> value-parameter it: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [41:119] ==> public final val KtValueArgument.text: (String..String?)[MyPropertyDescriptor]

'firstCallExpression' @ [42:34] ==> val firstCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'lambdaArguments' @ [42:54] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'singleOrNull' @ [42:70] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.singleOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'arguments' @ [44:33] ==> val arguments: List<(String..String?)> defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'ifNotEmpty' @ [44:43] ==> public inline fun <T, C : Collection<(String..String?)>, O> List<(String..String?)>.ifNotEmpty(body: List<(String..String?)>.() -> String?): String? defined in org.jetbrains.kotlin.utils.addToStdlib[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)
    <C : Collection<T>> -> List<(kotlin.String..kotlin.String?)>
    <O> -> String

'joinToString' @ [44:56] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'if (lambdaArgument != null) factory.createExpressionByPattern(
                    "$0$1$2 $3 $4",
                    firstQualifiedExpression.receiverExpression,
                    operationSign,
                    newName,
                    argumentsText,
                    lambdaArgument.getLambdaExpression().text
            )
            else factory.createExpressionByPattern(
                    "$0$1$2 $3",
                    firstQualifiedExpression.receiverExpression,
                    operationSign,
                    newName,
                    argumentsText
            )' @ [45:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression, elseBranch: KtExpression): KtExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression

'lambdaArgument' @ [45:46] ==> val lambdaArgument: KtLambdaArgument? defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'factory' @ [45:70] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'createExpressionByPattern' @ [45:78] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'firstQualifiedExpression' @ [47:21] ==> val firstQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'receiverExpression' @ [47:46] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'operationSign' @ [48:21] ==> val operationSign: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'newName' @ [49:21] ==> public final val newName: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix[PropertyDescriptorImpl]

'argumentsText' @ [50:21] ==> val argumentsText: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'lambdaArgument' @ [51:21] ==> val lambdaArgument: KtLambdaArgument? defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'getLambdaExpression' @ [51:36] ==> public open fun getLambdaExpression(): KtLambdaExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'text' @ [51:58] ==> public final val KtLambdaExpression.text: String[MyPropertyDescriptor]

'factory' @ [53:18] ==> val factory: KtPsiFactory defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'createExpressionByPattern' @ [53:26] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'firstQualifiedExpression' @ [55:21] ==> val firstQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'receiverExpression' @ [55:46] ==> public open val receiverExpression: KtExpression defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[DeserializedPropertyDescriptor]

'operationSign' @ [56:21] ==> val operationSign: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'newName' @ [57:21] ==> public final val newName: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix[PropertyDescriptorImpl]

'argumentsText' @ [58:21] ==> val argumentsText: String defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

'secondQualifiedExpression' @ [61:13] ==> value-parameter secondQualifiedExpression: KtQualifiedExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[ValueParameterDescriptorImpl]

'replaced' @ [61:39] ==> public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'newQualifiedExpression' @ [61:48] ==> val newQualifiedExpression: KtExpression defined in org.jetbrains.kotlin.idea.inspections.collections.SimplifyCallChainFix.applyFix.<anonymous>[LocalVariableDescriptor]

