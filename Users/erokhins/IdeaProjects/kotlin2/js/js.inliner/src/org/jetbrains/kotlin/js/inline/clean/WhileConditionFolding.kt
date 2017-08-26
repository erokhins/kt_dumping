'body' @ [26:9] ==> public final val body: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding[PropertyDescriptorImpl]

'accept' @ [26:14] ==> public open fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [26:30] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [28:38] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'statement' @ [28:40] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'when (innerStatement) {
                    is JsWhile -> process(innerStatement, x.name)
                    is JsDoWhile -> process(innerStatement, x.name)
                    else -> super.visitLabel(x)
                }' @ [29:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'innerStatement' @ [29:23] ==> val innerStatement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitLabel[LocalVariableDescriptor]

'process' @ [30:35] ==> private final fun process(statement: JsWhile, name: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'innerStatement' @ [30:43] ==> val innerStatement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitLabel[LocalVariableDescriptor]

'x' @ [30:59] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [30:61] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'process' @ [31:37] ==> private final fun process(statement: JsDoWhile, name: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'innerStatement' @ [31:45] ==> val innerStatement: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitLabel[LocalVariableDescriptor]

'x' @ [31:61] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [31:63] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'super' @ [32:29] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitLabel' @ [32:35] ==> public open fun visitLabel(x: JsLabel): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [32:46] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'process' @ [37:17] ==> private final fun process(statement: JsWhile, name: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [37:25] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitWhile[ValueParameterDescriptorImpl]

'process' @ [41:17] ==> private final fun process(statement: JsDoWhile, name: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [41:25] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.visitDoWhile[ValueParameterDescriptorImpl]

'process' @ [45:17] ==> private final fun process(statement: JsWhile, name: JsName?, find: (JsStatement) -> JsStatement, remove: (JsStatement) -> JsStatement, combine: (JsExpression, JsExpression) -> JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'statement' @ [45:25] ==> value-parameter statement: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'name' @ [45:36] ==> value-parameter name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'first' @ [45:44] ==> private final fun first(statement: JsStatement): JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [45:50] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'removeFirst' @ [45:59] ==> private final fun removeFirst(statement: JsStatement): JsBlock defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [45:71] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'and' @ [45:99] ==> @NotNull public open fun and(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'a' @ [45:103] ==> value-parameter a: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'b' @ [45:106] ==> value-parameter b: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [49:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'hasContinue' @ [49:22] ==> private final fun hasContinue(statement: JsStatement, label: JsName?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding[SimpleFunctionDescriptorImpl]

'statement' @ [49:34] ==> value-parameter statement: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'body' @ [49:44] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'name' @ [49:50] ==> value-parameter name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'process' @ [50:21] ==> private final fun process(statement: JsWhile, name: JsName?, find: (JsStatement) -> JsStatement, remove: (JsStatement) -> JsStatement, combine: (JsExpression, JsExpression) -> JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'statement' @ [50:29] ==> value-parameter statement: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'name' @ [50:40] ==> value-parameter name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'last' @ [50:48] ==> private final fun last(statement: JsStatement): JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [50:53] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'removeLast' @ [50:62] ==> private final fun removeLast(statement: JsStatement): JsBlock defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'it' @ [50:73] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'and' @ [50:101] ==> @NotNull public open fun and(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'b' @ [50:105] ==> value-parameter b: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'a' @ [50:108] ==> value-parameter a: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [61:17] ==> value-parameter statement: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'body' @ [61:27] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [61:32] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [61:39] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[LazyClassReceiverParameterDescriptor]

'invoke' @ [64:33] ==> public abstract operator fun invoke(p1: JsStatement): JsStatement defined in kotlin.Function1[FunctionInvokeDescriptor]

'statement' @ [64:38] ==> value-parameter statement: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'body' @ [64:48] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'extractCondition' @ [65:37] ==> private final fun extractCondition(statement: JsStatement, label: JsName?): JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'first' @ [65:54] ==> val first: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'name' @ [65:61] ==> value-parameter name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'condition' @ [66:25] ==> val condition: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'statement' @ [67:25] ==> value-parameter statement: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'body' @ [67:35] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'invoke' @ [67:42] ==> public abstract operator fun invoke(p1: JsStatement): JsStatement defined in kotlin.Function1[FunctionInvokeDescriptor]

'statement' @ [67:49] ==> value-parameter statement: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'body' @ [67:59] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'statement' @ [68:49] ==> value-parameter statement: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'condition' @ [68:59] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'statement' @ [69:25] ==> value-parameter statement: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[ValueParameterDescriptorImpl]

'condition' @ [69:35] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'when {
                            JsBooleanLiteral.isTrue(existingCondition) -> condition
                            else -> combine(existingCondition, condition)
                        }' @ [69:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: (JsExpression..JsExpression?), entry1: (JsExpression..JsExpression?)): (JsExpression..JsExpression?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'isTrue' @ [70:46] ==> public open fun isTrue(@NotNull p0: JsExpression): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaMethodDescriptor]

'existingCondition' @ [70:53] ==> val existingCondition: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'condition' @ [70:75] ==> val condition: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'invoke' @ [71:37] ==> public abstract operator fun invoke(p1: JsExpression, p2: JsExpression): JsExpression defined in kotlin.Function2[FunctionInvokeDescriptor]

'existingCondition' @ [71:45] ==> val existingCondition: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'condition' @ [71:64] ==> val condition: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'changed' @ [73:25] ==> private final var changed: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding[PropertyDescriptorImpl]

'optimized' @ [74:25] ==> var optimized: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'optimized' @ [76:26] ==> var optimized: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.process[LocalVariableDescriptor]

'when (statement) {
                // Code like this
                //
                //     while (A) {
                //         break;
                //         B();
                //     }
                //
                // can be rewritten as
                //
                //     while (A && false) {
                //         B();
                //     }
                //
                // therefore for single `break` we should return `false`.
                is JsBreak -> {
                    val target = statement.label?.name
                    if (label == target) JsBooleanLiteral(false) else null
                }

                // Code like this
                //
                //     while (A) {
                //         if (!B)
                //             X;
                //         D();
                //     }
                //
                // where X is a statement, and we can extract condition `C` from it, can be rewritten as
                //
                //     while (A && (B || C)) {
                //         D()
                //     }
                // therefore we return B || C
                //
                // an example is
                //
                //     while (A) {
                //         if (!B)
                //             if (!C)
                //                 break;
                //         D()
                //     }
                //
                // applying this rule repeatedly we get while (A && (B || C)), which is correct

                is JsIf -> {
                    val then = statement.thenStatement
                    if (statement.elseStatement == null) {
                        val nextCondition = extractCondition(then, label)
                        val result: JsExpression? = when {
                            // Just a little optimization. When inner statement is a single `break`, `nextCondition` would be false.
                            // However, `A || false` can be rewritten as simply `A`
                            nextCondition == null -> null
                            JsBooleanLiteral.isFalse(nextCondition) -> JsAstUtils.notOptimized(statement.ifExpression)
                            else -> JsAstUtils.or(JsAstUtils.notOptimized(statement.ifExpression), nextCondition)
                        }
                        result
                    }
                    else {
                        null
                    }
                }

                // A single block containing a statement with extractable condition
                is JsBlock -> {
                    if (statement.statements.size == 1) extractCondition(statement.statements[0], label) else null
                }
                else -> null
            }' @ [91:99] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression?, entry1: JsExpression?, entry2: JsExpression?, entry3: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression?

'statement' @ [91:105] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'statement' @ [107:34] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'label' @ [107:44] ==> public final val JsBreak.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [107:51] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'if (label == target) JsBooleanLiteral(false) else null' @ [108:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsBooleanLiteral?, elseBranch: JsBooleanLiteral?): JsBooleanLiteral?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsBooleanLiteral?

'label' @ [108:25] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'target' @ [108:34] ==> val target: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[LocalVariableDescriptor]

'JsBooleanLiteral' @ [108:42] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'statement' @ [138:32] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'thenStatement' @ [138:42] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'if (statement.elseStatement == null) {
                        val nextCondition = extractCondition(then, label)
                        val result: JsExpression? = when {
                            // Just a little optimization. When inner statement is a single `break`, `nextCondition` would be false.
                            // However, `A || false` can be rewritten as simply `A`
                            nextCondition == null -> null
                            JsBooleanLiteral.isFalse(nextCondition) -> JsAstUtils.notOptimized(statement.ifExpression)
                            else -> JsAstUtils.or(JsAstUtils.notOptimized(statement.ifExpression), nextCondition)
                        }
                        result
                    }
                    else {
                        null
                    }' @ [139:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'statement' @ [139:25] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'elseStatement' @ [139:35] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'extractCondition' @ [140:45] ==> private final fun extractCondition(statement: JsStatement, label: JsName?): JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'then' @ [140:62] ==> val then: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[LocalVariableDescriptor]

'label' @ [140:68] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'when {
                            // Just a little optimization. When inner statement is a single `break`, `nextCondition` would be false.
                            // However, `A || false` can be rewritten as simply `A`
                            nextCondition == null -> null
                            JsBooleanLiteral.isFalse(nextCondition) -> JsAstUtils.notOptimized(statement.ifExpression)
                            else -> JsAstUtils.or(JsAstUtils.notOptimized(statement.ifExpression), nextCondition)
                        }' @ [141:53] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression?, entry1: JsExpression?, entry2: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression?

'nextCondition' @ [144:29] ==> val nextCondition: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[LocalVariableDescriptor]

'isFalse' @ [145:46] ==> public open fun isFalse(@NotNull p0: JsExpression): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaMethodDescriptor]

'nextCondition' @ [145:54] ==> val nextCondition: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[LocalVariableDescriptor]

'notOptimized' @ [145:83] ==> @NotNull public open fun notOptimized(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'statement' @ [145:96] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'ifExpression' @ [145:106] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'or' @ [146:48] ==> @NotNull public open fun or(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'notOptimized' @ [146:62] ==> @NotNull public open fun notOptimized(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'statement' @ [146:75] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'ifExpression' @ [146:85] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'nextCondition' @ [146:100] ==> val nextCondition: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[LocalVariableDescriptor]

'result' @ [148:25] ==> val result: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[LocalVariableDescriptor]

'if (statement.statements.size == 1) extractCondition(statement.statements[0], label) else null' @ [157:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'statement' @ [157:25] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'statements' @ [157:35] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'size' @ [157:46] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'extractCondition' @ [157:57] ==> private final fun extractCondition(statement: JsStatement, label: JsName?): JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>[SimpleFunctionDescriptorImpl]

'statement' @ [157:74] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'statements' @ [157:84] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'label' @ [157:99] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.extractCondition[ValueParameterDescriptorImpl]

'when (statement) {
                is JsBlock -> statement.statements.firstOrNull() ?: statement
                else -> statement
            }' @ [162:57] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsStatement, entry1: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsStatement

'statement' @ [162:63] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.first[ValueParameterDescriptorImpl]

'statement' @ [163:31] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.first[ValueParameterDescriptorImpl]

'statements' @ [163:41] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [163:52] ==> public fun <T> List<(JsStatement..JsStatement?)>.firstOrNull(): JsStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'statement' @ [163:69] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.first[ValueParameterDescriptorImpl]

'statement' @ [164:25] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.first[ValueParameterDescriptorImpl]

'when (statement) {
                is JsBlock -> {
                    val statements = statement.statements
                    if (statements.isNotEmpty()) {
                        statements.removeAt(0)
                    }
                    statement
                }
                else -> JsBlock()
            }' @ [167:63] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsBlock, entry1: JsBlock): JsBlock[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsBlock

'statement' @ [167:69] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeFirst[ValueParameterDescriptorImpl]

'statement' @ [169:38] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeFirst[ValueParameterDescriptorImpl]

'statements' @ [169:48] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'statements' @ [170:25] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeFirst[LocalVariableDescriptor]

'isNotEmpty' @ [170:36] ==> @InlineOnly public inline fun <T> Collection<(JsStatement..JsStatement?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'statements' @ [171:25] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeFirst[LocalVariableDescriptor]

'removeAt' @ [171:36] ==> public abstract fun removeAt(index: Int): (JsStatement..JsStatement?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statement' @ [173:21] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeFirst[ValueParameterDescriptorImpl]

'JsBlock' @ [175:25] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'when (statement) {
                is JsBlock -> statement.statements.lastOrNull() ?: statement
                else -> statement
            }' @ [178:56] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsStatement, entry1: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsStatement

'statement' @ [178:62] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.last[ValueParameterDescriptorImpl]

'statement' @ [179:31] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.last[ValueParameterDescriptorImpl]

'statements' @ [179:41] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'lastOrNull' @ [179:52] ==> public fun <T> List<(JsStatement..JsStatement?)>.lastOrNull(): JsStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'statement' @ [179:68] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.last[ValueParameterDescriptorImpl]

'statement' @ [180:25] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.last[ValueParameterDescriptorImpl]

'when (statement) {
                is JsBlock -> {
                    val statements = statement.statements
                    if (statements.isNotEmpty()) {
                        statements.removeAt(statements.lastIndex)
                    }
                    statement
                }
                else -> JsBlock()
            }' @ [183:62] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsBlock, entry1: JsBlock): JsBlock[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsBlock

'statement' @ [183:68] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeLast[ValueParameterDescriptorImpl]

'statement' @ [185:38] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeLast[ValueParameterDescriptorImpl]

'statements' @ [185:48] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'statements' @ [186:25] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeLast[LocalVariableDescriptor]

'isNotEmpty' @ [186:36] ==> @InlineOnly public inline fun <T> Collection<(JsStatement..JsStatement?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'statements' @ [187:25] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeLast[LocalVariableDescriptor]

'removeAt' @ [187:36] ==> public abstract fun removeAt(index: Int): (JsStatement..JsStatement?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [187:45] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeLast[LocalVariableDescriptor]

'lastIndex' @ [187:56] ==> public val <T> List<(JsStatement..JsStatement?)>.lastIndex: Int defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'statement' @ [189:21] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.apply.<no name provided>.removeLast[ValueParameterDescriptorImpl]

'JsBlock' @ [191:25] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'changed' @ [197:16] ==> private final var changed: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding[PropertyDescriptorImpl]

'statement' @ [202:9] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue[ValueParameterDescriptorImpl]

'accept' @ [202:19] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [202:35] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [206:28] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitContinue[ValueParameterDescriptorImpl]

'label' @ [206:30] ==> public final val JsContinue.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [206:37] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'if (name == null) {
                    if (level == 0) {
                        found = true
                    }
                }
                else if (name == label) {
                    found = true
                }' @ [207:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'name' @ [207:21] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitContinue[LocalVariableDescriptor]

'level' @ [208:25] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'found' @ [209:25] ==> var found: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue[LocalVariableDescriptor]

'name' @ [212:26] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitContinue[LocalVariableDescriptor]

'label' @ [212:34] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue[ValueParameterDescriptorImpl]

'found' @ [213:21] ==> var found: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue[LocalVariableDescriptor]

'level' @ [218:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'super' @ [219:17] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFor' @ [219:23] ==> public open fun visitFor(x: JsFor): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [219:32] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'level' @ [220:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'level' @ [224:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'super' @ [225:17] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitWhile' @ [225:23] ==> public open fun visitWhile(x: JsWhile): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [225:34] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitWhile[ValueParameterDescriptorImpl]

'level' @ [226:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'level' @ [230:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'super' @ [231:17] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitDoWhile' @ [231:23] ==> public open fun visitDoWhile(x: JsDoWhile): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [231:36] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitDoWhile[ValueParameterDescriptorImpl]

'level' @ [232:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'level' @ [236:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'super' @ [237:17] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitForIn' @ [237:23] ==> public open fun visitForIn(x: JsForIn): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [237:34] ==> value-parameter x: JsForIn defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitForIn[ValueParameterDescriptorImpl]

'level' @ [238:17] ==> private final var level: Int defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[PropertyDescriptorImpl]

'!' @ [244:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'found' @ [244:22] ==> var found: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue[LocalVariableDescriptor]

'super' @ [245:21] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitElement' @ [245:27] ==> protected/*protected and package*/ open fun visitElement(@NotNull node: JsNode): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaMethodDescriptor]

'node' @ [245:40] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue.<no name provided>.visitElement[ValueParameterDescriptorImpl]

'found' @ [249:16] ==> var found: Boolean defined in org.jetbrains.kotlin.js.inline.clean.WhileConditionFolding.hasContinue[LocalVariableDescriptor]

