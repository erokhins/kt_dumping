'KotlinAbstractUExpression' @ [27:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'getValue' @ [28:32] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KotlinConverter' @ [28:37] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrNull' @ [28:53] ==> internal final fun convertOrNull(expression: KtExpression?, parent: UElement?): UExpression? defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'psi' @ [28:67] ==> public open val psi: KtWhenExpression defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[PropertyDescriptorImpl]

'subjectExpression' @ [28:71] ==> public final val KtWhenExpression.subjectExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [28:90] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[LazyClassReceiverParameterDescriptor]

'getValue' @ [30:43] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KotlinUExpressionList' @ [31:18] ==> public constructor KotlinUExpressionList(psi: PsiElement?, kind: UastSpecialExpressionKind, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUExpressionList[ClassConstructorDescriptorImpl]

'psi' @ [31:40] ==> public open val psi: KtWhenExpression defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[PropertyDescriptorImpl]

'WHEN' @ [31:74] ==> @JvmField public final val WHEN: UastSpecialExpressionKind defined in org.jetbrains.uast.kotlin.kinds.KotlinSpecialExpressionKinds[PropertyDescriptorImpl]

'this@KotlinUSwitchExpression' @ [31:80] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[LazyClassReceiverParameterDescriptor]

'expressions' @ [32:45] ==> public open lateinit var expressions: List<UExpression> defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression.body.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'joinToString' @ [32:57] ==> public fun <T> Iterable<UExpression>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: ((UExpression) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'it' @ [32:78] ==> value-parameter it: UExpression defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression.body.<anonymous>.<no name provided>.asRenderString.<anonymous>[ValueParameterDescriptorImpl]

'asRenderString' @ [32:81] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'withMargin' @ [32:98] ==> public val String.withMargin: String defined in org.jetbrains.uast[DeserializedPropertyDescriptor]

'apply' @ [33:11] ==> @InlineOnly public inline fun <T> <no name provided>.apply(block: <no name provided>.() -> Unit): <no name provided> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'expressions' @ [34:13] ==> public open lateinit var expressions: List<UExpression> defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression.body.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'this@KotlinUSwitchExpression' @ [34:27] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[LazyClassReceiverParameterDescriptor]

'psi' @ [34:56] ==> public open val psi: KtWhenExpression defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[PropertyDescriptorImpl]

'entries' @ [34:60] ==> public final val KtWhenExpression.entries: (MutableList<(KtWhenEntry..KtWhenEntry?)>..List<(KtWhenEntry..KtWhenEntry?)>)[MyPropertyDescriptor]

'map' @ [34:68] ==> public inline fun <T, R> Iterable<(KtWhenEntry..KtWhenEntry?)>.map(transform: ((KtWhenEntry..KtWhenEntry?)) -> KotlinUSwitchEntry): List<KotlinUSwitchEntry> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenEntry..org.jetbrains.kotlin.psi.KtWhenEntry?)
    <R> -> KotlinUSwitchEntry

'KotlinUSwitchEntry' @ [34:74] ==> public constructor KotlinUSwitchEntry(psi: KtWhenEntry, uastParent: UExpression) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[ClassConstructorDescriptorImpl]

'it' @ [34:93] ==> value-parameter it: (KtWhenEntry..KtWhenEntry?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression.body.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [34:97] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression.body.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'buildString' @ [38:37] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expression' @ [39:20] ==> public open val expression: UExpression? defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[PropertyDescriptorImpl]

'let' @ [39:32] ==> @InlineOnly public inline fun <T, R> UExpression.let(block: (UExpression) -> String): String defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression
    <R> -> String

'+' @ [39:38] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'it' @ [39:44] ==> value-parameter it: UExpression defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression.asRenderString.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asRenderString' @ [39:47] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'appendln' @ [40:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expr' @ [40:27] ==> val expr: String defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression.asRenderString.<anonymous>[LocalVariableDescriptor]

'appendln' @ [41:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'body' @ [41:18] ==> public open val body: UExpressionList defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[PropertyDescriptorImpl]

'asRenderString' @ [41:23] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpressionList[DeserializedSimpleFunctionDescriptor]

'appendln' @ [42:9] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'UIdentifier' @ [46:17] ==> public constructor UIdentifier(psi: PsiElement?, uastParent: UElement?) defined in org.jetbrains.uast.UIdentifier[DeserializedClassConstructorDescriptor]

'this' @ [46:35] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchExpression[LazyClassReceiverParameterDescriptor]

'KotlinAbstractUExpression' @ [52:5] ==> public constructor KotlinAbstractUExpression() defined in org.jetbrains.uast.kotlin.KotlinAbstractUExpression[ClassConstructorDescriptorImpl]

'getValue' @ [53:32] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'psi' @ [54:9] ==> public open val psi: KtWhenEntry defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[PropertyDescriptorImpl]

'conditions' @ [54:13] ==> public final val KtWhenEntry.conditions: (Array<(KtWhenCondition..KtWhenCondition?)>..Array<out (KtWhenCondition..KtWhenCondition?)>)[MyPropertyDescriptor]

'map' @ [54:24] ==> public inline fun <T, R> Array<out (KtWhenCondition..KtWhenCondition?)>.map(transform: ((KtWhenCondition..KtWhenCondition?)) -> UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtWhenCondition..org.jetbrains.kotlin.psi.KtWhenCondition?)
    <R> -> UExpression

'when (it) {
            is KtWhenConditionInRange -> KotlinCustomUBinaryExpression(it, this).apply {
                leftOperand = KotlinStringUSimpleReferenceExpression("it", this)
                operator = when {
                    it.isNegated -> KotlinBinaryOperators.NOT_IN
                    else -> KotlinBinaryOperators.IN
                }
                rightOperand = KotlinConverter.convertOrEmpty(it.rangeExpression, this)
            }
            is KtWhenConditionIsPattern -> KotlinCustomUBinaryExpressionWithType(it, this).apply {
                operand = KotlinStringUSimpleReferenceExpression("it", this)
                operationKind = when {
                    it.isNegated -> KotlinBinaryExpressionWithTypeKinds.NEGATED_INSTANCE_CHECK
                    else -> UastBinaryExpressionWithTypeKind.INSTANCE_CHECK
                }
                val typeRef = it.typeReference
                typeReference = typeRef?.let {
                    LazyKotlinUTypeReferenceExpression(it, this) { typeRef.toPsiType(this, boxed = true) }
                }
            }
            is KtWhenConditionWithExpression -> KotlinConverter.convertOrEmpty(it.expression, this)
            else -> UastEmptyExpression
        }' @ [54:30] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UExpression, entry1: UExpression, entry2: UExpression, entry3: UExpression): UExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UExpression

'it' @ [54:36] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'KotlinCustomUBinaryExpression' @ [55:42] ==> public constructor KotlinCustomUBinaryExpression(psi: PsiElement, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpression[ClassConstructorDescriptorImpl]

'it' @ [55:72] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [55:76] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[LazyClassReceiverParameterDescriptor]

'apply' @ [55:82] ==> @InlineOnly public inline fun <T> KotlinCustomUBinaryExpression.apply(block: KotlinCustomUBinaryExpression.() -> Unit): KotlinCustomUBinaryExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCustomUBinaryExpression

'leftOperand' @ [56:17] ==> public open lateinit var leftOperand: UExpression defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpression[PropertyDescriptorImpl]

'KotlinStringUSimpleReferenceExpression' @ [56:31] ==> public constructor KotlinStringUSimpleReferenceExpression(identifier: String, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinStringUSimpleReferenceExpression[ClassConstructorDescriptorImpl]

'this' @ [56:76] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'operator' @ [57:17] ==> public open lateinit var operator: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpression[PropertyDescriptorImpl]

'when {
                    it.isNegated -> KotlinBinaryOperators.NOT_IN
                    else -> KotlinBinaryOperators.IN
                }' @ [57:28] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UastBinaryOperator, entry1: UastBinaryOperator): UastBinaryOperator[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UastBinaryOperator

'it' @ [58:21] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNegated' @ [58:24] ==> public final val KtWhenConditionInRange.isNegated: Boolean[MyPropertyDescriptor]

'NOT_IN' @ [58:59] ==> @JvmField public final val NOT_IN: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'IN' @ [59:51] ==> @JvmField public final val IN: UastBinaryOperator defined in org.jetbrains.uast.kotlin.KotlinBinaryOperators[PropertyDescriptorImpl]

'rightOperand' @ [61:17] ==> public open lateinit var rightOperand: UExpression defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpression[PropertyDescriptorImpl]

'KotlinConverter' @ [61:32] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [61:48] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [61:63] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'rangeExpression' @ [61:66] ==> public final val KtWhenConditionInRange.rangeExpression: KtExpression?[MyPropertyDescriptor]

'this' @ [61:83] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'KotlinCustomUBinaryExpressionWithType' @ [63:44] ==> public constructor KotlinCustomUBinaryExpressionWithType(psi: PsiElement, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpressionWithType[ClassConstructorDescriptorImpl]

'it' @ [63:82] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [63:86] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[LazyClassReceiverParameterDescriptor]

'apply' @ [63:92] ==> @InlineOnly public inline fun <T> KotlinCustomUBinaryExpressionWithType.apply(block: KotlinCustomUBinaryExpressionWithType.() -> Unit): KotlinCustomUBinaryExpressionWithType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCustomUBinaryExpressionWithType

'operand' @ [64:17] ==> public open lateinit var operand: UExpression defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpressionWithType[PropertyDescriptorImpl]

'KotlinStringUSimpleReferenceExpression' @ [64:27] ==> public constructor KotlinStringUSimpleReferenceExpression(identifier: String, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinStringUSimpleReferenceExpression[ClassConstructorDescriptorImpl]

'this' @ [64:72] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'operationKind' @ [65:17] ==> public open lateinit var operationKind: UastBinaryExpressionWithTypeKind defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpressionWithType[PropertyDescriptorImpl]

'when {
                    it.isNegated -> KotlinBinaryExpressionWithTypeKinds.NEGATED_INSTANCE_CHECK
                    else -> UastBinaryExpressionWithTypeKind.INSTANCE_CHECK
                }' @ [65:33] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UastBinaryExpressionWithTypeKind, entry1: UastBinaryExpressionWithTypeKind): UastBinaryExpressionWithTypeKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UastBinaryExpressionWithTypeKind

'it' @ [66:21] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNegated' @ [66:24] ==> public final val KtWhenConditionIsPattern.isNegated: Boolean[MyPropertyDescriptor]

'NEGATED_INSTANCE_CHECK' @ [66:73] ==> @JvmField public final val NEGATED_INSTANCE_CHECK: UastBinaryExpressionWithTypeKind.InstanceCheck defined in org.jetbrains.uast.kotlin.KotlinBinaryExpressionWithTypeKinds[PropertyDescriptorImpl]

'INSTANCE_CHECK' @ [67:62] ==> @field:JvmField public final val INSTANCE_CHECK: UastBinaryExpressionWithTypeKind.InstanceCheck defined in org.jetbrains.uast.UastBinaryExpressionWithTypeKind.Companion[DeserializedPropertyDescriptor]

'it' @ [69:31] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'typeReference' @ [69:34] ==> public final val KtWhenConditionIsPattern.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [70:17] ==> public open var typeReference: UTypeReferenceExpression? defined in org.jetbrains.uast.kotlin.KotlinCustomUBinaryExpressionWithType[PropertyDescriptorImpl]

'typeRef' @ [70:33] ==> val typeRef: KtTypeReference? defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'let' @ [70:42] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> LazyKotlinUTypeReferenceExpression): LazyKotlinUTypeReferenceExpression defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> LazyKotlinUTypeReferenceExpression

'LazyKotlinUTypeReferenceExpression' @ [71:21] ==> public constructor LazyKotlinUTypeReferenceExpression(psi: PsiElement, uastParent: UElement?, typeSupplier: () -> PsiType) defined in org.jetbrains.uast.kotlin.LazyKotlinUTypeReferenceExpression[ClassConstructorDescriptorImpl]

'it' @ [71:56] ==> value-parameter it: KtTypeReference defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [71:60] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'typeRef' @ [71:68] ==> val typeRef: KtTypeReference? defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>[LocalVariableDescriptor]

'toPsiType' @ [71:76] ==> internal fun KtTypeReference?.toPsiType(source: UElement, boxed: Boolean = ...): PsiType defined in org.jetbrains.uast.kotlin in file kotlinInternalUastUtils.kt[SimpleFunctionDescriptorImpl]

'this' @ [71:86] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'convertOrEmpty' @ [74:65] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [74:80] ==> value-parameter it: (KtWhenCondition..KtWhenCondition?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.caseValues.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [74:83] ==> public final val KtWhenConditionWithExpression.expression: KtExpression?[MyPropertyDescriptor]

'this' @ [74:95] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[LazyClassReceiverParameterDescriptor]

'UastEmptyExpression' @ [75:21] ==> public object UastEmptyExpression : UExpression defined in org.jetbrains.uast[FakeCallableDescriptorForObject]

'getValue' @ [79:43] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'KotlinUExpressionList' @ [80:18] ==> public constructor KotlinUExpressionList(psi: PsiElement?, kind: UastSpecialExpressionKind, uastParent: UElement?) defined in org.jetbrains.uast.kotlin.KotlinUExpressionList[ClassConstructorDescriptorImpl]

'psi' @ [80:40] ==> public open val psi: KtWhenEntry defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[PropertyDescriptorImpl]

'WHEN_ENTRY' @ [80:74] ==> @JvmField public final val WHEN_ENTRY: UastSpecialExpressionKind defined in org.jetbrains.uast.kotlin.kinds.KotlinSpecialExpressionKinds[PropertyDescriptorImpl]

'this@KotlinUSwitchEntry' @ [80:86] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[LazyClassReceiverParameterDescriptor]

'buildString' @ [81:45] ==> @InlineOnly public inline fun buildString(builderAction: StringBuilder /* = StringBuilder */.() -> Unit): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'appendln' @ [82:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expressions' @ [83:17] ==> public open lateinit var expressions: List<UExpression> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'forEach' @ [83:29] ==> @HidesMembers public inline fun <T> Iterable<UExpression>.forEach(action: (UExpression) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'appendln' @ [83:39] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'it' @ [83:48] ==> value-parameter it: UExpression defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<no name provided>.asRenderString.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'asRenderString' @ [83:51] ==> public open fun asRenderString(): String defined in org.jetbrains.uast.UExpression[DeserializedSimpleFunctionDescriptor]

'withMargin' @ [83:68] ==> public val String.withMargin: String defined in org.jetbrains.uast[DeserializedPropertyDescriptor]

'appendln' @ [84:17] ==> @InlineOnly public inline fun StringBuilder /* = StringBuilder */.appendln(value: String?): StringBuilder /* = StringBuilder */ defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'apply' @ [86:11] ==> @InlineOnly public inline fun <T> <no name provided>.apply(block: <no name provided>.() -> Unit): <no name provided> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> <no name provided>

'this@KotlinUSwitchEntry' @ [87:27] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[LazyClassReceiverParameterDescriptor]

'psi' @ [87:51] ==> public open val psi: KtWhenEntry defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[PropertyDescriptorImpl]

'expression' @ [87:55] ==> public final val KtWhenEntry.expression: KtExpression?[MyPropertyDescriptor]

'when (exprPsi) {
                is KtBlockExpression -> exprPsi.statements.map { KotlinConverter.convertOrEmpty(it, this) }
                else -> listOf(KotlinConverter.convertOrEmpty(exprPsi, this))
            }' @ [88:35] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<UExpression>, entry1: List<UExpression>): List<UExpression>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<UExpression>

'exprPsi' @ [88:41] ==> val exprPsi: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<anonymous>[LocalVariableDescriptor]

'exprPsi' @ [89:41] ==> val exprPsi: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<anonymous>[LocalVariableDescriptor]

'statements' @ [89:49] ==> public final val KtBlockExpression.statements: List<(KtExpression..KtExpression?)>[MyPropertyDescriptor]

'map' @ [89:60] ==> public inline fun <T, R> Iterable<(KtExpression..KtExpression?)>.map(transform: ((KtExpression..KtExpression?)) -> UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtExpression..org.jetbrains.kotlin.psi.KtExpression?)
    <R> -> UExpression

'KotlinConverter' @ [89:66] ==> internal object KotlinConverter defined in org.jetbrains.uast.kotlin in file KotlinUastLanguagePlugin.kt[FakeCallableDescriptorForObject]

'convertOrEmpty' @ [89:82] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'it' @ [89:97] ==> value-parameter it: (KtExpression..KtExpression?) defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'this' @ [89:101] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'listOf' @ [90:25] ==> public fun <T> listOf(element: UExpression): List<UExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UExpression

'convertOrEmpty' @ [90:48] ==> internal final fun convertOrEmpty(expression: KtExpression?, parent: UElement?): UExpression defined in org.jetbrains.uast.kotlin.KotlinConverter[SimpleFunctionDescriptorImpl]

'exprPsi' @ [90:63] ==> val exprPsi: KtExpression? defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this' @ [90:72] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<anonymous>[ReceiverParameterDescriptorImpl]

'expressions' @ [92:13] ==> public open lateinit var expressions: List<UExpression> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<no name provided>[PropertyDescriptorImpl]

'userExpressions' @ [92:27] ==> val userExpressions: List<UExpression> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry.body.<anonymous>.<anonymous>[LocalVariableDescriptor]

'this@KotlinUSwitchEntry' @ [98:29] ==> <this> defined in org.jetbrains.uast.kotlin.KotlinUSwitchEntry[LazyClassReceiverParameterDescriptor]

'emptyList' @ [100:29] ==> public fun <T> emptyList(): List<UAnnotation> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UAnnotation

