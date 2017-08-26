'WhenMissingCase' @ [46:29] ==> private constructor WhenMissingCase() defined in org.jetbrains.kotlin.cfg.WhenMissingCase[ClassConstructorDescriptorImpl]

'firstOrNull' @ [53:13] ==> public fun <T> List<WhenMissingCase>.firstOrNull(): WhenMissingCase? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'UnknownMissingCase' @ [53:30] ==> public object UnknownMissingCase : WhenMissingCase defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'WhenMissingCase' @ [66:26] ==> private constructor WhenMissingCase() defined in org.jetbrains.kotlin.cfg.WhenMissingCase[ClassConstructorDescriptorImpl]

'branchConditionText' @ [67:31] ==> public open val branchConditionText: String defined in org.jetbrains.kotlin.cfg.NullMissingCase[PropertyDescriptorImpl]

'if (nullable) getNullCaseIfMissing(expression, context) else listOf()' @ [75:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<WhenMissingCase>, elseBranch: List<WhenMissingCase>): List<WhenMissingCase>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<WhenMissingCase>

'nullable' @ [75:17] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'getNullCaseIfMissing' @ [75:27] ==> private final fun getNullCaseIfMissing(expression: KtWhenExpression, context: BindingContext): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [75:48] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'context' @ [75:60] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'listOf' @ [75:74] ==> @InlineOnly public inline fun <T> listOf(): List<WhenMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'expression' @ [78:23] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing[ValueParameterDescriptorImpl]

'entries' @ [78:34] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entry' @ [79:31] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing[LocalVariableDescriptor]

'conditions' @ [79:37] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'condition' @ [80:21] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing[LocalVariableDescriptor]

'condition' @ [81:21] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing[LocalVariableDescriptor]

'expression' @ [81:31] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'let' @ [81:43] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'context' @ [82:36] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing[ValueParameterDescriptorImpl]

'getType' @ [82:44] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [82:52] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [83:29] ==> val type: KotlinType? defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing.<anonymous>[LocalVariableDescriptor]

'isNullableNothing' @ [83:60] ==> public open fun isNullableNothing(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'type' @ [83:78] ==> val type: KotlinType? defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker.getNullCaseIfMissing.<anonymous>[LocalVariableDescriptor]

'listOf' @ [84:36] ==> @InlineOnly public inline fun <T> listOf(): List<WhenMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'listOf' @ [90:16] ==> public fun <T> listOf(element: NullMissingCase): List<NullMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NullMissingCase

'NullMissingCase' @ [90:23] ==> public object NullMissingCase : WhenMissingCase defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'WhenMissingCase' @ [94:44] ==> private constructor WhenMissingCase() defined in org.jetbrains.kotlin.cfg.WhenMissingCase[ClassConstructorDescriptorImpl]

'branchConditionText' @ [95:31] ==> public open val branchConditionText: String defined in org.jetbrains.kotlin.cfg.BooleanMissingCase[PropertyDescriptorImpl]

'b' @ [97:40] ==> public final val b: Boolean defined in org.jetbrains.kotlin.cfg.BooleanMissingCase[PropertyDescriptorImpl]

'toString' @ [97:42] ==> public open fun toString(): String defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expression' @ [110:27] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'entries' @ [110:38] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'whenEntry' @ [111:35] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'conditions' @ [111:45] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'whenCondition' @ [112:21] ==> val whenCondition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'whenCondition' @ [113:42] ==> val whenCondition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'expression' @ [113:56] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'canBeReducedToBooleanConstant' @ [114:50] ==> public open fun canBeReducedToBooleanConstant(@Nullable expression: KtExpression?, @NotNull context: BindingContext, @Nullable expectedValue: Boolean?): Boolean defined in org.jetbrains.kotlin.resolve.CompileTimeConstantUtils[JavaMethodDescriptor]

'whenExpression' @ [114:80] ==> val whenExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'context' @ [114:96] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'containsTrue' @ [114:112] ==> var containsTrue: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'canBeReducedToBooleanConstant' @ [115:50] ==> public open fun canBeReducedToBooleanConstant(@Nullable expression: KtExpression?, @NotNull context: BindingContext, @Nullable expectedValue: Boolean?): Boolean defined in org.jetbrains.kotlin.resolve.CompileTimeConstantUtils[JavaMethodDescriptor]

'whenExpression' @ [115:80] ==> val whenExpression: KtExpression? defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'context' @ [115:96] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'containsFalse' @ [115:113] ==> var containsFalse: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'+' @ [119:16] ==> public operator fun <T> Collection<BooleanMissingCase>.plus(elements: Iterable<BooleanMissingCase>): List<BooleanMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BooleanMissingCase

'if (!containsTrue) listOf(BooleanMissingCase(true)) else listOf()' @ [119:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<BooleanMissingCase>, elseBranch: List<BooleanMissingCase>): List<BooleanMissingCase>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<BooleanMissingCase>

'!' @ [119:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsTrue' @ [119:22] ==> var containsTrue: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'listOf' @ [119:36] ==> public fun <T> listOf(element: BooleanMissingCase): List<BooleanMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BooleanMissingCase

'BooleanMissingCase' @ [119:43] ==> public constructor BooleanMissingCase(b: Boolean) defined in org.jetbrains.kotlin.cfg.BooleanMissingCase[ClassConstructorDescriptorImpl]

'listOf' @ [119:74] ==> @InlineOnly public inline fun <T> listOf(): List<BooleanMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BooleanMissingCase

'if (!containsFalse) listOf(BooleanMissingCase(false)) else listOf()' @ [120:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<BooleanMissingCase>, elseBranch: List<BooleanMissingCase>): List<BooleanMissingCase>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<BooleanMissingCase>

'!' @ [120:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'containsFalse' @ [120:22] ==> var containsFalse: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'listOf' @ [120:37] ==> public fun <T> listOf(element: BooleanMissingCase): List<BooleanMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BooleanMissingCase

'BooleanMissingCase' @ [120:44] ==> public constructor BooleanMissingCase(b: Boolean) defined in org.jetbrains.kotlin.cfg.BooleanMissingCase[ClassConstructorDescriptorImpl]

'listOf' @ [120:76] ==> @InlineOnly public inline fun <T> listOf(): List<BooleanMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> BooleanMissingCase

'WhenOnNullableExhaustivenessChecker' @ [121:16] ==> private object WhenOnNullableExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getMissingCases' @ [121:52] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext, nullable: Boolean): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [121:68] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'context' @ [121:80] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'nullable' @ [121:89] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'isBoolean' @ [125:31] ==> public open fun isBoolean(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'makeNotNullable' @ [125:51] ==> @NotNull public open fun makeNotNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'subjectType' @ [125:67] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.cfg.WhenOnBooleanExhaustivenessChecker.isApplicable[ValueParameterDescriptorImpl]

'WhenMissingCase' @ [129:58] ==> private constructor WhenMissingCase() defined in org.jetbrains.kotlin.cfg.WhenMissingCase[ClassConstructorDescriptorImpl]

'descriptor' @ [130:34] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.ClassMissingCase[PropertyDescriptorImpl]

'kind' @ [130:45] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [130:50] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'getFqNameFromTopLevelClass' @ [132:45] ==> @NotNull public open fun getFqNameFromTopLevelClass(@NotNull p0: DeclarationDescriptor): FqName defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'descriptor' @ [132:72] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.ClassMissingCase[PropertyDescriptorImpl]

'descriptor' @ [134:31] ==> public final val descriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.ClassMissingCase[PropertyDescriptorImpl]

'name' @ [134:42] ==> public final val ClassDescriptor.name: Name[MyPropertyDescriptor]

'identifier' @ [134:47] ==> public final val Name.identifier: String[MyPropertyDescriptor]

'let' @ [134:58] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (classIsSingleton) it else "is $it"' @ [134:64] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'classIsSingleton' @ [134:68] ==> public final val classIsSingleton: Boolean defined in org.jetbrains.kotlin.cfg.ClassMissingCase[PropertyDescriptorImpl]

'it' @ [134:86] ==> value-parameter it: String defined in org.jetbrains.kotlin.cfg.ClassMissingCase.toString.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [134:99] ==> value-parameter it: String defined in org.jetbrains.kotlin.cfg.ClassMissingCase.toString.<anonymous>[ValueParameterDescriptorImpl]

'classFqName' @ [136:40] ==> public final val classFqName: FqName defined in org.jetbrains.kotlin.cfg.ClassMissingCase[PropertyDescriptorImpl]

'asString' @ [136:52] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'let' @ [136:63] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> String

'if (classIsSingleton) it else "is $it"' @ [136:69] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'classIsSingleton' @ [136:73] ==> public final val classIsSingleton: Boolean defined in org.jetbrains.kotlin.cfg.ClassMissingCase[PropertyDescriptorImpl]

'it' @ [136:91] ==> value-parameter it: String defined in org.jetbrains.kotlin.cfg.ClassMissingCase.branchConditionText.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [136:104] ==> value-parameter it: String defined in org.jetbrains.kotlin.cfg.ClassMissingCase.branchConditionText.<anonymous>[ValueParameterDescriptorImpl]

'when (expression) {
                is KtSimpleNameExpression -> expression
                is KtQualifiedExpression -> getReference(expression.selectorExpression)
                else -> null
            }' @ [141:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtSimpleNameExpression?, entry1: KtSimpleNameExpression?, entry2: KtSimpleNameExpression?): KtSimpleNameExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtSimpleNameExpression?

'expression' @ [141:19] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getReference[ValueParameterDescriptorImpl]

'expression' @ [142:46] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getReference[ValueParameterDescriptorImpl]

'getReference' @ [143:45] ==> private final fun getReference(expression: KtExpression?): KtSimpleNameExpression? defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [143:58] ==> value-parameter expression: KtExpression? defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getReference[ValueParameterDescriptorImpl]

'selectorExpression' @ [143:69] ==> public open val selectorExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtQualifiedExpression[PropertyDescriptorImpl]

'this' @ [148:17] ==> <this> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.deepSealedSubclasses[ReceiverParameterDescriptorImpl]

'sealedSubclasses' @ [148:22] ==> public final val ClassDescriptor.sealedSubclasses: Collection<(ClassDescriptor..ClassDescriptor?)>[MyPropertyDescriptor]

'flatMap' @ [148:39] ==> public inline fun <T, R> Iterable<(ClassDescriptor..ClassDescriptor?)>.flatMap(transform: ((ClassDescriptor..ClassDescriptor?)) -> Iterable<ClassDescriptor>): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)
    <R> -> ClassDescriptor

'if (it.modality == Modality.SEALED) it.deepSealedSubclasses
            else setOf(it)' @ [149:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<(ClassDescriptor..ClassDescriptor?)>, elseBranch: Collection<(ClassDescriptor..ClassDescriptor?)>): Collection<(ClassDescriptor..ClassDescriptor?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<(org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)>

'it' @ [149:17] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.<get-deepSealedSubclasses>.<anonymous>[ValueParameterDescriptorImpl]

'modality' @ [149:20] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [149:32] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [149:41] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'it' @ [149:49] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.<get-deepSealedSubclasses>.<anonymous>[ValueParameterDescriptorImpl]

'deepSealedSubclasses' @ [149:52] ==> protected final val ClassDescriptor.deepSealedSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[PropertyDescriptorImpl]

'setOf' @ [150:18] ==> public fun <T> setOf(element: (ClassDescriptor..ClassDescriptor?)): Set<(ClassDescriptor..ClassDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ClassDescriptor..org.jetbrains.kotlin.descriptors.ClassDescriptor?)

'it' @ [150:24] ==> value-parameter it: (ClassDescriptor..ClassDescriptor?) defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.<get-deepSealedSubclasses>.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [154:17] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'this' @ [154:18] ==> <this> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.negated[ReceiverParameterDescriptorImpl]

'isNegated' @ [154:54] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'this' @ [157:13] ==> <this> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.isRelevant[ReceiverParameterDescriptorImpl]

'isObject' @ [158:29] ==> public open fun isObject(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'checkedDescriptor' @ [158:38] ==> value-parameter checkedDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.isRelevant[ValueParameterDescriptorImpl]

'isEnumEntry' @ [159:29] ==> public open fun isEnumEntry(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'checkedDescriptor' @ [159:41] ==> value-parameter checkedDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.isRelevant[ValueParameterDescriptorImpl]

'when (this) {
            is KtWhenConditionIsPattern -> {
                val checkedType = context.get(BindingContext.TYPE, typeReference) ?: return null
                TypeUtils.getClassDescriptor(checkedType)
            }
            is KtWhenConditionWithExpression -> {
                val reference = expression?.let { getReference(it) } ?: return null
                context.get(BindingContext.REFERENCE_TARGET, reference) as? ClassDescriptor
            }
            else -> {
                null
            }
        }' @ [162:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ClassDescriptor?, entry1: ClassDescriptor?, entry2: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ClassDescriptor?

'this' @ [162:22] ==> <this> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getCheckedDescriptor[ReceiverParameterDescriptorImpl]

'context' @ [164:35] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getCheckedDescriptor[ValueParameterDescriptorImpl]

'get' @ [164:43] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'TYPE' @ [164:62] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [164:68] ==> public final val KtWhenConditionIsPattern.typeReference: KtTypeReference?[MyPropertyDescriptor]

'getClassDescriptor' @ [165:27] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'checkedType' @ [165:46] ==> val checkedType: KotlinType defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getCheckedDescriptor[LocalVariableDescriptor]

'expression' @ [168:33] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'let' @ [168:45] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KtSimpleNameExpression?): KtSimpleNameExpression? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KtSimpleNameExpression?

'getReference' @ [168:51] ==> private final fun getReference(expression: KtExpression?): KtSimpleNameExpression? defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'it' @ [168:64] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getCheckedDescriptor.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [169:17] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getCheckedDescriptor[ValueParameterDescriptorImpl]

'get' @ [169:25] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [169:44] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'reference' @ [169:62] ==> val reference: KtSimpleNameExpression defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getCheckedDescriptor[LocalVariableDescriptor]

'subclasses' @ [183:13] ==> value-parameter subclasses: Set<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[ValueParameterDescriptorImpl]

'isEmpty' @ [183:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'listOf' @ [183:42] ==> public fun <T> listOf(element: UnknownMissingCase): List<UnknownMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnknownMissingCase

'UnknownMissingCase' @ [183:49] ==> public object UnknownMissingCase : WhenMissingCase defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'linkedSetOf' @ [185:34] ==> @SinceKotlin @InlineOnly public inline fun <T> linkedSetOf(): LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'whenExpression' @ [186:27] ==> value-parameter whenExpression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[ValueParameterDescriptorImpl]

'entries' @ [186:42] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'whenEntry' @ [187:31] ==> val whenEntry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'conditions' @ [187:41] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'condition' @ [188:31] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'negated' @ [188:41] ==> private final val KtWhenCondition.negated: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[PropertyDescriptorImpl]

'condition' @ [189:41] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'getCheckedDescriptor' @ [189:51] ==> private final fun KtWhenCondition.getCheckedDescriptor(context: BindingContext): ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'context' @ [189:72] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[ValueParameterDescriptorImpl]

'if (checkedDescriptor.modality == Modality.SEALED) checkedDescriptor.deepSealedSubclasses
                        else listOf(checkedDescriptor)' @ [191:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<ClassDescriptor>, elseBranch: List<ClassDescriptor>): List<ClassDescriptor>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<ClassDescriptor>

'checkedDescriptor' @ [191:29] ==> val checkedDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'modality' @ [191:47] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [191:59] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [191:68] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'checkedDescriptor' @ [191:76] ==> val checkedDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'deepSealedSubclasses' @ [191:94] ==> protected final val ClassDescriptor.deepSealedSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[PropertyDescriptorImpl]

'listOf' @ [192:30] ==> public fun <T> listOf(element: ClassDescriptor): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'checkedDescriptor' @ [192:37] ==> val checkedDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'checkedDescriptorSubclasses' @ [196:21] ==> val checkedDescriptorSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'none' @ [196:49] ==> public inline fun <T> Iterable<ClassDescriptor>.none(predicate: (ClassDescriptor) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'subclasses' @ [196:56] ==> value-parameter subclasses: Set<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[ValueParameterDescriptorImpl]

'contains' @ [196:67] ==> public abstract fun contains(element: ClassDescriptor): Boolean defined in kotlin.collections.Set[DeserializedSimpleFunctionDescriptor]

'it' @ [196:76] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [197:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'condition' @ [197:22] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'isRelevant' @ [197:32] ==> private final fun KtWhenCondition.isRelevant(checkedDescriptor: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'checkedDescriptor' @ [197:43] ==> val checkedDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'if (negated) {
                    if (checkedDescriptors.containsAll(checkedDescriptorSubclasses)) return listOf()
                    checkedDescriptors.addAll(subclasses)
                    checkedDescriptors.removeAll(checkedDescriptorSubclasses)
                }
                else {
                    checkedDescriptors.addAll(checkedDescriptorSubclasses)
                }' @ [200:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'negated' @ [200:21] ==> val negated: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'checkedDescriptors' @ [201:25] ==> val checkedDescriptors: LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'containsAll' @ [201:44] ==> public open fun containsAll(elements: Collection<ClassDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'checkedDescriptorSubclasses' @ [201:56] ==> val checkedDescriptorSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'listOf' @ [201:93] ==> @InlineOnly public inline fun <T> listOf(): List<WhenMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'checkedDescriptors' @ [202:21] ==> val checkedDescriptors: LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'addAll' @ [202:40] ==> public open fun addAll(elements: Collection<ClassDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'subclasses' @ [202:47] ==> value-parameter subclasses: Set<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[ValueParameterDescriptorImpl]

'checkedDescriptors' @ [203:21] ==> val checkedDescriptors: LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'removeAll' @ [203:40] ==> public open fun removeAll(elements: Collection<ClassDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'checkedDescriptorSubclasses' @ [203:50] ==> val checkedDescriptorSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'checkedDescriptors' @ [206:21] ==> val checkedDescriptors: LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'addAll' @ [206:40] ==> public open fun addAll(elements: Collection<ClassDescriptor>): Boolean defined in java.util.LinkedHashSet[JavaMethodDescriptor]

'checkedDescriptorSubclasses' @ [206:47] ==> val checkedDescriptorSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'subclasses' @ [210:17] ==> value-parameter subclasses: Set<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[ValueParameterDescriptorImpl]

'checkedDescriptors' @ [210:30] ==> val checkedDescriptors: LinkedHashSet<ClassDescriptor> /* = LinkedHashSet<ClassDescriptor> */ defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker.getMissingClassCases[LocalVariableDescriptor]

'map' @ [210:50] ==> public inline fun <T, R> Iterable<ClassDescriptor>.map(transform: (ClassDescriptor) -> ClassMissingCase): List<ClassMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor
    <R> -> ClassMissingCase

'WhenOnClassExhaustivenessChecker' @ [214:50] ==> public constructor WhenOnClassExhaustivenessChecker() defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[ClassConstructorDescriptorImpl]

'assert' @ [221:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isEnumClass' @ [221:16] ==> public open fun isEnumClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'subjectDescriptor' @ [221:28] ==> value-parameter subjectDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'getAllDescriptors' @ [223:33] ==> @NotNull public open fun getAllDescriptors(@NotNull p0: MemberScope): (MutableCollection<(DeclarationDescriptor..DeclarationDescriptor?)>..Collection<(DeclarationDescriptor..DeclarationDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'subjectDescriptor' @ [223:51] ==> value-parameter subjectDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'unsubstitutedInnerClassesScope' @ [223:71] ==> public final val ClassDescriptor.unsubstitutedInnerClassesScope: MemberScope[MyPropertyDescriptor]

'filter' @ [224:26] ==> public inline fun <T> Iterable<(DeclarationDescriptor..DeclarationDescriptor?)>.filter(predicate: ((DeclarationDescriptor..DeclarationDescriptor?)) -> Boolean): List<(DeclarationDescriptor..DeclarationDescriptor?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.DeclarationDescriptor..org.jetbrains.kotlin.descriptors.DeclarationDescriptor?)

'filterIsInstance' @ [225:26] ==> public inline fun <reified R> Iterable<*>.filterIsInstance(): List<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> ClassDescriptor

'toSet' @ [226:26] ==> public fun <T> Iterable<ClassDescriptor>.toSet(): Set<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'getMissingClassCases' @ [227:16] ==> protected final fun getMissingClassCases(whenExpression: KtWhenExpression, subclasses: Set<ClassDescriptor>, context: BindingContext): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [227:37] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'entryDescriptors' @ [227:49] ==> val entryDescriptors: Set<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'context' @ [227:67] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'WhenOnNullableExhaustivenessChecker' @ [228:16] ==> private object WhenOnNullableExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getMissingCases' @ [228:52] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext, nullable: Boolean): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [228:68] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'context' @ [228:80] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'nullable' @ [228:89] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'WhenChecker' @ [232:16] ==> public object WhenChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getClassDescriptorOfTypeIfEnum' @ [232:28] ==> @JvmStatic public final fun getClassDescriptorOfTypeIfEnum(type: KotlinType?): ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'subjectType' @ [232:59] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker.isApplicable[ValueParameterDescriptorImpl]

'WhenOnClassExhaustivenessChecker' @ [236:53] ==> public constructor WhenOnClassExhaustivenessChecker() defined in org.jetbrains.kotlin.cfg.WhenOnClassExhaustivenessChecker[ClassConstructorDescriptorImpl]

'assert' @ [244:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'isSealedClass' @ [244:32] ==> public open fun isSealedClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'subjectDescriptor' @ [244:46] ==> value-parameter subjectDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'subjectDescriptor' @ [245:94] ==> value-parameter subjectDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'subjectDescriptor' @ [248:29] ==> value-parameter subjectDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'deepSealedSubclasses' @ [248:49] ==> protected final val ClassDescriptor.deepSealedSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker[PropertyDescriptorImpl]

'getMissingClassCases' @ [249:16] ==> protected final fun getMissingClassCases(whenExpression: KtWhenExpression, subclasses: Set<ClassDescriptor>, context: BindingContext): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [249:37] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'allSubclasses' @ [249:49] ==> val allSubclasses: List<ClassDescriptor> defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[LocalVariableDescriptor]

'toSet' @ [249:63] ==> public fun <T> Iterable<ClassDescriptor>.toSet(): Set<ClassDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'context' @ [249:72] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'WhenOnNullableExhaustivenessChecker' @ [250:16] ==> private object WhenOnNullableExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getMissingCases' @ [250:52] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext, nullable: Boolean): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [250:68] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'context' @ [250:80] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'nullable' @ [250:89] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.getMissingCases[ValueParameterDescriptorImpl]

'isSealedClass' @ [254:32] ==> public open fun isSealedClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'getClassDescriptor' @ [254:56] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'subjectType' @ [254:75] ==> value-parameter subjectType: KotlinType defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker.isApplicable[ValueParameterDescriptorImpl]

'listOf' @ [261:42] ==> public fun <T> listOf(vararg elements: WhenExhaustivenessChecker): List<WhenExhaustivenessChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenExhaustivenessChecker

'WhenOnBooleanExhaustivenessChecker' @ [261:49] ==> private object WhenOnBooleanExhaustivenessChecker : WhenExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'WhenOnEnumExhaustivenessChecker' @ [262:49] ==> private object WhenOnEnumExhaustivenessChecker : WhenOnClassExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'WhenOnSealedExhaustivenessChecker' @ [263:49] ==> internal object WhenOnSealedExhaustivenessChecker : WhenOnClassExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'JvmStatic' @ [265:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'getClassDescriptorOfTypeIfEnum' @ [267:13] ==> @JvmStatic public final fun getClassDescriptorOfTypeIfEnum(type: KotlinType?): ClassDescriptor? defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'whenSubjectType' @ [267:44] ==> @JvmStatic public final fun whenSubjectType(expression: KtWhenExpression, context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'expression' @ [267:60] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.isWhenByEnum[ValueParameterDescriptorImpl]

'context' @ [267:72] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.isWhenByEnum[ValueParameterDescriptorImpl]

'JvmStatic' @ [269:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'type' @ [271:13] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.cfg.WhenChecker.getClassDescriptorOfTypeIfEnum[ValueParameterDescriptorImpl]

'?:' @ [272:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: ClassDescriptor?, right: ClassDescriptor): ClassDescriptor[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> ClassDescriptor

'getClassDescriptor' @ [272:41] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [272:60] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.cfg.WhenChecker.getClassDescriptorOfTypeIfEnum[ValueParameterDescriptorImpl]

'classDescriptor' @ [273:13] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenChecker.getClassDescriptorOfTypeIfEnum[LocalVariableDescriptor]

'kind' @ [273:29] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'ENUM_CLASS' @ [273:47] ==> enum entry ENUM_CLASS defined in org.jetbrains.kotlin.descriptors.ClassKind[FakeCallableDescriptorForObject]

'classDescriptor' @ [275:16] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenChecker.getClassDescriptorOfTypeIfEnum[LocalVariableDescriptor]

'JvmStatic' @ [278:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'type' @ [280:15] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.cfg.WhenChecker.getClassDescriptorOfTypeIfSealed[ValueParameterDescriptorImpl]

'let' @ [280:21] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> ClassDescriptor?): ClassDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> ClassDescriptor?

'getClassDescriptor' @ [280:37] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'it' @ [280:56] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.cfg.WhenChecker.getClassDescriptorOfTypeIfSealed.<anonymous>[ValueParameterDescriptorImpl]

'takeIf' @ [280:63] ==> @InlineOnly @SinceKotlin public inline fun <T> ClassDescriptor.takeIf(predicate: (ClassDescriptor) -> Boolean): ClassDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassDescriptor

'isSealedClass' @ [280:88] ==> public open fun isSealedClass(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'it' @ [280:102] ==> value-parameter it: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenChecker.getClassDescriptorOfTypeIfSealed.<anonymous>[ValueParameterDescriptorImpl]

'JvmStatic' @ [283:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'expression' @ [285:13] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.whenSubjectType[ValueParameterDescriptorImpl]

'subjectExpression' @ [285:24] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'let' @ [285:43] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> KotlinType?

'context' @ [285:49] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.whenSubjectType[ValueParameterDescriptorImpl]

'get' @ [285:57] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..ReadOnlySlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?), key: (KtExpression..KtExpression?)): ExplicitSmartCasts? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> ExplicitSmartCasts

'SMARTCAST' @ [285:61] ==> public final val SMARTCAST: (WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>..WritableSlice<(KtExpression..KtExpression?), (ExplicitSmartCasts..ExplicitSmartCasts?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [285:72] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.whenSubjectType.<anonymous>[ValueParameterDescriptorImpl]

'defaultType' @ [285:77] ==> public abstract val defaultType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.ExplicitSmartCasts[PropertyDescriptorImpl]

'context' @ [285:92] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.whenSubjectType[ValueParameterDescriptorImpl]

'getType' @ [285:100] ==> @Nullable public abstract fun getType(@NotNull expression: KtExpression): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]

'it' @ [285:108] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.whenSubjectType.<anonymous>[ValueParameterDescriptorImpl]

'JvmStatic' @ [287:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'WhenOnEnumExhaustivenessChecker' @ [292:9] ==> private object WhenOnEnumExhaustivenessChecker : WhenOnClassExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getMissingCases' @ [292:41] ==> public open fun getMissingCases(expression: KtWhenExpression, context: BindingContext, subjectDescriptor: ClassDescriptor?, nullable: Boolean): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnEnumExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [292:57] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.getEnumMissingCases[ValueParameterDescriptorImpl]

'context' @ [292:69] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.getEnumMissingCases[ValueParameterDescriptorImpl]

'enumClassDescriptor' @ [292:78] ==> value-parameter enumClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenChecker.getEnumMissingCases[ValueParameterDescriptorImpl]

'JvmStatic' @ [294:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'WhenOnSealedExhaustivenessChecker' @ [299:9] ==> internal object WhenOnSealedExhaustivenessChecker : WhenOnClassExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getMissingCases' @ [299:43] ==> public open fun getMissingCases(expression: KtWhenExpression, context: BindingContext, subjectDescriptor: ClassDescriptor?, nullable: Boolean): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnSealedExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [299:59] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.getSealedMissingCases[ValueParameterDescriptorImpl]

'context' @ [299:71] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.getSealedMissingCases[ValueParameterDescriptorImpl]

'sealedClassDescriptor' @ [299:80] ==> value-parameter sealedClassDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.cfg.WhenChecker.getSealedMissingCases[ValueParameterDescriptorImpl]

'whenSubjectType' @ [302:20] ==> @JvmStatic public final fun whenSubjectType(expression: KtWhenExpression, context: BindingContext): KotlinType? defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'expression' @ [302:36] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[ValueParameterDescriptorImpl]

'context' @ [302:48] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[ValueParameterDescriptorImpl]

'listOf' @ [302:67] ==> public fun <T> listOf(element: UnknownMissingCase): List<UnknownMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnknownMissingCase

'UnknownMissingCase' @ [302:74] ==> public object UnknownMissingCase : WhenMissingCase defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'type' @ [303:24] ==> val type: KotlinType defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[LocalVariableDescriptor]

'isMarkedNullable' @ [303:29] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'exhaustivenessCheckers' @ [304:24] ==> private final val exhaustivenessCheckers: List<WhenExhaustivenessChecker> defined in org.jetbrains.kotlin.cfg.WhenChecker[PropertyDescriptorImpl]

'filter' @ [304:47] ==> public inline fun <T> Iterable<WhenExhaustivenessChecker>.filter(predicate: (WhenExhaustivenessChecker) -> Boolean): List<WhenExhaustivenessChecker> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenExhaustivenessChecker

'it' @ [304:56] ==> value-parameter it: WhenExhaustivenessChecker defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases.<anonymous>[ValueParameterDescriptorImpl]

'isApplicable' @ [304:59] ==> public open fun isApplicable(subjectType: KotlinType): Boolean defined in org.jetbrains.kotlin.cfg.WhenExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'type' @ [304:72] ==> val type: KotlinType defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[LocalVariableDescriptor]

'checkers' @ [305:13] ==> val checkers: List<WhenExhaustivenessChecker> defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[LocalVariableDescriptor]

'isEmpty' @ [305:22] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'listOf' @ [305:40] ==> public fun <T> listOf(element: UnknownMissingCase): List<UnknownMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnknownMissingCase

'UnknownMissingCase' @ [305:47] ==> public object UnknownMissingCase : WhenMissingCase defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'checkers' @ [306:16] ==> val checkers: List<WhenExhaustivenessChecker> defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[LocalVariableDescriptor]

'map' @ [306:25] ==> public inline fun <T, R> Iterable<WhenExhaustivenessChecker>.map(transform: (WhenExhaustivenessChecker) -> List<WhenMissingCase>): List<List<WhenMissingCase>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenExhaustivenessChecker
    <R> -> List<WhenMissingCase>

'it' @ [306:31] ==> value-parameter it: WhenExhaustivenessChecker defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases.<anonymous>[ValueParameterDescriptorImpl]

'getMissingCases' @ [306:34] ==> public abstract fun getMissingCases(expression: KtWhenExpression, context: BindingContext, subjectDescriptor: ClassDescriptor?, nullable: Boolean): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [306:50] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[ValueParameterDescriptorImpl]

'context' @ [306:62] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[ValueParameterDescriptorImpl]

'getClassDescriptor' @ [306:81] ==> @Nullable public open fun getClassDescriptor(@NotNull p0: KotlinType): ClassDescriptor? defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [306:100] ==> val type: KotlinType defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[LocalVariableDescriptor]

'nullable' @ [306:107] ==> val nullable: Boolean defined in org.jetbrains.kotlin.cfg.WhenChecker.getMissingCases[LocalVariableDescriptor]

'flatten' @ [306:119] ==> public fun <T> Iterable<Iterable<WhenMissingCase>>.flatten(): List<WhenMissingCase> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> WhenMissingCase

'JvmStatic' @ [309:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'if (getMissingCases(expression, trace.bindingContext).isEmpty()) {
                trace.record(BindingContext.EXHAUSTIVE_WHEN, expression)
                true
            } else {
                false
            }' @ [311:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean, elseBranch: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean

'getMissingCases' @ [311:17] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenChecker[SimpleFunctionDescriptorImpl]

'expression' @ [311:33] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.isWhenExhaustive[ValueParameterDescriptorImpl]

'trace' @ [311:45] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.isWhenExhaustive[ValueParameterDescriptorImpl]

'bindingContext' @ [311:51] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'isEmpty' @ [311:67] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'trace' @ [312:17] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.isWhenExhaustive[ValueParameterDescriptorImpl]

'record' @ [312:23] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?), key: (KtWhenExpression..KtWhenExpression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtWhenExpression

'EXHAUSTIVE_WHEN' @ [312:45] ==> public final val EXHAUSTIVE_WHEN: (WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>..WritableSlice<(KtWhenExpression..KtWhenExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [312:62] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.isWhenExhaustive[ValueParameterDescriptorImpl]

'WhenOnNullableExhaustivenessChecker' @ [319:13] ==> private object WhenOnNullableExhaustivenessChecker defined in org.jetbrains.kotlin.cfg in file WhenChecker.kt[FakeCallableDescriptorForObject]

'getMissingCases' @ [319:49] ==> public final fun getMissingCases(expression: KtWhenExpression, context: BindingContext, nullable: Boolean): List<WhenMissingCase> defined in org.jetbrains.kotlin.cfg.WhenOnNullableExhaustivenessChecker[SimpleFunctionDescriptorImpl]

'expression' @ [319:65] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.containsNullCase[ValueParameterDescriptorImpl]

'context' @ [319:77] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.cfg.WhenChecker.containsNullCase[ValueParameterDescriptorImpl]

'isEmpty' @ [319:92] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'expression' @ [322:13] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[ValueParameterDescriptorImpl]

'subjectExpression' @ [322:24] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'HashSet' @ [324:28] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<KotlinType, Boolean>

'HashSet' @ [325:32] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CompileTimeConstant<*>

'expression' @ [326:23] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[ValueParameterDescriptorImpl]

'entries' @ [326:34] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entry' @ [327:17] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'isElse' @ [327:23] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'entry' @ [329:43] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'conditions' @ [329:49] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'when (condition) {
                    is KtWhenConditionWithExpression -> {
                        val constantExpression = condition.expression ?: continue@conditions
                        val constant = ConstantExpressionEvaluator.getConstant(
                                constantExpression, trace.bindingContext) ?: continue@conditions
                        if (checkedConstants.contains(constant)) {
                            trace.report(Errors.DUPLICATE_LABEL_IN_WHEN.on(constantExpression))
                        }
                        else {
                            checkedConstants.add(constant)
                        }

                    }
                    is KtWhenConditionIsPattern -> {
                        val typeReference = condition.typeReference ?: continue@conditions
                        val type = trace.get(BindingContext.TYPE, typeReference) ?: continue@conditions
                        val typeWithIsNegation = type to condition.isNegated
                        if (checkedTypes.contains(typeWithIsNegation)) {
                            trace.report(Errors.DUPLICATE_LABEL_IN_WHEN.on(typeReference))
                        }
                        else {
                            checkedTypes.add(typeWithIsNegation)
                        }
                    }
                    else -> {}
                }' @ [330:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Any, entry1: Any, entry2: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Any

'condition' @ [330:23] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'condition' @ [332:50] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'expression' @ [332:60] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'ConstantExpressionEvaluator' @ [333:40] ==> public companion object defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator[FakeCallableDescriptorForObject]

'getConstant' @ [333:68] ==> @JvmStatic public final fun getConstant(expression: KtExpression, bindingContext: BindingContext): CompileTimeConstant<*>? defined in org.jetbrains.kotlin.resolve.constants.evaluate.ConstantExpressionEvaluator.Companion[SimpleFunctionDescriptorImpl]

'constantExpression' @ [334:33] ==> val constantExpression: KtExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'trace' @ [334:53] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[ValueParameterDescriptorImpl]

'bindingContext' @ [334:59] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'if (checkedConstants.contains(constant)) {
                            trace.report(Errors.DUPLICATE_LABEL_IN_WHEN.on(constantExpression))
                        }
                        else {
                            checkedConstants.add(constant)
                        }' @ [335:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'checkedConstants' @ [335:29] ==> val checkedConstants: HashSet<CompileTimeConstant<*>> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'contains' @ [335:46] ==> public open fun contains(element: CompileTimeConstant<*>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'constant' @ [335:55] ==> val constant: CompileTimeConstant<Any?> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'trace' @ [336:29] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[ValueParameterDescriptorImpl]

'report' @ [336:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DUPLICATE_LABEL_IN_WHEN' @ [336:49] ==> public final val DUPLICATE_LABEL_IN_WHEN: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [336:73] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'constantExpression' @ [336:76] ==> val constantExpression: KtExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'checkedConstants' @ [339:29] ==> val checkedConstants: HashSet<CompileTimeConstant<*>> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'add' @ [339:46] ==> public open fun add(element: CompileTimeConstant<*>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'constant' @ [339:50] ==> val constant: CompileTimeConstant<Any?> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'condition' @ [344:45] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'typeReference' @ [344:55] ==> public final val KtWhenConditionIsPattern.typeReference: KtTypeReference?[MyPropertyDescriptor]

'trace' @ [345:36] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[ValueParameterDescriptorImpl]

'get' @ [345:42] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'TYPE' @ [345:61] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'typeReference' @ [345:67] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'type' @ [346:50] ==> val type: KotlinType defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'condition' @ [346:58] ==> val condition: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'isNegated' @ [346:68] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'if (checkedTypes.contains(typeWithIsNegation)) {
                            trace.report(Errors.DUPLICATE_LABEL_IN_WHEN.on(typeReference))
                        }
                        else {
                            checkedTypes.add(typeWithIsNegation)
                        }' @ [347:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'checkedTypes' @ [347:29] ==> val checkedTypes: HashSet<Pair<KotlinType, Boolean>> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'contains' @ [347:42] ==> public open fun contains(element: Pair<KotlinType, Boolean>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'typeWithIsNegation' @ [347:51] ==> val typeWithIsNegation: Pair<KotlinType, Boolean> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'trace' @ [348:29] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[ValueParameterDescriptorImpl]

'report' @ [348:35] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'DUPLICATE_LABEL_IN_WHEN' @ [348:49] ==> public final val DUPLICATE_LABEL_IN_WHEN: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [348:73] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'typeReference' @ [348:76] ==> val typeReference: KtTypeReference defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'checkedTypes' @ [351:29] ==> val checkedTypes: HashSet<Pair<KotlinType, Boolean>> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'add' @ [351:42] ==> public open fun add(element: Pair<KotlinType, Boolean>): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'typeWithIsNegation' @ [351:46] ==> val typeWithIsNegation: Pair<KotlinType, Boolean> defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDuplicatedLabels[LocalVariableDescriptor]

'expression' @ [362:13] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[ValueParameterDescriptorImpl]

'subjectExpression' @ [362:24] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [364:23] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[ValueParameterDescriptorImpl]

'entries' @ [364:34] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'entry' @ [365:17] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'isElse' @ [365:23] ==> public final val KtWhenEntry.isElse: Boolean[MyPropertyDescriptor]

'entry' @ [366:38] ==> val entry: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'firstChild' @ [366:44] ==> public final val KtWhenEntry.firstChild: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'child' @ [367:20] ==> var child: PsiElement? defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'child' @ [368:21] ==> var child: PsiElement? defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'node' @ [368:27] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [368:32] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'COMMA' @ [368:57] ==> public final val COMMA: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'trace' @ [369:21] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[ValueParameterDescriptorImpl]

'report' @ [369:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'COMMA_IN_WHEN_CONDITION_WITHOUT_ARGUMENT' @ [369:41] ==> public final val COMMA_IN_WHEN_CONDITION_WITHOUT_ARGUMENT: (DiagnosticFactory0<(PsiElement..PsiElement?)>..DiagnosticFactory0<(PsiElement..PsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [369:82] ==> @NotNull public open fun on(@NotNull element: PsiElement): SimpleDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'child' @ [369:85] ==> var child: PsiElement? defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'child' @ [371:21] ==> var child: PsiElement? defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'node' @ [371:27] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [371:32] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'ARROW' @ [371:57] ==> public final val ARROW: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'child' @ [372:17] ==> var child: PsiElement? defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'child' @ [372:25] ==> var child: PsiElement? defined in org.jetbrains.kotlin.cfg.WhenChecker.checkDeprecatedWhenSyntax[LocalVariableDescriptor]

'nextSibling' @ [372:31] ==> public final val PsiElement.nextSibling: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'checkReservedPrefixWord' @ [378:9] ==> public fun checkReservedPrefixWord(sink: DiagnosticSink, element: PsiElement, word: String, message: String): Unit defined in org.jetbrains.kotlin.psi.psiUtil in file ktPsiUtil.kt[SimpleFunctionDescriptorImpl]

'trace' @ [378:33] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.cfg.WhenChecker.checkReservedPrefix[ValueParameterDescriptorImpl]

'expression' @ [378:40] ==> value-parameter expression: KtWhenExpression defined in org.jetbrains.kotlin.cfg.WhenChecker.checkReservedPrefix[ValueParameterDescriptorImpl]

'whenKeyword' @ [378:51] ==> public final val KtWhenExpression.whenKeyword: PsiElement[MyPropertyDescriptor]

