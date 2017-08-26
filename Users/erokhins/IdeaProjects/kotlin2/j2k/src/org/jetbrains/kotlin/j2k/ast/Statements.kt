'Element' @ [22:28] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'Statement' @ [23:20] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'Statement' @ [29:59] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [31:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.DeclarationStatement.generateCode[ValueParameterDescriptorImpl]

'append' @ [31:17] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'elements' @ [31:24] ==> public final val elements: List<Element> defined in org.jetbrains.kotlin.j2k.ast.DeclarationStatement[PropertyDescriptorImpl]

'Expression' @ [35:68] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [37:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ExpressionListStatement.generateCode[ValueParameterDescriptorImpl]

'append' @ [37:17] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'expressions' @ [37:24] ==> public final val expressions: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.ExpressionListStatement[PropertyDescriptorImpl]

'Statement' @ [41:72] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [43:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.LabeledStatement.generateCode[ValueParameterDescriptorImpl]

'name' @ [43:24] ==> public final val name: Identifier defined in org.jetbrains.kotlin.j2k.ast.LabeledStatement[PropertyDescriptorImpl]

'statement' @ [43:58] ==> public final val statement: Element defined in org.jetbrains.kotlin.j2k.ast.LabeledStatement[PropertyDescriptorImpl]

'Statement' @ [47:84] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [49:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement.generateCode[ValueParameterDescriptorImpl]

'label' @ [50:13] ==> public final val label: Identifier? defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement[PropertyDescriptorImpl]

'builder' @ [51:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement.generateCode[ValueParameterDescriptorImpl]

'label' @ [51:39] ==> public final val label: Identifier? defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement[PropertyDescriptorImpl]

'builder' @ [53:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement.generateCode[ValueParameterDescriptorImpl]

'expression' @ [53:35] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement[PropertyDescriptorImpl]

'Expression' @ [62:5] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'if (singleLine) " " else "\n"' @ [64:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'singleLine' @ [64:26] ==> value-parameter singleLine: Boolean defined in org.jetbrains.kotlin.j2k.ast.IfStatement.<init>[ValueParameterDescriptorImpl]

'if (singleLine || elseStatement is IfStatement) " " else "\n"' @ [65:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'singleLine' @ [65:35] ==> value-parameter singleLine: Boolean defined in org.jetbrains.kotlin.j2k.ast.IfStatement.<init>[ValueParameterDescriptorImpl]

'elseStatement' @ [65:49] ==> public final val elseStatement: Element defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'builder' @ [68:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.IfStatement.generateCode[ValueParameterDescriptorImpl]

'condition' @ [68:38] ==> public final val condition: Expression defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'br' @ [68:66] ==> private final val br: String defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'thenStatement' @ [68:76] ==> public final val thenStatement: Element defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'wrapToBlockIfRequired' @ [68:90] ==> public fun Element.wrapToBlockIfRequired(): Element defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'if (!elseStatement.isEmpty) {
            builder append br append "else" append brAfterElse append elseStatement.wrapToBlockIfRequired()
        }
        else if (thenStatement.isEmpty) {
            builder append ";"
        }' @ [69:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'!' @ [69:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'elseStatement' @ [69:14] ==> public final val elseStatement: Element defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'isEmpty' @ [69:28] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'builder' @ [70:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.IfStatement.generateCode[ValueParameterDescriptorImpl]

'br' @ [70:28] ==> private final val br: String defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'brAfterElse' @ [70:52] ==> private final val brAfterElse: String defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'elseStatement' @ [70:71] ==> public final val elseStatement: Element defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'wrapToBlockIfRequired' @ [70:85] ==> public fun Element.wrapToBlockIfRequired(): Element defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'thenStatement' @ [72:18] ==> public final val thenStatement: Element defined in org.jetbrains.kotlin.j2k.ast.IfStatement[PropertyDescriptorImpl]

'isEmpty' @ [72:32] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'builder' @ [73:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.IfStatement.generateCode[ValueParameterDescriptorImpl]

'Statement' @ [80:91] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'if (singleLine) " " else "\n"' @ [81:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'singleLine' @ [81:26] ==> value-parameter singleLine: Boolean defined in org.jetbrains.kotlin.j2k.ast.WhileStatement.<init>[ValueParameterDescriptorImpl]

'builder' @ [84:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.WhileStatement.generateCode[ValueParameterDescriptorImpl]

'condition' @ [84:41] ==> public final val condition: Expression defined in org.jetbrains.kotlin.j2k.ast.WhileStatement[PropertyDescriptorImpl]

'br' @ [84:69] ==> private final val br: String defined in org.jetbrains.kotlin.j2k.ast.WhileStatement[PropertyDescriptorImpl]

'body' @ [84:79] ==> public final val body: Element defined in org.jetbrains.kotlin.j2k.ast.WhileStatement[PropertyDescriptorImpl]

'wrapToBlockIfRequired' @ [84:84] ==> public fun Element.wrapToBlockIfRequired(): Element defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'body' @ [85:13] ==> public final val body: Element defined in org.jetbrains.kotlin.j2k.ast.WhileStatement[PropertyDescriptorImpl]

'isEmpty' @ [85:18] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'builder' @ [86:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.WhileStatement.generateCode[ValueParameterDescriptorImpl]

'Statement' @ [91:93] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'if (singleLine) " " else "\n"' @ [92:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'singleLine' @ [92:26] ==> value-parameter singleLine: Boolean defined in org.jetbrains.kotlin.j2k.ast.DoWhileStatement.<init>[ValueParameterDescriptorImpl]

'builder' @ [95:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.DoWhileStatement.generateCode[ValueParameterDescriptorImpl]

'br' @ [95:36] ==> private final val br: String defined in org.jetbrains.kotlin.j2k.ast.DoWhileStatement[PropertyDescriptorImpl]

'body' @ [95:46] ==> public final val body: Element defined in org.jetbrains.kotlin.j2k.ast.DoWhileStatement[PropertyDescriptorImpl]

'wrapToBlockIfRequired' @ [95:51] ==> public fun Element.wrapToBlockIfRequired(): Element defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'br' @ [95:82] ==> private final val br: String defined in org.jetbrains.kotlin.j2k.ast.DoWhileStatement[PropertyDescriptorImpl]

'condition' @ [95:109] ==> public final val condition: Expression defined in org.jetbrains.kotlin.j2k.ast.DoWhileStatement[PropertyDescriptorImpl]

'Statement' @ [105:5] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'if (singleLine) " " else "\n"' @ [107:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'singleLine' @ [107:26] ==> value-parameter singleLine: Boolean defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement.<init>[ValueParameterDescriptorImpl]

'builder' @ [110:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement.generateCode[ValueParameterDescriptorImpl]

'variableName' @ [110:39] ==> public final val variableName: Identifier defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[PropertyDescriptorImpl]

'explicitVariableType' @ [111:13] ==> public final val explicitVariableType: Type? defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[PropertyDescriptorImpl]

'builder' @ [112:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement.generateCode[ValueParameterDescriptorImpl]

'explicitVariableType' @ [112:39] ==> public final val explicitVariableType: Type? defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[PropertyDescriptorImpl]

'builder' @ [114:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement.generateCode[ValueParameterDescriptorImpl]

'collection' @ [114:38] ==> public final val collection: Expression defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[PropertyDescriptorImpl]

'br' @ [114:67] ==> private final val br: String defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[PropertyDescriptorImpl]

'body' @ [114:77] ==> public final val body: Element defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[PropertyDescriptorImpl]

'wrapToBlockIfRequired' @ [114:82] ==> public fun Element.wrapToBlockIfRequired(): Element defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'body' @ [115:13] ==> public final val body: Element defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[PropertyDescriptorImpl]

'isEmpty' @ [115:18] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'builder' @ [116:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement.generateCode[ValueParameterDescriptorImpl]

'Identifier' @ [121:46] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'Empty' @ [121:57] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'Statement' @ [121:66] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [123:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.BreakStatement.generateCode[ValueParameterDescriptorImpl]

'append' @ [123:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendWithPrefix' @ [123:33] ==> public fun CodeBuilder.appendWithPrefix(element: Element, prefix: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'label' @ [123:50] ==> public final val label: Identifier defined in org.jetbrains.kotlin.j2k.ast.BreakStatement[PropertyDescriptorImpl]

'Identifier' @ [127:49] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Identifier[FakeCallableDescriptorForObject]

'Empty' @ [127:60] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'Statement' @ [127:69] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [129:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ContinueStatement.generateCode[ValueParameterDescriptorImpl]

'append' @ [129:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendWithPrefix' @ [129:36] ==> public fun CodeBuilder.appendWithPrefix(element: Element, prefix: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'label' @ [129:53] ==> public final val label: Identifier defined in org.jetbrains.kotlin.j2k.ast.ContinueStatement[PropertyDescriptorImpl]

'Statement' @ [135:100] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [137:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TryStatement.generateCode[ValueParameterDescriptorImpl]

'append' @ [137:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [137:33] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'block' @ [137:40] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.TryStatement[PropertyDescriptorImpl]

'append' @ [137:47] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [137:60] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'catches' @ [137:67] ==> public final val catches: List<CatchStatement> defined in org.jetbrains.kotlin.j2k.ast.TryStatement[PropertyDescriptorImpl]

'append' @ [137:82] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'!' @ [138:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'finallyBlock' @ [138:14] ==> public final val finallyBlock: Block defined in org.jetbrains.kotlin.j2k.ast.TryStatement[PropertyDescriptorImpl]

'isEmpty' @ [138:27] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'builder' @ [139:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TryStatement.generateCode[ValueParameterDescriptorImpl]

'finallyBlock' @ [139:47] ==> public final val finallyBlock: Block defined in org.jetbrains.kotlin.j2k.ast.TryStatement[PropertyDescriptorImpl]

'Expression' @ [144:52] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [146:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ThrowStatement.generateCode[ValueParameterDescriptorImpl]

'expression' @ [146:40] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.ThrowStatement[PropertyDescriptorImpl]

'Statement' @ [150:75] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [152:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.CatchStatement.generateCode[ValueParameterDescriptorImpl]

'variable' @ [152:41] ==> public final val variable: FunctionParameter defined in org.jetbrains.kotlin.j2k.ast.CatchStatement[PropertyDescriptorImpl]

'block' @ [152:69] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.CatchStatement[PropertyDescriptorImpl]

'Statement' @ [158:85] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [160:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.WhenStatement.generateCode[ValueParameterDescriptorImpl]

'append' @ [160:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [160:34] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'subject' @ [160:41] ==> public final val subject: Expression defined in org.jetbrains.kotlin.j2k.ast.WhenStatement[PropertyDescriptorImpl]

'append' @ [160:50] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [160:66] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'caseContainers' @ [160:73] ==> public final val caseContainers: List<WhenEntry> defined in org.jetbrains.kotlin.j2k.ast.WhenStatement[PropertyDescriptorImpl]

'append' @ [160:95] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'Statement' @ [164:80] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [166:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.WhenEntry.generateCode[ValueParameterDescriptorImpl]

'append' @ [166:17] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k in file CodeBuilder.kt[SimpleFunctionDescriptorImpl]

'selectors' @ [166:24] ==> public final val selectors: List<WhenEntrySelector> defined in org.jetbrains.kotlin.j2k.ast.WhenEntry[PropertyDescriptorImpl]

'append' @ [166:41] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [166:56] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'body' @ [166:63] ==> public final val body: Statement defined in org.jetbrains.kotlin.j2k.ast.WhenEntry[PropertyDescriptorImpl]

'Statement' @ [170:36] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'WhenEntrySelector' @ [172:60] ==> public constructor WhenEntrySelector() defined in org.jetbrains.kotlin.j2k.ast.WhenEntrySelector[ClassConstructorDescriptorImpl]

'builder' @ [174:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ValueWhenEntrySelector.generateCode[ValueParameterDescriptorImpl]

'append' @ [174:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'expression' @ [174:24] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.ValueWhenEntrySelector[PropertyDescriptorImpl]

'WhenEntrySelector' @ [178:31] ==> public constructor WhenEntrySelector() defined in org.jetbrains.kotlin.j2k.ast.WhenEntrySelector[ClassConstructorDescriptorImpl]

'builder' @ [180:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ElseWhenEntrySelector.generateCode[ValueParameterDescriptorImpl]

'append' @ [180:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'Statement' @ [186:77] ==> public constructor Statement() defined in org.jetbrains.kotlin.j2k.ast.Statement[ClassConstructorDescriptorImpl]

'builder' @ [188:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.SynchronizedStatement.generateCode[ValueParameterDescriptorImpl]

'expression' @ [188:48] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.SynchronizedStatement[PropertyDescriptorImpl]

'block' @ [188:78] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.SynchronizedStatement[PropertyDescriptorImpl]

