'JsScope' @ [21:61] ==> public constructor JsScope(parent: (JsScope..JsScope?), @NotNull description: String) defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaClassConstructorDescriptor]

'parent' @ [21:69] ==> value-parameter parent: JsScope defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope.<init>[ValueParameterDescriptorImpl]

'description' @ [21:77] ==> value-parameter description: String defined in org.jetbrains.kotlin.js.backend.ast.JsObjectScope.<init>[ValueParameterDescriptorImpl]

'JsScope' @ [23:25] ==> public constructor JsScope(parent: (JsScope..JsScope?), @NotNull description: String) defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaClassConstructorDescriptor]

'JsName' @ [24:47] ==> public/*package*/ constructor JsName(@NotNull ident: String, temporary: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaClassConstructorDescriptor]

'name' @ [24:54] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsDynamicScope.doCreateName[ValueParameterDescriptorImpl]

'JsDeclarationScope' @ [27:68] ==> public constructor JsDeclarationScope(parent: JsScope, description: String, useParentScopeStack: Boolean = ...) defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[ClassConstructorDescriptorImpl]

'parent' @ [27:87] ==> value-parameter parent: JsScope defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope.<init>[ValueParameterDescriptorImpl]

'description' @ [27:95] ==> value-parameter description: String defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope.<init>[ValueParameterDescriptorImpl]

'RESERVED_WORDS' @ [28:54] ==> public final val RESERVED_WORDS: Set<String> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.Companion[PropertyDescriptorImpl]

'contains' @ [28:69] ==> public abstract fun contains(element: String): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'name' @ [28:78] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope.hasOwnName[ValueParameterDescriptorImpl]

'super' @ [28:87] ==> <this> defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[LazyClassReceiverParameterDescriptor]

'hasOwnName' @ [28:93] ==> public open fun hasOwnName(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[JavaMethodDescriptor]

'name' @ [28:104] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope.hasOwnName[ValueParameterDescriptorImpl]

'super' @ [30:62] ==> <this> defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[LazyClassReceiverParameterDescriptor]

'declareName' @ [30:68] ==> @NotNull public open fun declareName(@NotNull identifier: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[JavaMethodDescriptor]

'identifier' @ [30:80] ==> value-parameter identifier: String defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope.declareNameUnsafe[ValueParameterDescriptorImpl]

'JsScope' @ [33:109] ==> public constructor JsScope(parent: (JsScope..JsScope?), @NotNull description: String) defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaClassConstructorDescriptor]

'parent' @ [33:117] ==> value-parameter parent: JsScope defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.<init>[ValueParameterDescriptorImpl]

'description' @ [33:125] ==> value-parameter description: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.<init>[ValueParameterDescriptorImpl]

'if (parent is JsDeclarationScope && useParentScopeStack) parent.labelScopes else Stack<LabelScope>()' @ [35:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Stack<JsDeclarationScope.LabelScope>, elseBranch: Stack<JsDeclarationScope.LabelScope>): Stack<JsDeclarationScope.LabelScope>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Stack<LabelScope>

'parent' @ [35:17] ==> value-parameter parent: JsScope defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.<init>[ValueParameterDescriptorImpl]

'useParentScopeStack' @ [35:49] ==> value-parameter useParentScopeStack: Boolean = ... defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.<init>[ValueParameterDescriptorImpl]

'parent' @ [35:70] ==> value-parameter parent: JsScope defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.<init>[ValueParameterDescriptorImpl]

'labelScopes' @ [35:77] ==> private final val labelScopes: Stack<JsDeclarationScope.LabelScope> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'Stack' @ [35:94] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LabelScope

'if (labelScopes.isNotEmpty()) labelScopes.peek() else null' @ [38:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsDeclarationScope.LabelScope?, elseBranch: JsDeclarationScope.LabelScope?): JsDeclarationScope.LabelScope?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> LabelScope?

'labelScopes' @ [38:21] ==> private final val labelScopes: Stack<JsDeclarationScope.LabelScope> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'isNotEmpty' @ [38:33] ==> @InlineOnly public inline fun <T> Collection<(JsDeclarationScope.LabelScope..JsDeclarationScope.LabelScope?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope..org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope?)

'labelScopes' @ [38:47] ==> private final val labelScopes: Stack<JsDeclarationScope.LabelScope> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'peek' @ [38:59] ==> public open fun peek(): (JsDeclarationScope.LabelScope..JsDeclarationScope.LabelScope?) defined in java.util.Stack[JavaMethodDescriptor]

'LabelScope' @ [41:21] ==> public constructor LabelScope(parent: JsDeclarationScope.LabelScope?, ident: String, outputIdent: String) defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope[ClassConstructorDescriptorImpl]

'topLabelScope' @ [41:32] ==> private final val topLabelScope: JsDeclarationScope.LabelScope? defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'label' @ [41:47] ==> value-parameter label: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.enterLabel[ValueParameterDescriptorImpl]

'outputName' @ [41:54] ==> value-parameter outputName: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.enterLabel[ValueParameterDescriptorImpl]

'labelScopes' @ [42:9] ==> private final val labelScopes: Stack<JsDeclarationScope.LabelScope> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'push' @ [42:21] ==> public open fun push(p0: (JsDeclarationScope.LabelScope..JsDeclarationScope.LabelScope?)): (JsDeclarationScope.LabelScope..JsDeclarationScope.LabelScope?) defined in java.util.Stack[JavaMethodDescriptor]

'scope' @ [42:26] ==> val scope: JsDeclarationScope.LabelScope defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.enterLabel[LocalVariableDescriptor]

'scope' @ [43:16] ==> val scope: JsDeclarationScope.LabelScope defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.enterLabel[LocalVariableDescriptor]

'labelName' @ [43:22] ==> public final val labelName: JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope[PropertyDescriptorImpl]

'assert' @ [47:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'labelScopes' @ [47:16] ==> private final val labelScopes: Stack<JsDeclarationScope.LabelScope> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'isNotEmpty' @ [47:28] ==> @InlineOnly public inline fun <T> Collection<(JsDeclarationScope.LabelScope..JsDeclarationScope.LabelScope?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope..org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope?)

'labelScopes' @ [48:9] ==> private final val labelScopes: Stack<JsDeclarationScope.LabelScope> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'pop' @ [48:21] ==> public open fun pop(): (JsDeclarationScope.LabelScope..JsDeclarationScope.LabelScope?) defined in java.util.Stack[JavaMethodDescriptor]

'topLabelScope' @ [52:13] ==> private final val topLabelScope: JsDeclarationScope.LabelScope? defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope[PropertyDescriptorImpl]

'findName' @ [52:28] ==> @Nullable public final fun findName(@NotNull ident: String): JsName? defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope[JavaMethodDescriptor]

'label' @ [52:37] ==> value-parameter label: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.findLabel[ValueParameterDescriptorImpl]

'JsScope' @ [54:99] ==> public constructor JsScope(parent: (JsScope..JsScope?), @NotNull description: String) defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaClassConstructorDescriptor]

'parent' @ [54:107] ==> value-parameter parent: JsDeclarationScope.LabelScope? defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.<init>[ValueParameterDescriptorImpl]

'ident' @ [54:133] ==> value-parameter ident: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.<init>[ValueParameterDescriptorImpl]

'JsName' @ [55:33] ==> public/*package*/ constructor JsName(@NotNull ident: String, temporary: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaClassConstructorDescriptor]

'outputIdent' @ [55:40] ==> value-parameter outputIdent: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.<init>[ValueParameterDescriptorImpl]

'if (name == ident) labelName else null' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsName?, elseBranch: JsName?): JsName?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsName?

'name' @ [58:21] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.findOwnName[ValueParameterDescriptorImpl]

'ident' @ [58:29] ==> public final val ident: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope[PropertyDescriptorImpl]

'labelName' @ [58:36] ==> public final val labelName: JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope[PropertyDescriptorImpl]

'Suppress' @ [64:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'name' @ [66:17] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.hasOwnName[ValueParameterDescriptorImpl]

'RESERVED_WORDS' @ [66:25] ==> public final val RESERVED_WORDS: Set<String> defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.Companion[PropertyDescriptorImpl]

'name' @ [67:20] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.hasOwnName[ValueParameterDescriptorImpl]

'ident' @ [67:28] ==> public final val ident: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope[PropertyDescriptorImpl]

'name' @ [68:20] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.hasOwnName[ValueParameterDescriptorImpl]

'labelName' @ [68:28] ==> public final val labelName: JsName defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope[PropertyDescriptorImpl]

'ident' @ [68:39] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'parent' @ [69:20] ==> public final val JsDeclarationScope.LabelScope.parent: (JsScope..JsScope?)[MyPropertyDescriptor]

'hasOwnName' @ [69:28] ==> public open fun hasOwnName(@NotNull name: String): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'name' @ [69:39] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.JsDeclarationScope.LabelScope.hasOwnName[ValueParameterDescriptorImpl]

'setOf' @ [73:43] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'JsFunctionScope' @ [106:5] ==> public constructor JsFunctionScope(parent: JsScope, description: String) defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[ClassConstructorDescriptorImpl]

'parent' @ [106:21] ==> value-parameter parent: JsScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.<init>[ValueParameterDescriptorImpl]

'delegatingScope' @ [109:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'hasOwnName' @ [109:29] ==> public open fun hasOwnName(name: String): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[SimpleFunctionDescriptorImpl]

'name' @ [109:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.hasOwnName[ValueParameterDescriptorImpl]

'delegatingScope' @ [112:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'findOwnName' @ [112:29] ==> protected/*protected and package*/ open fun findOwnName(@NotNull ident: String): (JsName..JsName?) defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[JavaMethodDescriptor]

'ident' @ [112:41] ==> value-parameter ident: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.findOwnName[ValueParameterDescriptorImpl]

'delegatingScope' @ [115:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'declareNameUnsafe' @ [115:29] ==> public open fun declareNameUnsafe(identifier: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[SimpleFunctionDescriptorImpl]

'identifier' @ [115:47] ==> value-parameter identifier: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.declareNameUnsafe[ValueParameterDescriptorImpl]

'delegatingScope' @ [118:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'declareName' @ [118:29] ==> @NotNull public open fun declareName(@NotNull identifier: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[JavaMethodDescriptor]

'identifier' @ [118:41] ==> value-parameter identifier: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.declareName[ValueParameterDescriptorImpl]

'delegatingScope' @ [121:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'declareFreshName' @ [121:29] ==> @NotNull public open fun declareFreshName(@NotNull suggestedName: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[JavaMethodDescriptor]

'suggestedName' @ [121:46] ==> value-parameter suggestedName: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.declareFreshName[ValueParameterDescriptorImpl]

'delegatingScope' @ [124:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'enterLabel' @ [124:29] ==> public open fun enterLabel(label: String, outputName: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[SimpleFunctionDescriptorImpl]

'label' @ [124:40] ==> value-parameter label: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.enterLabel[ValueParameterDescriptorImpl]

'outputName' @ [124:47] ==> value-parameter outputName: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.enterLabel[ValueParameterDescriptorImpl]

'delegatingScope' @ [127:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'exitLabel' @ [127:29] ==> public open fun exitLabel(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[SimpleFunctionDescriptorImpl]

'delegatingScope' @ [130:13] ==> private final val delegatingScope: JsFunctionScope defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent[PropertyDescriptorImpl]

'findLabel' @ [130:29] ==> public open fun findLabel(label: String): JsName? defined in org.jetbrains.kotlin.js.backend.ast.JsFunctionScope[SimpleFunctionDescriptorImpl]

'label' @ [130:39] ==> value-parameter label: String defined in org.jetbrains.kotlin.js.backend.ast.DelegatingJsFunctionScopeWithTemporaryParent.findLabel[ValueParameterDescriptorImpl]

