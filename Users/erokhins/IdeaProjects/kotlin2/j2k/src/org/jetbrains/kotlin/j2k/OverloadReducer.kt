'HashMap' @ [28:49] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiMethod
    <V : (Any..Any?)> -> ArrayList<PsiExpression>

'HashSet' @ [29:33] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiMethod

'buildOverloadEquivalenceMap' @ [32:19] ==> private final fun buildOverloadEquivalenceMap(): Map<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'dropOverloadsForDefaultValues' @ [33:9] ==> private final fun dropOverloadsForDefaultValues(equivalenceMap: Map<PsiMethod, OverloadReducer.EquivalentOverloadInfo>): Unit defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'map' @ [33:39] ==> val map: Map<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.<init>[LocalVariableDescriptor]

'method' @ [36:56] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.shouldDropMethod[ValueParameterDescriptorImpl]

'methodsToDrop' @ [36:66] ==> private final val methodsToDrop: HashSet<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer[PropertyDescriptorImpl]

'methodToLastParameterDefaults' @ [39:24] ==> private final val methodToLastParameterDefaults: HashMap<PsiMethod, ArrayList<PsiExpression>> defined in org.jetbrains.kotlin.j2k.OverloadReducer[PropertyDescriptorImpl]

'method' @ [39:54] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.parameterDefault[ValueParameterDescriptorImpl]

'method' @ [40:21] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.parameterDefault[ValueParameterDescriptorImpl]

'parameterList' @ [40:28] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [40:42] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'parameterIndex' @ [40:60] ==> value-parameter parameterIndex: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.parameterDefault[ValueParameterDescriptorImpl]

'if (index < defaults.size) defaults[index] else null' @ [41:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: PsiExpression?, elseBranch: PsiExpression?): PsiExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> PsiExpression?

'index' @ [41:20] ==> val index: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.parameterDefault[LocalVariableDescriptor]

'defaults' @ [41:28] ==> val defaults: ArrayList<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.parameterDefault[LocalVariableDescriptor]

'size' @ [41:37] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'defaults' @ [41:43] ==> val defaults: ArrayList<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.parameterDefault[LocalVariableDescriptor]

'index' @ [41:52] ==> val index: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.parameterDefault[LocalVariableDescriptor]

'methods' @ [55:30] ==> private final val methods: Collection<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer[PropertyDescriptorImpl]

'groupBy' @ [56:18] ==> public inline fun <T, K> Iterable<PsiMethod>.groupBy(keySelector: (PsiMethod) -> List<Any?>): Map<List<Any?>, List<PsiMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <K> -> List<Any?>

'listOf' @ [56:28] ==> public fun <T> listOf(vararg elements: Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'if (it.isConstructor) null else it.name' @ [56:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'it' @ [56:39] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'isConstructor' @ [56:42] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'it' @ [56:67] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [56:70] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'it' @ [57:35] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'accessModifier' @ [57:38] ==> public fun PsiModifierListOwner.accessModifier(): String defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'it' @ [58:35] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'returnType' @ [58:38] ==> public final val PsiMethod.returnType: PsiType?[MyPropertyDescriptor]

'it' @ [59:35] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [59:38] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'STATIC' @ [59:70] ==> public const final val STATIC: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'getAnnotationsFingerprint' @ [60:35] ==> private final fun getAnnotationsFingerprint(method: PsiMethod): Any defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'it' @ [60:61] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'values' @ [61:18] ==> public abstract val values: Collection<List<PsiMethod>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'filter' @ [62:18] ==> public inline fun <T> Iterable<List<PsiMethod>>.filter(predicate: (List<PsiMethod>) -> Boolean): List<List<PsiMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiMethod>

'it' @ [62:27] ==> value-parameter it: List<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [62:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'map' @ [63:18] ==> public inline fun <T, R> Iterable<List<PsiMethod>>.map(transform: (List<PsiMethod>) -> List<PsiMethod>): List<List<PsiMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiMethod>
    <R> -> List<PsiMethod>

'it' @ [63:24] ==> value-parameter it: List<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'filterNot' @ [63:27] ==> public inline fun <T> Iterable<PsiMethod>.filterNot(predicate: (PsiMethod) -> Boolean): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod

'shouldSkipOverload' @ [63:39] ==> private final fun shouldSkipOverload(method: PsiMethod): Boolean defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'it' @ [63:58] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'filter' @ [64:18] ==> public inline fun <T> Iterable<List<PsiMethod>>.filter(predicate: (List<PsiMethod>) -> Boolean): List<List<PsiMethod>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<PsiMethod>

'it' @ [64:27] ==> value-parameter it: List<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap.<anonymous>[ValueParameterDescriptorImpl]

'size' @ [64:30] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'HashMap' @ [66:19] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> PsiMethod
    <V : (Any..Any?)> -> EquivalentOverloadInfo

'overloadGroups' @ [67:23] ==> val overloadGroups: List<List<PsiMethod>> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'group' @ [68:28] ==> val group: List<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'findEquivalentOverload' @ [69:36] ==> private final fun findEquivalentOverload(method: PsiMethod, overloads: Collection<PsiMethod>): OverloadReducer.EquivalentOverloadInfo? defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'method' @ [69:59] ==> val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'group' @ [69:67] ==> val group: List<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'map' @ [71:43] ==> val map: HashMap<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'overloadInfo' @ [71:47] ==> val overloadInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'method' @ [71:60] ==> public final val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'if (furtherOverloadInfo != null) {
                    EquivalentOverloadInfo(furtherOverloadInfo.method, overloadInfo.parameterDefaults + furtherOverloadInfo.parameterDefaults)
                }
                else {
                    overloadInfo
                }' @ [72:42] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: OverloadReducer.EquivalentOverloadInfo, elseBranch: OverloadReducer.EquivalentOverloadInfo): OverloadReducer.EquivalentOverloadInfo[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> EquivalentOverloadInfo

'furtherOverloadInfo' @ [72:46] ==> val furtherOverloadInfo: OverloadReducer.EquivalentOverloadInfo? defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'EquivalentOverloadInfo' @ [73:21] ==> public constructor EquivalentOverloadInfo(method: PsiMethod, parameterDefaults: List<PsiExpression>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[ClassConstructorDescriptorImpl]

'furtherOverloadInfo' @ [73:44] ==> val furtherOverloadInfo: OverloadReducer.EquivalentOverloadInfo? defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'method' @ [73:64] ==> public final val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'overloadInfo' @ [73:72] ==> val overloadInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'parameterDefaults' @ [73:85] ==> public final val parameterDefaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'furtherOverloadInfo' @ [73:105] ==> val furtherOverloadInfo: OverloadReducer.EquivalentOverloadInfo? defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'parameterDefaults' @ [73:125] ==> public final val parameterDefaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'overloadInfo' @ [76:21] ==> val overloadInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'map' @ [79:17] ==> val map: HashMap<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'method' @ [79:21] ==> val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'resultOverloadInfo' @ [79:31] ==> val resultOverloadInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'map' @ [80:31] ==> val map: HashMap<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'entries' @ [80:35] ==> public open val entries: MutableSet<MutableMap.MutableEntry<PsiMethod, OverloadReducer.EquivalentOverloadInfo>> defined in java.util.HashMap[JavaPropertyDescriptor]

'entry' @ [81:25] ==> val entry: MutableMap.MutableEntry<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'value' @ [81:31] ==> public abstract val value: OverloadReducer.EquivalentOverloadInfo defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'method' @ [81:37] ==> public final val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'method' @ [81:47] ==> val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'entry' @ [82:52] ==> val entry: MutableMap.MutableEntry<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'value' @ [82:58] ==> public abstract val value: OverloadReducer.EquivalentOverloadInfo defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'parameterDefaults' @ [82:64] ==> public final val parameterDefaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'resultOverloadInfo' @ [82:84] ==> val resultOverloadInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'parameterDefaults' @ [82:103] ==> public final val parameterDefaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'entry' @ [83:25] ==> val entry: MutableMap.MutableEntry<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'setValue' @ [83:31] ==> public abstract fun setValue(newValue: OverloadReducer.EquivalentOverloadInfo): OverloadReducer.EquivalentOverloadInfo defined in kotlin.collections.MutableMap.MutableEntry[DeserializedSimpleFunctionDescriptor]

'EquivalentOverloadInfo' @ [83:40] ==> public constructor EquivalentOverloadInfo(method: PsiMethod, parameterDefaults: List<PsiExpression>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[ClassConstructorDescriptorImpl]

'resultOverloadInfo' @ [83:63] ==> val resultOverloadInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'method' @ [83:82] ==> public final val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'newParameterDefaults' @ [83:90] ==> val newParameterDefaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'map' @ [90:16] ==> val map: HashMap<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.buildOverloadEquivalenceMap[LocalVariableDescriptor]

'method' @ [94:13] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.shouldSkipOverload[ValueParameterDescriptorImpl]

'isConstructor' @ [94:20] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'method' @ [95:13] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.shouldSkipOverload[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [95:20] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'ABSTRACT' @ [95:52] ==> public const final val ABSTRACT: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'method' @ [96:13] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.shouldSkipOverload[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [96:20] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'NATIVE' @ [96:52] ==> public const final val NATIVE: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'method' @ [97:13] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.shouldSkipOverload[ValueParameterDescriptorImpl]

'hasModifierProperty' @ [97:20] ==> public abstract fun hasModifierProperty(@PsiModifier.ModifierConstant @NonNls @NotNull p0: String): Boolean defined in com.intellij.psi.PsiMethod[JavaMethodDescriptor]

'SYNCHRONIZED' @ [97:52] ==> public const final val SYNCHRONIZED: String defined in com.intellij.psi.PsiModifier[JavaPropertyDescriptor]

'method' @ [98:13] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.shouldSkipOverload[ValueParameterDescriptorImpl]

'hierarchicalMethodSignature' @ [98:20] ==> public final val PsiMethod.hierarchicalMethodSignature: HierarchicalMethodSignature[MyPropertyDescriptor]

'superSignatures' @ [98:48] ==> public final val HierarchicalMethodSignature.superSignatures: (MutableList<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>..List<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>)[MyPropertyDescriptor]

'isNotEmpty' @ [98:64] ==> @InlineOnly public inline fun <T> Collection<(HierarchicalMethodSignature..HierarchicalMethodSignature?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.HierarchicalMethodSignature..com.intellij.psi.HierarchicalMethodSignature?)

'isOpenClass' @ [99:13] ==> private final val isOpenClass: Boolean defined in org.jetbrains.kotlin.j2k.OverloadReducer[PropertyDescriptorImpl]

'referenceSearcher' @ [99:28] ==> private final val referenceSearcher: ReferenceSearcher defined in org.jetbrains.kotlin.j2k.OverloadReducer[PropertyDescriptorImpl]

'hasOverrides' @ [99:46] ==> public abstract fun hasOverrides(method: PsiMethod): Boolean defined in org.jetbrains.kotlin.j2k.ReferenceSearcher[SimpleFunctionDescriptorImpl]

'method' @ [99:59] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.shouldSkipOverload[ValueParameterDescriptorImpl]

'method' @ [104:25] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[ValueParameterDescriptorImpl]

'body' @ [104:32] ==> public final val PsiMethod.body: PsiCodeBlock?[MyPropertyDescriptor]

'statements' @ [104:38] ==> public final val PsiCodeBlock.statements: (Array<(PsiStatement..PsiStatement?)>..Array<out (PsiStatement..PsiStatement?)>)[MyPropertyDescriptor]

'singleOrNull' @ [104:50] ==> public fun <T> Array<out (PsiStatement..PsiStatement?)>.singleOrNull(): PsiStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiStatement..com.intellij.psi.PsiStatement?)

'when (statement) {
            is PsiExpressionStatement -> statement.expression
            is PsiReturnStatement -> statement.returnValue
            else -> null
        }' @ [106:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PsiExpression?, entry1: PsiExpression?, entry2: PsiExpression?): PsiExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PsiExpression?

'statement' @ [106:32] ==> val statement: PsiStatement defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'statement' @ [107:42] ==> val statement: PsiStatement defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'expression' @ [107:52] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'statement' @ [108:38] ==> val statement: PsiStatement defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'returnValue' @ [108:48] ==> public final val PsiReturnStatement.returnValue: PsiExpression?[MyPropertyDescriptor]

'if (method.isConstructor) "this" else method.name' @ [112:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'method' @ [112:38] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[ValueParameterDescriptorImpl]

'isConstructor' @ [112:45] ==> public final val PsiMethod.isConstructor: Boolean[MyPropertyDescriptor]

'method' @ [112:72] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[ValueParameterDescriptorImpl]

'name' @ [112:79] ==> public final var PsiMethod.name: String[MyPropertyDescriptor]

'methodCall' @ [113:23] ==> val methodCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'methodExpression' @ [113:34] ==> public final val PsiMethodCallExpression.methodExpression: PsiReferenceExpression[MyPropertyDescriptor]

'refExpr' @ [114:13] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'isQualified' @ [114:21] ==> public final val PsiReferenceExpression.isQualified: Boolean[MyPropertyDescriptor]

'refExpr' @ [114:36] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'referenceName' @ [114:44] ==> public final val PsiReferenceExpression.referenceName: String?[MyPropertyDescriptor]

'expectedMethodName' @ [114:61] ==> val expectedMethodName: String defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'refExpr' @ [116:22] ==> val refExpr: PsiReferenceExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'resolve' @ [116:30] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'target' @ [117:13] ==> val target: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'overloads' @ [117:24] ==> value-parameter overloads: Collection<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[ValueParameterDescriptorImpl]

'calcTargetParameterDefaults' @ [119:33] ==> private final fun calcTargetParameterDefaults(method: PsiMethod, target: PsiMethod, targetCall: PsiMethodCallExpression): List<PsiExpression>? defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'method' @ [119:61] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[ValueParameterDescriptorImpl]

'target' @ [119:69] ==> val target: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'methodCall' @ [119:77] ==> val methodCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'EquivalentOverloadInfo' @ [120:16] ==> public constructor EquivalentOverloadInfo(method: PsiMethod, parameterDefaults: List<PsiExpression>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[ClassConstructorDescriptorImpl]

'target' @ [120:39] ==> val target: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'parameterDefaults' @ [120:47] ==> val parameterDefaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.findEquivalentOverload[LocalVariableDescriptor]

'method' @ [124:26] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[ValueParameterDescriptorImpl]

'parameterList' @ [124:33] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [124:47] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'target' @ [125:32] ==> value-parameter target: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[ValueParameterDescriptorImpl]

'parameterList' @ [125:39] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameters' @ [125:53] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'parameters' @ [126:13] ==> val parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'size' @ [126:24] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'targetParameters' @ [126:32] ==> val targetParameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'size' @ [126:49] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'targetCall' @ [127:20] ==> value-parameter targetCall: PsiMethodCallExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[ValueParameterDescriptorImpl]

'argumentList' @ [127:31] ==> public final val PsiMethodCallExpression.argumentList: PsiExpressionList[MyPropertyDescriptor]

'expressions' @ [127:44] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'args' @ [128:13] ==> val args: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'size' @ [128:18] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'targetParameters' @ [128:26] ==> val targetParameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'size' @ [128:43] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'parameters' @ [130:19] ==> val parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'indices' @ [130:30] ==> public val <T> Array<out (PsiParameter..PsiParameter?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'parameters' @ [131:29] ==> val parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'i' @ [131:40] ==> val i: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'targetParameters' @ [132:35] ==> val targetParameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'i' @ [132:52] ==> val i: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'parameter' @ [133:17] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'name' @ [133:27] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'targetParameter' @ [133:35] ==> val targetParameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'name' @ [133:51] ==> public final val PsiParameter.name: String?[MyPropertyDescriptor]

'parameter' @ [133:59] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'type' @ [133:69] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'targetParameter' @ [133:77] ==> val targetParameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'type' @ [133:93] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'args' @ [134:23] ==> val args: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'i' @ [134:28] ==> val i: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'arg' @ [135:17] ==> val arg: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'arg' @ [135:51] ==> val arg: (PsiExpression..PsiExpression?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'resolve' @ [135:55] ==> @Nullable public abstract fun resolve(): PsiElement? defined in com.intellij.psi.PsiReferenceExpression[JavaMethodDescriptor]

'parameter' @ [135:68] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'args' @ [138:16] ==> val args: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'drop' @ [138:21] ==> public fun <T> Array<out (PsiExpression..PsiExpression?)>.drop(n: Int): List<(PsiExpression..PsiExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'parameters' @ [138:26] ==> val parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.OverloadReducer.calcTargetParameterDefaults[LocalVariableDescriptor]

'size' @ [138:37] ==> public final val size: Int defined in kotlin.Array[DeserializedPropertyDescriptor]

'equivalenceMap' @ [142:30] ==> value-parameter equivalenceMap: Map<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[ValueParameterDescriptorImpl]

'map' @ [143:18] ==> public inline fun <K, V, R> Map<out PsiMethod, OverloadReducer.EquivalentOverloadInfo>.map(transform: (Map.Entry<PsiMethod, OverloadReducer.EquivalentOverloadInfo>) -> PsiMethod): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiMethod
    <V> -> EquivalentOverloadInfo
    <R> -> PsiMethod

'it' @ [143:24] ==> value-parameter it: Map.Entry<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [143:27] ==> public abstract val key: PsiMethod defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'sortedByDescending' @ [144:18] ==> public inline fun <T, R : Comparable<Int>> Iterable<PsiMethod>.sortedByDescending(crossinline selector: (PsiMethod) -> Int?): List<PsiMethod> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiMethod
    <R : Comparable<R>> -> Int

'it' @ [144:39] ==> value-parameter it: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues.<anonymous>[ValueParameterDescriptorImpl]

'parameterList' @ [144:42] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [144:56] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'dropCandidates' @ [147:24] ==> val dropCandidates: List<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'method' @ [148:30] ==> val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'parameterList' @ [148:37] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [148:51] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'equivalenceMap' @ [149:30] ==> value-parameter equivalenceMap: Map<PsiMethod, OverloadReducer.EquivalentOverloadInfo> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[ValueParameterDescriptorImpl]

'method' @ [149:45] ==> val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'targetInfo' @ [150:36] ==> val targetInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'method' @ [150:47] ==> public final val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'parameterList' @ [150:54] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parametersCount' @ [150:68] ==> public final val PsiParameterList.parametersCount: Int[MyPropertyDescriptor]

'assert' @ [151:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'paramCount' @ [151:20] ==> val paramCount: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'targetParamCount' @ [151:33] ==> val targetParamCount: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'targetInfo' @ [152:28] ==> val targetInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'parameterDefaults' @ [152:39] ==> public final val parameterDefaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'assert' @ [153:13] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'defaults' @ [153:20] ==> val defaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'size' @ [153:29] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'targetParamCount' @ [153:37] ==> val targetParamCount: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'paramCount' @ [153:56] ==> val paramCount: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'methodToLastParameterDefaults' @ [155:34] ==> private final val methodToLastParameterDefaults: HashMap<PsiMethod, ArrayList<PsiExpression>> defined in org.jetbrains.kotlin.j2k.OverloadReducer[PropertyDescriptorImpl]

'getOrPut' @ [155:64] ==> public inline fun <K, V> MutableMap<PsiMethod, ArrayList<PsiExpression>>.getOrPut(key: PsiMethod, defaultValue: () -> ArrayList<PsiExpression>): ArrayList<PsiExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> PsiMethod
    <V> -> ArrayList<PsiExpression>

'targetInfo' @ [155:73] ==> val targetInfo: OverloadReducer.EquivalentOverloadInfo defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'method' @ [155:84] ==> public final val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.EquivalentOverloadInfo[PropertyDescriptorImpl]

'ArrayList' @ [155:94] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> PsiExpression

'defaults' @ [157:23] ==> val defaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'indices' @ [157:32] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'defaults' @ [158:31] ==> val defaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'defaults' @ [158:40] ==> val defaults: List<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'size' @ [158:49] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'i' @ [158:56] ==> val i: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'if (i < targetDefaults.size) { // default for this parameter has already been assigned
                    if (targetDefaults[i].text != default.text) continue@DropCandidatesLoop
                }
                else {
                    targetDefaults.add(default)
                }' @ [159:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'i' @ [159:21] ==> val i: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'targetDefaults' @ [159:25] ==> val targetDefaults: ArrayList<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'size' @ [159:40] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'targetDefaults' @ [160:25] ==> val targetDefaults: ArrayList<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'i' @ [160:40] ==> val i: Int defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'text' @ [160:43] ==> public final val PsiExpression.text: (String..String?)[MyPropertyDescriptor]

'default' @ [160:51] ==> val default: PsiExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'text' @ [160:59] ==> public final val PsiExpression.text: (String..String?)[MyPropertyDescriptor]

'targetDefaults' @ [163:21] ==> val targetDefaults: ArrayList<PsiExpression> defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'add' @ [163:36] ==> public open fun add(element: PsiExpression): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'default' @ [163:40] ==> val default: PsiExpression defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'methodsToDrop' @ [167:13] ==> private final val methodsToDrop: HashSet<PsiMethod> defined in org.jetbrains.kotlin.j2k.OverloadReducer[PropertyDescriptorImpl]

'add' @ [167:27] ==> public open fun add(element: PsiMethod): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'method' @ [167:31] ==> val method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.dropOverloadsForDefaultValues[LocalVariableDescriptor]

'method' @ [172:16] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.OverloadReducer.getAnnotationsFingerprint[ValueParameterDescriptorImpl]

'modifierList' @ [172:23] ==> public final val PsiMethod.modifierList: PsiModifierList[MyPropertyDescriptor]

'annotations' @ [172:36] ==> public final val PsiModifierList.annotations: (Array<(PsiAnnotation..PsiAnnotation?)>..Array<out (PsiAnnotation..PsiAnnotation?)>)[MyPropertyDescriptor]

'map' @ [172:48] ==> public inline fun <T, R> Array<out (PsiAnnotation..PsiAnnotation?)>.map(transform: ((PsiAnnotation..PsiAnnotation?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiAnnotation..com.intellij.psi.PsiAnnotation?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [172:54] ==> value-parameter it: (PsiAnnotation..PsiAnnotation?) defined in org.jetbrains.kotlin.j2k.OverloadReducer.getAnnotationsFingerprint.<anonymous>[ValueParameterDescriptorImpl]

'text' @ [172:57] ==> public final val PsiAnnotation.text: (String..String?)[MyPropertyDescriptor]

'convertParameter' @ [179:139] ==> public final fun convertParameter(parameter: PsiParameter, nullability: Nullability = ..., varValModifier: FunctionParameter.VarValModifier = ..., modifiers: Modifiers = ..., defaultValue: DeferredElement<Expression>? = ...): FunctionParameter defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'parameter' @ [179:156] ==> value-parameter parameter: PsiParameter defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[ValueParameterDescriptorImpl]

'default' @ [179:182] ==> value-parameter default: DeferredElement<Expression>? defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [180:69] ==> <this> defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[ReceiverParameterDescriptorImpl]

'method' @ [182:25] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.convertParameterList[ValueParameterDescriptorImpl]

'parameterList' @ [182:32] ==> public final val PsiMethod.parameterList: PsiParameterList[MyPropertyDescriptor]

'parameterList' @ [183:18] ==> val parameterList: PsiParameterList defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

'parameters' @ [183:32] ==> public final val PsiParameterList.parameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'parameterList' @ [184:18] ==> val parameterList: PsiParameterList defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

'node' @ [184:32] ==> public final val PsiParameterList.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'findChildByType' @ [184:38] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'LPARENTH' @ [184:68] ==> public final val LPARENTH: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'psi' @ [184:79] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parameterList' @ [185:18] ==> val parameterList: PsiParameterList defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

'node' @ [185:32] ==> public final val PsiParameterList.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'findChildByType' @ [185:38] ==> @Nullable public abstract fun findChildByType(p0: (IElementType..IElementType?)): ASTNode? defined in com.intellij.lang.ASTNode[JavaMethodDescriptor]

'RPARENTH' @ [185:68] ==> public final val RPARENTH: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'psi' @ [185:79] ==> public final val ASTNode.psi: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'ParameterList' @ [186:12] ==> public constructor ParameterList(parameters: List<Parameter>, lPar: LPar?, rPar: RPar?) defined in org.jetbrains.kotlin.j2k.ast.ParameterList[ClassConstructorDescriptorImpl]

'params' @ [187:13] ==> val params: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

'indices' @ [187:20] ==> public val <T> Array<out (PsiParameter..PsiParameter?)>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'map' @ [187:28] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> FunctionParameter): List<FunctionParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> FunctionParameter

'params' @ [188:33] ==> val params: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>) defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

'i' @ [188:40] ==> value-parameter i: Int defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[ValueParameterDescriptorImpl]

'overloadReducer' @ [189:36] ==> value-parameter overloadReducer: OverloadReducer? defined in org.jetbrains.kotlin.j2k.convertParameterList[ValueParameterDescriptorImpl]

'parameterDefault' @ [189:53] ==> public final fun parameterDefault(method: PsiMethod, parameterIndex: Int): PsiExpression? defined in org.jetbrains.kotlin.j2k.OverloadReducer[SimpleFunctionDescriptorImpl]

'method' @ [189:70] ==> value-parameter method: PsiMethod defined in org.jetbrains.kotlin.j2k.convertParameterList[ValueParameterDescriptorImpl]

'i' @ [189:78] ==> value-parameter i: Int defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[ValueParameterDescriptorImpl]

'if (defaultValue != null)
                    deferredElement { codeConverter -> codeConverter.correctCodeConverter().convertExpression(defaultValue, parameter.type) }
                else
                    null' @ [190:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DeferredElement<Expression>?, elseBranch: DeferredElement<Expression>?): DeferredElement<Expression>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DeferredElement<Expression>?

'defaultValue' @ [190:49] ==> val defaultValue: PsiExpression? defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[LocalVariableDescriptor]

'deferredElement' @ [191:21] ==> public final fun <TResult : Element> deferredElement(generator: (CodeConverter) -> Expression): DeferredElement<Expression> defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]
Inferred types:
    <TResult : Element> -> Expression

'codeConverter' @ [191:56] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [191:70] ==> public abstract operator fun CodeConverter.invoke(): CodeConverter defined in kotlin.Function1[FunctionInvokeDescriptor]

'convertExpression' @ [191:93] ==> public final fun convertExpression(expression: PsiExpression?, expectedType: PsiType?, expectedNullability: Nullability? = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'defaultValue' @ [191:111] ==> val defaultValue: PsiExpression? defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[LocalVariableDescriptor]

'parameter' @ [191:125] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[LocalVariableDescriptor]

'type' @ [191:135] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'invoke' @ [194:17] ==> public abstract operator fun invoke(parameter: @ParameterName PsiParameter, default: @ParameterName DeferredElement<Expression>?): FunctionParameter defined in kotlin.Function2[FunctionInvokeDescriptor]

'parameter' @ [194:34] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[LocalVariableDescriptor]

'defaultValueConverted' @ [194:45] ==> val defaultValueConverted: DeferredElement<Expression>? defined in org.jetbrains.kotlin.j2k.convertParameterList.<anonymous>[LocalVariableDescriptor]

'LPar' @ [196:13] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.LPar[FakeCallableDescriptorForObject]

'withPrototype' @ [196:18] ==> public final fun withPrototype(element: PsiElement?): LPar defined in org.jetbrains.kotlin.j2k.ast.LPar.Companion[SimpleFunctionDescriptorImpl]

'lParen' @ [196:32] ==> val lParen: PsiElement? defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

'RPar' @ [197:13] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.RPar[FakeCallableDescriptorForObject]

'withPrototype' @ [197:18] ==> public final fun withPrototype(element: PsiElement?): RPar defined in org.jetbrains.kotlin.j2k.ast.RPar.Companion[SimpleFunctionDescriptorImpl]

'rParen' @ [197:32] ==> val rParen: PsiElement? defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

'assignPrototype' @ [198:7] ==> public fun <TElement : Element> ParameterList.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): ParameterList defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ParameterList

'parameterList' @ [198:23] ==> val parameterList: PsiParameterList defined in org.jetbrains.kotlin.j2k.convertParameterList[LocalVariableDescriptor]

