'generateSequence' @ [23:29] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: JsScope?, nextFunction: (JsScope) -> JsScope?): Sequence<JsScope> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> JsScope

'scope' @ [23:46] ==> value-parameter scope: JsScope defined in com.google.gwt.dev.js.ScopeContext.<init>[ValueParameterDescriptorImpl]

'it' @ [23:55] ==> value-parameter it: JsScope defined in com.google.gwt.dev.js.ScopeContext.rootScope.<anonymous>[ValueParameterDescriptorImpl]

'parent' @ [23:58] ==> public final val JsScope.parent: (JsScope..JsScope?)[MyPropertyDescriptor]

'first' @ [23:67] ==> public inline fun <T> Sequence<JsScope>.first(predicate: (JsScope) -> Boolean): JsScope defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsScope

'it' @ [23:75] ==> value-parameter it: JsScope defined in com.google.gwt.dev.js.ScopeContext.rootScope.<anonymous>[ValueParameterDescriptorImpl]

'Stack' @ [24:26] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsScope

'scopes' @ [27:9] ==> private final val scopes: Stack<JsScope> defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'push' @ [27:16] ==> public open fun push(p0: (JsScope..JsScope?)): (JsScope..JsScope?) defined in java.util.Stack[JavaMethodDescriptor]

'scope' @ [27:21] ==> value-parameter scope: JsScope defined in com.google.gwt.dev.js.ScopeContext.<init>[ValueParameterDescriptorImpl]

'JsFunction' @ [31:18] ==> public constructor JsFunction(@NotNull p0: JsScope, @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaClassConstructorDescriptor]

'currentScope' @ [31:29] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'enterScope' @ [32:9] ==> private final fun enterScope(scope: JsScope): (JsScope..JsScope?) defined in com.google.gwt.dev.js.ScopeContext[SimpleFunctionDescriptorImpl]

'fn' @ [32:20] ==> val fn: JsFunction defined in com.google.gwt.dev.js.ScopeContext.enterFunction[LocalVariableDescriptor]

'scope' @ [32:23] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'fn' @ [33:16] ==> val fn: JsFunction defined in com.google.gwt.dev.js.ScopeContext.enterFunction[LocalVariableDescriptor]

'assert' @ [37:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'currentScope' @ [37:16] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'exitScope' @ [38:9] ==> private final fun exitScope(): (JsScope..JsScope?) defined in com.google.gwt.dev.js.ScopeContext[SimpleFunctionDescriptorImpl]

'JsCatch' @ [42:23] ==> public constructor JsCatch(p0: (JsScope..JsScope?), @NotNull p1: String) defined in org.jetbrains.kotlin.js.backend.ast.JsCatch[JavaClassConstructorDescriptor]

'currentScope' @ [42:31] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'ident' @ [42:45] ==> value-parameter ident: String defined in com.google.gwt.dev.js.ScopeContext.enterCatch[ValueParameterDescriptorImpl]

'enterScope' @ [43:9] ==> private final fun enterScope(scope: JsScope): (JsScope..JsScope?) defined in com.google.gwt.dev.js.ScopeContext[SimpleFunctionDescriptorImpl]

'jsCatch' @ [43:20] ==> val jsCatch: JsCatch defined in com.google.gwt.dev.js.ScopeContext.enterCatch[LocalVariableDescriptor]

'scope' @ [43:28] ==> public final val JsCatch.scope: (JsScope..JsScope?)[MyPropertyDescriptor]

'jsCatch' @ [44:16] ==> val jsCatch: JsCatch defined in com.google.gwt.dev.js.ScopeContext.enterCatch[LocalVariableDescriptor]

'assert' @ [48:9] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'currentScope' @ [48:16] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'exitScope' @ [49:9] ==> private final fun exitScope(): (JsScope..JsScope?) defined in com.google.gwt.dev.js.ScopeContext[SimpleFunctionDescriptorImpl]

'currentScope' @ [53:14] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'enterLabel' @ [53:50] ==> public open fun enterLabel(label: String, outputName: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[DeserializedSimpleFunctionDescriptor]

'ident' @ [53:61] ==> value-parameter ident: String defined in com.google.gwt.dev.js.ScopeContext.enterLabel[ValueParameterDescriptorImpl]

'outputName' @ [53:68] ==> value-parameter outputName: String defined in com.google.gwt.dev.js.ScopeContext.enterLabel[ValueParameterDescriptorImpl]

'currentScope' @ [56:14] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'exitLabel' @ [56:50] ==> public open fun exitLabel(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[DeserializedSimpleFunctionDescriptor]

'currentScope' @ [59:14] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'findLabel' @ [59:50] ==> public open fun findLabel(label: String): JsName? defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[DeserializedSimpleFunctionDescriptor]

'ident' @ [59:60] ==> value-parameter ident: String defined in com.google.gwt.dev.js.ScopeContext.labelFor[ValueParameterDescriptorImpl]

'currentScope' @ [62:13] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'findName' @ [62:26] ==> @Nullable public final fun findName(@NotNull p0: String): JsName? defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'ident' @ [62:35] ==> value-parameter ident: String defined in com.google.gwt.dev.js.ScopeContext.globalNameFor[ValueParameterDescriptorImpl]

'rootScope' @ [62:45] ==> private final val rootScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'declareName' @ [62:55] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'ident' @ [62:67] ==> value-parameter ident: String defined in com.google.gwt.dev.js.ScopeContext.globalNameFor[ValueParameterDescriptorImpl]

'currentScope' @ [65:13] ==> private final val currentScope: JsScope defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'findOwnNameOrDeclare' @ [65:26] ==> private fun JsScope.findOwnNameOrDeclare(ident: String): JsName defined in com.google.gwt.dev.js in file ScopeContext.kt[SimpleFunctionDescriptorImpl]

'ident' @ [65:47] ==> value-parameter ident: String defined in com.google.gwt.dev.js.ScopeContext.localNameFor[ValueParameterDescriptorImpl]

'JsNameRef' @ [68:13] ==> public constructor JsNameRef(@NotNull p0: String) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'ident' @ [68:23] ==> value-parameter ident: String defined in com.google.gwt.dev.js.ScopeContext.referenceFor[ValueParameterDescriptorImpl]

'scopes' @ [70:46] ==> private final val scopes: Stack<JsScope> defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'push' @ [70:53] ==> public open fun push(p0: (JsScope..JsScope?)): (JsScope..JsScope?) defined in java.util.Stack[JavaMethodDescriptor]

'scope' @ [70:58] ==> value-parameter scope: JsScope defined in com.google.gwt.dev.js.ScopeContext.enterScope[ValueParameterDescriptorImpl]

'scopes' @ [72:31] ==> private final val scopes: Stack<JsScope> defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'pop' @ [72:38] ==> public open fun pop(): (JsScope..JsScope?) defined in java.util.Stack[JavaMethodDescriptor]

'scopes' @ [75:17] ==> private final val scopes: Stack<JsScope> defined in com.google.gwt.dev.js.ScopeContext[PropertyDescriptorImpl]

'peek' @ [75:24] ==> public open fun peek(): (JsScope..JsScope?) defined in java.util.Stack[JavaMethodDescriptor]

'when (this) {
            is JsFunctionScope -> declareNameUnsafe(ident)
            else -> declareName(ident)
        }' @ [82:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsName, entry1: JsName): JsName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsName

'this' @ [82:15] ==> <this> defined in com.google.gwt.dev.js.findOwnNameOrDeclare[ReceiverParameterDescriptorImpl]

'declareNameUnsafe' @ [83:35] ==> public open fun declareNameUnsafe(identifier: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[DeserializedSimpleFunctionDescriptor]

'ident' @ [83:53] ==> value-parameter ident: String defined in com.google.gwt.dev.js.findOwnNameOrDeclare[ValueParameterDescriptorImpl]

'declareName' @ [84:21] ==> @NotNull public open fun declareName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'ident' @ [84:33] ==> value-parameter ident: String defined in com.google.gwt.dev.js.findOwnNameOrDeclare[ValueParameterDescriptorImpl]

