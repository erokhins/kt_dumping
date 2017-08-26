'UsedImportsCollector' @ [23:21] ==> public constructor UsedImportsCollector() defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector[ClassConstructorDescriptorImpl]

'root' @ [24:5] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports[ValueParameterDescriptorImpl]

'accept' @ [24:10] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'collector' @ [24:17] ==> val collector: UsedImportsCollector defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports[LocalVariableDescriptor]

'NodeRemover' @ [25:5] ==> public constructor NodeRemover<T>(klass: Class<JsVars>, predicate: (JsVars) -> Boolean) defined in org.jetbrains.kotlin.js.inline.clean.NodeRemover[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> JsVars

'JsVars' @ [25:17] ==> public constructor JsVars() defined in org.jetbrains.kotlin.js.backend.ast.JsVars[JavaClassConstructorDescriptor]

'java' @ [25:31] ==> public val <T> KClass<JsVars>.java: Class<JsVars> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JsVars

'if (statement.vars.size == 1) {
            val name = statement.vars[0].name
            name.imported && name !in collector.usedImports
        }
        else {
            false
        }' @ [26:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'statement' @ [26:13] ==> value-parameter statement: JsVars defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports.<anonymous>[ValueParameterDescriptorImpl]

'vars' @ [26:23] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'size' @ [26:28] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'statement' @ [27:24] ==> value-parameter statement: JsVars defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports.<anonymous>[ValueParameterDescriptorImpl]

'vars' @ [27:34] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'name' @ [27:42] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'name' @ [28:13] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports.<anonymous>[LocalVariableDescriptor]

'imported' @ [28:18] ==> public var JsName.imported: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'name' @ [28:30] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports.<anonymous>[LocalVariableDescriptor]

'collector' @ [28:39] ==> val collector: UsedImportsCollector defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports[LocalVariableDescriptor]

'usedImports' @ [28:49] ==> public final val usedImports: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector[PropertyDescriptorImpl]

'accept' @ [33:7] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.inline.clean.NodeRemover[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsNode..org.jetbrains.kotlin.js.backend.ast.JsNode?)

'root' @ [33:14] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedImports[ValueParameterDescriptorImpl]

'RecursiveJsVisitor' @ [36:38] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'mutableSetOf' @ [37:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'nameRef' @ [40:20] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector.visitNameRef[ValueParameterDescriptorImpl]

'name' @ [40:28] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [41:13] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector.visitNameRef[LocalVariableDescriptor]

'name' @ [41:29] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector.visitNameRef[LocalVariableDescriptor]

'imported' @ [41:34] ==> public var JsName.imported: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'usedImports' @ [42:13] ==> public final val usedImports: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector[PropertyDescriptorImpl]

'name' @ [42:28] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector.visitNameRef[LocalVariableDescriptor]

'super' @ [44:9] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [44:15] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [44:28] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.UsedImportsCollector.visitNameRef[ValueParameterDescriptorImpl]

