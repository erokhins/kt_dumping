'JsVisitorWithContextImpl' @ [21:90] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [27:22] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'label' @ [27:24] ==> public final val JsContinue.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [27:31] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'if (target == null) loopNestingLevel == 0 else target == loopLabelName' @ [28:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'target' @ [28:33] ==> val target: JsName? defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[LocalVariableDescriptor]

'loopNestingLevel' @ [28:49] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'target' @ [28:76] ==> val target: JsName? defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[LocalVariableDescriptor]

'loopLabelName' @ [28:86] ==> public final val loopLabelName: JsName? defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'shouldReplace' @ [29:13] ==> val shouldReplace: Boolean defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[LocalVariableDescriptor]

'ctx' @ [30:13] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'replaceMe' @ [30:17] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsBreak..JsBreak?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsBreak..org.jetbrains.kotlin.js.backend.ast.JsBreak?)

'JsBreak' @ [30:27] ==> public constructor JsBreak(p0: (JsNameRef..JsNameRef?)) defined in org.jetbrains.kotlin.js.backend.ast.JsBreak[JavaClassConstructorDescriptor]

'guardLabelName' @ [30:35] ==> public final val guardLabelName: JsName defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'makeRef' @ [30:50] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'loopLabelName' @ [37:13] ==> public final val loopLabelName: JsName? defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'loopNestingLevel' @ [39:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'super' @ [40:16] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'visit' @ [40:22] ==> public open fun visit(@NotNull p0: JsWhile, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [40:28] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'ctx' @ [40:31] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'super' @ [44:9] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'endVisit' @ [44:15] ==> public open fun endVisit(@NotNull p0: JsWhile, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [44:24] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'ctx' @ [44:27] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'loopNestingLevel' @ [45:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'loopLabelName' @ [49:13] ==> public final val loopLabelName: JsName? defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'loopNestingLevel' @ [51:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'super' @ [52:16] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'visit' @ [52:22] ==> public open fun visit(@NotNull p0: JsDoWhile, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [52:28] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'ctx' @ [52:31] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'super' @ [56:9] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'endVisit' @ [56:15] ==> public open fun endVisit(@NotNull p0: JsDoWhile, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [56:24] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'ctx' @ [56:27] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'loopNestingLevel' @ [57:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'loopLabelName' @ [61:13] ==> public final val loopLabelName: JsName? defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'loopNestingLevel' @ [63:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'super' @ [64:16] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'visit' @ [64:22] ==> public open fun visit(@NotNull p0: JsFor, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [64:28] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'ctx' @ [64:31] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'super' @ [68:9] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'endVisit' @ [68:15] ==> public open fun endVisit(@NotNull p0: JsFor, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [68:24] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'ctx' @ [68:27] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'loopNestingLevel' @ [69:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'loopLabelName' @ [73:13] ==> public final val loopLabelName: JsName? defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'loopNestingLevel' @ [75:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

'super' @ [76:16] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'visit' @ [76:22] ==> public open fun visit(@NotNull p0: JsForIn, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [76:28] ==> value-parameter x: JsForIn defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'ctx' @ [76:31] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.visit[ValueParameterDescriptorImpl]

'super' @ [80:9] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[LazyClassReceiverParameterDescriptor]

'endVisit' @ [80:15] ==> public open fun endVisit(@NotNull p0: JsForIn, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [80:24] ==> value-parameter x: JsForIn defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'ctx' @ [80:27] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor.endVisit[ValueParameterDescriptorImpl]

'loopNestingLevel' @ [81:9] ==> public final var loopNestingLevel: Int defined in org.jetbrains.kotlin.js.inline.util.rewriters.ContinueReplacingVisitor[PropertyDescriptorImpl]

