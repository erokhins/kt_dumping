'AbstractTranslator' @ [35:5] ==> protected/*protected and package*/ constructor AbstractTranslator(@NotNull context: TranslationContext) defined in org.jetbrains.kotlin.js.translate.general.AbstractTranslator[JavaClassConstructorDescriptor]

'context' @ [35:24] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.<init>[ValueParameterDescriptorImpl]

'generateValuesFunction' @ [37:9] ==> private final fun generateValuesFunction(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[SimpleFunctionDescriptorImpl]

'generateValueOfFunction' @ [38:9] ==> private final fun generateValueOfFunction(): Unit defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[SimpleFunctionDescriptorImpl]

'createFunction' @ [42:24] ==> private final fun createFunction(functionDescriptor: FunctionDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[SimpleFunctionDescriptorImpl]

'getFunctionByName' @ [42:55] ==> @NotNull public open fun getFunctionByName(@NotNull p0: MemberScope, @NotNull p1: Name): FunctionDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [42:73] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'staticScope' @ [42:84] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'ENUM_VALUES' @ [42:113] ==> public final val ENUM_VALUES: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'entries' @ [44:22] ==> public final val entries: List<ClassDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'map' @ [44:30] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> (JsExpression..JsExpression?)): List<(JsExpression..JsExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'JsInvocation' @ [45:13] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'pureFqn' @ [45:37] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [45:45] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'getNameForObjectInstance' @ [45:55] ==> @NotNull public open fun getNameForObjectInstance(@NotNull descriptor: ClassDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'it' @ [45:80] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValuesFunction.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [45:92] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'psi' @ [45:99] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'function' @ [47:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValuesFunction[LocalVariableDescriptor]

'body' @ [47:18] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [47:23] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsReturn' @ [47:37] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'JsArrayLiteral' @ [47:46] ==> public constructor JsArrayLiteral(p0: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayLiteral[JavaClassConstructorDescriptor]

'values' @ [47:61] ==> val values: List<(JsExpression..JsExpression?)> defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValuesFunction[LocalVariableDescriptor]

'source' @ [47:69] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayLiteral[JavaMethodDescriptor]

'psi' @ [47:76] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'apply' @ [47:82] ==> @InlineOnly public inline fun <T> JsReturn.apply(block: JsReturn.() -> Unit): JsReturn defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsReturn

'source' @ [47:90] ==> public final var JsReturn.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [47:99] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'createFunction' @ [51:24] ==> private final fun createFunction(functionDescriptor: FunctionDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[SimpleFunctionDescriptorImpl]

'getFunctionByName' @ [51:55] ==> @NotNull public open fun getFunctionByName(@NotNull p0: MemberScope, @NotNull p1: Name): FunctionDescriptor defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [51:73] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'staticScope' @ [51:84] ==> public final val ClassDescriptor.staticScope: MemberScope[MyPropertyDescriptor]

'ENUM_VALUE_OF' @ [51:113] ==> public final val ENUM_VALUE_OF: (Name..Name?) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaPropertyDescriptor]

'declareTemporaryName' @ [53:33] ==> @NotNull public open fun declareTemporaryName(@NotNull p0: String): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'function' @ [54:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'parameters' @ [54:18] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'JsParameter' @ [54:32] ==> public constructor JsParameter(@NotNull p0: JsName) defined in org.jetbrains.kotlin.js.backend.ast.JsParameter[JavaClassConstructorDescriptor]

'nameParam' @ [54:44] ==> val nameParam: JsName defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'entries' @ [56:23] ==> public final val entries: List<ClassDescriptor> defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'map' @ [56:31] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> JsCase): List<JsCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> JsCase

'JsCase' @ [57:13] ==> public constructor JsCase() defined in org.jetbrains.kotlin.js.backend.ast.JsCase[JavaClassConstructorDescriptor]

'apply' @ [57:22] ==> @InlineOnly public inline fun <T> JsCase.apply(block: JsCase.() -> Unit): JsCase defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsCase

'caseExpression' @ [58:17] ==> public final var JsCase.caseExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'JsStringLiteral' @ [58:34] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'entry' @ [58:50] ==> value-parameter entry: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [58:56] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [58:61] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'source' @ [58:73] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaMethodDescriptor]

'psi' @ [58:80] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'statements' @ [59:17] ==> public final val JsCase.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'JsReturn' @ [59:31] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'JsInvocation' @ [59:40] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'pureFqn' @ [59:64] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'context' @ [59:72] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'getNameForObjectInstance' @ [59:82] ==> @NotNull public open fun getNameForObjectInstance(@NotNull descriptor: ClassDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'entry' @ [59:107] ==> value-parameter entry: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction.<anonymous>[ValueParameterDescriptorImpl]

'source' @ [59:122] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'psi' @ [59:129] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'apply' @ [60:26] ==> @InlineOnly public inline fun <T> JsReturn.apply(block: JsReturn.() -> Unit): JsReturn defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsReturn

'source' @ [60:34] ==> public final var JsReturn.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [60:43] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'source' @ [61:17] ==> public final var JsCase.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [61:26] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'JsBinaryOperation' @ [65:23] ==> public constructor JsBinaryOperation(@NotNull p0: JsBinaryOperator, @Nullable p1: JsExpression?, @Nullable p2: JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaClassConstructorDescriptor]

'ADD' @ [65:58] ==> enum entry ADD defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'JsStringLiteral' @ [66:41] ==> public constructor JsStringLiteral(p0: (String..String?)) defined in org.jetbrains.kotlin.js.backend.ast.JsStringLiteral[JavaClassConstructorDescriptor]

'descriptor' @ [66:77] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'fqNameSafe' @ [66:88] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'nameParam' @ [67:41] ==> val nameParam: JsName defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'makeRef' @ [67:51] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'JsExpressionStatement' @ [68:30] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'JsInvocation' @ [68:52] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'throwIllegalStateExceptionFunRef' @ [68:71] ==> @NotNull public open fun throwIllegalStateExceptionFunRef(): JsExpression defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'message' @ [68:107] ==> val message: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'source' @ [68:116] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaMethodDescriptor]

'psi' @ [68:123] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'if (clauses.isNotEmpty()) {
            val defaultCase = JsDefault().apply {
                statements += throwStatement
                source = psi
            }
            function.body.statements += JsSwitch(nameParam.makeRef().source(psi), clauses + defaultCase).apply { source = psi }
        }
        else {
            function.body.statements += throwStatement
        }' @ [70:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'clauses' @ [70:13] ==> val clauses: List<JsCase> defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'isNotEmpty' @ [70:21] ==> @InlineOnly public inline fun <T> Collection<JsCase>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsCase

'JsDefault' @ [71:31] ==> public constructor JsDefault() defined in org.jetbrains.kotlin.js.backend.ast.JsDefault[JavaClassConstructorDescriptor]

'apply' @ [71:43] ==> @InlineOnly public inline fun <T> JsDefault.apply(block: JsDefault.() -> Unit): JsDefault defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsDefault

'statements' @ [72:17] ==> public final val JsDefault.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>?)[MyPropertyDescriptor]

'throwStatement' @ [72:31] ==> val throwStatement: JsExpressionStatement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'source' @ [73:17] ==> public final var JsDefault.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [73:26] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'function' @ [75:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'body' @ [75:22] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [75:27] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'JsSwitch' @ [75:41] ==> public constructor JsSwitch(p0: (JsExpression..JsExpression?), p1: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)) defined in org.jetbrains.kotlin.js.backend.ast.JsSwitch[JavaClassConstructorDescriptor]

'nameParam' @ [75:50] ==> val nameParam: JsName defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'makeRef' @ [75:60] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'source' @ [75:70] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'psi' @ [75:77] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'clauses' @ [75:83] ==> val clauses: List<JsCase> defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'defaultCase' @ [75:93] ==> val defaultCase: JsDefault defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'apply' @ [75:106] ==> @InlineOnly public inline fun <T> JsSwitch.apply(block: JsSwitch.() -> Unit): JsSwitch defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsSwitch

'source' @ [75:114] ==> public final var JsSwitch.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [75:123] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'function' @ [78:13] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'body' @ [78:22] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'statements' @ [78:27] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'throwStatement' @ [78:41] ==> val throwStatement: JsExpressionStatement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.generateValueOfFunction[LocalVariableDescriptor]

'context' @ [83:24] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'getFunctionObject' @ [83:34] ==> @NotNull public open fun getFunctionObject(@NotNull descriptor: CallableDescriptor): JsFunction defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'functionDescriptor' @ [83:52] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[ValueParameterDescriptorImpl]

'function' @ [84:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

'name' @ [84:18] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'context' @ [84:25] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'getInnerNameForDescriptor' @ [84:35] ==> @NotNull public open fun getInnerNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'functionDescriptor' @ [84:61] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[ValueParameterDescriptorImpl]

'function' @ [85:9] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

'source' @ [85:18] ==> public final var JsFunction.source: (Any..Any?)[MyPropertyDescriptor]

'psi' @ [85:27] ==> private final val psi: PsiElement defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'context' @ [86:9] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [86:19] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'function' @ [86:43] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

'makeStmt' @ [86:52] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsFunction[JavaMethodDescriptor]

'context' @ [88:24] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'getInnerReference' @ [88:34] ==> @NotNull public open fun getInnerReference(@NotNull descriptor: DeclarationDescriptor): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'descriptor' @ [88:52] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[PropertyDescriptorImpl]

'function' @ [89:27] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

'name' @ [89:36] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'makeRef' @ [89:41] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'assignment' @ [90:37] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'JsNameRef' @ [90:48] ==> public constructor JsNameRef(@NotNull p0: JsName, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'context' @ [90:58] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'getNameForDescriptor' @ [90:68] ==> @NotNull public open fun getNameForDescriptor(@NotNull descriptor: DeclarationDescriptor): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'functionDescriptor' @ [90:89] ==> value-parameter functionDescriptor: FunctionDescriptor defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[ValueParameterDescriptorImpl]

'classRef' @ [90:110] ==> val classRef: JsExpression defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

'functionRef' @ [90:121] ==> val functionRef: JsNameRef defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

'context' @ [91:9] ==> @NotNull protected/*protected and package*/ open fun context(): TranslationContext defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator[JavaMethodDescriptor]

'addDeclarationStatement' @ [91:19] ==> public open fun addDeclarationStatement(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'assignment' @ [91:43] ==> val assignment: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

'makeStmt' @ [91:54] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'function' @ [93:16] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.translate.declaration.EnumTranslator.createFunction[LocalVariableDescriptor]

