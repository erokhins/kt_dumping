'psiClass' @ [30:32] ==> private final val psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'constructors' @ [30:41] ==> public final val PsiClass.constructors: (Array<(PsiMethod..PsiMethod?)>..Array<out (PsiMethod..PsiMethod?)>)[MyPropertyDescriptor]

'asList' @ [30:54] ==> public fun <T> Array<out (PsiMethod..PsiMethod?)>.asList(): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'buildToTargetConstructorMap' @ [32:42] ==> private final fun buildToTargetConstructorMap(): Map<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'when (constructors.size) {
        0 -> null
        1 -> constructors.single()
        else -> choosePrimaryConstructor()
    }' @ [34:50] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiMethod?, entry1: PsiMethod?, entry2: PsiMethod?): PsiMethod?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiMethod?

'constructors' @ [34:56] ==> private final val constructors: List<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'size' @ [34:69] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'constructors' @ [36:14] ==> private final val constructors: List<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'single' @ [36:27] ==> public fun <T> List<(PsiMethod..PsiMethod?)>.single(): (PsiMethod..PsiMethod?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'choosePrimaryConstructor' @ [37:17] ==> private final fun choosePrimaryConstructor(): PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'constructors' @ [41:26] ==> private final val constructors: List<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'filter' @ [41:39] ==> public inline fun <T> Iterable<(PsiMethod..PsiMethod?)>.filter(predicate: ((PsiMethod..PsiMethod?)) -> Boolean): List<(PsiMethod..PsiMethod?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'it' @ [41:48] ==> value-parameter it: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.choosePrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'toTargetConstructorMap' @ [41:55] ==> private final val toTargetConstructorMap: Map<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'candidates' @ [42:13] ==> val candidates: List<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.choosePrimaryConstructor[LocalVariableDescriptor]

'size' @ [42:24] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'candidates' @ [43:23] ==> val candidates: List<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.choosePrimaryConstructor[LocalVariableDescriptor]

'single' @ [43:34] ==> public fun <T> List<(PsiMethod..PsiMethod?)>.single(): (PsiMethod..PsiMethod?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiMethod..com.intellij.psi.PsiMethod?)

'toTargetConstructorMap' @ [44:13] ==> private final val toTargetConstructorMap: Map<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'values' @ [44:36] ==> public abstract val values: Collection<PsiMethod> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'any' @ [44:43] ==> public inline fun <T> Iterable<PsiMethod>.any(predicate: (PsiMethod) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'it' @ [44:51] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.choosePrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'primary' @ [44:57] ==> val primary: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.choosePrimaryConstructor[LocalVariableDescriptor]

'primary' @ [45:16] ==> val primary: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.choosePrimaryConstructor[LocalVariableDescriptor]

'HashMap' @ [49:38] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiMethod
    <V : (Any..Any?)> -> PsiMethod

'constructors' @ [50:29] ==> private final val constructors: List<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'constructor' @ [51:34] ==> val constructor: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'body' @ [51:46] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'statements' @ [51:52] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [51:64] ==> public fun <T> Array<out (PsiStatement..PsiStatement?)>.firstOrNull(): PsiStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'firstStatement' @ [52:31] ==> val firstStatement: PsiStatement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'expression' @ [52:75] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'methodCall' @ [53:17] ==> val methodCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'methodCall' @ [54:31] ==> val methodCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'methodExpression' @ [54:42] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'refExpr' @ [55:21] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'canonicalText' @ [55:29] ==> public final val PsiReferenceExpression.canonicalText: String[MyPropertyDescriptor]

'refExpr' @ [56:34] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'resolve' @ [56:42] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'target' @ [57:25] ==> val target: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'target' @ [57:43] ==> val target: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'isConstructor' @ [57:50] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'toTargetConstructorMap' @ [58:43] ==> val toTargetConstructorMap: HashMap<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'target' @ [58:66] ==> val target: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'target' @ [58:77] ==> val target: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'toTargetConstructorMap' @ [59:25] ==> val toTargetConstructorMap: HashMap<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'constructor' @ [59:48] ==> val constructor: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'finalTarget' @ [59:63] ==> val finalTarget: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'toTargetConstructorMap' @ [60:39] ==> val toTargetConstructorMap: HashMap<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'entries' @ [60:62] ==> public open val entries: MutableSet<MutableMap.MutableEntry<PsiMethod, PsiMethod>> defined in java.util.HashMap[JavaPropertyDescriptor]

'entry' @ [61:33] ==> val entry: MutableMap.MutableEntry<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'value' @ [61:39] ==> public abstract val value: PsiMethod defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'constructor' @ [61:48] ==> val constructor: (PsiMethod..PsiMethod?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'entry' @ [62:33] ==> val entry: MutableMap.MutableEntry<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'setValue' @ [62:39] ==> public abstract fun setValue(newValue: PsiMethod): PsiMethod defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'finalTarget' @ [62:48] ==> val finalTarget: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'toTargetConstructorMap' @ [69:16] ==> val toTargetConstructorMap: HashMap<PsiMethod, PsiMethod> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.buildToTargetConstructorMap[LocalVariableDescriptor]

'if (constructors.isEmpty()) emptyList() else null' @ [72:63] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<DeferredElement<Expression>>?, elseBranch: List<DeferredElement<Expression>>?): List<DeferredElement<Expression>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<DeferredElement<Expression>>?

'constructors' @ [72:67] ==> private final val constructors: List<(PsiMethod..PsiMethod?)> defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'isEmpty' @ [72:80] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [72:91] ==> public fun <T> emptyList(): List<DeferredElement<Expression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeferredElement<Expression>

'if (constructor == primaryConstructor) {
            convertPrimaryConstructor(annotations, modifiers, fieldsToDrop, postProcessBody)
        }
        else {
            if (overloadReducer.shouldDropMethod(constructor)) return null

            val params = converter.convertParameterList(constructor, overloadReducer)

            val thisOrSuper = findThisOrSuperCall(constructor)
            val thisOrSuperDeferred = if (thisOrSuper != null)
                converter.deferredElement { it.convertExpression(thisOrSuper.expression) }
            else
                null

            fun convertBody(codeConverter: CodeConverter): Block {
                return postProcessBody(codeConverter.withSpecialExpressionConverter(object: SpecialExpressionConverter {
                    override fun convertExpression(expression: PsiExpression, codeConverter: CodeConverter): Expression? {
                        if (expression.isThisConstructorCall() || expression.isSuperConstructorCall()) {
                            return Expression.Empty // skip it
                        }
                        return null
                    }
                }).convertBlock(constructor.body))
            }

            SecondaryConstructor(annotations, modifiers, params, converter.deferredElement(::convertBody), thisOrSuperDeferred)
        }' @ [80:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Constructor?, elseBranch: Constructor?): Constructor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Constructor?

'constructor' @ [80:20] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'primaryConstructor' @ [80:35] ==> private final val primaryConstructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertPrimaryConstructor' @ [81:13] ==> private final fun convertPrimaryConstructor(annotations: Annotations, modifiers: Modifiers, fieldsToDrop: MutableSet<PsiField>, postProcessBody: (Block) -> Block): PrimaryConstructor defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'annotations' @ [81:39] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'modifiers' @ [81:52] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'fieldsToDrop' @ [81:63] ==> value-parameter fieldsToDrop: MutableSet<PsiField> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'postProcessBody' @ [81:77] ==> value-parameter postProcessBody: (Block) -> Block defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'overloadReducer' @ [84:17] ==> private final val overloadReducer: OverloadReducer defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'shouldDropMethod' @ [84:33] ==> public final fun shouldDropMethod(method: PsiMethod): Boolean defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'constructor' @ [84:50] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'converter' @ [86:26] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertParameterList' @ [86:36] ==> public fun Converter.convertParameterList(method: PsiMethod, overloadReducer: OverloadReducer?, convertParameter: (parameter: PsiParameter, default: DeferredElement<Expression>?) -> FunctionParameter = ..., correctCodeConverter: CodeConverter.() -> CodeConverter = ...): ParameterList defined in org.jetbrains.kotlin.j2k in file OverloadReducer.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [86:57] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'overloadReducer' @ [86:70] ==> private final val overloadReducer: OverloadReducer defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'findThisOrSuperCall' @ [88:31] ==> private final fun findThisOrSuperCall(constructor: PsiMethod): PsiExpressionStatement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'constructor' @ [88:51] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'if (thisOrSuper != null)
                converter.deferredElement { it.convertExpression(thisOrSuper.expression) }
            else
                null' @ [89:39] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeferredElement<Expression>?, elseBranch: DeferredElement<Expression>?): DeferredElement<Expression>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeferredElement<Expression>?

'thisOrSuper' @ [89:43] ==> val thisOrSuper: PsiExpressionStatement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[LocalVariableDescriptor]

'converter' @ [90:17] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'deferredElement' @ [90:27] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Expression): DeferredElement<Expression> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Expression

'it' @ [90:45] ==> value-parameter it: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor.<anonymous>[ValueParameterDescriptorImpl]

'convertExpression' @ [90:48] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'thisOrSuper' @ [90:66] ==> val thisOrSuper: PsiExpressionStatement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[LocalVariableDescriptor]

'expression' @ [90:78] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'invoke' @ [95:24] ==> public abstract operator fun invoke(p1: Block): Block defined in kotlin.Function1[FunctionInvokeDescriptor]

'codeConverter' @ [95:40] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor.convertBody[ValueParameterDescriptorImpl]

'withSpecialExpressionConverter' @ [95:54] ==> public final fun withSpecialExpressionConverter(specialConverter: SpecialExpressionConverter): CodeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'expression' @ [97:29] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor.convertBody.<no name provided>.convertExpression[ValueParameterDescriptorImpl]

'isThisConstructorCall' @ [97:40] ==> private final fun PsiExpression.isThisConstructorCall(): Boolean defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'expression' @ [97:67] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor.convertBody.<no name provided>.convertExpression[ValueParameterDescriptorImpl]

'isSuperConstructorCall' @ [97:78] ==> private final fun PsiExpression.isSuperConstructorCall(): Boolean defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'Empty' @ [98:47] ==> public object Empty : Expression defined in org.jetbrains.kotlin.j2k.ast.Expression[FakeCallableDescriptorForObject]

'convertBlock' @ [102:20] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'constructor' @ [102:33] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'body' @ [102:45] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'SecondaryConstructor' @ [105:13] ==> public constructor SecondaryConstructor(annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList, body: DeferredElement<Block>, thisOrSuperCall: DeferredElement<Expression>?) defined in org.jetbrains.kotlin.j2k.ast.SecondaryConstructor[ClassConstructorDescriptorImpl]

'annotations' @ [105:34] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'modifiers' @ [105:47] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[ValueParameterDescriptorImpl]

'params' @ [105:58] ==> val params: ParameterList defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[LocalVariableDescriptor]

'converter' @ [105:66] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'deferredElement' @ [105:76] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Block): DeferredElement<Block> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Block

'convertBody' @ [105:94] ==> local final fun convertBody(codeConverter: CodeConverter): Block defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[SimpleFunctionDescriptorImpl]

'thisOrSuperDeferred' @ [105:108] ==> val thisOrSuperDeferred: DeferredElement<Expression>? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertConstructor[LocalVariableDescriptor]

'constructor' @ [110:25] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findThisOrSuperCall[ValueParameterDescriptorImpl]

'body' @ [110:37] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'statements' @ [110:43] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [110:55] ==> public fun <T> Array<out (PsiStatement..PsiStatement?)>.firstOrNull(): PsiStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'statement' @ [111:26] ==> val statement: PsiExpressionStatement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findThisOrSuperCall[LocalVariableDescriptor]

'expression' @ [111:36] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'methodCall' @ [112:20] ==> val methodCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findThisOrSuperCall[LocalVariableDescriptor]

'methodExpression' @ [112:31] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'text' @ [112:48] ==> public final val PsiReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'if (text == "this" || text == "super") statement else null' @ [113:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiExpressionStatement?, elseBranch: PsiExpressionStatement?): PsiExpressionStatement?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiExpressionStatement?

'text' @ [113:20] ==> val text: (String..String?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findThisOrSuperCall[LocalVariableDescriptor]

'text' @ [113:38] ==> val text: (String..String?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findThisOrSuperCall[LocalVariableDescriptor]

'statement' @ [113:55] ==> val statement: PsiExpressionStatement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findThisOrSuperCall[LocalVariableDescriptor]

'primaryConstructor' @ [120:22] ==> private final val primaryConstructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'parameterList' @ [120:43] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [120:57] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'HashMap' @ [121:32] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiParameter
    <V : (Any..Any?)> -> Pair<PsiField, Type>

'primaryConstructor' @ [122:20] ==> private final val primaryConstructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'body' @ [122:39] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'HashMap' @ [124:44] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> String

'if (body != null) {
            val statementsToRemove = HashSet<PsiStatement>()
            for (parameter in params) {
                val (field, initializationStatement) = findBackingFieldForConstructorParameter(parameter, primaryConstructor) ?: continue

                val fieldType = converter.typeConverter.convertVariableType(field)
                val parameterType = converter.typeConverter.convertVariableType(parameter)
                // types can be different only in nullability
                val type = if (fieldType == parameterType) {
                    fieldType
                }
                else if (fieldType.toNotNullType() == parameterType.toNotNullType()) {
                    if (fieldType.isNullable) fieldType else parameterType // prefer nullable one
                }
                else {
                    continue
                }

                val propertyInfo = fieldToPropertyInfo(field)
                if (propertyInfo.needExplicitGetter || propertyInfo.needExplicitSetter) continue

                parameterToField.put(parameter, field to type)
                statementsToRemove.add(initializationStatement)
                fieldsToDrop.add(field)

                val fieldName = propertyInfo.name
                if (fieldName != parameter.name) {
                    parameterUsageReplacementMap.put(parameter.name!!, fieldName)
                }
            }

            { codeConverter ->
                val bodyConverter = codeConverter.withSpecialExpressionConverter(
                        object : ReplacingExpressionConverter(parameterUsageReplacementMap) {
                            override fun convertExpression(expression: PsiExpression, codeConverter: CodeConverter): Expression? {
                                if (expression.isSuperConstructorCall()) {
                                    return Expression.Empty // skip it
                                }
                                return super.convertExpression(expression, codeConverter)
                            }
                        })
                postProcessBody(bodyConverter.convertBlock(body, false, { !statementsToRemove.contains(it) }))
            }
        }
        else {
            { Block.Empty }
        }' @ [126:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (CodeConverter) -> Block, elseBranch: (CodeConverter) -> Block): (CodeConverter) -> Block[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Function1<CodeConverter, Block>

'body' @ [126:59] ==> val body: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'HashSet' @ [127:38] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiStatement

'params' @ [128:31] ==> val params: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'component1' @ [129:22] ==> public final operator fun component1(): PsiField defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [129:29] ==> public final operator fun component2(): PsiStatement defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'findBackingFieldForConstructorParameter' @ [129:56] ==> private final fun findBackingFieldForConstructorParameter(parameter: PsiParameter, constructor: PsiMethod): Pair<PsiField, PsiStatement>? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'parameter' @ [129:96] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'primaryConstructor' @ [129:107] ==> private final val primaryConstructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'converter' @ [131:33] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'typeConverter' @ [131:43] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertVariableType' @ [131:57] ==> public final fun convertVariableType(variable: PsiVariable): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'field' @ [131:77] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'converter' @ [132:37] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'typeConverter' @ [132:47] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'convertVariableType' @ [132:61] ==> public final fun convertVariableType(variable: PsiVariable): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'parameter' @ [132:81] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'if (fieldType == parameterType) {
                    fieldType
                }
                else if (fieldType.toNotNullType() == parameterType.toNotNullType()) {
                    if (fieldType.isNullable) fieldType else parameterType // prefer nullable one
                }
                else {
                    continue
                }' @ [134:28] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'fieldType' @ [134:32] ==> val fieldType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'parameterType' @ [134:45] ==> val parameterType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'fieldType' @ [135:21] ==> val fieldType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'if (fieldType.toNotNullType() == parameterType.toNotNullType()) {
                    if (fieldType.isNullable) fieldType else parameterType // prefer nullable one
                }
                else {
                    continue
                }' @ [137:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'fieldType' @ [137:26] ==> val fieldType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'toNotNullType' @ [137:36] ==> public open fun toNotNullType(): Type defined in org.jetbrains.kotlin.j2k.ast.Type[SimpleFunctionDescriptorImpl]

'parameterType' @ [137:55] ==> val parameterType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'toNotNullType' @ [137:69] ==> public open fun toNotNullType(): Type defined in org.jetbrains.kotlin.j2k.ast.Type[SimpleFunctionDescriptorImpl]

'if (fieldType.isNullable) fieldType else parameterType' @ [138:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type, elseBranch: Type): Type[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type

'fieldType' @ [138:25] ==> val fieldType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'isNullable' @ [138:35] ==> public abstract val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Type[PropertyDescriptorImpl]

'fieldType' @ [138:47] ==> val fieldType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'parameterType' @ [138:62] ==> val parameterType: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'invoke' @ [144:36] ==> public abstract operator fun invoke(p1: PsiField): PropertyInfo defined in kotlin.Function1[FunctionInvokeDescriptor]

'field' @ [144:56] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'propertyInfo' @ [145:21] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'needExplicitGetter' @ [145:34] ==> public final val needExplicitGetter: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'propertyInfo' @ [145:56] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'needExplicitSetter' @ [145:69] ==> public final val needExplicitSetter: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'parameterToField' @ [147:17] ==> val parameterToField: HashMap<PsiParameter, Pair<PsiField, Type>> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'put' @ [147:34] ==> public open fun put(key: PsiParameter, value: Pair<PsiField, Type>): Pair<PsiField, Type>? defined in java.util.HashMap[JavaMethodDescriptor]

'parameter' @ [147:38] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'field' @ [147:49] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'type' @ [147:58] ==> val type: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'statementsToRemove' @ [148:17] ==> val statementsToRemove: HashSet<PsiStatement> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'add' @ [148:36] ==> public open fun add(element: PsiStatement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'initializationStatement' @ [148:40] ==> val initializationStatement: PsiStatement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'fieldsToDrop' @ [149:17] ==> value-parameter fieldsToDrop: MutableSet<PsiField> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[ValueParameterDescriptorImpl]

'add' @ [149:30] ==> public abstract fun add(element: PsiField): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'field' @ [149:34] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'propertyInfo' @ [151:33] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'name' @ [151:46] ==> public final val name: String defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'fieldName' @ [152:21] ==> val fieldName: String defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'parameter' @ [152:34] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'name' @ [152:44] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'parameterUsageReplacementMap' @ [153:21] ==> val parameterUsageReplacementMap: HashMap<String, String> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'put' @ [153:50] ==> public open fun put(key: String, value: String): String? defined in java.util.HashMap[JavaMethodDescriptor]

'parameter' @ [153:54] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'name' @ [153:64] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'fieldName' @ [153:72] ==> val fieldName: String defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'codeConverter' @ [158:37] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'withSpecialExpressionConverter' @ [158:51] ==> public final fun withSpecialExpressionConverter(specialConverter: SpecialExpressionConverter): CodeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'ReplacingExpressionConverter' @ [159:34] ==> public constructor ReplacingExpressionConverter(parameterUsageReplacementMap: Map<String, String>) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter[ClassConstructorDescriptorImpl]

'parameterUsageReplacementMap' @ [159:63] ==> val parameterUsageReplacementMap: HashMap<String, String> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'expression' @ [161:37] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>.<no name provided>.convertExpression[ValueParameterDescriptorImpl]

'isSuperConstructorCall' @ [161:48] ==> private final fun PsiExpression.isSuperConstructorCall(): Boolean defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'Empty' @ [162:55] ==> public object Empty : Expression defined in org.jetbrains.kotlin.j2k.ast.Expression[FakeCallableDescriptorForObject]

'super' @ [164:40] ==> <this> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>.<no name provided>[LazyClassReceiverParameterDescriptor]

'convertExpression' @ [164:46] ==> public open fun convertExpression(expression: PsiExpression, codeConverter: CodeConverter): Expression? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter[SimpleFunctionDescriptorImpl]

'expression' @ [164:64] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>.<no name provided>.convertExpression[ValueParameterDescriptorImpl]

'codeConverter' @ [164:76] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>.<no name provided>.convertExpression[ValueParameterDescriptorImpl]

'invoke' @ [167:17] ==> public abstract operator fun invoke(p1: Block): Block defined in kotlin.Function1[FunctionInvokeDescriptor]

'bodyConverter' @ [167:33] ==> val bodyConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'convertBlock' @ [167:47] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'body' @ [167:60] ==> val body: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'!' @ [167:75] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'statementsToRemove' @ [167:76] ==> val statementsToRemove: HashSet<PsiStatement> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'contains' @ [167:95] ==> public open fun contains(element: PsiStatement): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'it' @ [167:104] ==> value-parameter it: PsiStatement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'Block' @ [171:15] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Block[FakeCallableDescriptorForObject]

'Empty' @ [171:21] ==> public final val Empty: Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[PropertyDescriptorImpl]

'withSpecialExpressionConverter' @ [176:39] ==> public final fun withSpecialExpressionConverter(specialConverter: SpecialExpressionConverter): CodeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'ReplacingExpressionConverter' @ [176:70] ==> public constructor ReplacingExpressionConverter(parameterUsageReplacementMap: Map<String, String>) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter[ClassConstructorDescriptorImpl]

'parameterUsageReplacementMap' @ [176:99] ==> val parameterUsageReplacementMap: HashMap<String, String> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'primaryConstructor' @ [178:25] ==> private final val primaryConstructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'body' @ [178:44] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'statements' @ [178:50] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'firstOrNull' @ [178:62] ==> public fun <T> Array<out (PsiStatement..PsiStatement?)>.firstOrNull(): PsiStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'statement' @ [179:27] ==> val statement: PsiStatement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'expression' @ [179:66] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'baseClassParams' @ [180:9] ==> public final var baseClassParams: List<DeferredElement<Expression>>? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'if (methodCall != null && methodCall.isSuperConstructorCall()) {
            methodCall.argumentList.expressions.map {
                converter.deferredElement { codeConverter -> codeConverter.correct().convertExpression(it) }
            }
        }
        else {
            emptyList()
        }' @ [180:27] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<DeferredElement<Expression>>?, elseBranch: List<DeferredElement<Expression>>?): List<DeferredElement<Expression>>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<DeferredElement<Expression>>?

'methodCall' @ [180:31] ==> val methodCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'methodCall' @ [180:53] ==> val methodCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'isSuperConstructorCall' @ [180:64] ==> private final fun PsiExpression.isSuperConstructorCall(): Boolean defined in org.jetbrains.kotlin.j2k.ConstructorConverter[SimpleFunctionDescriptorImpl]

'methodCall' @ [181:13] ==> val methodCall: PsiMethodCallExpression? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'argumentList' @ [181:24] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'expressions' @ [181:37] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'map' @ [181:49] ==> public inline fun <T, R> Array<out (PsiExpression..PsiExpression?)>.map(transform: ((PsiExpression..PsiExpression?)) -> DeferredElement<Expression>): List<DeferredElement<Expression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)
    <R> -> DeferredElement<Expression>

'converter' @ [182:17] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'deferredElement' @ [182:27] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Expression): DeferredElement<Expression> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Expression

'codeConverter' @ [182:62] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'correct' @ [182:76] ==> local final fun CodeConverter.correct(): CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[SimpleFunctionDescriptorImpl]

'convertExpression' @ [182:86] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'it' @ [182:104] ==> value-parameter it: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [186:13] ==> public fun <T> emptyList(): List<DeferredElement<Expression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeferredElement<Expression>

'converter' @ [189:29] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertParameterList' @ [189:39] ==> public fun Converter.convertParameterList(method: PsiMethod, overloadReducer: OverloadReducer?, convertParameter: (parameter: PsiParameter, default: DeferredElement<Expression>?) -> FunctionParameter = ..., correctCodeConverter: CodeConverter.() -> CodeConverter = ...): ParameterList defined in org.jetbrains.kotlin.j2k in file OverloadReducer.kt[SimpleFunctionDescriptorImpl]

'primaryConstructor' @ [190:17] ==> private final val primaryConstructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'overloadReducer' @ [191:17] ==> private final val overloadReducer: OverloadReducer defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'if (!parameterToField.containsKey(parameter)) {
                        converter.convertParameter(parameter, defaultValue = default)
                    }
                    else {
                        val (field, type) = parameterToField[parameter]!!
                        val propertyInfo = fieldToPropertyInfo(field)

                        var paramAnnotations = converter.convertAnnotations(parameter, AnnotationUseTarget.Param) +
                                               converter.convertAnnotations(field, AnnotationUseTarget.Field)
                        if (propertyInfo.getMethod != null) {
                            paramAnnotations += converter.convertAnnotations(propertyInfo.getMethod, AnnotationUseTarget.Get)
                        }
                        if (propertyInfo.setMethod != null) {
                            paramAnnotations += converter.convertAnnotations(propertyInfo.setMethod, AnnotationUseTarget.Set)
                        }
                        FunctionParameter(
                                propertyInfo.identifier,
                                type,
                                if (propertyInfo.isVar) FunctionParameter.VarValModifier.Var else FunctionParameter.VarValModifier.Val,
                                paramAnnotations,
                                propertyInfo.modifiers,
                                default
                        ).assignPrototypes(
                                PrototypeInfo(parameter, CommentsAndSpacesInheritance.LINE_BREAKS),
                                PrototypeInfo(field, CommentsAndSpacesInheritance.NO_SPACES)
                        )
                    }' @ [193:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionParameter, elseBranch: FunctionParameter): FunctionParameter[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> FunctionParameter

'!' @ [193:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterToField' @ [193:26] ==> val parameterToField: HashMap<PsiParameter, Pair<PsiField, Type>> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'containsKey' @ [193:43] ==> public open fun containsKey(key: PsiParameter): Boolean defined in java.util.HashMap[JavaMethodDescriptor]

'parameter' @ [193:55] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'converter' @ [194:25] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertParameter' @ [194:35] ==> public final fun convertParameter(parameter: PsiParameter, nullability: Nullability = ..., varValModifier: FunctionParameter.VarValModifier = ..., modifiers: Modifiers = ..., defaultValue: DeferredElement<Expression>? = ...): FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'parameter' @ [194:52] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [194:78] ==> value-parameter default: DeferredElement<Expression>? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'component1' @ [197:30] ==> public final operator fun component1(): PsiField defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [197:37] ==> public final operator fun component2(): Type defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'parameterToField' @ [197:45] ==> val parameterToField: HashMap<PsiParameter, Pair<PsiField, Type>> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'parameter' @ [197:62] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [198:44] ==> public abstract operator fun invoke(p1: PsiField): PropertyInfo defined in kotlin.Function1[FunctionInvokeDescriptor]

'field' @ [198:64] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'converter' @ [200:48] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertAnnotations' @ [200:58] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'parameter' @ [200:77] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'Param' @ [200:108] ==> enum entry Param defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[FakeCallableDescriptorForObject]

'converter' @ [201:48] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertAnnotations' @ [201:58] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'field' @ [201:77] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'Field' @ [201:104] ==> enum entry Field defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[FakeCallableDescriptorForObject]

'propertyInfo' @ [202:29] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'getMethod' @ [202:42] ==> public final val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'paramAnnotations' @ [203:29] ==> var paramAnnotations: Annotations defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'converter' @ [203:49] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertAnnotations' @ [203:59] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'propertyInfo' @ [203:78] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'getMethod' @ [203:91] ==> public final val getMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'Get' @ [203:122] ==> enum entry Get defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[FakeCallableDescriptorForObject]

'propertyInfo' @ [205:29] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'setMethod' @ [205:42] ==> public final val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'paramAnnotations' @ [206:29] ==> var paramAnnotations: Annotations defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'converter' @ [206:49] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'convertAnnotations' @ [206:59] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'propertyInfo' @ [206:78] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'setMethod' @ [206:91] ==> public final val setMethod: PsiMethod? defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'Set' @ [206:122] ==> enum entry Set defined in org.jetbrains.kotlin.j2k.ast.AnnotationUseTarget[FakeCallableDescriptorForObject]

'FunctionParameter' @ [208:25] ==> public constructor FunctionParameter(identifier: Identifier, type: Type?, varVal: FunctionParameter.VarValModifier, annotations: Annotations, modifiers: Modifiers, defaultValue: DeferredElement<Expression>? = ...) defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[ClassConstructorDescriptorImpl]

'propertyInfo' @ [209:33] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'identifier' @ [209:46] ==> public final val identifier: Identifier defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'type' @ [210:33] ==> val type: Type defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'if (propertyInfo.isVar) FunctionParameter.VarValModifier.Var else FunctionParameter.VarValModifier.Val' @ [211:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: FunctionParameter.VarValModifier, elseBranch: FunctionParameter.VarValModifier): FunctionParameter.VarValModifier[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> VarValModifier

'propertyInfo' @ [211:37] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'isVar' @ [211:50] ==> public final val isVar: Boolean defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'Var' @ [211:90] ==> enum entry Var defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter.VarValModifier[FakeCallableDescriptorForObject]

'Val' @ [211:132] ==> enum entry Val defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter.VarValModifier[FakeCallableDescriptorForObject]

'paramAnnotations' @ [212:33] ==> var paramAnnotations: Annotations defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'propertyInfo' @ [213:33] ==> val propertyInfo: PropertyInfo defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'modifiers' @ [213:46] ==> public final val modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.PropertyInfo[PropertyDescriptorImpl]

'default' @ [214:33] ==> value-parameter default: DeferredElement<Expression>? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'assignPrototypes' @ [215:27] ==> public fun <TElement : Element> FunctionParameter.assignPrototypes(vararg prototypes: PrototypeInfo): FunctionParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> FunctionParameter

'PrototypeInfo' @ [216:33] ==> public constructor PrototypeInfo(element: PsiElement, commentsAndSpacesInheritance: CommentsAndSpacesInheritance) defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[ClassConstructorDescriptorImpl]

'parameter' @ [216:47] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[ValueParameterDescriptorImpl]

'LINE_BREAKS' @ [216:87] ==> public final val LINE_BREAKS: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'PrototypeInfo' @ [217:33] ==> public constructor PrototypeInfo(element: PsiElement, commentsAndSpacesInheritance: CommentsAndSpacesInheritance) defined in org.jetbrains.kotlin.j2k.ast.PrototypeInfo[ClassConstructorDescriptorImpl]

'field' @ [217:47] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor.<anonymous>[LocalVariableDescriptor]

'NO_SPACES' @ [217:83] ==> public final val NO_SPACES: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'correct' @ [221:42] ==> local final fun CodeConverter.correct(): CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[SimpleFunctionDescriptorImpl]

'PrimaryConstructor' @ [223:16] ==> public constructor PrimaryConstructor(annotations: Annotations, modifiers: Modifiers, parameterList: ParameterList, body: DeferredElement<Block>) defined in org.jetbrains.kotlin.j2k.ast.PrimaryConstructor[ClassConstructorDescriptorImpl]

'annotations' @ [223:35] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[ValueParameterDescriptorImpl]

'modifiers' @ [223:48] ==> value-parameter modifiers: Modifiers defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[ValueParameterDescriptorImpl]

'parameterList' @ [223:59] ==> val parameterList: ParameterList defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'converter' @ [223:74] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'deferredElement' @ [223:84] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Block): DeferredElement<Block> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Block

'bodyGenerator' @ [223:100] ==> val bodyGenerator: (CodeConverter) -> Block defined in org.jetbrains.kotlin.j2k.ConstructorConverter.convertPrimaryConstructor[LocalVariableDescriptor]

'assignPrototype' @ [223:116] ==> public fun <TElement : Element> PrimaryConstructor.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): PrimaryConstructor defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> PrimaryConstructor

'primaryConstructor' @ [223:132] ==> private final val primaryConstructor: PsiMethod? defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'constructor' @ [227:20] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[ValueParameterDescriptorImpl]

'body' @ [227:32] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'converter' @ [229:20] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [229:30] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'findVariableUsages' @ [229:48] ==> public fun ReferenceSearcher.findVariableUsages(variable: PsiVariable, scope: PsiElement): Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'parameter' @ [229:67] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[ValueParameterDescriptorImpl]

'body' @ [229:78] ==> val body: PsiCodeBlock defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'refs' @ [231:13] ==> val refs: Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'any' @ [231:18] ==> public inline fun <T> Iterable<PsiReferenceExpression>.any(predicate: (PsiReferenceExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceExpression

'isAccessedForWriting' @ [231:32] ==> public open fun isAccessedForWriting(@NotNull p0: PsiExpression): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'it' @ [231:53] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'refs' @ [233:21] ==> val refs: Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'ref' @ [234:30] ==> val ref: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'parent' @ [234:34] ==> public final val PsiReferenceExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'assignment' @ [235:17] ==> val assignment: PsiAssignmentExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'operationSign' @ [235:28] ==> public final val PsiAssignmentExpression.operationSign: PsiJavaToken[MyPropertyDescriptor]

'tokenType' @ [235:42] ==> public final val PsiJavaToken.tokenType: (IElementType..IElementType?)[MyPropertyDescriptor]

'EQ' @ [235:69] ==> public final val EQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'assignment' @ [236:28] ==> val assignment: PsiAssignmentExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'lExpression' @ [236:39] ==> public final val PsiAssignmentExpression.lExpression: PsiExpression[MyPropertyDescriptor]

'!' @ [237:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'assignee' @ [237:18] ==> val assignee: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'isQualifierEmptyOrThis' @ [237:27] ==> public fun PsiReferenceExpression.isQualifierEmptyOrThis(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'assignee' @ [238:25] ==> val assignee: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'resolve' @ [238:34] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'field' @ [239:17] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'containingClass' @ [239:23] ==> public final val PsiField.containingClass: PsiClass?[MyPropertyDescriptor]

'constructor' @ [239:42] ==> value-parameter constructor: PsiMethod defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[ValueParameterDescriptorImpl]

'containingClass' @ [239:54] ==> public final val PsiMethod.containingClass: PsiClass?[MyPropertyDescriptor]

'field' @ [240:17] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'hasModifierProperty' @ [240:23] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiField[JavaMethodDescriptor]

'STATIC' @ [240:55] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'field' @ [241:17] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'initializer' @ [241:23] ==> public final var PsiField.initializer: PsiExpression?[MyPropertyDescriptor]

'assignment' @ [244:29] ==> val assignment: PsiAssignmentExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'parent' @ [244:40] ==> public final val PsiAssignmentExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'statement' @ [245:17] ==> val statement: PsiExpressionStatement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'parent' @ [245:27] ==> public final val PsiExpressionStatement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'body' @ [245:37] ==> val body: PsiCodeBlock defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'converter' @ [248:17] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'referenceSearcher' @ [248:27] ==> public final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.Converter[PropertyDescriptorImpl]

'findVariableUsages' @ [248:45] ==> public fun ReferenceSearcher.findVariableUsages(variable: PsiVariable, scope: PsiElement): Collection<PsiReferenceExpression> defined in org.jetbrains.kotlin.j2k in file ReferenceSearcher.kt[SimpleFunctionDescriptorImpl]

'field' @ [248:64] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'body' @ [248:71] ==> val body: PsiCodeBlock defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'any' @ [248:77] ==> public inline fun <T> Iterable<PsiReferenceExpression>.any(predicate: (PsiReferenceExpression) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiReferenceExpression

'it' @ [248:83] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'assignee' @ [248:89] ==> val assignee: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'isAccessedForWriting' @ [248:109] ==> public open fun isAccessedForWriting(@NotNull p0: PsiExpression): Boolean defined in com.intellij.psi.util.PsiUtil[JavaMethodDescriptor]

'it' @ [248:130] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [248:137] ==> value-parameter it: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter.<anonymous>[ValueParameterDescriptorImpl]

'isQualifierEmptyOrThis' @ [248:140] ==> public fun PsiReferenceExpression.isQualifierEmptyOrThis(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'field' @ [251:20] ==> val field: PsiField defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'statement' @ [251:29] ==> val statement: PsiExpressionStatement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.findBackingFieldForConstructorParameter[LocalVariableDescriptor]

'==' @ [257:58] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [257:59] ==> <this> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.isSuperConstructorCall[ReceiverParameterDescriptorImpl]

'methodExpression' @ [257:94] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'text' @ [257:112] ==> public final val PsiReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'==' @ [258:57] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'this' @ [258:58] ==> <this> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.isThisConstructorCall[ReceiverParameterDescriptorImpl]

'methodExpression' @ [258:93] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'text' @ [258:111] ==> public final val PsiReferenceExpression.text: (String..String?)[MyPropertyDescriptor]

'expression' @ [262:17] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'expression' @ [262:57] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'qualifier' @ [262:68] ==> public final val PsiReferenceExpression.qualifier: PsiElement?[MyPropertyDescriptor]

'parameterUsageReplacementMap' @ [263:35] ==> public final val parameterUsageReplacementMap: Map<String, String> defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter[PropertyDescriptorImpl]

'expression' @ [263:64] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'referenceName' @ [263:75] ==> public final val PsiReferenceExpression.referenceName: String?[MyPropertyDescriptor]

'replacement' @ [264:21] ==> val replacement: String? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'expression' @ [265:34] ==> value-parameter expression: PsiExpression defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'resolve' @ [265:45] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'target' @ [266:25] ==> val target: PsiElement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'target' @ [267:37] ==> val target: PsiElement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'declarationScope' @ [267:44] ==> public final val PsiParameter.declarationScope: PsiElement[MyPropertyDescriptor]

'scope' @ [269:29] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'scope' @ [269:51] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'isConstructor' @ [269:57] ==> public fun PsiMember.isConstructor(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [269:76] ==> val scope: PsiElement defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'parent' @ [269:82] ==> public final val PsiMember.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'psiClass' @ [269:92] ==> private final val psiClass: PsiClass defined in org.jetbrains.kotlin.j2k.ConstructorConverter[PropertyDescriptorImpl]

'Identifier' @ [270:36] ==> public constructor Identifier(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...) defined in org.jetbrains.kotlin.j2k.ast.Identifier[ClassConstructorDescriptorImpl]

'replacement' @ [270:47] ==> val replacement: String? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'codeConverter' @ [270:60] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'typeConverter' @ [270:74] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'variableNullability' @ [270:88] ==> public final fun variableNullability(variable: PsiVariable): Nullability defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'target' @ [270:108] ==> val target: PsiElement? defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[LocalVariableDescriptor]

'isNullable' @ [270:116] ==> public fun Nullability.isNullable(settings: ConverterSettings): Boolean defined in org.jetbrains.kotlin.j2k.ast in file Types.kt[SimpleFunctionDescriptorImpl]

'codeConverter' @ [270:127] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.ConstructorConverter.ReplacingExpressionConverter.convertExpression[ValueParameterDescriptorImpl]

'settings' @ [270:141] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

