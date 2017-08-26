'if (replaceMap.isEmpty()) node else NameReplacingVisitor(replaceMap).accept(node)!!' @ [26:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: T, elseBranch: T): T[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> T

'replaceMap' @ [26:16] ==> value-parameter replaceMap: Map<JsName, JsExpression> defined in org.jetbrains.kotlin.js.inline.util.replaceNames[ValueParameterDescriptorImpl]

'isEmpty' @ [26:27] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Map[DeserializedSimpleFunctionDescriptor]

'node' @ [26:38] ==> value-parameter node: T defined in org.jetbrains.kotlin.js.inline.util.replaceNames[ValueParameterDescriptorImpl]

'NameReplacingVisitor' @ [26:48] ==> public constructor NameReplacingVisitor(replaceMap: Map<JsName, JsExpression>) defined in org.jetbrains.kotlin.js.inline.util.rewriters.NameReplacingVisitor[ClassConstructorDescriptorImpl]

'replaceMap' @ [26:69] ==> value-parameter replaceMap: Map<JsName, JsExpression> defined in org.jetbrains.kotlin.js.inline.util.replaceNames[ValueParameterDescriptorImpl]

'accept' @ [26:81] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (T..T?)): (T..T?) defined in org.jetbrains.kotlin.js.inline.util.rewriters.NameReplacingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> (T..T?)

'node' @ [26:88] ==> value-parameter node: T defined in org.jetbrains.kotlin.js.inline.util.replaceNames[ValueParameterDescriptorImpl]

'ThisReplacingVisitor' @ [30:5] ==> public constructor ThisReplacingVisitor(thisReplacement: JsExpression) defined in org.jetbrains.kotlin.js.inline.util.rewriters.ThisReplacingVisitor[ClassConstructorDescriptorImpl]

'replacement' @ [30:26] ==> value-parameter replacement: JsExpression defined in org.jetbrains.kotlin.js.inline.util.replaceThisReference[ValueParameterDescriptorImpl]

'accept' @ [30:39] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (T..T?)): (T..T?) defined in org.jetbrains.kotlin.js.inline.util.rewriters.ThisReplacingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> (T..T?)

'node' @ [30:46] ==> value-parameter node: T defined in org.jetbrains.kotlin.js.inline.util.replaceThisReference[ValueParameterDescriptorImpl]

