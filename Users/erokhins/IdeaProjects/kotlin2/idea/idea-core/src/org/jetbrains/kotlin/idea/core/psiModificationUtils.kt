'Suppress' @ [46:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'replace' @ [48:18] ==> public abstract fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'newElement' @ [48:26] ==> value-parameter newElement: T defined in org.jetbrains.kotlin.idea.core.replaced[ValueParameterDescriptorImpl]

'if (result is T)
        result
    else
        (result as KtParenthesizedExpression).expression as T' @ [49:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'result' @ [49:16] ==> val result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.replaced[LocalVariableDescriptor]

'result' @ [50:9] ==> val result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.replaced[LocalVariableDescriptor]

'result' @ [52:10] ==> val result: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.replaced[LocalVariableDescriptor]

'expression' @ [52:47] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'Suppress' @ [55:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'copy' @ [56:38] ==> public abstract fun copy(): (PsiElement..PsiElement?) defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'moveInsideParenthesesAndReplaceWith' @ [59:12] ==> public fun KtLambdaArgument.moveInsideParenthesesAndReplaceWith(replacement: KtExpression, bindingContext: BindingContext): KtCallExpression defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [59:48] ==> <this> defined in org.jetbrains.kotlin.idea.core.moveInsideParentheses[ReceiverParameterDescriptorImpl]

'getArgumentExpression' @ [59:53] ==> public open fun getArgumentExpression(): KtExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [59:78] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.moveInsideParentheses[ValueParameterDescriptorImpl]

'moveInsideParenthesesAndReplaceWith' @ [65:23] ==> public fun KtLambdaArgument.moveInsideParenthesesAndReplaceWith(replacement: KtExpression, functionLiteralArgumentName: Name?): KtCallExpression defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'replacement' @ [65:59] ==> value-parameter replacement: KtExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[ValueParameterDescriptorImpl]

'getLambdaArgumentName' @ [65:72] ==> public fun KtLambdaArgument.getLambdaArgumentName(bindingContext: BindingContext): Name? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [65:94] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[ValueParameterDescriptorImpl]

'parent' @ [71:29] ==> public final val KtLambdaArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'oldCallExpression' @ [72:29] ==> val oldCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'copy' @ [72:47] ==> public open fun copy(): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaMethodDescriptor]

'KtPsiFactory' @ [74:22] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [74:35] ==> public final val KtLambdaArgument.project: Project[MyPropertyDescriptor]

'if (shouldLambdaParameterBeNamed(newCallExpression.getValueArgumentsInParentheses(), oldCallExpression)) {
        psiFactory.createArgument(replacement, functionLiteralArgumentName)
    }
    else {
        psiFactory.createArgument(replacement)
    }' @ [76:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtValueArgument, elseBranch: KtValueArgument): KtValueArgument[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtValueArgument

'shouldLambdaParameterBeNamed' @ [76:24] ==> private fun shouldLambdaParameterBeNamed(args: List<ValueArgument>, callExpr: KtCallExpression): Boolean defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'newCallExpression' @ [76:53] ==> val newCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'getValueArgumentsInParentheses' @ [76:71] ==> public fun KtCallElement.getValueArgumentsInParentheses(): List<ValueArgument> defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'oldCallExpression' @ [76:105] ==> val oldCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'psiFactory' @ [77:9] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'createArgument' @ [77:20] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'replacement' @ [77:35] ==> value-parameter replacement: KtExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[ValueParameterDescriptorImpl]

'functionLiteralArgumentName' @ [77:48] ==> value-parameter functionLiteralArgumentName: Name? defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[ValueParameterDescriptorImpl]

'psiFactory' @ [80:9] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'createArgument' @ [80:20] ==> public final fun createArgument(expression: KtExpression?, name: Name? = ..., isSpread: Boolean = ...): KtValueArgument defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'replacement' @ [80:35] ==> value-parameter replacement: KtExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[ValueParameterDescriptorImpl]

'newCallExpression' @ [83:35] ==> val newCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'lambdaArguments' @ [83:53] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'firstOrNull' @ [83:69] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.firstOrNull(): KtLambdaArgument? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'newCallExpression' @ [84:29] ==> val newCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'valueArgumentList' @ [84:47] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'psiFactory' @ [84:68] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'createCallArguments' @ [84:79] ==> public final fun createCallArguments(text: String): KtValueArgumentList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'valueArgumentList' @ [86:5] ==> val valueArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'addArgument' @ [86:23] ==> @NotNull public open fun addArgument(@NotNull p0: KtValueArgument): KtValueArgument defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'argument' @ [86:35] ==> val argument: KtValueArgument defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'functionLiteralArgument' @ [88:6] ==> val functionLiteralArgument: KtLambdaArgument defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'prevSibling' @ [88:30] ==> public final val KtLambdaArgument.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'delete' @ [88:62] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiWhiteSpace[JavaMethodDescriptor]

'if (newCallExpression.valueArgumentList != null) {
        functionLiteralArgument.delete()
    }
    else {
        functionLiteralArgument.replace(valueArgumentList)
    }' @ [89:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'newCallExpression' @ [89:9] ==> val newCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'valueArgumentList' @ [89:27] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'functionLiteralArgument' @ [90:9] ==> val functionLiteralArgument: KtLambdaArgument defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'delete' @ [90:33] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtLambdaArgument[JavaMethodDescriptor]

'functionLiteralArgument' @ [93:9] ==> val functionLiteralArgument: KtLambdaArgument defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'replace' @ [93:33] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtLambdaArgument[JavaMethodDescriptor]

'valueArgumentList' @ [93:41] ==> val valueArgumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'oldCallExpression' @ [95:12] ==> val oldCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'replace' @ [95:30] ==> public open fun replace(newElement: PsiElement): PsiElement defined in org.jetbrains.kotlin.psi.KtCallExpression[DeserializedSimpleFunctionDescriptor]

'newCallExpression' @ [95:38] ==> val newCallExpression: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveInsideParenthesesAndReplaceWith[LocalVariableDescriptor]

'args' @ [99:9] ==> value-parameter args: List<ValueArgument> defined in org.jetbrains.kotlin.idea.core.shouldLambdaParameterBeNamed[ValueParameterDescriptorImpl]

'any' @ [99:14] ==> public inline fun <T> Iterable<ValueArgument>.any(predicate: (ValueArgument) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'it' @ [99:20] ==> value-parameter it: ValueArgument defined in org.jetbrains.kotlin.idea.core.shouldLambdaParameterBeNamed.<anonymous>[ValueParameterDescriptorImpl]

'isNamed' @ [99:23] ==> public abstract fun isNamed(): Boolean defined in org.jetbrains.kotlin.psi.ValueArgument[DeserializedSimpleFunctionDescriptor]

'?:' @ [100:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtFunction?, right: KtFunction): KtFunction[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtFunction

'callExpr' @ [100:18] ==> value-parameter callExpr: KtCallExpression defined in org.jetbrains.kotlin.idea.core.shouldLambdaParameterBeNamed[ValueParameterDescriptorImpl]

'calleeExpression' @ [100:27] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'mainReference' @ [100:45] ==> public val KtElement.mainReference: KtReference? defined in org.jetbrains.kotlin.idea.references in file referenceUtil.kt[PropertyDescriptorImpl]

'resolve' @ [100:60] ==> @Nullable public abstract fun resolve(): PsiElement? defined in org.jetbrains.kotlin.idea.references.KtReference[JavaMethodDescriptor]

'if (calee.valueParameters.any { it.isVarArg }) true else calee.valueParameters.size - 1 > args.size' @ [101:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'calee' @ [101:16] ==> val calee: KtFunction defined in org.jetbrains.kotlin.idea.core.shouldLambdaParameterBeNamed[LocalVariableDescriptor]

'valueParameters' @ [101:22] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'any' @ [101:38] ==> public inline fun <T> Iterable<(KtParameter..KtParameter?)>.any(predicate: ((KtParameter..KtParameter?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtParameter..org.jetbrains.kotlin.psi.KtParameter?)

'it' @ [101:44] ==> value-parameter it: (KtParameter..KtParameter?) defined in org.jetbrains.kotlin.idea.core.shouldLambdaParameterBeNamed.<anonymous>[ValueParameterDescriptorImpl]

'isVarArg' @ [101:47] ==> public final val KtParameter.isVarArg: Boolean[MyPropertyDescriptor]

'calee' @ [101:69] ==> val calee: KtFunction defined in org.jetbrains.kotlin.idea.core.shouldLambdaParameterBeNamed[LocalVariableDescriptor]

'valueParameters' @ [101:75] ==> public final val KtFunction.valueParameters: (MutableList<(KtParameter..KtParameter?)>..List<(KtParameter..KtParameter?)>)[MyPropertyDescriptor]

'size' @ [101:91] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'args' @ [101:102] ==> value-parameter args: List<ValueArgument> defined in org.jetbrains.kotlin.idea.core.shouldLambdaParameterBeNamed[ValueParameterDescriptorImpl]

'size' @ [101:107] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'assert' @ [106:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'lambdaArguments' @ [106:12] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'isEmpty' @ [106:28] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'valueArgumentList' @ [107:24] ==> public final val KtCallExpression.valueArgumentList: KtValueArgumentList?[MyPropertyDescriptor]

'argumentList' @ [108:20] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'arguments' @ [108:33] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'last' @ [108:43] ==> public fun <T> List<(KtValueArgument..KtValueArgument?)>.last(): (KtValueArgument..KtValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtValueArgument..org.jetbrains.kotlin.psi.KtValueArgument?)

'argument' @ [109:22] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'getArgumentExpression' @ [109:31] ==> @IfNotParsed @Nullable public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'assert' @ [110:5] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'expression' @ [110:12] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'unpackFunctionLiteral' @ [110:23] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'KtPsiFactory' @ [112:21] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [112:34] ==> <this> defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[ReceiverParameterDescriptorImpl]

'createExpressionByPattern' @ [112:40] ==> public fun KtPsiFactory.createExpressionByPattern(pattern: String, vararg args: Any, reformat: Boolean = ...): KtExpression defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'expression' @ [112:82] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'dummyCall' @ [113:35] ==> val dummyCall: KtCallExpression defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'lambdaArguments' @ [113:45] ==> public final val KtCallExpression.lambdaArguments: (MutableList<(KtLambdaArgument..KtLambdaArgument?)>..List<(KtLambdaArgument..KtLambdaArgument?)>)[MyPropertyDescriptor]

'single' @ [113:61] ==> public fun <T> List<(KtLambdaArgument..KtLambdaArgument?)>.single(): (KtLambdaArgument..KtLambdaArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtLambdaArgument..org.jetbrains.kotlin.psi.KtLambdaArgument?)

'this' @ [114:5] ==> <this> defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[ReceiverParameterDescriptorImpl]

'add' @ [114:10] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaMethodDescriptor]

'functionLiteralArgument' @ [114:14] ==> val functionLiteralArgument: (KtLambdaArgument..KtLambdaArgument?) defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'if (argumentList.arguments.size == 1 && calleeExpression !is KtCallExpression) {
        argumentList.delete()
    }
    else {
        argumentList.removeArgument(argument)
    }' @ [116:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentList' @ [116:9] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'arguments' @ [116:22] ==> public final val KtValueArgumentList.arguments: (MutableList<(KtValueArgument..KtValueArgument?)>..List<(KtValueArgument..KtValueArgument?)>)[MyPropertyDescriptor]

'size' @ [116:32] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'calleeExpression' @ [116:45] ==> public final val KtCallExpression.calleeExpression: KtExpression?[MyPropertyDescriptor]

'argumentList' @ [117:9] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'delete' @ [117:22] ==> public open fun delete(): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'argumentList' @ [120:9] ==> val argumentList: KtValueArgumentList defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'removeArgument' @ [120:22] ==> public open fun removeArgument(@NotNull p0: KtValueArgument): Unit defined in org.jetbrains.kotlin.psi.KtValueArgumentList[JavaMethodDescriptor]

'argument' @ [120:37] ==> val argument: (KtValueArgument..KtValueArgument?) defined in org.jetbrains.kotlin.idea.core.moveFunctionLiteralOutsideParentheses[LocalVariableDescriptor]

'rBrace' @ [125:18] ==> public final val KtBlockExpression.rBrace: PsiElement?[MyPropertyDescriptor]

'KtPsiFactory' @ [126:19] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [126:32] ==> <this> defined in org.jetbrains.kotlin.idea.core.appendElement[ReceiverParameterDescriptorImpl]

'createNewLine' @ [126:38] ==> public final fun createNewLine(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'if (rBrace == null) {
        val lastChild = lastChild
        if (lastChild !is PsiWhiteSpace) addAfter(newLine, lastChild)!! else lastChild
    }
    else {
        rBrace.prevSibling!!
    }' @ [127:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'rBrace' @ [127:22] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'lastChild' @ [128:25] ==> public final val KtBlockExpression.lastChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'if (lastChild !is PsiWhiteSpace) addAfter(newLine, lastChild)!! else lastChild' @ [129:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'lastChild' @ [129:13] ==> val lastChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'addAfter' @ [129:42] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'newLine' @ [129:51] ==> val newLine: PsiElement defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'lastChild' @ [129:60] ==> val lastChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'lastChild' @ [129:78] ==> val lastChild: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'rBrace' @ [132:9] ==> val rBrace: PsiElement? defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'prevSibling' @ [132:16] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'addAfter' @ [134:24] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'element' @ [134:33] ==> value-parameter element: KtElement defined in org.jetbrains.kotlin.idea.core.appendElement[ValueParameterDescriptorImpl]

'anchor' @ [134:42] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'addNewLine' @ [135:9] ==> value-parameter addNewLine: Boolean = ... defined in org.jetbrains.kotlin.idea.core.appendElement[ValueParameterDescriptorImpl]

'addAfter' @ [136:9] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtBlockExpression[JavaMethodDescriptor]

'newLine' @ [136:18] ==> val newLine: PsiElement defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'addedElement' @ [136:27] ==> val addedElement: KtElement defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'addedElement' @ [138:12] ==> val addedElement: KtElement defined in org.jetbrains.kotlin.idea.core.appendElement[LocalVariableDescriptor]

'parent' @ [143:18] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'deleteElementWithDelimiters' @ [145:5] ==> private fun deleteElementWithDelimiters(element: PsiElement): Unit defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [145:33] ==> <this> defined in org.jetbrains.kotlin.idea.core.deleteElementAndCleanParent[ReceiverParameterDescriptorImpl]

'deleteChildlessElement' @ [146:5] ==> private fun <T : PsiElement> deleteChildlessElement(element: PsiElement, childClass: Class<out PsiElement>): Unit defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : PsiElement> -> Captured(out PsiElement)

'parent' @ [146:28] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.deleteElementAndCleanParent[LocalVariableDescriptor]

'this' @ [146:36] ==> <this> defined in org.jetbrains.kotlin.idea.core.deleteElementAndCleanParent[ReceiverParameterDescriptorImpl]

'java' @ [146:48] ==> public val <T> KClass<out PsiElement>.java: Class<out PsiElement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out PsiElement)

'==' @ [151:9] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Array[DeserializedSimpleFunctionDescriptor]

'getChildrenOfType' @ [151:21] ==> @Nullable public open fun <T : (PsiElement..PsiElement?)> getChildrenOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(T..T?)>): (Array<(T..T?)>?..Array<out (T..T?)>?) defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> T

'element' @ [151:42] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteChildlessElement[ValueParameterDescriptorImpl]

'childClass' @ [151:51] ==> value-parameter childClass: Class<T> defined in org.jetbrains.kotlin.idea.core.deleteChildlessElement[ValueParameterDescriptorImpl]

'element' @ [152:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteChildlessElement[ValueParameterDescriptorImpl]

'delete' @ [152:17] ==> public abstract fun delete(): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'getPrevSiblingOfType' @ [158:35] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getPrevSiblingOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(PsiElement..PsiElement?)>): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'element' @ [158:68] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'element' @ [158:77] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'javaClass' @ [158:85] ==> public val <T : Any> (PsiElement..PsiElement?).javaClass: Class<(PsiElement..PsiElement?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'if (paramBefore != null) {
        from = paramBefore.nextSibling
        to = element
    }
    else {
        val paramAfter = PsiTreeUtil.getNextSiblingOfType<PsiElement>(element, element.javaClass)

        from = element
        to = if (paramAfter != null) paramAfter.prevSibling else element
    }' @ [162:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'paramBefore' @ [162:9] ==> val paramBefore: PsiElement? defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'from' @ [163:9] ==> val from: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'paramBefore' @ [163:16] ==> val paramBefore: PsiElement? defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'nextSibling' @ [163:28] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'to' @ [164:9] ==> val to: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'element' @ [164:14] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'getNextSiblingOfType' @ [167:38] ==> @Nullable @Contract public open fun <T : (PsiElement..PsiElement?)> getNextSiblingOfType(@Nullable p0: PsiElement?, @NotNull p1: Class<(PsiElement..PsiElement?)>): PsiElement? defined in com.intellij.psi.util.PsiTreeUtil[JavaMethodDescriptor]
Inferred types:
    <T : (PsiElement..PsiElement?)> -> PsiElement

'element' @ [167:71] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'element' @ [167:80] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'javaClass' @ [167:88] ==> public val <T : Any> (PsiElement..PsiElement?).javaClass: Class<(PsiElement..PsiElement?)> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)

'from' @ [169:9] ==> val from: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'element' @ [169:16] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'to' @ [170:9] ==> val to: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'if (paramAfter != null) paramAfter.prevSibling else element' @ [170:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiElement, elseBranch: PsiElement): PsiElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiElement

'paramAfter' @ [170:18] ==> val paramAfter: PsiElement? defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'paramAfter' @ [170:38] ==> val paramAfter: PsiElement? defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'prevSibling' @ [170:49] ==> public final val PsiElement.prevSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'element' @ [170:66] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'element' @ [173:18] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[ValueParameterDescriptorImpl]

'parent' @ [173:26] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [175:5] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'deleteChildRange' @ [175:12] ==> public abstract fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in com.intellij.psi.PsiElement[JavaMethodDescriptor]

'from' @ [175:29] ==> val from: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'to' @ [175:35] ==> val to: PsiElement defined in org.jetbrains.kotlin.idea.core.deleteElementWithDelimiters[LocalVariableDescriptor]

'removeChild' @ [179:18] ==> public open fun removeChild(p0: (ASTNode..ASTNode?), @NotNull p1: ASTNode): Unit defined in com.intellij.psi.impl.source.codeStyle.CodeEditUtil[JavaMethodDescriptor]

'parent' @ [179:30] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'node' @ [179:38] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'node' @ [179:54] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'companionObjects' @ [183:5] ==> public final val KtClass.companionObjects: List<KtObjectDeclaration>[MyPropertyDescriptor]

'firstOrNull' @ [183:22] ==> public fun <T> List<KtObjectDeclaration>.firstOrNull(): KtObjectDeclaration? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtObjectDeclaration

'let' @ [183:37] ==> @InlineOnly public inline fun <T, R> KtObjectDeclaration.let(block: (KtObjectDeclaration) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtObjectDeclaration
    <R> -> Nothing

'it' @ [183:50] ==> value-parameter it: KtObjectDeclaration defined in org.jetbrains.kotlin.idea.core.getOrCreateCompanionObject.<anonymous>[ValueParameterDescriptorImpl]

'addDeclaration' @ [184:12] ==> public final inline fun <reified T : KtDeclaration> addDeclaration(declaration: KtObjectDeclaration): KtObjectDeclaration defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : KtDeclaration> -> KtObjectDeclaration

'KtPsiFactory' @ [184:27] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [184:40] ==> <this> defined in org.jetbrains.kotlin.idea.core.getOrCreateCompanionObject[ReceiverParameterDescriptorImpl]

'createCompanionObject' @ [184:46] ==> public final fun createCompanionObject(): KtObjectDeclaration defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'analyze' @ [188:26] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'this' @ [190:9] ==> <this> defined in org.jetbrains.kotlin.idea.core.toDescriptor[ReceiverParameterDescriptorImpl]

'this' @ [191:17] ==> <this> defined in org.jetbrains.kotlin.idea.core.toDescriptor[ReceiverParameterDescriptorImpl]

'getContainingClassOrObject' @ [191:22] ==> public open fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtPrimaryConstructor[DeserializedSimpleFunctionDescriptor]

'resolveToDescriptor' @ [191:51] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'unsubstitutedPrimaryConstructor' @ [191:93] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'bindingContext' @ [194:22] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.toDescriptor[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [194:52] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [194:79] ==> <this> defined in org.jetbrains.kotlin.idea.core.toDescriptor[ReceiverParameterDescriptorImpl]

'descriptor' @ [195:9] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.toDescriptor[LocalVariableDescriptor]

'bindingContext' @ [196:16] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.toDescriptor[LocalVariableDescriptor]

'VALUE_PARAMETER_AS_PROPERTY' @ [196:46] ==> public final val VALUE_PARAMETER_AS_PROPERTY: (WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>..WritableSlice<(ValueParameterDescriptor..ValueParameterDescriptor?), (PropertyDescriptor..PropertyDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'descriptor' @ [196:75] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.toDescriptor[LocalVariableDescriptor]

'descriptor' @ [198:12] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.idea.core.toDescriptor[LocalVariableDescriptor]

'this' @ [203:9] ==> <this> defined in org.jetbrains.kotlin.idea.core.setVisibility[ReceiverParameterDescriptorImpl]

'implicitVisibility' @ [204:40] ==> public fun KtDeclaration.implicitVisibility(): KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'visibilityModifier' @ [206:13] ==> value-parameter visibilityModifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.setVisibility[ValueParameterDescriptorImpl]

'defaultVisibilityKeyword' @ [206:35] ==> val defaultVisibilityKeyword: KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.core.setVisibility[LocalVariableDescriptor]

'this' @ [207:13] ==> <this> defined in org.jetbrains.kotlin.idea.core.setVisibility[ReceiverParameterDescriptorImpl]

'visibilityModifierType' @ [207:18] ==> public fun KtDeclaration.visibilityModifierType(): KtModifierKeywordToken? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'let' @ [207:44] ==> @InlineOnly public inline fun <T, R> KtModifierKeywordToken.let(block: (KtModifierKeywordToken) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtModifierKeywordToken
    <R> -> Unit

'removeModifier' @ [207:50] ==> public abstract fun removeModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'it' @ [207:65] ==> value-parameter it: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.setVisibility.<anonymous>[ValueParameterDescriptorImpl]

'addModifier' @ [212:5] ==> public abstract fun addModifier(@NotNull p0: KtModifierKeywordToken): Unit defined in org.jetbrains.kotlin.psi.KtModifierListOwner[JavaMethodDescriptor]

'visibilityModifier' @ [212:17] ==> value-parameter visibilityModifier: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.setVisibility[ValueParameterDescriptorImpl]

'when {
            this is KtConstructor<*> -> {
                val klass = getContainingClassOrObject()
                if (klass is KtClass && (klass.isEnum() || klass.isSealed())) KtTokens.PRIVATE_KEYWORD
                else KtTokens.DEFAULT_VISIBILITY_KEYWORD
            }
            hasModifier(KtTokens.OVERRIDE_KEYWORD) -> {
                (resolveToDescriptor(BodyResolveMode.PARTIAL) as? CallableMemberDescriptor)
                        ?.overriddenDescriptors
                        ?.let { OverridingUtil.findMaxVisibility(it) }
                        ?.toKeywordToken()
            }
            else -> {
                KtTokens.DEFAULT_VISIBILITY_KEYWORD
            }
        }' @ [216:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtModifierKeywordToken?, entry1: KtModifierKeywordToken?, entry2: KtModifierKeywordToken?): KtModifierKeywordToken?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtModifierKeywordToken?

'this' @ [217:13] ==> <this> defined in org.jetbrains.kotlin.idea.core.implicitVisibility[ReceiverParameterDescriptorImpl]

'getContainingClassOrObject' @ [218:29] ==> public abstract fun getContainingClassOrObject(): KtClassOrObject defined in org.jetbrains.kotlin.psi.KtConstructor[DeserializedSimpleFunctionDescriptor]

'if (klass is KtClass && (klass.isEnum() || klass.isSealed())) KtTokens.PRIVATE_KEYWORD
                else KtTokens.DEFAULT_VISIBILITY_KEYWORD' @ [219:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (KtModifierKeywordToken..KtModifierKeywordToken?), elseBranch: (KtModifierKeywordToken..KtModifierKeywordToken?)): (KtModifierKeywordToken..KtModifierKeywordToken?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.lexer.KtModifierKeywordToken..org.jetbrains.kotlin.lexer.KtModifierKeywordToken?)

'klass' @ [219:21] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.implicitVisibility[LocalVariableDescriptor]

'klass' @ [219:42] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.implicitVisibility[LocalVariableDescriptor]

'isEnum' @ [219:48] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'klass' @ [219:60] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.implicitVisibility[LocalVariableDescriptor]

'isSealed' @ [219:66] ==> public final fun isSealed(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'PRIVATE_KEYWORD' @ [219:88] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DEFAULT_VISIBILITY_KEYWORD' @ [220:31] ==> public final val DEFAULT_VISIBILITY_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasModifier' @ [222:13] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [222:34] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'resolveToDescriptor' @ [223:18] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [223:54] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'overriddenDescriptors' @ [224:27] ==> public final var CallableMemberDescriptor.overriddenDescriptors: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)[MyPropertyDescriptor]

'let' @ [225:27] ==> @InlineOnly public inline fun <T, R> (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>).let(block: ((MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)) -> Visibility?): Visibility? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableCollection<out (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>..kotlin.collections.Collection<(org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)>)
    <R> -> Visibility?

'findMaxVisibility' @ [225:48] ==> @Nullable public open fun findMaxVisibility(@NotNull p0: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>)): Visibility? defined in org.jetbrains.kotlin.resolve.OverridingUtil[JavaMethodDescriptor]

'it' @ [225:66] ==> value-parameter it: (MutableCollection<out (CallableMemberDescriptor..CallableMemberDescriptor?)>..Collection<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.idea.core.implicitVisibility.<anonymous>[ValueParameterDescriptorImpl]

'toKeywordToken' @ [226:27] ==> public fun Visibility.toKeywordToken(): KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'DEFAULT_VISIBILITY_KEYWORD' @ [229:26] ==> public final val DEFAULT_VISIBILITY_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'modifierList' @ [233:42] ==> public final val KtModifierListOwner.modifierList: KtModifierList?[MyPropertyDescriptor]

'hasModifier' @ [233:56] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtModifierList[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [233:77] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'this' @ [236:18] ==> <this> defined in org.jetbrains.kotlin.idea.core.canBeProtected[ReceiverParameterDescriptorImpl]

'parent' @ [236:23] ==> public final val KtModifierListOwner.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (parent) {
        is KtClassBody -> parent.parent is KtClass
        is KtParameterList -> parent.parent is KtPrimaryConstructor
        else -> false
    }' @ [237:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean, entry2: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'parent' @ [237:18] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.canBeProtected[LocalVariableDescriptor]

'parent' @ [238:27] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.canBeProtected[LocalVariableDescriptor]

'parent' @ [238:34] ==> public final val KtClassBody.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [239:31] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.canBeProtected[LocalVariableDescriptor]

'parent' @ [239:38] ==> public final val KtParameterList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'when (getModalityFromDescriptor()) {
        KtTokens.ABSTRACT_KEYWORD, KtTokens.OPEN_KEYWORD, KtTokens.SEALED_KEYWORD -> true
        else -> false
    }' @ [245:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'getModalityFromDescriptor' @ [245:18] ==> public fun KtDeclaration.getModalityFromDescriptor(): KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'ABSTRACT_KEYWORD' @ [246:18] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [246:45] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SEALED_KEYWORD' @ [246:68] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'parent' @ [252:18] ==> public final val KtDeclaration.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'!' @ [253:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parent' @ [253:11] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'parent' @ [253:36] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'if (parent.parent is KtPrimaryConstructor)
        parent.parent.parent as? KtClass
    else
        parent.parent as? KtClass' @ [255:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtClass?, elseBranch: KtClass?): KtClass?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtClass?

'parent' @ [255:21] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'parent' @ [255:28] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [256:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'parent' @ [256:16] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [256:23] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [258:9] ==> val parent: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'parent' @ [258:16] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'klass' @ [260:9] ==> val klass: KtClass? defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'!' @ [260:27] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [260:28] ==> val klass: KtClass? defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'isInheritable' @ [260:34] ==> public fun KtClass.isInheritable(): Boolean defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'!' @ [260:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'klass' @ [260:54] ==> val klass: KtClass? defined in org.jetbrains.kotlin.idea.core.isOverridable[LocalVariableDescriptor]

'isEnum' @ [260:60] ==> public final fun isEnum(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'this' @ [262:9] ==> <this> defined in org.jetbrains.kotlin.idea.core.isOverridable[ReceiverParameterDescriptorImpl]

'hasModifier' @ [262:14] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [262:35] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (getModalityFromDescriptor()) {
        KtTokens.ABSTRACT_KEYWORD, KtTokens.OPEN_KEYWORD -> true
        else -> false
    }' @ [267:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'getModalityFromDescriptor' @ [267:18] ==> public fun KtDeclaration.getModalityFromDescriptor(): KtModifierKeywordToken? defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'ABSTRACT_KEYWORD' @ [268:18] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [268:45] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'this' @ [274:22] ==> <this> defined in org.jetbrains.kotlin.idea.core.getModalityFromDescriptor[ReceiverParameterDescriptorImpl]

'resolveToDescriptor' @ [274:27] ==> public fun KtDeclaration.resolveToDescriptor(bodyResolveMode: BodyResolveMode = ...): DeclarationDescriptor defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [274:63] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'descriptor' @ [275:9] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.getModalityFromDescriptor[LocalVariableDescriptor]

'mapModality' @ [276:16] ==> public fun mapModality(accurateModality: Modality): KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'descriptor' @ [276:28] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.getModalityFromDescriptor[LocalVariableDescriptor]

'modality' @ [276:39] ==> public final val MemberDescriptor.modality: Modality[MyPropertyDescriptor]

'predictImplicitModality' @ [283:29] ==> private fun KtDeclaration.predictImplicitModality(): KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'analyze' @ [284:26] ==> @JvmOverloads public fun KtElement.analyze(bodyResolveMode: BodyResolveMode = ...): BindingContext defined in org.jetbrains.kotlin.idea.caches.resolve[DeserializedSimpleFunctionDescriptor]

'PARTIAL' @ [284:50] ==> enum entry PARTIAL defined in org.jetbrains.kotlin.resolve.lazy.BodyResolveMode[FakeCallableDescriptorForObject]

'bindingContext' @ [285:22] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'DECLARATION_TO_DESCRIPTOR' @ [285:52] ==> public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [285:79] ==> <this> defined in org.jetbrains.kotlin.idea.core.implicitModality[ReceiverParameterDescriptorImpl]

'predictedModality' @ [285:95] ==> var predictedModality: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'descriptor' @ [286:32] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'containingDeclaration' @ [286:43] ==> public final val DeclarationDescriptor.containingDeclaration: DeclarationDescriptor?[MyPropertyDescriptor]

'predictedModality' @ [286:75] ==> var predictedModality: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'DeclarationAttributeAltererExtension' @ [288:22] ==> public companion object : ProjectExtensionDescriptor<DeclarationAttributeAltererExtension> defined in org.jetbrains.kotlin.extensions.DeclarationAttributeAltererExtension[FakeCallableDescriptorForObject]

'getInstances' @ [288:59] ==> public final fun getInstances(project: Project): List<DeclarationAttributeAltererExtension> defined in org.jetbrains.kotlin.extensions.DeclarationAttributeAltererExtension.Companion[DeserializedSimpleFunctionDescriptor]

'this' @ [288:72] ==> <this> defined in org.jetbrains.kotlin.idea.core.implicitModality[ReceiverParameterDescriptorImpl]

'project' @ [288:77] ==> public final val KtDeclaration.project: Project[MyPropertyDescriptor]

'extensions' @ [289:23] ==> val extensions: List<DeclarationAttributeAltererExtension> defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'extension' @ [290:27] ==> val extension: DeclarationAttributeAltererExtension defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'refineDeclarationModality' @ [290:37] ==> public open fun refineDeclarationModality(modifierListOwner: KtModifierListOwner, declaration: DeclarationDescriptor?, containingDeclaration: DeclarationDescriptor?, currentModality: Modality, bindingContext: BindingContext, isImplicitModality: Boolean): Modality? defined in org.jetbrains.kotlin.extensions.DeclarationAttributeAltererExtension[DeserializedSimpleFunctionDescriptor]

'this' @ [291:17] ==> <this> defined in org.jetbrains.kotlin.idea.core.implicitModality[ReceiverParameterDescriptorImpl]

'descriptor' @ [292:17] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'containingDescriptor' @ [293:17] ==> val containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'mapModalityToken' @ [294:17] ==> private fun mapModalityToken(modalityToken: IElementType): Modality defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'predictedModality' @ [294:34] ==> var predictedModality: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'bindingContext' @ [295:17] ==> val bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'newModality' @ [298:13] ==> val newModality: Modality? defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'predictedModality' @ [299:13] ==> var predictedModality: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'mapModality' @ [299:33] ==> public fun mapModality(accurateModality: Modality): KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'newModality' @ [299:45] ==> val newModality: Modality? defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'predictedModality' @ [303:12] ==> var predictedModality: KtModifierKeywordToken defined in org.jetbrains.kotlin.idea.core.implicitModality[LocalVariableDescriptor]

'when (accurateModality) {
    Modality.FINAL -> KtTokens.FINAL_KEYWORD
    Modality.SEALED -> KtTokens.SEALED_KEYWORD
    Modality.OPEN -> KtTokens.OPEN_KEYWORD
    Modality.ABSTRACT -> KtTokens.ABSTRACT_KEYWORD
}' @ [306:71] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtModifierKeywordToken, entry1: KtModifierKeywordToken, entry2: KtModifierKeywordToken, entry3: KtModifierKeywordToken): KtModifierKeywordToken[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtModifierKeywordToken

'accurateModality' @ [306:77] ==> value-parameter accurateModality: Modality defined in org.jetbrains.kotlin.idea.core.mapModality[ValueParameterDescriptorImpl]

'Modality' @ [307:5] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL' @ [307:14] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'FINAL_KEYWORD' @ [307:32] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Modality' @ [308:5] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [308:14] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED_KEYWORD' @ [308:33] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Modality' @ [309:5] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN' @ [309:14] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN_KEYWORD' @ [309:31] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Modality' @ [310:5] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [310:14] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT_KEYWORD' @ [310:35] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'when (modalityToken) {
    KtTokens.FINAL_KEYWORD -> Modality.FINAL
    KtTokens.SEALED_KEYWORD -> Modality.SEALED
    KtTokens.OPEN_KEYWORD -> Modality.OPEN
    KtTokens.ABSTRACT_KEYWORD -> Modality.ABSTRACT
    else -> error("Unexpected modality keyword $modalityToken")
}' @ [313:71] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Modality, entry1: Modality, entry2: Modality, entry3: Modality, entry4: Modality): Modality[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Modality

'modalityToken' @ [313:77] ==> value-parameter modalityToken: IElementType defined in org.jetbrains.kotlin.idea.core.mapModalityToken[ValueParameterDescriptorImpl]

'FINAL_KEYWORD' @ [314:14] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL' @ [314:40] ==> enum entry FINAL defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED_KEYWORD' @ [315:14] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SEALED' @ [315:41] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'OPEN_KEYWORD' @ [316:14] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN' @ [316:39] ==> enum entry OPEN defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT_KEYWORD' @ [317:14] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ABSTRACT' @ [317:43] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'error' @ [318:13] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'modalityToken' @ [318:49] ==> value-parameter modalityToken: IElementType defined in org.jetbrains.kotlin.idea.core.mapModalityToken[ValueParameterDescriptorImpl]

'this' @ [322:9] ==> <this> defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[ReceiverParameterDescriptorImpl]

'this' @ [323:13] ==> <this> defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[ReceiverParameterDescriptorImpl]

'this' @ [323:32] ==> <this> defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[ReceiverParameterDescriptorImpl]

'isInterface' @ [323:37] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'ABSTRACT_KEYWORD' @ [323:68] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL_KEYWORD' @ [324:25] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'containingClassOrObject' @ [326:17] ==> public val KtDeclaration.containingClassOrObject: KtClassOrObject? defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'FINAL_KEYWORD' @ [326:60] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'hasModifier' @ [327:9] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'OVERRIDE_KEYWORD' @ [327:30] ==> public final val OVERRIDE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'klass' @ [328:13] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[LocalVariableDescriptor]

'hasModifier' @ [328:19] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'ABSTRACT_KEYWORD' @ [328:40] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'klass' @ [329:13] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[LocalVariableDescriptor]

'hasModifier' @ [329:19] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'OPEN_KEYWORD' @ [329:40] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'klass' @ [330:13] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[LocalVariableDescriptor]

'hasModifier' @ [330:19] ==> public open fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtClassOrObject[JavaMethodDescriptor]

'SEALED_KEYWORD' @ [330:40] ==> public final val SEALED_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OPEN_KEYWORD' @ [331:29] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'klass' @ [334:9] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[LocalVariableDescriptor]

'klass' @ [334:29] ==> val klass: KtClassOrObject defined in org.jetbrains.kotlin.idea.core.predictImplicitModality[LocalVariableDescriptor]

'isInterface' @ [334:35] ==> public final fun isInterface(): Boolean defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'!' @ [334:52] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasModifier' @ [334:53] ==> public abstract fun hasModifier(@NotNull p0: KtModifierKeywordToken): Boolean defined in org.jetbrains.kotlin.psi.KtDeclaration[JavaMethodDescriptor]

'PRIVATE_KEYWORD' @ [334:74] ==> public final val PRIVATE_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'if (hasBody()) KtTokens.OPEN_KEYWORD else KtTokens.ABSTRACT_KEYWORD' @ [335:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtModifierKeywordToken, elseBranch: KtModifierKeywordToken): KtModifierKeywordToken[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtModifierKeywordToken

'hasBody' @ [335:20] ==> public fun KtDeclaration.hasBody(): Boolean defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedSimpleFunctionDescriptor]

'OPEN_KEYWORD' @ [335:40] ==> public final val OPEN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ABSTRACT_KEYWORD' @ [335:67] ==> public final val ABSTRACT_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'FINAL_KEYWORD' @ [337:21] ==> public final val FINAL_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'bodyExpression' @ [341:5] ==> public final val KtSecondaryConstructor.bodyExpression: KtBlockExpression?[MyPropertyDescriptor]

'let' @ [341:21] ==> @InlineOnly public inline fun <T, R> KtBlockExpression.let(block: (KtBlockExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtBlockExpression
    <R> -> Nothing

'it' @ [341:34] ==> value-parameter it: KtBlockExpression defined in org.jetbrains.kotlin.idea.core.getOrCreateBody.<anonymous>[ValueParameterDescriptorImpl]

'getDelegationCall' @ [343:26] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'if (delegationCall.isImplicit) valueParameterList else delegationCall' @ [344:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: NavigatablePsiElement?, elseBranch: NavigatablePsiElement?): NavigatablePsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> NavigatablePsiElement?

'delegationCall' @ [344:22] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.core.getOrCreateBody[LocalVariableDescriptor]

'isImplicit' @ [344:37] ==> public final val KtConstructorDelegationCall.isImplicit: Boolean[MyPropertyDescriptor]

'valueParameterList' @ [344:49] ==> public final val KtSecondaryConstructor.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'delegationCall' @ [344:73] ==> val delegationCall: KtConstructorDelegationCall defined in org.jetbrains.kotlin.idea.core.getOrCreateBody[LocalVariableDescriptor]

'KtPsiFactory' @ [345:19] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [345:32] ==> <this> defined in org.jetbrains.kotlin.idea.core.getOrCreateBody[ReceiverParameterDescriptorImpl]

'createEmptyBody' @ [345:38] ==> public final fun createEmptyBody(): KtBlockExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'addAfter' @ [346:12] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[JavaMethodDescriptor]

'newBody' @ [346:21] ==> val newBody: KtBlockExpression defined in org.jetbrains.kotlin.idea.core.getOrCreateBody[LocalVariableDescriptor]

'anchor' @ [346:30] ==> val anchor: NavigatablePsiElement? defined in org.jetbrains.kotlin.idea.core.getOrCreateBody[LocalVariableDescriptor]

'equalsToken' @ [350:16] ==> public final val KtParameter.equalsToken: PsiElement?[MyPropertyDescriptor]

'defaultValue' @ [351:14] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'from' @ [351:30] ==> val from: PsiElement defined in org.jetbrains.kotlin.idea.core.dropDefaultValue[LocalVariableDescriptor]

'deleteChildRange' @ [352:5] ==> public open fun deleteChildRange(p0: (PsiElement..PsiElement?), p1: (PsiElement..PsiElement?)): Unit defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'from' @ [352:22] ==> val from: PsiElement defined in org.jetbrains.kotlin.idea.core.dropDefaultValue[LocalVariableDescriptor]

'to' @ [352:28] ==> val to: PsiElement defined in org.jetbrains.kotlin.idea.core.dropDefaultValue[LocalVariableDescriptor]

'expression' @ [356:18] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.core.dropEnclosingParenthesesIfPossible[ValueParameterDescriptorImpl]

'parent' @ [356:29] ==> public final val KtExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'expression' @ [356:76] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.core.dropEnclosingParenthesesIfPossible[ValueParameterDescriptorImpl]

'!' @ [357:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'areParenthesesUseless' @ [357:20] ==> public open fun areParenthesesUseless(@NotNull p0: KtParenthesizedExpression): Boolean defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'parent' @ [357:42] ==> val parent: KtParenthesizedExpression defined in org.jetbrains.kotlin.idea.core.dropEnclosingParenthesesIfPossible[LocalVariableDescriptor]

'expression' @ [357:58] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.core.dropEnclosingParenthesesIfPossible[ValueParameterDescriptorImpl]

'parent' @ [358:12] ==> val parent: KtParenthesizedExpression defined in org.jetbrains.kotlin.idea.core.dropEnclosingParenthesesIfPossible[LocalVariableDescriptor]

'replaced' @ [358:19] ==> @Suppress public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'expression' @ [358:28] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.idea.core.dropEnclosingParenthesesIfPossible[ValueParameterDescriptorImpl]

'typeParameterList' @ [362:5] ==> public final val KtTypeParameterListOwner.typeParameterList: KtTypeParameterList?[MyPropertyDescriptor]

'let' @ [362:24] ==> @InlineOnly public inline fun <T, R> KtTypeParameterList.let(block: (KtTypeParameterList) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeParameterList
    <R> -> Nothing

'it' @ [362:37] ==> value-parameter it: KtTypeParameterList defined in org.jetbrains.kotlin.idea.core.addTypeParameter.<anonymous>[ValueParameterDescriptorImpl]

'addParameter' @ [362:40] ==> @NotNull public open fun addParameter(@NotNull p0: KtTypeParameter): KtTypeParameter defined in org.jetbrains.kotlin.psi.KtTypeParameterList[JavaMethodDescriptor]

'typeParameter' @ [362:53] ==> value-parameter typeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.core.addTypeParameter[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [364:16] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [364:29] ==> <this> defined in org.jetbrains.kotlin.idea.core.addTypeParameter[ReceiverParameterDescriptorImpl]

'createTypeParameterList' @ [364:35] ==> public final fun createTypeParameterList(text: String): KtTypeParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'list' @ [365:5] ==> val list: KtTypeParameterList defined in org.jetbrains.kotlin.idea.core.addTypeParameter[LocalVariableDescriptor]

'parameters' @ [365:10] ==> public final val KtTypeParameterList.parameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'replace' @ [365:24] ==> public open fun replace(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeParameter[JavaMethodDescriptor]

'typeParameter' @ [365:32] ==> value-parameter typeParameter: KtTypeParameter defined in org.jetbrains.kotlin.idea.core.addTypeParameter[ValueParameterDescriptorImpl]

'when (this) {
                         is KtClass -> nameIdentifier ?: getClassOrInterfaceKeyword()
                         is KtNamedFunction -> funKeyword
                         is KtProperty -> valOrVarKeyword
                         else -> null
                     }' @ [366:22] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiElement?, entry1: PsiElement?, entry2: PsiElement?, entry3: PsiElement?): PsiElement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiElement?

'this' @ [366:28] ==> <this> defined in org.jetbrains.kotlin.idea.core.addTypeParameter[ReceiverParameterDescriptorImpl]

'nameIdentifier' @ [367:40] ==> public final val KtClass.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'getClassOrInterfaceKeyword' @ [367:58] ==> public final fun getClassOrInterfaceKeyword(): PsiElement? defined in org.jetbrains.kotlin.psi.KtClass[DeserializedSimpleFunctionDescriptor]

'funKeyword' @ [368:48] ==> public final val KtNamedFunction.funKeyword: PsiElement?[MyPropertyDescriptor]

'valOrVarKeyword' @ [369:43] ==> public final val KtProperty.valOrVarKeyword: PsiElement[MyPropertyDescriptor]

'addAfter' @ [372:13] ==> public abstract fun addAfter(@NotNull p0: PsiElement, @Nullable p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtTypeParameterListOwner[JavaMethodDescriptor]

'list' @ [372:22] ==> val list: KtTypeParameterList defined in org.jetbrains.kotlin.idea.core.addTypeParameter[LocalVariableDescriptor]

'leftAnchor' @ [372:28] ==> val leftAnchor: PsiElement defined in org.jetbrains.kotlin.idea.core.addTypeParameter[LocalVariableDescriptor]

'parameters' @ [372:64] ==> public final val KtTypeParameterList.parameters: (MutableList<(KtTypeParameter..KtTypeParameter?)>..List<(KtTypeParameter..KtTypeParameter?)>)[MyPropertyDescriptor]

'first' @ [372:75] ==> public fun <T> List<(KtTypeParameter..KtTypeParameter?)>.first(): (KtTypeParameter..KtTypeParameter?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeParameter..org.jetbrains.kotlin.psi.KtTypeParameter?)

'valueParameterList' @ [376:5] ==> public final val KtNamedFunction.valueParameterList: KtParameterList?[MyPropertyDescriptor]

'let' @ [376:25] ==> @InlineOnly public inline fun <T, R> KtParameterList.let(block: (KtParameterList) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtParameterList
    <R> -> Nothing

'it' @ [376:38] ==> value-parameter it: KtParameterList defined in org.jetbrains.kotlin.idea.core.getOrCreateValueParameterList.<anonymous>[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [377:25] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [377:38] ==> <this> defined in org.jetbrains.kotlin.idea.core.getOrCreateValueParameterList[ReceiverParameterDescriptorImpl]

'createParameterList' @ [377:44] ==> public final fun createParameterList(text: String): KtParameterList defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'nameIdentifier' @ [378:18] ==> public final val KtNamedFunction.nameIdentifier: PsiElement?[MyPropertyDescriptor]

'funKeyword' @ [378:36] ==> public final val KtNamedFunction.funKeyword: PsiElement?[MyPropertyDescriptor]

'addAfter' @ [379:12] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtNamedFunction[JavaMethodDescriptor]

'parameterList' @ [379:21] ==> val parameterList: KtParameterList defined in org.jetbrains.kotlin.idea.core.getOrCreateValueParameterList[LocalVariableDescriptor]

'anchor' @ [379:36] ==> val anchor: PsiElement defined in org.jetbrains.kotlin.idea.core.getOrCreateValueParameterList[LocalVariableDescriptor]

'type' @ [383:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.setType[ValueParameterDescriptorImpl]

'isError' @ [383:14] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'setType' @ [384:5] ==> public fun KtCallableDeclaration.setType(typeString: String, shortenReferences: Boolean = ...): Unit defined in org.jetbrains.kotlin.idea.core in file psiModificationUtils.kt[SimpleFunctionDescriptorImpl]

'SOURCE_CODE' @ [384:36] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [384:48] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [384:59] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.setType[ValueParameterDescriptorImpl]

'shortenReferences' @ [384:66] ==> value-parameter shortenReferences: Boolean = ... defined in org.jetbrains.kotlin.idea.core.setType[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [388:25] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [388:38] ==> public final val KtCallableDeclaration.project: Project[MyPropertyDescriptor]

'createType' @ [388:47] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'typeString' @ [388:58] ==> value-parameter typeString: String defined in org.jetbrains.kotlin.idea.core.setType[ValueParameterDescriptorImpl]

'setTypeReference' @ [389:5] ==> @Nullable public abstract fun setTypeReference(@Nullable p0: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'typeReference' @ [389:22] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.core.setType[LocalVariableDescriptor]

'shortenReferences' @ [390:9] ==> value-parameter shortenReferences: Boolean = ... defined in org.jetbrains.kotlin.idea.core.setType[ValueParameterDescriptorImpl]

'ShortenReferences' @ [391:9] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [391:27] ==> @JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[PropertyDescriptorImpl]

'process' @ [391:35] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'getTypeReference' @ [391:43] ==> @Nullable public abstract fun getTypeReference(): KtTypeReference? defined in org.jetbrains.kotlin.psi.KtCallableDeclaration[JavaMethodDescriptor]

'type' @ [396:9] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.setReceiverType[ValueParameterDescriptorImpl]

'isError' @ [396:14] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'KtPsiFactory' @ [397:25] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [397:38] ==> public final val KtCallableDeclaration.project: Project[MyPropertyDescriptor]

'createType' @ [397:47] ==> public final fun createType(type: String): KtTypeReference defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'SOURCE_CODE' @ [397:81] ==> @field:JvmField public final val SOURCE_CODE: DescriptorRenderer defined in org.jetbrains.kotlin.idea.util.IdeDescriptorRenderers[DeserializedPropertyDescriptor]

'renderType' @ [397:93] ==> public abstract fun renderType(type: KotlinType): String defined in org.jetbrains.kotlin.renderer.DescriptorRenderer[DeserializedSimpleFunctionDescriptor]

'type' @ [397:104] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.setReceiverType[ValueParameterDescriptorImpl]

'setReceiverTypeReference' @ [398:5] ==> public fun KtCallableDeclaration.setReceiverTypeReference(typeRef: KtTypeReference?): KtTypeReference? defined in org.jetbrains.kotlin.psi.typeRefHelpers[DeserializedSimpleFunctionDescriptor]

'typeReference' @ [398:30] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.idea.core.setReceiverType[LocalVariableDescriptor]

'ShortenReferences' @ [399:5] ==> public companion object defined in org.jetbrains.kotlin.idea.core.ShortenReferences[FakeCallableDescriptorForObject]

'DEFAULT' @ [399:23] ==> @JvmField public final val DEFAULT: ShortenReferences defined in org.jetbrains.kotlin.idea.core.ShortenReferences.Companion[PropertyDescriptorImpl]

'process' @ [399:31] ==> @JvmOverloads public final fun process(element: KtElement, elementFilter: (PsiElement) -> ShortenReferences.FilterResult = ...): KtElement defined in org.jetbrains.kotlin.idea.core.ShortenReferences[SimpleFunctionDescriptorImpl]

'receiverTypeReference' @ [399:39] ==> public final val KtCallableDeclaration.receiverTypeReference: KtTypeReference?[MyPropertyDescriptor]

'defaultValue' @ [403:5] ==> public final val KtParameter.defaultValue: KtExpression?[MyPropertyDescriptor]

'let' @ [403:19] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Nothing

'it' @ [403:32] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.idea.core.setDefaultValue.<anonymous>[ValueParameterDescriptorImpl]

'replaced' @ [403:35] ==> @Suppress public inline fun <reified T : PsiElement> PsiElement.replaced(newElement: KtExpression): KtExpression defined in org.jetbrains.kotlin.idea.core[SimpleFunctionDescriptorImpl]
Inferred types:
    <reified T : PsiElement> -> KtExpression

'newDefaultValue' @ [403:44] ==> value-parameter newDefaultValue: KtExpression defined in org.jetbrains.kotlin.idea.core.setDefaultValue[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [405:22] ==> @JvmOverloads public fun KtPsiFactory(elementForProject: PsiElement, markGenerated: Boolean = ...): KtPsiFactory defined in org.jetbrains.kotlin.psi[DeserializedSimpleFunctionDescriptor]

'this' @ [405:35] ==> <this> defined in org.jetbrains.kotlin.idea.core.setDefaultValue[ReceiverParameterDescriptorImpl]

'equalsToken' @ [406:14] ==> public final val KtParameter.equalsToken: PsiElement?[MyPropertyDescriptor]

'add' @ [406:29] ==> public open fun add(@NotNull p0: PsiElement): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'psiFactory' @ [406:33] ==> val psiFactory: KtPsiFactory defined in org.jetbrains.kotlin.idea.core.setDefaultValue[LocalVariableDescriptor]

'createEQ' @ [406:44] ==> public final fun createEQ(): PsiElement defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'addAfter' @ [407:12] ==> public open fun addAfter(@NotNull p0: PsiElement, p1: PsiElement?): (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.psi.KtParameter[JavaMethodDescriptor]

'newDefaultValue' @ [407:21] ==> value-parameter newDefaultValue: KtExpression defined in org.jetbrains.kotlin.idea.core.setDefaultValue[ValueParameterDescriptorImpl]

'eq' @ [407:38] ==> val eq: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.idea.core.setDefaultValue[LocalVariableDescriptor]

