'body' @ [23:5] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [23:10] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'add' @ [23:21] ==> public abstract fun add(element: (JsStatement..JsStatement?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'stmt' @ [23:25] ==> value-parameter stmt: JsStatement defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addStatement[ValueParameterDescriptorImpl]

'declareTemporaryName' @ [27:24] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'identifier' @ [27:45] ==> value-parameter identifier: String defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addParameter[ValueParameterDescriptorImpl]

'JsParameter' @ [28:21] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'name' @ [28:33] ==> val name: JsName defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addParameter[LocalVariableDescriptor]

'if (index == null) {
        parameters.add(parameter)
    } else {
        parameters.add(index, parameter)
    }' @ [30:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'index' @ [30:9] ==> value-parameter index: Int? = ... defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addParameter[ValueParameterDescriptorImpl]

'parameters' @ [31:9] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [31:20] ==> public abstract fun add(element: (JsParameter..JsParameter?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'parameter' @ [31:24] ==> val parameter: JsParameter defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addParameter[LocalVariableDescriptor]

'parameters' @ [33:9] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'add' @ [33:20] ==> public abstract fun add(index: Int, element: (JsParameter..JsParameter?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [33:24] ==> value-parameter index: Int? = ... defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addParameter[ValueParameterDescriptorImpl]

'parameter' @ [33:31] ==> val parameter: JsParameter defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addParameter[LocalVariableDescriptor]

'parameter' @ [36:12] ==> val parameter: JsParameter defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.addParameter[LocalVariableDescriptor]

'RecursiveJsVisitor' @ [43:28] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'matched' @ [47:13] ==> public final var matched: Boolean defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>[PropertyDescriptorImpl]

'matched' @ [47:23] ==> public final var matched: Boolean defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>[PropertyDescriptorImpl]

'invoke' @ [47:34] ==> public abstract operator fun invoke(p1: JsNode): Boolean defined in kotlin.Function1[FunctionInvokeDescriptor]

'node' @ [47:44] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'!' @ [49:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'matched' @ [49:18] ==> public final var matched: Boolean defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>[PropertyDescriptorImpl]

'super' @ [50:17] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [50:23] ==> protected/*protected and package*/ open fun visitElement(@NotNull node: JsNode): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaMethodDescriptor]

'node' @ [50:36] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'visitor' @ [55:5] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any[LocalVariableDescriptor]

'accept' @ [55:13] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'this' @ [55:20] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any[ReceiverParameterDescriptorImpl]

'visitor' @ [56:12] ==> val visitor: <no name provided> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any[LocalVariableDescriptor]

'matched' @ [56:20] ==> public final var matched: Boolean defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.any.<no name provided>[PropertyDescriptorImpl]

'arguments' @ [65:55] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith.padArguments[ValueParameterDescriptorImpl]

'..' @ [65:68] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'parameterCount' @ [65:72] ==> value-parameter parameterCount: Int defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[ValueParameterDescriptorImpl]

'arguments' @ [65:89] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith.padArguments[ValueParameterDescriptorImpl]

'size' @ [65:99] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'map' @ [66:14] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> JsExpression

'getUndefinedExpression' @ [66:26] ==> @NotNull public open fun getUndefinedExpression(): JsExpression defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'when (this) {
        is JsNew -> {
            qualifier = Namer.getFunctionCallRef(constructorExpression)
            // `new A(a, b, c)` -> `A.call($this, a, b, c)`
            JsInvocation(qualifier, listOf(thisExpr) + leadingExtraArgs + arguments).source(source)
        }
        is JsInvocation -> {
            qualifier = getQualifier()
            // `A(a, b, c)` -> `A(a, b, c, $this)`
            JsInvocation(qualifier, leadingExtraArgs + padArguments(arguments) + thisExpr).source(source)
        }
        else -> throw IllegalStateException("Unexpected node type: " + this::class.java)
    }' @ [68:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression, entry1: JsExpression, entry2: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression

'this' @ [68:18] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[ReceiverParameterDescriptorImpl]

'qualifier' @ [70:13] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[LocalVariableDescriptor]

'getFunctionCallRef' @ [70:31] ==> @NotNull public open fun getFunctionCallRef(@NotNull functionExpression: JsExpression): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'constructorExpression' @ [70:50] ==> public final var JsNew.constructorExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'JsInvocation' @ [72:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'qualifier' @ [72:26] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[LocalVariableDescriptor]

'listOf' @ [72:37] ==> public fun <T> listOf(element: JsExpression): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'thisExpr' @ [72:44] ==> value-parameter thisExpr: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[ValueParameterDescriptorImpl]

'leadingExtraArgs' @ [72:56] ==> value-parameter leadingExtraArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[ValueParameterDescriptorImpl]

'arguments' @ [72:75] ==> public final val JsNew.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)[MyPropertyDescriptor]

'source' @ [72:86] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'source' @ [72:93] ==> public final var JsNew.source: (Any..Any?)[MyPropertyDescriptor]

'qualifier' @ [75:13] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[LocalVariableDescriptor]

'getQualifier' @ [75:25] ==> @NotNull public open fun getQualifier(): JsExpression defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'JsInvocation' @ [77:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, @NotNull p1: (MutableList<out (JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'qualifier' @ [77:26] ==> val qualifier: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[LocalVariableDescriptor]

'leadingExtraArgs' @ [77:37] ==> value-parameter leadingExtraArgs: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[ValueParameterDescriptorImpl]

'padArguments' @ [77:56] ==> local final fun padArguments(arguments: List<JsExpression>): List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[SimpleFunctionDescriptorImpl]

'arguments' @ [77:69] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'thisExpr' @ [77:82] ==> value-parameter thisExpr: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[ValueParameterDescriptorImpl]

'source' @ [77:92] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'source' @ [77:99] ==> public final var JsInvocation.source: (Any..Any?)[MyPropertyDescriptor]

'IllegalStateException' @ [79:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'+' @ [79:45] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [79:72] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.toInvocationWith[ReceiverParameterDescriptorImpl]

'java' @ [79:84] ==> public val <T> KClass<out JsExpression>.java: Class<out JsExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out JsExpression)

'condition' @ [84:13] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'condition' @ [85:18] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'value' @ [85:30] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.<set-test>[ValueParameterDescriptorImpl]

'indexExpression' @ [88:13] ==> public final var JsArrayAccess.indexExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'indexExpression' @ [89:18] ==> public final var JsArrayAccess.indexExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'value' @ [89:36] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.<set-index>[ValueParameterDescriptorImpl]

'arrayExpression' @ [92:13] ==> public final var JsArrayAccess.arrayExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'arrayExpression' @ [93:18] ==> public final var JsArrayAccess.arrayExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'value' @ [93:36] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.<set-array>[ValueParameterDescriptorImpl]

'testExpression' @ [96:13] ==> public final var JsConditional.testExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'testExpression' @ [97:18] ==> public final var JsConditional.testExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'value' @ [97:35] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.<set-test>[ValueParameterDescriptorImpl]

'thenExpression' @ [100:13] ==> public final var JsConditional.thenExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'thenExpression' @ [101:18] ==> public final var JsConditional.thenExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'value' @ [101:35] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.<set-then>[ValueParameterDescriptorImpl]

'elseExpression' @ [104:13] ==> public final var JsConditional.elseExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'elseExpression' @ [105:18] ==> public final var JsConditional.elseExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'value' @ [105:35] ==> value-parameter value: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.jsAstUtils.<set-otherwise>[ValueParameterDescriptorImpl]

