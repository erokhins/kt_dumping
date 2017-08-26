'KtVisitorVoid' @ [24:68] ==> public constructor KtVisitorVoid() defined in org.jetbrains.kotlin.psi.KtVisitorVoid[JavaClassConstructorDescriptor]

'mutableSetOf' @ [25:21] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'if (expression is KtDeclarationWithBody) {
            functions += BindingUtils.getFunctionDescriptor(bindingContext, expression)
        }
        else {
            expression.acceptChildren(this, null)
        }' @ [28:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expression' @ [28:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.LocalFunctionCollector.visitExpression[ValueParameterDescriptorImpl]

'functions' @ [29:13] ==> public final val functions: MutableSet<FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.expression.LocalFunctionCollector[PropertyDescriptorImpl]

'getFunctionDescriptor' @ [29:39] ==> @NotNull public open fun getFunctionDescriptor(@NotNull context: BindingContext, @NotNull declaration: KtDeclarationWithBody): FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'bindingContext' @ [29:61] ==> public final val bindingContext: BindingContext defined in org.jetbrains.kotlin.js.translate.expression.LocalFunctionCollector[PropertyDescriptorImpl]

'expression' @ [29:77] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.LocalFunctionCollector.visitExpression[ValueParameterDescriptorImpl]

'expression' @ [32:13] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.LocalFunctionCollector.visitExpression[ValueParameterDescriptorImpl]

'acceptChildren' @ [32:24] ==> public abstract fun <D> acceptChildren(visitor: KtVisitor<Void, (Void..Void?)>, data: (Void..Void?)): Unit defined in org.jetbrains.kotlin.psi.KtExpression[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <D> -> (java.lang.Void..java.lang.Void?)

'this' @ [32:39] ==> <this> defined in org.jetbrains.kotlin.js.translate.expression.LocalFunctionCollector[LazyClassReceiverParameterDescriptor]

