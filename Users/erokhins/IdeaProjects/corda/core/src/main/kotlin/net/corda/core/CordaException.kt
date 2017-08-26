'CordaSerializable' @ [6:1] ==> public constructor CordaSerializable() defined in net.corda.core.serialization.CordaSerializable[ClassConstructorDescriptorImpl]

'Exception' @ [17:89] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?), p2: Boolean, p3: Boolean): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'this' @ [20:38] ==> internal constructor CordaException(originalExceptionClassName: String? = ..., _message: String? = ..., _cause: Throwable? = ...) defined in net.corda.core.CordaException[ClassConstructorDescriptorImpl]

'message' @ [20:49] ==> value-parameter message: String? defined in net.corda.core.CordaException.<init>[ValueParameterDescriptorImpl]

'cause' @ [20:58] ==> value-parameter cause: Throwable? defined in net.corda.core.CordaException.<init>[ValueParameterDescriptorImpl]

'if (originalExceptionClassName == null) originalMessage else {
            if (originalMessage == null) "$originalExceptionClassName" else "$originalExceptionClassName: $originalMessage"
        }' @ [23:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'originalExceptionClassName' @ [23:21] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'originalMessage' @ [23:57] ==> public open val originalMessage: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'if (originalMessage == null) "$originalExceptionClassName" else "$originalExceptionClassName: $originalMessage"' @ [24:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'originalMessage' @ [24:17] ==> public open val originalMessage: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'originalExceptionClassName' @ [24:44] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'originalExceptionClassName' @ [24:79] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'originalMessage' @ [24:108] ==> public open val originalMessage: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'_cause' @ [28:17] ==> private final var _cause: Throwable? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'super' @ [28:27] ==> <this> defined in net.corda.core.CordaException[LazyClassReceiverParameterDescriptor]

'cause' @ [28:33] ==> public open val cause: Throwable? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'_message' @ [31:9] ==> private final var _message: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'message' @ [31:20] ==> value-parameter message: String? defined in net.corda.core.CordaException.setMessage[ValueParameterDescriptorImpl]

'_cause' @ [35:9] ==> private final var _cause: Throwable? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'cause' @ [35:18] ==> value-parameter cause: Throwable? defined in net.corda.core.CordaException.setCause[ValueParameterDescriptorImpl]

'suppressed' @ [39:26] ==> value-parameter suppressed: Array<Throwable> defined in net.corda.core.CordaException.addSuppressed[ValueParameterDescriptorImpl]

'addSuppressed' @ [40:13] ==> public final fun addSuppressed(p0: (Throwable..Throwable?)): Unit defined in net.corda.core.CordaException[JavaMethodDescriptor]

'suppress' @ [40:27] ==> val suppress: Throwable defined in net.corda.core.CordaException.addSuppressed[LocalVariableDescriptor]

'_message' @ [45:17] ==> private final var _message: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'xor' @ [48:16] ==> public final infix fun xor(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'deepHashCode' @ [48:23] ==> public open fun deepHashCode(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Int defined in java.util.Arrays[JavaMethodDescriptor]

'stackTrace' @ [48:36] ==> public final var CordaException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'hash' @ [48:60] ==> public open fun hash(vararg p0: (Any..Any?)): Int defined in java.util.Objects[JavaMethodDescriptor]

'originalExceptionClassName' @ [48:65] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'originalMessage' @ [48:93] ==> public open val originalMessage: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'other' @ [52:16] ==> value-parameter other: Any? defined in net.corda.core.CordaException.equals[ValueParameterDescriptorImpl]

'originalExceptionClassName' @ [53:17] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'other' @ [53:47] ==> value-parameter other: Any? defined in net.corda.core.CordaException.equals[ValueParameterDescriptorImpl]

'originalExceptionClassName' @ [53:53] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'message' @ [54:17] ==> public open val message: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'other' @ [54:28] ==> value-parameter other: Any? defined in net.corda.core.CordaException.equals[ValueParameterDescriptorImpl]

'message' @ [54:34] ==> public open val message: String? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'cause' @ [55:17] ==> public open val cause: Throwable? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'other' @ [55:26] ==> value-parameter other: Any? defined in net.corda.core.CordaException.equals[ValueParameterDescriptorImpl]

'cause' @ [55:32] ==> public open val cause: Throwable? defined in net.corda.core.CordaException[PropertyDescriptorImpl]

'equals' @ [56:24] ==> public open fun equals(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?), p1: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'stackTrace' @ [56:31] ==> public final var CordaException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'other' @ [56:43] ==> value-parameter other: Any? defined in net.corda.core.CordaException.equals[ValueParameterDescriptorImpl]

'stackTrace' @ [56:49] ==> public final var CordaException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'equals' @ [57:24] ==> public open fun equals(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?), p1: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'suppressed' @ [57:31] ==> public final val CordaException.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'other' @ [57:43] ==> value-parameter other: Any? defined in net.corda.core.CordaException.equals[ValueParameterDescriptorImpl]

'suppressed' @ [57:49] ==> public final val CordaException.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'RuntimeException' @ [63:75] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?), p2: Boolean, p3: Boolean): RuntimeException /* = RuntimeException */ defined in kotlin.RuntimeException[TypeAliasConstructorDescriptorImpl]

'this' @ [64:56] ==> public constructor CordaRuntimeException(originalExceptionClassName: String?, _message: String? = ..., _cause: Throwable? = ...) defined in net.corda.core.CordaRuntimeException[ClassConstructorDescriptorImpl]

'message' @ [64:67] ==> value-parameter message: String? defined in net.corda.core.CordaRuntimeException.<init>[ValueParameterDescriptorImpl]

'cause' @ [64:76] ==> value-parameter cause: Throwable? defined in net.corda.core.CordaRuntimeException.<init>[ValueParameterDescriptorImpl]

'if (originalExceptionClassName == null) originalMessage else {
            if (originalMessage == null) "$originalExceptionClassName" else "$originalExceptionClassName: $originalMessage"
        }' @ [67:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String?, elseBranch: String?): String?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String?

'originalExceptionClassName' @ [67:21] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'originalMessage' @ [67:57] ==> public open val originalMessage: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'if (originalMessage == null) "$originalExceptionClassName" else "$originalExceptionClassName: $originalMessage"' @ [68:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'originalMessage' @ [68:17] ==> public open val originalMessage: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'originalExceptionClassName' @ [68:44] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'originalExceptionClassName' @ [68:79] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'originalMessage' @ [68:108] ==> public open val originalMessage: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'_cause' @ [72:17] ==> private final var _cause: Throwable? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'super' @ [72:27] ==> <this> defined in net.corda.core.CordaRuntimeException[LazyClassReceiverParameterDescriptor]

'cause' @ [72:33] ==> public open val cause: Throwable? defined in java.lang.RuntimeException[DeserializedPropertyDescriptor]

'_message' @ [75:9] ==> private final var _message: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'message' @ [75:20] ==> value-parameter message: String? defined in net.corda.core.CordaRuntimeException.setMessage[ValueParameterDescriptorImpl]

'_cause' @ [79:9] ==> private final var _cause: Throwable? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'cause' @ [79:18] ==> value-parameter cause: Throwable? defined in net.corda.core.CordaRuntimeException.setCause[ValueParameterDescriptorImpl]

'suppressed' @ [83:26] ==> value-parameter suppressed: Array<Throwable> defined in net.corda.core.CordaRuntimeException.addSuppressed[ValueParameterDescriptorImpl]

'addSuppressed' @ [84:13] ==> public final fun addSuppressed(p0: (Throwable..Throwable?)): Unit defined in net.corda.core.CordaRuntimeException[JavaMethodDescriptor]

'suppress' @ [84:27] ==> val suppress: Throwable defined in net.corda.core.CordaRuntimeException.addSuppressed[LocalVariableDescriptor]

'_message' @ [89:17] ==> private final var _message: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'xor' @ [92:16] ==> public final infix fun xor(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'deepHashCode' @ [92:23] ==> public open fun deepHashCode(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Int defined in java.util.Arrays[JavaMethodDescriptor]

'stackTrace' @ [92:36] ==> public final var CordaRuntimeException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'hash' @ [92:60] ==> public open fun hash(vararg p0: (Any..Any?)): Int defined in java.util.Objects[JavaMethodDescriptor]

'originalExceptionClassName' @ [92:65] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'originalMessage' @ [92:93] ==> public open val originalMessage: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'other' @ [96:16] ==> value-parameter other: Any? defined in net.corda.core.CordaRuntimeException.equals[ValueParameterDescriptorImpl]

'originalExceptionClassName' @ [97:17] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'other' @ [97:47] ==> value-parameter other: Any? defined in net.corda.core.CordaRuntimeException.equals[ValueParameterDescriptorImpl]

'originalExceptionClassName' @ [97:53] ==> public open var originalExceptionClassName: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'message' @ [98:17] ==> public open val message: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'other' @ [98:28] ==> value-parameter other: Any? defined in net.corda.core.CordaRuntimeException.equals[ValueParameterDescriptorImpl]

'message' @ [98:34] ==> public open val message: String? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'cause' @ [99:17] ==> public open val cause: Throwable? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'other' @ [99:26] ==> value-parameter other: Any? defined in net.corda.core.CordaRuntimeException.equals[ValueParameterDescriptorImpl]

'cause' @ [99:32] ==> public open val cause: Throwable? defined in net.corda.core.CordaRuntimeException[PropertyDescriptorImpl]

'equals' @ [100:24] ==> public open fun equals(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?), p1: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'stackTrace' @ [100:31] ==> public final var CordaRuntimeException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'other' @ [100:43] ==> value-parameter other: Any? defined in net.corda.core.CordaRuntimeException.equals[ValueParameterDescriptorImpl]

'stackTrace' @ [100:49] ==> public final var CordaRuntimeException.stackTrace: (Array<(StackTraceElement..StackTraceElement?)>..Array<out (StackTraceElement..StackTraceElement?)>?)[MyPropertyDescriptor]

'equals' @ [101:24] ==> public open fun equals(p0: (Array<(Any..Any?)>..Array<out (Any..Any?)>?), p1: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)): Boolean defined in java.util.Arrays[JavaMethodDescriptor]

'suppressed' @ [101:31] ==> public final val CordaRuntimeException.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

'other' @ [101:43] ==> value-parameter other: Any? defined in net.corda.core.CordaRuntimeException.equals[ValueParameterDescriptorImpl]

'suppressed' @ [101:49] ==> public final val CordaRuntimeException.suppressed: (Array<(Throwable..Throwable?)>..Array<out (Throwable..Throwable?)>?)[MyPropertyDescriptor]

