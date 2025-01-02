<!-- Bootstrap core JavaScript-->
<script src="/resources/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="/resources/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="/resources/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="/resources/vendor/datatables/jquery.dataTables.min.js"></script>
<script src="/resources/vendor/datatables/dataTables.bootstrap4.min.js"></script>

<!-- Page level custom scripts -->
<script src="/resources/js/demo/datatables-demo.js"></script>

<script>
	$(document).ready(function() {
		$('#dataTables-example').DataTable({
		responsive: true
		});
		$(".sidebar-nav").attr("class","sidebar-nav navbar-collapse collapse").attr("aria-expanded", 'false').attr("style","height:1px");
	});
</script>

</body>

</html>