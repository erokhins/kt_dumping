'accept' @ [22:5] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [22:21] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'mutableMapOf' @ [23:28] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsName

'currentScope' @ [26:13] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'collectDefinedNames' @ [26:29] ==> public fun collectDefinedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'this@fixForwardNameReferences' @ [26:49] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences[ReceiverParameterDescriptorImpl]

'associateBy' @ [26:80] ==> public inline fun <T, K> Iterable<JsName>.associateBy(keySelector: (JsName) -> String): Map<String, JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <K> -> String

'it' @ [26:94] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.<init>.<anonymous>[ValueParameterDescriptorImpl]

'ident' @ [26:97] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'mutableMapOf' @ [30:31] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, JsName?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsName?

'x' @ [31:29] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'collectLocalVariables' @ [31:31] ==> public fun JsFunction.collectLocalVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'localVars' @ [32:30] ==> val localVars: Set<JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'scopeBackup' @ [33:17] ==> val scopeBackup: MutableMap<String, JsName?> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'localVar' @ [33:29] ==> val localVar: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'ident' @ [33:38] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'currentScope' @ [33:47] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'localVar' @ [33:60] ==> val localVar: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'ident' @ [33:69] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'currentScope' @ [34:17] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'localVar' @ [34:30] ==> val localVar: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'ident' @ [34:39] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'localVar' @ [34:48] ==> val localVar: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'super' @ [37:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [37:19] ==> public open fun visitFunction(x: JsFunction): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [37:33] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'component1' @ [39:19] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, JsName?>.component1(): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsName?

'component2' @ [39:26] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<String, JsName?>.component2(): JsName? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsName?

'scopeBackup' @ [39:38] ==> val scopeBackup: MutableMap<String, JsName?> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'if (oldName == null) {
                    currentScope -= ident
                }
                else {
                    currentScope[ident] = oldName
                }' @ [40:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'oldName' @ [40:21] ==> val oldName: JsName? defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'currentScope' @ [41:21] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'ident' @ [41:37] ==> val ident: String defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'currentScope' @ [44:21] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'ident' @ [44:34] ==> val ident: String defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'oldName' @ [44:43] ==> val oldName: JsName? defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitFunction[LocalVariableDescriptor]

'x' @ [50:24] ==> value-parameter x: JsCatch defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[ValueParameterDescriptorImpl]

'parameter' @ [50:26] ==> public final val JsCatch.parameter: (JsParameter..JsParameter?)[MyPropertyDescriptor]

'name' @ [50:36] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'currentScope' @ [51:27] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'name' @ [51:40] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[LocalVariableDescriptor]

'ident' @ [51:45] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'currentScope' @ [52:13] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'name' @ [52:26] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[LocalVariableDescriptor]

'ident' @ [52:31] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'name' @ [52:40] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[LocalVariableDescriptor]

'super' @ [54:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitCatch' @ [54:19] ==> public open fun visitCatch(x: JsCatch): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [54:30] ==> value-parameter x: JsCatch defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[ValueParameterDescriptorImpl]

'if (oldName != null) {
                currentScope[name.ident] = name
            }
            else {
                currentScope -= name.ident
            }' @ [56:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'oldName' @ [56:17] ==> val oldName: JsName? defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[LocalVariableDescriptor]

'currentScope' @ [57:17] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'name' @ [57:30] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[LocalVariableDescriptor]

'ident' @ [57:35] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'name' @ [57:44] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[LocalVariableDescriptor]

'currentScope' @ [60:17] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'name' @ [60:33] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitCatch[LocalVariableDescriptor]

'ident' @ [60:38] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'super' @ [65:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [65:19] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [65:32] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'nameRef' @ [66:17] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'qualifier' @ [66:25] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'nameRef' @ [67:29] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'ident' @ [67:37] ==> public final val JsNameRef.ident: String[MyPropertyDescriptor]

'currentScope' @ [68:28] ==> public final val currentScope: MutableMap<String, JsName> defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>[PropertyDescriptorImpl]

'ident' @ [68:41] ==> val ident: String defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitNameRef[LocalVariableDescriptor]

'name' @ [69:21] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitNameRef[LocalVariableDescriptor]

'nameRef' @ [70:21] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'name' @ [70:29] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [70:36] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.fixForwardNameReferences.<no name provided>.visitNameRef[LocalVariableDescriptor]

