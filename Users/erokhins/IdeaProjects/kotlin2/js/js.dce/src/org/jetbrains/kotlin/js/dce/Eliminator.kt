'JsVisitorWithContextImpl' @ [21:64] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'removeIfNecessary' @ [22:71] ==> private final fun removeIfNecessary(x: JsNode, ctx: JsContext<*>): Boolean defined in org.jetbrains.kotlin.js.dce.Eliminator[SimpleFunctionDescriptorImpl]

'x' @ [22:89] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.dce.Eliminator.visit[ValueParameterDescriptorImpl]

'ctx' @ [22:92] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.dce.Eliminator.visit[ValueParameterDescriptorImpl]

'removeIfNecessary' @ [24:80] ==> private final fun removeIfNecessary(x: JsNode, ctx: JsContext<*>): Boolean defined in org.jetbrains.kotlin.js.dce.Eliminator[SimpleFunctionDescriptorImpl]

'x' @ [24:98] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.dce.Eliminator.visit[ValueParameterDescriptorImpl]

'ctx' @ [24:101] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.dce.Eliminator.visit[ValueParameterDescriptorImpl]

'removeIfNecessary' @ [26:67] ==> private final fun removeIfNecessary(x: JsNode, ctx: JsContext<*>): Boolean defined in org.jetbrains.kotlin.js.dce.Eliminator[SimpleFunctionDescriptorImpl]

'x' @ [26:85] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.dce.Eliminator.visit[ValueParameterDescriptorImpl]

'ctx' @ [26:88] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.dce.Eliminator.visit[ValueParameterDescriptorImpl]

'x' @ [29:13] ==> value-parameter x: JsNode defined in org.jetbrains.kotlin.js.dce.Eliminator.removeIfNecessary[ValueParameterDescriptorImpl]

'analysisResult' @ [29:18] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.Eliminator[PropertyDescriptorImpl]

'astNodesToEliminate' @ [29:33] ==> public abstract val astNodesToEliminate: Set<JsNode> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'ctx' @ [30:13] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.dce.Eliminator.removeIfNecessary[ValueParameterDescriptorImpl]

'removeMe' @ [30:17] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'analysisResult' @ [33:20] ==> private final val analysisResult: AnalysisResult defined in org.jetbrains.kotlin.js.dce.Eliminator[PropertyDescriptorImpl]

'nodeMap' @ [33:35] ==> public abstract val nodeMap: Map<JsNode, Context.Node> defined in org.jetbrains.kotlin.js.dce.AnalysisResult[PropertyDescriptorImpl]

'x' @ [33:43] ==> value-parameter x: JsNode defined in org.jetbrains.kotlin.js.dce.Eliminator.removeIfNecessary[ValueParameterDescriptorImpl]

'original' @ [33:47] ==> public final var original: Context.Node defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

'if (!isUsed(node)) {
            ctx.removeMe()
            false
        }
        else {
            true
        }' @ [34:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'!' @ [34:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUsed' @ [34:21] ==> private final fun isUsed(node: Context.Node?): Boolean defined in org.jetbrains.kotlin.js.dce.Eliminator[SimpleFunctionDescriptorImpl]

'node' @ [34:28] ==> val node: Context.Node? defined in org.jetbrains.kotlin.js.dce.Eliminator.removeIfNecessary[LocalVariableDescriptor]

'ctx' @ [35:13] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.dce.Eliminator.removeIfNecessary[ValueParameterDescriptorImpl]

'removeMe' @ [35:17] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'x' @ [44:13] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.dce.Eliminator.endVisit[ValueParameterDescriptorImpl]

'vars' @ [44:15] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'isEmpty' @ [44:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'ctx' @ [45:13] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.dce.Eliminator.endVisit[ValueParameterDescriptorImpl]

'removeMe' @ [45:17] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'node' @ [49:56] ==> value-parameter node: Context.Node? defined in org.jetbrains.kotlin.js.dce.Eliminator.isUsed[ValueParameterDescriptorImpl]

'node' @ [49:72] ==> value-parameter node: Context.Node? defined in org.jetbrains.kotlin.js.dce.Eliminator.isUsed[ValueParameterDescriptorImpl]

'declarationReachable' @ [49:77] ==> public final var declarationReachable: Boolean defined in org.jetbrains.kotlin.js.dce.Context.Node[PropertyDescriptorImpl]

