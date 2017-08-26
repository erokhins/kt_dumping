'KtValueArgument' @ [21:41] ==> public constructor KtValueArgument(@NotNull node: ASTNode) defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaClassConstructorDescriptor]

'node' @ [21:57] ==> value-parameter node: ASTNode defined in org.jetbrains.kotlin.psi.KtLambdaArgument.<init>[ValueParameterDescriptorImpl]

'super' @ [23:44] ==> <this> defined in org.jetbrains.kotlin.psi.KtLambdaArgument[LazyClassReceiverParameterDescriptor]

'getArgumentExpression' @ [23:50] ==> @Override @Nullable @IfNotParsed public open fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.KtValueArgument[JavaMethodDescriptor]

'getArgumentExpression' @ [25:62] ==> public open fun getArgumentExpression(): KtExpression defined in org.jetbrains.kotlin.psi.KtLambdaArgument[SimpleFunctionDescriptorImpl]

'unpackFunctionLiteral' @ [25:86] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi in file KtLambdaArgument.kt[SimpleFunctionDescriptorImpl]

'when (this) {
        is KtLambdaExpression -> this
        is KtLabeledExpression -> baseExpression?.unpackFunctionLiteral(allowParentheses)
        is KtAnnotatedExpression -> baseExpression?.unpackFunctionLiteral(allowParentheses)
        is KtParenthesizedExpression -> if (allowParentheses) expression?.unpackFunctionLiteral(allowParentheses) else null
        else -> null
    }' @ [29:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtLambdaExpression?, entry1: KtLambdaExpression?, entry2: KtLambdaExpression?, entry3: KtLambdaExpression?, entry4: KtLambdaExpression?): KtLambdaExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtLambdaExpression?

'this' @ [29:18] ==> <this> defined in org.jetbrains.kotlin.psi.unpackFunctionLiteral[ReceiverParameterDescriptorImpl]

'this' @ [30:34] ==> <this> defined in org.jetbrains.kotlin.psi.unpackFunctionLiteral[ReceiverParameterDescriptorImpl]

'baseExpression' @ [31:35] ==> public final val baseExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtLabeledExpression[PropertyDescriptorImpl]

'unpackFunctionLiteral' @ [31:51] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi in file KtLambdaArgument.kt[SimpleFunctionDescriptorImpl]

'allowParentheses' @ [31:73] ==> value-parameter allowParentheses: Boolean = ... defined in org.jetbrains.kotlin.psi.unpackFunctionLiteral[ValueParameterDescriptorImpl]

'baseExpression' @ [32:37] ==> public final val KtAnnotatedExpression.baseExpression: KtExpression?[MyPropertyDescriptor]

'unpackFunctionLiteral' @ [32:53] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi in file KtLambdaArgument.kt[SimpleFunctionDescriptorImpl]

'allowParentheses' @ [32:75] ==> value-parameter allowParentheses: Boolean = ... defined in org.jetbrains.kotlin.psi.unpackFunctionLiteral[ValueParameterDescriptorImpl]

'if (allowParentheses) expression?.unpackFunctionLiteral(allowParentheses) else null' @ [33:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtLambdaExpression?, elseBranch: KtLambdaExpression?): KtLambdaExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtLambdaExpression?

'allowParentheses' @ [33:45] ==> value-parameter allowParentheses: Boolean = ... defined in org.jetbrains.kotlin.psi.unpackFunctionLiteral[ValueParameterDescriptorImpl]

'expression' @ [33:63] ==> public final val KtParenthesizedExpression.expression: KtExpression?[MyPropertyDescriptor]

'unpackFunctionLiteral' @ [33:75] ==> public fun KtExpression.unpackFunctionLiteral(allowParentheses: Boolean = ...): KtLambdaExpression? defined in org.jetbrains.kotlin.psi in file KtLambdaArgument.kt[SimpleFunctionDescriptorImpl]

'allowParentheses' @ [33:97] ==> value-parameter allowParentheses: Boolean = ... defined in org.jetbrains.kotlin.psi.unpackFunctionLiteral[ValueParameterDescriptorImpl]

