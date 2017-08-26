'RecursiveJsVisitor' @ [25:36] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'hashSetOf' @ [27:32] ==> @SinceKotlin @InlineOnly public inline fun <T> hashSetOf(): HashSet<String> /* = HashSet<String> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'hashMapOf' @ [28:33] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, Int> /* = HashMap<String, Int> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> Int

'expectedIdent' @ [30:54] ==> value-parameter expectedIdent: String defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.hasUnqualifiedReads[ValueParameterDescriptorImpl]

'identReadSet' @ [30:71] ==> private final val identReadSet: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[PropertyDescriptorImpl]

'expectedIdent' @ [31:55] ==> value-parameter expectedIdent: String defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.hasUnqualifiedWrites[ValueParameterDescriptorImpl]

'identWriteMap' @ [31:72] ==> private final val identWriteMap: HashMap<String, Int> /* = HashMap<String, Int> */ defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[PropertyDescriptorImpl]

'identWriteMap' @ [33:61] ==> private final val identWriteMap: HashMap<String, Int> /* = HashMap<String, Int> */ defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[PropertyDescriptorImpl]

'expectedIdent' @ [33:75] ==> value-parameter expectedIdent: String defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.unqualifiedWriteCount[ValueParameterDescriptorImpl]

'super' @ [36:9] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [36:15] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [36:28] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitNameRef[ValueParameterDescriptorImpl]

'identReadSet' @ [37:9] ==> private final val identReadSet: HashSet<String> /* = HashSet<String> */ defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[PropertyDescriptorImpl]

'add' @ [37:22] ==> public open fun add(element: String): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'nameRef' @ [37:26] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitNameRef[ValueParameterDescriptorImpl]

'ident' @ [37:34] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'decomposeAssignment' @ [42:20] ==> @Nullable public open fun decomposeAssignment(@NotNull p0: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [42:40] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression[ValueParameterDescriptorImpl]

'let' @ [42:44] ==> @InlineOnly public inline fun <T, R> Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>.let(block: (Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?), (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)>
    <R> -> Unit?

'component1' @ [42:51] ==> public final operator fun component1(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [42:57] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'left' @ [43:14] ==> val left: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression.<anonymous>[LocalVariableDescriptor]

'let' @ [43:35] ==> @InlineOnly public inline fun <T, R> JsNameRef.let(block: (JsNameRef) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNameRef
    <R> -> Unit

'assignmentToProperty' @ [44:17] ==> var assignmentToProperty: Boolean defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression[LocalVariableDescriptor]

'identWriteMap' @ [45:17] ==> private final val identWriteMap: HashMap<String, Int> /* = HashMap<String, Int> */ defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[PropertyDescriptorImpl]

'nameRef' @ [45:31] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ident' @ [45:39] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'+' @ [45:48] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'unqualifiedWriteCount' @ [45:52] ==> public final fun unqualifiedWriteCount(expectedIdent: String): Int defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[SimpleFunctionDescriptorImpl]

'nameRef' @ [45:74] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'ident' @ [45:82] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'nameRef' @ [46:17] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'qualifier' @ [46:25] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'accept' @ [46:36] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [46:43] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[LazyClassReceiverParameterDescriptor]

'right' @ [47:17] ==> val right: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression.<anonymous>[LocalVariableDescriptor]

'accept' @ [47:23] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'this' @ [47:30] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[LazyClassReceiverParameterDescriptor]

'!' @ [50:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'assignmentToProperty' @ [50:14] ==> var assignmentToProperty: Boolean defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression[LocalVariableDescriptor]

'super' @ [51:13] ==> <this> defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[LazyClassReceiverParameterDescriptor]

'visitBinaryExpression' @ [51:19] ==> public open fun visitBinaryExpression(x: JsBinaryOperation): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [51:41] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.visitBinaryExpression[ValueParameterDescriptorImpl]

'PropertyReferenceCollector' @ [57:27] ==> public constructor PropertyReferenceCollector() defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector[ClassConstructorDescriptorImpl]

'node' @ [58:13] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.Companion.collect[ValueParameterDescriptorImpl]

'accept' @ [58:18] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'visitor' @ [58:25] ==> val visitor: PropertyReferenceCollector defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.Companion.collect[LocalVariableDescriptor]

'visitor' @ [59:20] ==> val visitor: PropertyReferenceCollector defined in org.jetbrains.kotlin.js.test.utils.PropertyReferenceCollector.Companion.collect[LocalVariableDescriptor]

