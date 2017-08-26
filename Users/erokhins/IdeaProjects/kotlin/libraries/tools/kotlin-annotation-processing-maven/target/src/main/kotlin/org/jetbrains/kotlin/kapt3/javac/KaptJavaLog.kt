'Log' @ [36:5] ==> protected/*protected and package*/ constructor Log(p0: (Context..Context?), p1: (PrintWriter..PrintWriter?), p2: (PrintWriter..PrintWriter?), p3: (PrintWriter..PrintWriter?)) defined in com.sun.tools.javac.util.Log[JavaClassConstructorDescriptor]

'context' @ [36:9] ==> value-parameter context: Context defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.<init>[ValueParameterDescriptorImpl]

'errWriter' @ [36:18] ==> value-parameter errWriter: PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.<init>[ValueParameterDescriptorImpl]

'warnWriter' @ [36:29] ==> value-parameter warnWriter: PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.<init>[ValueParameterDescriptorImpl]

'noticeWriter' @ [36:41] ==> value-parameter noticeWriter: PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.<init>[ValueParameterDescriptorImpl]

'context' @ [38:9] ==> value-parameter context: Context defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.<init>[ValueParameterDescriptorImpl]

'put' @ [38:17] ==> public open fun <T : (Any..Any?)> put(p0: (Context.Key<(PrintWriter..PrintWriter?)>..Context.Key<(PrintWriter..PrintWriter?)>?), p1: (PrintWriter..PrintWriter?)): Unit defined in com.sun.tools.javac.util.Context[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PrintWriter

'outKey' @ [38:25] ==> public final val outKey: (Context.Key<(PrintWriter..PrintWriter?)>..Context.Key<(PrintWriter..PrintWriter?)>?) defined in com.sun.tools.javac.util.Log[JavaPropertyDescriptor]

'noticeWriter' @ [38:33] ==> value-parameter noticeWriter: PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.<init>[ValueParameterDescriptorImpl]

'diagnostic' @ [42:13] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'type' @ [42:24] ==> public final val JCDiagnostic.type: (JCDiagnostic.DiagnosticType..JCDiagnostic.DiagnosticType?)[MyPropertyDescriptor]

'ERROR' @ [42:60] ==> enum entry ERROR defined in com.sun.tools.javac.util.JCDiagnostic.DiagnosticType[FakeCallableDescriptorForObject]

'diagnostic' @ [42:69] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'code' @ [42:80] ==> public final val JCDiagnostic.code: (String..String?)[MyPropertyDescriptor]

'IGNORED_DIAGNOSTICS' @ [42:88] ==> private final val IGNORED_DIAGNOSTICS: Set<String> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion[PropertyDescriptorImpl]

'diagnostic' @ [46:13] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'type' @ [46:24] ==> public final val JCDiagnostic.type: (JCDiagnostic.DiagnosticType..JCDiagnostic.DiagnosticType?)[MyPropertyDescriptor]

'WARNING' @ [46:60] ==> enum entry WARNING defined in com.sun.tools.javac.util.JCDiagnostic.DiagnosticType[FakeCallableDescriptorForObject]

'diagnostic' @ [47:16] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'code' @ [47:27] ==> public final val JCDiagnostic.code: (String..String?)[MyPropertyDescriptor]

'diagnostic' @ [48:16] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'args' @ [48:27] ==> public final val JCDiagnostic.args: (Array<(Any..Any?)>..Array<out (Any..Any?)>?)[MyPropertyDescriptor]

'singleOrNull' @ [48:32] ==> public fun <T> Array<out (Any..Any?)>.singleOrNull(): Any? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'diagnostic' @ [54:29] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'diagnosticPosition' @ [54:40] ==> public final val JCDiagnostic.diagnosticPosition: (JCDiagnostic.DiagnosticPosition..JCDiagnostic.DiagnosticPosition?)[MyPropertyDescriptor]

'diagnostic' @ [55:13] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'code' @ [55:24] ==> public final val JCDiagnostic.code: (String..String?)[MyPropertyDescriptor]

'contains' @ [55:29] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'targetElement' @ [55:61] ==> val targetElement: (JCDiagnostic.DiagnosticPosition..JCDiagnostic.DiagnosticPosition?) defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[LocalVariableDescriptor]

'interceptorData' @ [56:30] ==> public final val interceptorData: KaptJavaLog.DiagnosticInterceptorData defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog[PropertyDescriptorImpl]

'files' @ [56:46] ==> public final var files: Map<JavaFileObject, JCTree.JCCompilationUnit> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.DiagnosticInterceptorData[PropertyDescriptorImpl]

'diagnostic' @ [56:52] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'source' @ [56:63] ==> public final val JCDiagnostic.source: (JavaFileObject..JavaFileObject?)[MyPropertyDescriptor]

'sourceFile' @ [57:17] ==> val sourceFile: JCTree.JCCompilationUnit? defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[LocalVariableDescriptor]

'targetElement' @ [58:37] ==> val targetElement: (JCDiagnostic.DiagnosticPosition..JCDiagnostic.DiagnosticPosition?) defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[LocalVariableDescriptor]

'tree' @ [58:51] ==> public final val JCDiagnostic.DiagnosticPosition.tree: (JCTree..JCTree?)[MyPropertyDescriptor]

'sourceFile' @ [58:59] ==> val sourceFile: JCTree.JCCompilationUnit? defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[LocalVariableDescriptor]

'imports' @ [58:70] ==> public final val JCTree.JCCompilationUnit.imports: (List<(JCTree.JCImport..JCTree.JCImport?)>..List<(JCTree.JCImport..JCTree.JCImport?)>?)[MyPropertyDescriptor]

'insideImports' @ [60:21] ==> val insideImports: Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[LocalVariableDescriptor]

'super' @ [64:9] ==> <this> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog[LazyClassReceiverParameterDescriptor]

'report' @ [64:15] ==> public open fun report(p0: (JCDiagnostic..JCDiagnostic?)): Unit defined in com.sun.tools.javac.util.Log[JavaMethodDescriptor]

'diagnostic' @ [64:22] ==> value-parameter diagnostic: JCDiagnostic defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.report[ValueParameterDescriptorImpl]

'element' @ [68:13] ==> value-parameter element: JCTree? defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[ValueParameterDescriptorImpl]

'JCTree.Visitor' @ [73:32] ==> public constructor Visitor() defined in com.sun.tools.javac.tree.JCTree.Visitor[JavaClassConstructorDescriptor]

'super' @ [75:17] ==> <this> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitImport' @ [75:23] ==> public open fun visitImport(p0: (JCTree.JCImport..JCTree.JCImport?)): Unit defined in com.sun.tools.javac.tree.JCTree.Visitor[JavaMethodDescriptor]

'that' @ [75:35] ==> value-parameter that: JCTree.JCImport defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>.visitImport[ValueParameterDescriptorImpl]

'!' @ [76:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'found' @ [76:22] ==> var found: Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[LocalVariableDescriptor]

'that' @ [76:29] ==> value-parameter that: JCTree.JCImport defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>.visitImport[ValueParameterDescriptorImpl]

'qualid' @ [76:34] ==> public final var qualid: (JCTree..JCTree?) defined in com.sun.tools.javac.tree.JCTree.JCImport[JavaPropertyDescriptor]

'accept' @ [76:41] ==> public abstract fun accept(p0: (JCTree.Visitor..JCTree.Visitor?)): Unit defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'this' @ [76:48] ==> <this> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>[LazyClassReceiverParameterDescriptor]

'super' @ [80:17] ==> <this> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitSelect' @ [80:23] ==> public open fun visitSelect(p0: (JCTree.JCFieldAccess..JCTree.JCFieldAccess?)): Unit defined in com.sun.tools.javac.tree.JCTree.Visitor[JavaMethodDescriptor]

'that' @ [80:35] ==> value-parameter that: JCTree.JCFieldAccess defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>.visitSelect[ValueParameterDescriptorImpl]

'!' @ [81:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'found' @ [81:22] ==> var found: Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[LocalVariableDescriptor]

'that' @ [81:29] ==> value-parameter that: JCTree.JCFieldAccess defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>.visitSelect[ValueParameterDescriptorImpl]

'selected' @ [81:34] ==> public final var selected: (JCTree.JCExpression..JCTree.JCExpression?) defined in com.sun.tools.javac.tree.JCTree.JCFieldAccess[JavaPropertyDescriptor]

'accept' @ [81:43] ==> public abstract fun accept(p0: (JCTree.Visitor..JCTree.Visitor?)): Unit defined in com.sun.tools.javac.tree.JCTree.JCExpression[JavaMethodDescriptor]

'this' @ [81:50] ==> <this> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>[LazyClassReceiverParameterDescriptor]

'!' @ [85:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'found' @ [85:22] ==> var found: Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[LocalVariableDescriptor]

'element' @ [85:31] ==> value-parameter element: JCTree? defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[ValueParameterDescriptorImpl]

'that' @ [85:42] ==> value-parameter that: JCTree defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<no name provided>.visitTree[ValueParameterDescriptorImpl]

'found' @ [85:48] ==> var found: Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[LocalVariableDescriptor]

'this' @ [88:9] ==> <this> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[ReceiverParameterDescriptorImpl]

'forEach' @ [88:14] ==> @HidesMembers public inline fun <T> Iterable<T>.forEach(action: (T) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'!' @ [88:28] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'found' @ [88:29] ==> var found: Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[LocalVariableDescriptor]

'it' @ [88:36] ==> value-parameter it: T defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [88:39] ==> public abstract fun accept(p0: (JCTree.Visitor..JCTree.Visitor?)): Unit defined in com.sun.tools.javac.tree.JCTree[JavaMethodDescriptor]

'visitor' @ [88:46] ==> val visitor: <no name provided><T> defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[LocalVariableDescriptor]

'found' @ [89:16] ==> var found: Boolean defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.contains[LocalVariableDescriptor]

'setOf' @ [93:43] ==> public fun <T> setOf(vararg elements: String): Set<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'DiagnosticInterceptorData' @ [103:35] ==> public constructor DiagnosticInterceptorData() defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.DiagnosticInterceptorData[ClassConstructorDescriptorImpl]

'context' @ [104:13] ==> value-parameter context: Context defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister[ValueParameterDescriptorImpl]

'put' @ [104:21] ==> public open fun <T : (Any..Any?)> put(p0: (Context.Key<(Log..Log?)>..Context.Key<(Log..Log?)>?), p1: (Context.Factory<(Log..Log?)>..Context.Factory<(Log..Log?)>?)): Unit defined in com.sun.tools.javac.util.Context[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Log

'logKey' @ [104:29] ==> public final val logKey: (Context.Key<(Log..Log?)>..Context.Key<(Log..Log?)>?) defined in com.sun.tools.javac.util.Log[JavaPropertyDescriptor]

'Factory' @ [104:45] ==> public final fun <T : (Any..Any?)> Factory(function: ((Context..Context?)) -> (Log..Log?)): Context.Factory<Log> defined in com.sun.tools.javac.util.Context[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : (Any..Any?)> -> Log

'PrintWriter' @ [105:69] ==> public constructor PrintWriter(p0: (Writer..Writer?)) defined in java.io.PrintWriter[JavaClassConstructorDescriptor]

'MessageCollectorBackedWriter' @ [105:81] ==> public constructor MessageCollectorBackedWriter(messageCollector: MessageCollector, severity: CompilerMessageSeverity) defined in org.jetbrains.kotlin.kapt3.util.MessageCollectorBackedWriter[ClassConstructorDescriptorImpl]

'messageCollector' @ [105:110] ==> value-parameter messageCollector: MessageCollector defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister[ValueParameterDescriptorImpl]

'severity' @ [105:128] ==> value-parameter severity: CompilerMessageSeverity defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>.makeWriter[ValueParameterDescriptorImpl]

'makeWriter' @ [106:33] ==> local final fun makeWriter(severity: CompilerMessageSeverity): PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>[SimpleFunctionDescriptorImpl]

'ERROR' @ [106:44] ==> enum entry ERROR defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'makeWriter' @ [107:34] ==> local final fun makeWriter(severity: CompilerMessageSeverity): PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>[SimpleFunctionDescriptorImpl]

'STRONG_WARNING' @ [107:45] ==> enum entry STRONG_WARNING defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'makeWriter' @ [108:36] ==> local final fun makeWriter(severity: CompilerMessageSeverity): PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>[SimpleFunctionDescriptorImpl]

'INFO' @ [108:47] ==> enum entry INFO defined in org.jetbrains.kotlin.cli.common.messages.CompilerMessageSeverity[FakeCallableDescriptorForObject]

'KaptJavaLog' @ [109:17] ==> public constructor KaptJavaLog(context: Context, errWriter: PrintWriter, warnWriter: PrintWriter, noticeWriter: PrintWriter, interceptorData: KaptJavaLog.DiagnosticInterceptorData) defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog[ClassConstructorDescriptorImpl]

'it' @ [109:29] ==> value-parameter it: (Context..Context?) defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>[ValueParameterDescriptorImpl]

'errWriter' @ [109:33] ==> val errWriter: PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>[LocalVariableDescriptor]

'warnWriter' @ [109:44] ==> val warnWriter: PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>[LocalVariableDescriptor]

'noticeWriter' @ [109:56] ==> val noticeWriter: PrintWriter defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister.<anonymous>[LocalVariableDescriptor]

'interceptorData' @ [109:70] ==> val interceptorData: KaptJavaLog.DiagnosticInterceptorData defined in org.jetbrains.kotlin.kapt3.javac.KaptJavaLog.Companion.preRegister[LocalVariableDescriptor]

'emptyMap' @ [115:68] ==> public fun <K, V> emptyMap(): Map<JavaFileObject, JCTree.JCCompilationUnit> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JavaFileObject
    <V> -> JCCompilationUnit

