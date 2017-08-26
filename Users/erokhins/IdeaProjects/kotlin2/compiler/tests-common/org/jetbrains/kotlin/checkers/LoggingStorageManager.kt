'ObservableStorageManager' @ [26:97] ==> public constructor ObservableStorageManager(delegate: StorageManager) defined in org.jetbrains.kotlin.storage.ObservableStorageManager[DeserializedClassConstructorDescriptor]

'delegate' @ [26:122] ==> value-parameter delegate: StorageManager defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<init>[ValueParameterDescriptorImpl]

'this@observable' @ [40:30] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.observable[ReceiverParameterDescriptorImpl]

'invoke' @ [41:17] ==> public abstract operator fun invoke(lambda: @ParameterName Any, call: @ParameterName LoggingStorageManager.CallData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'this@observable' @ [41:29] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.observable[ReceiverParameterDescriptorImpl]

'computeCallerData' @ [41:46] ==> private final fun computeCallerData(lambda: Any, wrapper: Any, arguments: List<Any?>, result: Any?): LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[SimpleFunctionDescriptorImpl]

'this@observable' @ [41:64] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.observable[ReceiverParameterDescriptorImpl]

'this' @ [41:81] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>[LazyClassReceiverParameterDescriptor]

'listOf' @ [41:87] ==> @InlineOnly public inline fun <T> listOf(): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'result' @ [41:97] ==> val result: T defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>.invoke[LocalVariableDescriptor]

'result' @ [42:24] ==> val result: T defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>.invoke[LocalVariableDescriptor]

'this@observable' @ [50:30] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.observable[ReceiverParameterDescriptorImpl]

'p1' @ [50:46] ==> value-parameter p1: K defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>.invoke[ValueParameterDescriptorImpl]

'invoke' @ [51:17] ==> public abstract operator fun invoke(lambda: @ParameterName Any, call: @ParameterName LoggingStorageManager.CallData): Unit defined in kotlin.Function2[FunctionInvokeDescriptor]

'this@observable' @ [51:29] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.observable[ReceiverParameterDescriptorImpl]

'computeCallerData' @ [51:46] ==> private final fun computeCallerData(lambda: Any, wrapper: Any, arguments: List<Any?>, result: Any?): LoggingStorageManager.CallData defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[SimpleFunctionDescriptorImpl]

'this@observable' @ [51:64] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.observable[ReceiverParameterDescriptorImpl]

'this' @ [51:81] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>[LazyClassReceiverParameterDescriptor]

'listOf' @ [51:87] ==> public fun <T> listOf(element: K): List<K> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> K

'p1' @ [51:94] ==> value-parameter p1: K defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>.invoke[ValueParameterDescriptorImpl]

'result' @ [51:99] ==> val result: V defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>.invoke[LocalVariableDescriptor]

'result' @ [52:24] ==> val result: V defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.<get-observable>.<no name provided>.invoke[LocalVariableDescriptor]

'lambda' @ [57:27] ==> value-parameter lambda: Any defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'java' @ [57:41] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'lambdaClass' @ [59:44] ==> val lambdaClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'enclosingClass' @ [59:56] ==> public final val <T : (Any..Any?)> Class<out Any>.enclosingClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'lambdaClass' @ [62:32] ==> val lambdaClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'getAllDeclaredFields' @ [62:44] ==> private final fun Class<*>.getAllDeclaredFields(): List<Field> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [62:67] ==> public inline fun <T> Iterable<Field>.firstOrNull(predicate: (Field) -> Boolean): Field? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'field' @ [64:13] ==> value-parameter field: Field defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [64:19] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'outerClass' @ [64:27] ==> val outerClass: Class<out Any?>? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'field' @ [64:41] ==> value-parameter field: Field defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [64:47] ==> public final val Field.name: (String..String?)[MyPropertyDescriptor]

'contains' @ [64:54] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'referenceToOuter' @ [66:9] ==> val referenceToOuter: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'isAccessible' @ [66:27] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'referenceToOuter' @ [68:29] ==> val referenceToOuter: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'get' @ [68:47] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'lambda' @ [68:51] ==> value-parameter lambda: Any defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'this' @ [71:20] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.findFunctionField[ReceiverParameterDescriptorImpl]

'getAllDeclaredFields' @ [71:25] ==> private final fun Class<*>.getAllDeclaredFields(): List<Field> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [71:48] ==> public inline fun <T> Iterable<Field>.firstOrNull(predicate: (Field) -> Boolean): Field? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'it' @ [72:17] ==> value-parameter it: Field defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.findFunctionField.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [72:20] ==> public final val Field.type: (Class<*>..Class<*>?)[MyPropertyDescriptor]

'name' @ [72:26] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'startsWith' @ [72:32] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'if (outerInstance == null) null
                              else outerClass?.getAllDeclaredFields()?.firstOrNull {
                                  field ->
                                  field.isAccessible = true
                                  val value = field.get(outerInstance)
                                  if (value == null) return@firstOrNull false

                                  val valueClass = value::class.java
                                  val functionField = valueClass.findFunctionField()
                                  if (functionField == null) return@firstOrNull false

            functionField.isAccessible = true
                                  val functionValue = functionField.get(value)
                                  functionValue == wrapper
                              }' @ [75:31] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Field?, elseBranch: Field?): Field?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Field?

'outerInstance' @ [75:35] ==> val outerInstance: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'outerClass' @ [76:36] ==> val outerClass: Class<out Any?>? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'getAllDeclaredFields' @ [76:48] ==> private final fun Class<*>.getAllDeclaredFields(): List<Field> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [76:72] ==> public inline fun <T> Iterable<Field>.firstOrNull(predicate: (Field) -> Boolean): Field? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'field' @ [78:35] ==> value-parameter field: Field defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[ValueParameterDescriptorImpl]

'isAccessible' @ [78:41] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'field' @ [79:47] ==> value-parameter field: Field defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[ValueParameterDescriptorImpl]

'get' @ [79:53] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'outerInstance' @ [79:57] ==> val outerInstance: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'value' @ [80:39] ==> val value: (Any..Any?) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'value' @ [82:52] ==> val value: (Any..Any?) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'java' @ [82:65] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'valueClass' @ [83:55] ==> val valueClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'findFunctionField' @ [83:66] ==> local final fun Class<*>.findFunctionField(): Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[SimpleFunctionDescriptorImpl]

'functionField' @ [84:39] ==> val functionField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'functionField' @ [86:13] ==> val functionField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'isAccessible' @ [86:27] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'functionField' @ [87:55] ==> val functionField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'get' @ [87:69] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'value' @ [87:73] ==> val value: (Any..Any?) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'functionValue' @ [88:35] ==> val functionValue: (Any..Any?) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData.<anonymous>[LocalVariableDescriptor]

'wrapper' @ [88:52] ==> value-parameter wrapper: Any defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'containingField' @ [91:13] ==> val containingField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'lambdaClass' @ [92:38] ==> val lambdaClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'findFunctionField' @ [92:50] ==> local final fun Class<*>.findFunctionField(): Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[SimpleFunctionDescriptorImpl]

'wrappedLambdaField' @ [93:17] ==> val wrappedLambdaField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'wrappedLambdaField' @ [94:17] ==> val wrappedLambdaField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'isAccessible' @ [94:36] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'wrappedLambdaField' @ [95:37] ==> val wrappedLambdaField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'get' @ [95:56] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'lambda' @ [95:60] ==> value-parameter lambda: Any defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'CallData' @ [96:24] ==> public constructor CallData(fieldOwner: Any?, field: Field?, lambdaCreatedIn: GenericDeclaration?, arguments: List<Any?>, result: Any?) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[ClassConstructorDescriptorImpl]

'outerInstance' @ [96:33] ==> val outerInstance: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'enclosingEntity' @ [96:54] ==> private final fun enclosingEntity(klass: Class<out Any>): GenericDeclaration? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[SimpleFunctionDescriptorImpl]

'wrappedLambda' @ [96:70] ==> val wrappedLambda: (Any..Any?) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'java' @ [96:91] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'arguments' @ [96:98] ==> value-parameter arguments: List<Any?> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'result' @ [96:109] ==> value-parameter result: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'enclosingEntity' @ [100:31] ==> private final fun enclosingEntity(klass: Class<out Any>): GenericDeclaration? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager[SimpleFunctionDescriptorImpl]

'lambdaClass' @ [100:47] ==> val lambdaClass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'CallData' @ [102:16] ==> public constructor CallData(fieldOwner: Any?, field: Field?, lambdaCreatedIn: GenericDeclaration?, arguments: List<Any?>, result: Any?) defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.CallData[ClassConstructorDescriptorImpl]

'outerInstance' @ [102:25] ==> val outerInstance: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'containingField' @ [102:40] ==> val containingField: Field? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'enclosingEntity' @ [102:57] ==> val enclosingEntity: GenericDeclaration? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[LocalVariableDescriptor]

'arguments' @ [102:74] ==> value-parameter arguments: List<Any?> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'result' @ [102:85] ==> value-parameter result: Any? defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.computeCallerData[ValueParameterDescriptorImpl]

'klass' @ [106:13] ==> value-parameter klass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.enclosingEntity[ValueParameterDescriptorImpl]

'enclosingConstructor' @ [106:19] ==> public final val <T : (Any..Any?)> Class<out Any>.enclosingConstructor: (Constructor<*>..Constructor<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'klass' @ [106:43] ==> value-parameter klass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.enclosingEntity[ValueParameterDescriptorImpl]

'enclosingMethod' @ [106:49] ==> public final val <T : (Any..Any?)> Class<out Any>.enclosingMethod: (Method..Method?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'klass' @ [106:68] ==> value-parameter klass: Class<out Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.enclosingEntity[ValueParameterDescriptorImpl]

'enclosingClass' @ [106:74] ==> public final val <T : (Any..Any?)> Class<out Any>.enclosingClass: (Class<*>..Class<*>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'arrayListOf' @ [109:22] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Field> /* = ArrayList<Field> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Field

'this' @ [111:17] ==> <this> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[ReceiverParameterDescriptorImpl]

'result' @ [113:13] ==> val result: ArrayList<Field> /* = ArrayList<Field> */ defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

'addAll' @ [113:20] ==> public open fun addAll(elements: Collection<Field>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'c' @ [113:27] ==> var c: Class<*> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

'declaredFields' @ [113:29] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.declaredFields: (Array<(Field..Field?)>..Array<out (Field..Field?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'toList' @ [113:44] ==> public fun <T> Array<out (Field..Field?)>.toList(): List<(Field..Field?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'Suppress' @ [114:13] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'?:' @ [115:30] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Class<in Any>?, right: Class<in Any>): Class<in Any>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Class<in Any>

'c' @ [115:31] ==> var c: Class<*> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

'superclass' @ [115:48] ==> public final val <T : (Any..Any?)> Class<Any>.superclass: (Class<in (Any..Any?)>..Class<in (Any..Any?)>?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Any

'c' @ [116:17] ==> var c: Class<*> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

'superClass' @ [116:22] ==> val superClass: Class<in Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

'c' @ [117:13] ==> var c: Class<*> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

'superClass' @ [117:17] ==> val superClass: Class<in Any> defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

'result' @ [120:16] ==> val result: ArrayList<Field> /* = ArrayList<Field> */ defined in org.jetbrains.kotlin.checkers.LoggingStorageManager.getAllDeclaredFields[LocalVariableDescriptor]

